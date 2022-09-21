package typings.maplibreGl.mod

import typings.maplibreGl.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Light")
@js.native
open class Light () extends Evented {
  def this(lightOptions: LightSpecification) = this()
  
  var _transitionable: Transitionable[Props] = js.native
  
  var _transitioning: Transitioning[Props] = js.native
  
  def _validate(validate: js.Function, value: Any): Boolean = js.native
  def _validate(validate: js.Function, value: Any, options: Validate): Boolean = js.native
  
  def getLight(): Any = js.native
  
  def hasTransition(): Boolean = js.native
  
  var properties: PossiblyEvaluated[Props, PropsPossiblyEvaluated] = js.native
  
  def recalculate(parameters: EvaluationParameters): scala.Unit = js.native
  
  def setLight(): scala.Unit = js.native
  def setLight(light: scala.Unit, options: StyleSetterOptions): scala.Unit = js.native
  def setLight(light: LightSpecification): scala.Unit = js.native
  def setLight(light: LightSpecification, options: StyleSetterOptions): scala.Unit = js.native
  
  def updateTransitions(parameters: TransitionParameters): scala.Unit = js.native
}
