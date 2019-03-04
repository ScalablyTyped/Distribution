package typings
package jqueryDotToolsLib.JQueryToolsNs.overlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  /** Closes the overlay. */
  def close(): Overlay
  /** Returns the closing element(s) as a jQuery object. */
  def getClosers(): jqueryDotToolsLib.JQuery
  /** Returns the configuration for the overlay. */
  def getConf(): OverlayOptions
  /** Returns the overlayed element as a jQuery object. */
  def getOverlay(): jqueryDotToolsLib.JQuery
  /** Returns the triggering element as a jQuery object. */
  def getTrigger(): jqueryDotToolsLib.JQuery
  /** Returns `true` if the overlay is opened. */
  def isOpened(): scala.Boolean
  /** Opens the overlay. */
  def load(): Overlay
}

object Overlay {
  @scala.inline
  def apply(
    close: js.Function0[Overlay],
    getClosers: js.Function0[jqueryDotToolsLib.JQuery],
    getConf: js.Function0[OverlayOptions],
    getOverlay: js.Function0[jqueryDotToolsLib.JQuery],
    getTrigger: js.Function0[jqueryDotToolsLib.JQuery],
    isOpened: js.Function0[scala.Boolean],
    load: js.Function0[Overlay]
  ): Overlay = {
    val __obj = js.Dynamic.literal(close = close, getClosers = getClosers, getConf = getConf, getOverlay = getOverlay, getTrigger = getTrigger, isOpened = isOpened, load = load)
  
    __obj.asInstanceOf[Overlay]
  }
}

