package typings.jsonPointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-pointer", "walk")
@js.native
object walk extends js.Object {
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def apply(`object`: js.Object, iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = js.native
}

