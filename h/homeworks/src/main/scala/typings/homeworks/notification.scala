package typings.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("notification")
@js.native
object notification extends js.Object {
  /**
    * @since 1.0.44
    */
  def apply(title: String, content: String, url: String): Unit = js.native
  def apply(title: String, content: String, url: String, status: String): Unit = js.native
}

