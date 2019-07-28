package typings.ladda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Creates a new instance of ladda for the selected button
    */
  def ladda(): JQuery = js.native
  /**
    * The action controls or checks the state of the ladda button.  
    * Possible actions are 'start', 'stop', 'toggle', 'stopAll'
    * Possible check 'isLoading'
    */
  def ladda(action: String): JQuery = js.native
  /**
    * When the action is 'setProgress' you can pass a number between
    * 0 and 1 for the options to represent the progress.  For example .5 would be 50%
    * When the action is 'bind' you can pass an object with a property
    * called timeout with the timeout value in milliseconds. 
    * For example { timeout: 2000 }
    */
  def ladda(action: String, options: js.Any): JQuery = js.native
}

