package typings.jqueryDotTools.JQueryTools.overlay

import typings.jqueryDotTools.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  /** Closes the overlay. */
  def close(): Overlay
  /** Returns the closing element(s) as a jQuery object. */
  def getClosers(): JQuery
  /** Returns the configuration for the overlay. */
  def getConf(): OverlayOptions
  /** Returns the overlayed element as a jQuery object. */
  def getOverlay(): JQuery
  /** Returns the triggering element as a jQuery object. */
  def getTrigger(): JQuery
  /** Returns `true` if the overlay is opened. */
  def isOpened(): Boolean
  /** Opens the overlay. */
  def load(): Overlay
}

object Overlay {
  @scala.inline
  def apply(
    close: () => Overlay,
    getClosers: () => JQuery,
    getConf: () => OverlayOptions,
    getOverlay: () => JQuery,
    getTrigger: () => JQuery,
    isOpened: () => Boolean,
    load: () => Overlay
  ): Overlay = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getClosers = js.Any.fromFunction0(getClosers), getConf = js.Any.fromFunction0(getConf), getOverlay = js.Any.fromFunction0(getOverlay), getTrigger = js.Any.fromFunction0(getTrigger), isOpened = js.Any.fromFunction0(isOpened), load = js.Any.fromFunction0(load))
  
    __obj.asInstanceOf[Overlay]
  }
}

