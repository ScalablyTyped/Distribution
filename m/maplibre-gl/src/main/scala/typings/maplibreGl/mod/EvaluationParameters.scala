package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "EvaluationParameters")
@js.native
open class EvaluationParameters protected () extends StObject {
  def this(zoom: Double) = this()
  def this(zoom: Double, options: Any) = this()
  
  def crossFadingFactor(): Double = js.native
  
  var fadeDuration: Double = js.native
  
  def getCrossfadeParameters(): CrossfadeParameters = js.native
  
  def isSupportedScript(str: String): Boolean = js.native
  
  var now: Double = js.native
  
  var transition: TransitionSpecification = js.native
  
  var zoom: Double = js.native
  
  var zoomHistory: ZoomHistory = js.native
}
