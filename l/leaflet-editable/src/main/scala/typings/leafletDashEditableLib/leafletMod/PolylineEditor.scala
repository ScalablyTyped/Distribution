package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.PathEditor.
  */
trait PolylineEditor extends PathEditor {
  /**
    * Set up drawing tools to continue the line backward.
    */
  def continueBackward(): scala.Unit
  /**
    * Set up drawing tools to continue the line forward.
    */
  def continueForward(): scala.Unit
}

