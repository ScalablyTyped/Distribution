package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "KeyboardHandler")
@js.native
open class KeyboardHandler protected () extends StObject {
  def this(map: Map) = this()
  
  def disable(): Unit = js.native
  
  /**
    * Disables the "keyboard pan/rotate" interaction, leaving the
    * "keyboard zoom" interaction enabled.
    *
    * @example
    *   map.keyboard.disableRotation();
    */
  def disableRotation(): Unit = js.native
  
  def enable(): Unit = js.native
  
  /**
    * Enables the "keyboard pan/rotate" interaction.
    *
    * @example
    *   map.keyboard.enable();
    *   map.keyboard.enableRotation();
    */
  def enableRotation(): Unit = js.native
  
  /**
    * Returns true if the handler is enabled and has detected the start of a
    * zoom/rotate gesture.
    *
    * @returns {boolean} `true` if the handler is enabled and has detected the
    * start of a zoom/rotate gesture.
    */
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
}
