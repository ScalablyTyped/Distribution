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

