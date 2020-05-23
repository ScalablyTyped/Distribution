package typings.keya.storeMod

import org.scalablytyped.runtime.StringDictionary
import typings.keya.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/core/Store", JSImport.Default)
@js.native
abstract class default protected () extends Store {
  def this(name: String) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var store: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /* CompleteClass */
  override def all(): js.Promise[js.Array[Key]] = js.native
  /* CompleteClass */
  override def clear(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: String): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def find(finder: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean]): js.Promise[js.Array[Key]] = js.native
  /* CompleteClass */
  override def get(key: String): js.Promise[_] = js.native
  /* CompleteClass */
  override def initalize(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def load(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def save(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def set(key: String, value: js.Any): js.Promise[Boolean] = js.native
}

