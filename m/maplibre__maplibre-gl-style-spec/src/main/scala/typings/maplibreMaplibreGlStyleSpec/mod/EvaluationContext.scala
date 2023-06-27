package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "EvaluationContext")
@js.native
open class EvaluationContext () extends StObject {
  
  var _parseColorCache: StringDictionary[Color] = js.native
  
  var availableImages: js.Array[String] = js.native
  
  var canonical: ICanonicalTileID = js.native
  
  def canonicalID(): ICanonicalTileID = js.native
  
  var feature: Feature = js.native
  
  var featureState: FeatureState = js.native
  
  var formattedSection: FormattedSection = js.native
  
  def geometry(): js.Array[js.Array[typings.mapboxPointGeometry.mod.^]] = js.native
  
  def geometryType(): String = js.native
  
  var globals: GlobalProperties = js.native
  
  def id(): Any = js.native
  
  def parseColor(input: String): Color = js.native
  
  def properties(): StringDictionary[Any] = js.native
}
