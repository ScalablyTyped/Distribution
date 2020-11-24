package typings.graygelf.mod

import typings.graygelf.graygelfStrings.error
import typings.graygelf.graygelfStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListener extends js.Object {
  
  /**
    * Set a listener to error event
    *
    * @param event listen error event
    * @param cb callback function that receives error messsage
    */
  def apply(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
  /**
    * Set a listener to message event
    *
    * @param event listen message event
    * @param cb callback function that receives message
    */
  def apply(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
}
