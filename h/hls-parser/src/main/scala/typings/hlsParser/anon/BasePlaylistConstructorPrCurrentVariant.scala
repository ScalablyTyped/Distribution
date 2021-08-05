package typings.hlsParser.anon

import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.SessionData
import typings.hlsParser.mod.types.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  variants :std.Array<hls-parser.hls-parser.types.Variant> | undefined,   currentVariant :number | undefined,   sessionDataList :std.Array<hls-parser.hls-parser.types.SessionData> | undefined,   sessionKeyList :std.Array<hls-parser.hls-parser.types.Key> | undefined,   source :string | undefined} */
trait BasePlaylistConstructorPrCurrentVariant extends StObject {
  
  var currentVariant: js.UndefOr[Double] = js.undefined
  
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  
  var sessionDataList: js.UndefOr[js.Array[SessionData]] = js.undefined
  
  var sessionKeyList: js.UndefOr[js.Array[Key]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[Offset] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object BasePlaylistConstructorPrCurrentVariant {
  
  inline def apply(): BasePlaylistConstructorPrCurrentVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePlaylistConstructorPrCurrentVariant]
  }
  
  extension [Self <: BasePlaylistConstructorPrCurrentVariant](x: Self) {
    
    inline def setCurrentVariant(value: Double): Self = StObject.set(x, "currentVariant", value.asInstanceOf[js.Any])
    
    inline def setCurrentVariantUndefined: Self = StObject.set(x, "currentVariant", js.undefined)
    
    inline def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
    
    inline def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
    
    inline def setSessionDataList(value: js.Array[SessionData]): Self = StObject.set(x, "sessionDataList", value.asInstanceOf[js.Any])
    
    inline def setSessionDataListUndefined: Self = StObject.set(x, "sessionDataList", js.undefined)
    
    inline def setSessionDataListVarargs(value: SessionData*): Self = StObject.set(x, "sessionDataList", js.Array(value :_*))
    
    inline def setSessionKeyList(value: js.Array[Key]): Self = StObject.set(x, "sessionKeyList", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyListUndefined: Self = StObject.set(x, "sessionKeyList", js.undefined)
    
    inline def setSessionKeyListVarargs(value: Key*): Self = StObject.set(x, "sessionKeyList", js.Array(value :_*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value :_*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
