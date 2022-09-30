package typings.leafletEditable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EditableMixin is included to L.Polyline, L.Polygon, L.Rectangle, L.Circle and L.Marker.
  * It adds some methods to them.
  */
@js.native
trait EditableMixin extends StObject {
  
  /**
    * Disable editing, also remove the editor property reference.
    */
  def disableEdit(): Unit = js.native
  
  /**
    * Return true if current instance has an editor attached, and this editor is enabled.
    */
  def editEnabled(): Boolean = js.native
  
  /**
    * Enable editing, by creating an editor if not existing, and then calling enable on it.
    */
  def enableEdit(): Editor = js.native
  def enableEdit(map: Map): Editor = js.native
  
  /**
    * Enable or disable editing, according to current status.
    */
  def toggleEdit(): Unit = js.native
}
