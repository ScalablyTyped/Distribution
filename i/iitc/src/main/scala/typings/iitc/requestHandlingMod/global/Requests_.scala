package typings.iitc.requestHandlingMod.global

import typings.jquery.JQuery.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Requests")
@js.native
class Requests_ () extends js.Object {
  
  def abort(): Unit = js.native
  
  def add(ajax: jqXHR[_]): Unit = js.native
  
  /**
    * add method here to be notified of auto-refreshes
    */
  def addRefreshFunction(fct: js.Function0[Unit]): Unit = js.native
  
  def isLastRequest(ajax: jqXHR[_]): Boolean = js.native
  
  def remove(ajax: jqXHR[_]): Unit = js.native
  
  /**
    * sets the timer for the next auto refresh. Ensures only one timeout
    * is queued. May be given 'override' in milliseconds if time should
    * not be guessed automatically. Especially useful if a little delay
    * is required, for example when zooming.
    */
  def startRefreshTimeout(`override`: Double): Unit = js.native
}
