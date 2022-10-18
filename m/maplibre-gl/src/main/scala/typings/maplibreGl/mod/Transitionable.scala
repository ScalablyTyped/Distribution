package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.anchor
import typings.maplibreGl.maplibreGlStrings.color
import typings.maplibreGl.maplibreGlStrings.intensity
import typings.maplibreGl.maplibreGlStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Transitionable")
@js.native
open class Transitionable[Props] protected () extends StObject {
  def this(properties: Properties[Props]) = this()
  
  var _properties: Properties[Props] = js.native
  
  var _values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Props ]: maplibre-gl.maplibre-gl.TransitionablePropertyValue<any, unknown>} */ js.Any = js.native
  
  @JSName("getTransition")
  def getTransition_anchor(name: anchor): TransitionSpecification | scala.Unit = js.native
  @JSName("getTransition")
  def getTransition_color(name: color): TransitionSpecification | scala.Unit = js.native
  @JSName("getTransition")
  def getTransition_intensity(name: intensity): TransitionSpecification | scala.Unit = js.native
  @JSName("getTransition")
  def getTransition_position(name: position): TransitionSpecification | scala.Unit = js.native
  
  @JSName("getValue")
  def getValue_anchor[T](name: anchor): PropertyValueSpecification[T] | scala.Unit = js.native
  @JSName("getValue")
  def getValue_color[T](name: color): PropertyValueSpecification[T] | scala.Unit = js.native
  @JSName("getValue")
  def getValue_intensity[T](name: intensity): PropertyValueSpecification[T] | scala.Unit = js.native
  @JSName("getValue")
  def getValue_position[T](name: position): PropertyValueSpecification[T] | scala.Unit = js.native
  
  def serialize(): Any = js.native
  
  @JSName("setTransition")
  def setTransition_anchor(name: anchor, value: scala.Unit): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_anchor(name: anchor, value: TransitionSpecification): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_color(name: color, value: scala.Unit): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_color(name: color, value: TransitionSpecification): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_intensity(name: intensity, value: scala.Unit): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_intensity(name: intensity, value: TransitionSpecification): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_position(name: position, value: scala.Unit): scala.Unit = js.native
  @JSName("setTransition")
  def setTransition_position(name: position, value: TransitionSpecification): scala.Unit = js.native
  
  @JSName("setValue")
  def setValue_anchor[T](name: anchor, value: scala.Unit): scala.Unit = js.native
  @JSName("setValue")
  def setValue_anchor[T](name: anchor, value: PropertyValueSpecification[T]): scala.Unit = js.native
  @JSName("setValue")
  def setValue_color[T](name: color, value: scala.Unit): scala.Unit = js.native
  @JSName("setValue")
  def setValue_color[T](name: color, value: PropertyValueSpecification[T]): scala.Unit = js.native
  @JSName("setValue")
  def setValue_intensity[T](name: intensity, value: scala.Unit): scala.Unit = js.native
  @JSName("setValue")
  def setValue_intensity[T](name: intensity, value: PropertyValueSpecification[T]): scala.Unit = js.native
  @JSName("setValue")
  def setValue_position[T](name: position, value: scala.Unit): scala.Unit = js.native
  @JSName("setValue")
  def setValue_position[T](name: position, value: PropertyValueSpecification[T]): scala.Unit = js.native
  
  def transitioned(parameters: TransitionParameters, prior: Transitioning[Props]): Transitioning[Props] = js.native
  
  def untransitioned(): Transitioning[Props] = js.native
}
