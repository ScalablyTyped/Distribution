package typings.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * @since 1.0.44
    */
  def notification(title: String, content: String, url: String): Unit = js.native
  def notification(title: String, content: String, url: String, status: String): Unit = js.native
  /**
    * @since 1.0.44
    */
  def toast(message: js.Any): Unit = js.native
  @js.native
  object homeworks extends js.Object {
    /**
      * @since 1.0.44
      */
    def disableHook(): Unit = js.native
  }
  
}

