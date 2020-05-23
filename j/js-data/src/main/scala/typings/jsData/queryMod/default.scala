package typings.jsData.queryMod

import typings.jsData.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Query", JSImport.Default)
@js.native
class default () extends Query {
  def this(collection: js.Any) = this()
}

/* static members */
@JSImport("js-data/dist/Query", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The filtering operators supported by {@link Query#filter}, and which are
    * implemented by adapters (for the most part).
    *
    * @example <caption>Variant 1</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'published', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    * ];
    * store.add('post', posts);
    * const publishedPosts = store.filter('post', {
    *   status: 'published',
    *   limit: 2
    * });
    * console.log(publishedPosts);
    *
    *
    * @example <caption>Variant 2</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post')
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'published', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    * ];
    * store.add('post', posts);
    * const publishedPosts = store.filter('post', {
    *   where: {
    *     status: {
    *       '==': 'published'
    *     }
    *   },
    *   limit: 2
    * });
    * console.log(publishedPosts);
    *
    * @example <caption>Variant 3</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'published', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    * ];
    * store.add('post', posts);
    * const publishedPosts = store
    *   .query('post')
    *   .filter({ status: 'published' })
    *   .limit(2)
    *   .run();
    * console.log(publishedPosts);
    *
    * @example <caption>Variant 4</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'published', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    * ];
    * store.add('post', posts);
    * const publishedPosts = store
    *   .query('post')
    *   .filter({
    *     where: {
    *       status: {
    *         '==': 'published'
    *       }
    *     }
    *   })
    *   .limit(2)
    *   .run();
    * console.log(publishedPosts);
    *
    * @example <caption>Multiple operators</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'published', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    * ];
    * store.add('post', posts);
    *
    * const myPublishedPosts = store.filter('post', {
    *   where: {
    *     status: {
    *       '==': 'published'
    *     },
    *     user_id: {
    *       '==': currentUser.id
    *     }
    *   }
    * });
    *
    * console.log(myPublishedPosts);
    *
    * @name Query.ops
    * @property {Function} == Equality operator.
    * @property {Function} != Inequality operator.
    * @property {Function} > Greater than operator.
    * @property {Function} >= Greater than (inclusive) operator.
    * @property {Function} < Less than operator.
    * @property {Function} <= Less than (inclusive) operator.
    * @property {Function} isectEmpty Operator that asserts that the intersection
    * between two arrays is empty.
    * @property {Function} isectNotEmpty Operator that asserts that the
    * intersection between two arrays is __not__ empty.
    * @property {Function} in Operator that asserts whether a value is in an
    * array.
    * @property {Function} notIn Operator that asserts whether a value is __not__
    * in an array.
    * @property {Function} contains Operator that asserts whether an array
    * contains a value.
    * @property {Function} notContains Operator that asserts whether an array
    * does __not__ contain a value.
    * @since 3.0.0
    * @type {Object}
    */
  var ops: _empty = js.native
}

