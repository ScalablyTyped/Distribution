package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationContext extends StObject {
  
  var _parseColorCache: StringDictionary[Color]
  
  var availableImages: js.Array[String]
  
  var canonical: CanonicalTileID
  
  def canonicalID(): CanonicalTileID
  
  var feature: Feature
  
  var featureState: FeatureState
  
  var formattedSection: FormattedSection
  
  def geometry(): js.Array[js.Array[typings.mapboxPointGeometry.mod.^]]
  
  def geometryType(): String
  
  var globals: GlobalProperties
  
  def id(): Any
  
  def parseColor(input: String): Color
  
  def properties(): StringDictionary[Any]
}
object EvaluationContext {
  
  inline def apply(
    _parseColorCache: StringDictionary[Color],
    availableImages: js.Array[String],
    canonical: CanonicalTileID,
    canonicalID: () => CanonicalTileID,
    feature: Feature,
    featureState: FeatureState,
    formattedSection: FormattedSection,
    geometry: () => js.Array[js.Array[typings.mapboxPointGeometry.mod.^]],
    geometryType: () => String,
    globals: GlobalProperties,
    id: () => Any,
    parseColor: String => Color,
    properties: () => StringDictionary[Any]
  ): EvaluationContext = {
    val __obj = js.Dynamic.literal(_parseColorCache = _parseColorCache.asInstanceOf[js.Any], availableImages = availableImages.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], canonicalID = js.Any.fromFunction0(canonicalID), feature = feature.asInstanceOf[js.Any], featureState = featureState.asInstanceOf[js.Any], formattedSection = formattedSection.asInstanceOf[js.Any], geometry = js.Any.fromFunction0(geometry), geometryType = js.Any.fromFunction0(geometryType), globals = globals.asInstanceOf[js.Any], id = js.Any.fromFunction0(id), parseColor = js.Any.fromFunction1(parseColor), properties = js.Any.fromFunction0(properties))
    __obj.asInstanceOf[EvaluationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationContext] (val x: Self) extends AnyVal {
    
    inline def setAvailableImages(value: js.Array[String]): Self = StObject.set(x, "availableImages", value.asInstanceOf[js.Any])
    
    inline def setAvailableImagesVarargs(value: String*): Self = StObject.set(x, "availableImages", js.Array(value*))
    
    inline def setCanonical(value: CanonicalTileID): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setCanonicalID(value: () => CanonicalTileID): Self = StObject.set(x, "canonicalID", js.Any.fromFunction0(value))
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureState(value: FeatureState): Self = StObject.set(x, "featureState", value.asInstanceOf[js.Any])
    
    inline def setFormattedSection(value: FormattedSection): Self = StObject.set(x, "formattedSection", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: () => js.Array[js.Array[typings.mapboxPointGeometry.mod.^]]): Self = StObject.set(x, "geometry", js.Any.fromFunction0(value))
    
    inline def setGeometryType(value: () => String): Self = StObject.set(x, "geometryType", js.Any.fromFunction0(value))
    
    inline def setGlobals(value: GlobalProperties): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setId(value: () => Any): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setParseColor(value: String => Color): Self = StObject.set(x, "parseColor", js.Any.fromFunction1(value))
    
    inline def setProperties(value: () => StringDictionary[Any]): Self = StObject.set(x, "properties", js.Any.fromFunction0(value))
    
    inline def set_parseColorCache(value: StringDictionary[Color]): Self = StObject.set(x, "_parseColorCache", value.asInstanceOf[js.Any])
  }
}
