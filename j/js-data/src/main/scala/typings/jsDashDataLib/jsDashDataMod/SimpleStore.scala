package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "SimpleStore")
@js.native
class SimpleStore () extends Container {
  def this(opts: js.Any) = this()
  var _collections: js.Object = js.native
  var _completedQueries: js.Object = js.native
  var _pendingQueries: js.Object = js.native
  var collectionClass: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[/* records */ js.Array[js.Any]], 
    js.UndefOr[/* opts */ js.Any], 
    Collection
  ] = js.native
  var usePendingFind: scala.Boolean = js.native
  var usePendingFindAll: scala.Boolean = js.native
  def _callSuper(method: java.lang.String, args: js.Any*): js.Any = js.native
  def _end(mapperName: java.lang.String, data: js.Any): js.Any = js.native
  def _end(mapperName: java.lang.String, data: js.Any, opts: js.Any): js.Any = js.native
  def add(mapperName: java.lang.String, records: js.Any): js.Array[_] | js.Any = js.native
  def add(mapperName: java.lang.String, records: js.Any, opts: js.Any): js.Array[_] | js.Any = js.native
  def add(mapperName: java.lang.String, records: js.Array[_]): js.Array[_] | js.Any = js.native
  def add(mapperName: java.lang.String, records: js.Array[_], opts: js.Any): js.Array[_] | js.Any = js.native
  def addToCache(mapperName: java.lang.String, data: js.Any, opts: js.Any): js.Any = js.native
  def between(mapperName: java.lang.String, leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(mapperName: java.lang.String, leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  def cacheFind(mapperName: java.lang.String, data: js.Any, id: java.lang.String, opts: js.Any): scala.Unit = js.native
  def cacheFind(mapperName: java.lang.String, data: js.Any, id: scala.Double, opts: js.Any): scala.Unit = js.native
  def cacheFindAll(mapperName: java.lang.String, data: js.Any, hash: java.lang.String, opts: js.Any): scala.Unit = js.native
  def cachedFind(mapperName: java.lang.String, id: java.lang.String, opts: js.Any): js.Any = js.native
  def cachedFind(mapperName: java.lang.String, id: js.Any): js.Any = js.native
  def cachedFind(mapperName: java.lang.String, id: js.Any, opts: js.Any): js.Any = js.native
  def cachedFind(mapperName: java.lang.String, id: scala.Double, opts: js.Any): js.Any = js.native
  def cachedFindAll(mapperName: java.lang.String, hash: java.lang.String, opts: js.Any): js.Any = js.native
  def cachedFindAll(mapperName: java.lang.String, query: js.Any): js.Any = js.native
  def cachedFindAll(mapperName: java.lang.String, query: js.Any, opts: js.Any): js.Any = js.native
  def clear(): js.Any = js.native
  def create(mapperName: java.lang.String, record: js.Any): js.Promise[_] = js.native
  def create(mapperName: java.lang.String, record: js.Any, opts: js.Any): js.Promise[_] = js.native
  def createIndex(mapperName: java.lang.String, name: js.Any, fieldList: js.Any): Collection = js.native
  def createIndex(mapperName: java.lang.String, name: js.Any, fieldList: js.Any, opts: js.Any): Collection = js.native
  def createMany(mapperName: java.lang.String, records: js.Any): js.Promise[js.Array[_] | _] = js.native
  def createMany(mapperName: java.lang.String, records: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
  def destroy(mapperName: java.lang.String, id: js.Any): js.Promise[_] = js.native
  def destroy(mapperName: java.lang.String, id: js.Any, opts: js.Any): js.Promise[_] = js.native
  def destroyAll(mapperName: java.lang.String): js.Promise[_] = js.native
  def destroyAll(mapperName: java.lang.String, query: js.Any): js.Promise[_] = js.native
  def destroyAll(mapperName: java.lang.String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def filter(mapperName: java.lang.String, query: js.Any): js.Array[_] = js.native
  def filter(mapperName: java.lang.String, query: js.Any, thisArg: js.Any): js.Array[_] = js.native
  def find(mapperName: java.lang.String, id: js.Any): js.Promise[_] = js.native
  def find(mapperName: java.lang.String, id: js.Any, opts: js.Any): js.Promise[_] = js.native
  def findAll(mapperName: java.lang.String): js.Promise[_] = js.native
  def findAll(mapperName: java.lang.String, query: js.Any): js.Promise[_] = js.native
  def findAll(mapperName: java.lang.String, query: js.Any, opts: js.Any): js.Promise[_] = js.native
  def get(mapperName: java.lang.String, id: java.lang.String): js.Any = js.native
  def get(mapperName: java.lang.String, id: scala.Double): js.Any = js.native
  def getAll(mapperName: java.lang.String, args: js.Any*): js.Array[_] = js.native
  def getCollection(mapperName: java.lang.String): Collection = js.native
  def hashQuery(mapperName: java.lang.String, query: js.Any): java.lang.String = js.native
  def hashQuery(mapperName: java.lang.String, query: js.Any, opts: js.Any): java.lang.String = js.native
  def query(mapperName: java.lang.String): Query = js.native
  def remove(mapperName: java.lang.String, id: java.lang.String): js.Any = js.native
  def remove(mapperName: java.lang.String, id: java.lang.String, opts: js.Any): js.Any = js.native
  def remove(mapperName: java.lang.String, id: scala.Double): js.Any = js.native
  def remove(mapperName: java.lang.String, id: scala.Double, opts: js.Any): js.Any = js.native
  def removeAll(mapperName: java.lang.String): scala.Unit | js.Array[_] = js.native
  def removeAll(mapperName: java.lang.String, query: js.Any): scala.Unit | js.Array[_] = js.native
  def removeAll(mapperName: java.lang.String, query: js.Any, opts: js.Any): scala.Unit | js.Array[_] = js.native
  def toJson(mapperName: java.lang.String): js.Array[_] = js.native
  def toJson(mapperName: java.lang.String, opts: js.Any): js.Array[_] = js.native
  def update(mapperName: java.lang.String, id: js.Any, record: js.Any): js.Promise[_] = js.native
  def update(mapperName: java.lang.String, id: js.Any, record: js.Any, opts: js.Any): js.Promise[_] = js.native
  def updateAll(mapperName: java.lang.String, props: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateAll(mapperName: java.lang.String, props: js.Any, query: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateAll(mapperName: java.lang.String, props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateMany(mapperName: java.lang.String, records: js.Any): js.Promise[js.Array[_] | _] = js.native
  def updateMany(mapperName: java.lang.String, records: js.Any, opts: js.Any): js.Promise[js.Array[_] | _] = js.native
}

