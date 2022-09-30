package typings.leaflet.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Draggable")
@js.native
open class Draggable protected () extends Evented {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, dragStartTarget: HTMLElement) = this()
  def this(element: HTMLElement, dragStartTarget: Unit, preventOutline: Boolean) = this()
  def this(element: HTMLElement, dragStartTarget: HTMLElement, preventOutline: Boolean) = this()
  def this(element: HTMLElement, dragStartTarget: Unit, preventOutline: Boolean, options: DraggableOptions) = this()
  def this(element: HTMLElement, dragStartTarget: Unit, preventOutline: Unit, options: DraggableOptions) = this()
  def this(
    element: HTMLElement,
    dragStartTarget: HTMLElement,
    preventOutline: Boolean,
    options: DraggableOptions
  ) = this()
  def this(
    element: HTMLElement,
    dragStartTarget: HTMLElement,
    preventOutline: Unit,
    options: DraggableOptions
  ) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def finishDrag(): Unit = js.native
}
