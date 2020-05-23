package typings.keya.storeMod

import org.scalablytyped.runtime.StringDictionary
import typings.keya.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var name: String
  var store: StringDictionary[js.Any]
  var version: Double
  def all(): js.Promise[js.Array[Key]]
  def clear(): js.Promise[Unit]
  def delete(key: String): js.Promise[Boolean]
  def find(finder: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean]): js.Promise[js.Array[Key]]
  def get(key: String): js.Promise[_]
  def initalize(): js.Promise[Unit]
  def load(): js.Promise[Unit]
  def save(): js.Promise[Unit]
  def set(key: String, value: js.Any): js.Promise[Boolean]
}

object Store {
  @scala.inline
  def apply(
    all: () => js.Promise[js.Array[Key]],
    clear: () => js.Promise[Unit],
    delete: String => js.Promise[Boolean],
    find: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean] => js.Promise[js.Array[Key]],
    get: String => js.Promise[_],
    initalize: () => js.Promise[Unit],
    load: () => js.Promise[Unit],
    name: String,
    save: () => js.Promise[Unit],
    set: (String, js.Any) => js.Promise[Boolean],
    store: StringDictionary[js.Any],
    version: Double
  ): Store = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), get = js.Any.fromFunction1(get), initalize = js.Any.fromFunction0(initalize), load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
}

