package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerTileResult extends StObject {
  
  var buckets: js.Array[Bucket]
  
  var collisionBoxArray: CollisionBoxArray
  
  var featureIndex: FeatureIndex
  
  var glyphAtlasImage: AlphaImage
  
  var glyphMap: js.UndefOr[StringDictionary[NumberDictionary[StyleGlyph]] | Null] = js.undefined
  
  var glyphPositions: js.UndefOr[GlyphPositions | Null] = js.undefined
  
  var iconMap: js.UndefOr[StringDictionary[StyleImage] | Null] = js.undefined
  
  var imageAtlas: ImageAtlas
  
  var rawTileData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var resourceTiming: js.UndefOr[js.Array[PerformanceResourceTiming]] = js.undefined
}
object WorkerTileResult {
  
  inline def apply(
    buckets: js.Array[Bucket],
    collisionBoxArray: CollisionBoxArray,
    featureIndex: FeatureIndex,
    glyphAtlasImage: AlphaImage,
    imageAtlas: ImageAtlas
  ): WorkerTileResult = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], collisionBoxArray = collisionBoxArray.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any], glyphAtlasImage = glyphAtlasImage.asInstanceOf[js.Any], imageAtlas = imageAtlas.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerTileResult]
  }
  
  extension [Self <: WorkerTileResult](x: Self) {
    
    inline def setBuckets(value: js.Array[Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setCollisionBoxArray(value: CollisionBoxArray): Self = StObject.set(x, "collisionBoxArray", value.asInstanceOf[js.Any])
    
    inline def setFeatureIndex(value: FeatureIndex): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
    
    inline def setGlyphAtlasImage(value: AlphaImage): Self = StObject.set(x, "glyphAtlasImage", value.asInstanceOf[js.Any])
    
    inline def setGlyphMap(value: StringDictionary[NumberDictionary[StyleGlyph]]): Self = StObject.set(x, "glyphMap", value.asInstanceOf[js.Any])
    
    inline def setGlyphMapNull: Self = StObject.set(x, "glyphMap", null)
    
    inline def setGlyphMapUndefined: Self = StObject.set(x, "glyphMap", js.undefined)
    
    inline def setGlyphPositions(value: GlyphPositions): Self = StObject.set(x, "glyphPositions", value.asInstanceOf[js.Any])
    
    inline def setGlyphPositionsNull: Self = StObject.set(x, "glyphPositions", null)
    
    inline def setGlyphPositionsUndefined: Self = StObject.set(x, "glyphPositions", js.undefined)
    
    inline def setIconMap(value: StringDictionary[StyleImage]): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    inline def setIconMapNull: Self = StObject.set(x, "iconMap", null)
    
    inline def setIconMapUndefined: Self = StObject.set(x, "iconMap", js.undefined)
    
    inline def setImageAtlas(value: ImageAtlas): Self = StObject.set(x, "imageAtlas", value.asInstanceOf[js.Any])
    
    inline def setRawTileData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "rawTileData", value.asInstanceOf[js.Any])
    
    inline def setRawTileDataUndefined: Self = StObject.set(x, "rawTileData", js.undefined)
    
    inline def setResourceTiming(value: js.Array[PerformanceResourceTiming]): Self = StObject.set(x, "resourceTiming", value.asInstanceOf[js.Any])
    
    inline def setResourceTimingUndefined: Self = StObject.set(x, "resourceTiming", js.undefined)
    
    inline def setResourceTimingVarargs(value: PerformanceResourceTiming*): Self = StObject.set(x, "resourceTiming", js.Array(value*))
  }
}
