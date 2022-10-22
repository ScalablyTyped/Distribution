package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings._empty
import typings.inferno.infernoStrings.`lazy`
import typings.inferno.infernoStrings.`use-credentials`
import typings.inferno.infernoStrings.anonymous
import typings.inferno.infernoStrings.async
import typings.inferno.infernoStrings.auto
import typings.inferno.infernoStrings.eager
import typings.inferno.infernoStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var alt: js.UndefOr[String | Null] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty | Null] = js.undefined
  
  var decoding: js.UndefOr[async | auto | sync | Null] = js.undefined
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy` | Null] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy | Null] = js.undefined
  
  var sizes: js.UndefOr[String | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
  
  var srcSet: js.UndefOr[String | Null] = js.undefined
  
  var useMap: js.UndefOr[String | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object ImgHTMLAttributes {
  
  inline def apply[T](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  
  extension [Self <: ImgHTMLAttributes[?], T](x: Self & ImgHTMLAttributes[T]) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDecoding(value: async | auto | sync): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingNull: Self = StObject.set(x, "decoding", null)
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingNull: Self = StObject.set(x, "loading", null)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyNull: Self = StObject.set(x, "referrerPolicy", null)
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesNull: Self = StObject.set(x, "sizes", null)
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetNull: Self = StObject.set(x, "srcSet", null)
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    inline def setUseMapNull: Self = StObject.set(x, "useMap", null)
    
    inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
