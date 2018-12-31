package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotify extends js.Object {
  /**
    * The state can be "initializing", "opening", "open", "closing", and "closed"
    */
  var state: js.UndefOr[StateOptions] = js.native
  /**
    *  Get the DOM element.
    */
  def get(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    *  Display the notice.
    */
  def open(): scala.Unit = js.native
  /**
    * Remove the notice.
    */
  def remove(): scala.Unit = js.native
  /**
    * This function is for updating the notice.
    */
  def update(): PNotify = js.native
  def update(options: PNotifyOptions): PNotify = js.native
}

