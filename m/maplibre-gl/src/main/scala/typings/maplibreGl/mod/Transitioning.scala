package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Transitioning")
@js.native
open class Transitioning[Props] protected () extends StObject {
  def this(properties: Properties[Props]) = this()
  
  var _properties: Properties[Props] = js.native
  
  var _values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Props ]: maplibre-gl.maplibre-gl.PossiblyEvaluatedPropertyValue<unknown>} */ js.Any = js.native
  
  def hasTransition(): Boolean = js.native
  
  def possiblyEvaluate(parameters: EvaluationParameters): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: scala.Unit, availableImages: js.Array[String]): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID, availableImages: js.Array[String]): PossiblyEvaluated[Props, Any] = js.native
}
