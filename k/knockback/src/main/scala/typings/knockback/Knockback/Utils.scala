package typings.knockback.Knockback

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  def createFromDefaultCreator(obj: js.Any): js.Any = js.native
  def createFromDefaultCreator(obj: js.Any, options: js.Any): js.Any = js.native
  def hasCollectionSignature(obj: js.Any): Boolean = js.native
  def hasModelSignature(obj: js.Any): Boolean = js.native
  def inferCreator(value: js.Any, factory: Factory, path: String, owner: js.Any, key: String): js.Any = js.native
  def optionsPathJoin(options: js.Any, path: String): js.Any = js.native
  def pathJoin(path1: String, path2: String): String = js.native
  def valueType(observable: KnockoutObservable[_]): js.Any = js.native
  def wrappedDestroy(obj: js.Any): js.Any = js.native
  def wrappedEventWatcher(obj: js.Any): js.Any = js.native
  def wrappedEventWatcher(obj: js.Any, value: js.Any): js.Any = js.native
  def wrappedFactory(obj: js.Any): js.Any = js.native
  def wrappedFactory(obj: js.Any, value: js.Any): js.Any = js.native
  def wrappedModel(obj: js.Any): js.Any = js.native
  def wrappedModel(obj: js.Any, value: js.Any): js.Any = js.native
  def wrappedObject(obj: js.Any): js.Any = js.native
  def wrappedObject(obj: js.Any, value: js.Any): js.Any = js.native
  def wrappedObservable(obj: js.Any): js.Any = js.native
  def wrappedObservable(obj: js.Any, value: js.Any): js.Any = js.native
  def wrappedStore(obj: js.Any): js.Any = js.native
  def wrappedStore(obj: js.Any, value: js.Any): js.Any = js.native
}

