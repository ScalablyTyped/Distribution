package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.`lazy`
import typings.inferno.infernoStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IframeHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var allow: js.UndefOr[String | Null] = js.undefined
  
  var allowFullScreen: js.UndefOr[Boolean | Null] = js.undefined
  
  var allowTransparency: js.UndefOr[Boolean | Null] = js.undefined
  
  /** @deprecated */
  var frameBorder: js.UndefOr[Double | String | Null] = js.undefined
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy` | Null] = js.undefined
  
  /** @deprecated */
  var marginHeight: js.UndefOr[Double | Null] = js.undefined
  
  /** @deprecated */
  var marginWidth: js.UndefOr[Double | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy | Null] = js.undefined
  
  var sandbox: js.UndefOr[String | Null] = js.undefined
  
  /** @deprecated */
  var scrolling: js.UndefOr[String | Null] = js.undefined
  
  var seamless: js.UndefOr[Boolean | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
  
  var srcDoc: js.UndefOr[String | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object IframeHTMLAttributes {
  
  inline def apply[T](): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
  
  extension [Self <: IframeHTMLAttributes[?], T](x: Self & IframeHTMLAttributes[T]) {
    
    inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreenNull: Self = StObject.set(x, "allowFullScreen", null)
    
    inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
    
    inline def setAllowNull: Self = StObject.set(x, "allow", null)
    
    inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowTransparencyNull: Self = StObject.set(x, "allowTransparency", null)
    
    inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    inline def setFrameBorderNull: Self = StObject.set(x, "frameBorder", null)
    
    inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingNull: Self = StObject.set(x, "loading", null)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    inline def setMarginHeightNull: Self = StObject.set(x, "marginHeight", null)
    
    inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
    
    inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    inline def setMarginWidthNull: Self = StObject.set(x, "marginWidth", null)
    
    inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyNull: Self = StObject.set(x, "referrerPolicy", null)
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxNull: Self = StObject.set(x, "sandbox", null)
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingNull: Self = StObject.set(x, "scrolling", null)
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessNull: Self = StObject.set(x, "seamless", null)
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
    
    inline def setSrcDocNull: Self = StObject.set(x, "srcDoc", null)
    
    inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
