package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TOptionsBase extends StObject {
  
  /**
    * Used for contexts (eg. male\female)
    */
  var context: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Count value used for plurals
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Default value to return if a translation was not found
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Override language to lookup key if not found see fallbacks for details
    */
  var fallbackLng: js.UndefOr[FallbackLng] = js.undefined
  
  /**
    * Override interpolation options
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.undefined
  
  /**
    * Char, eg. '\n' that arrays will be joined by (can be set globally too)
    */
  var joinArrays: js.UndefOr[String] = js.undefined
  
  /**
    * Override char to separate keys
    */
  var keySeparator: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * Override language to use
    */
  var lng: js.UndefOr[String] = js.undefined
  
  /**
    * Override languages to use
    */
  var lngs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Override namespaces (string or array)
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Override char to split namespace from key
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * String or array of postProcessors to apply see interval plurals as a sample
    */
  var postProcess: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Object with vars for interpolation - or put them directly in options
    */
  var replace: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Accessing an object not a translation string (can be set globally too)
    */
  var returnObjects: js.UndefOr[Boolean] = js.undefined
}
object TOptionsBase {
  
  inline def apply(): TOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TOptionsBase]
  }
  
  extension [Self <: TOptionsBase](x: Self) {
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setFallbackLng(value: FallbackLng): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
    
    inline def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = StObject.set(x, "fallbackLng", js.Any.fromFunction1(value))
    
    inline def setFallbackLngUndefined: Self = StObject.set(x, "fallbackLng", js.undefined)
    
    inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value :_*))
    
    inline def setInterpolation(value: InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setJoinArrays(value: String): Self = StObject.set(x, "joinArrays", value.asInstanceOf[js.Any])
    
    inline def setJoinArraysUndefined: Self = StObject.set(x, "joinArrays", js.undefined)
    
    inline def setKeySeparator(value: `false` | String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
    
    inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    
    inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    inline def setLngs(value: js.Array[String]): Self = StObject.set(x, "lngs", value.asInstanceOf[js.Any])
    
    inline def setLngsUndefined: Self = StObject.set(x, "lngs", js.undefined)
    
    inline def setLngsVarargs(value: String*): Self = StObject.set(x, "lngs", js.Array(value :_*))
    
    inline def setNs(value: String | js.Array[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsSeparator(value: `false` | String): Self = StObject.set(x, "nsSeparator", value.asInstanceOf[js.Any])
    
    inline def setNsSeparatorUndefined: Self = StObject.set(x, "nsSeparator", js.undefined)
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setNsVarargs(value: String*): Self = StObject.set(x, "ns", js.Array(value :_*))
    
    inline def setPostProcess(value: String | js.Array[String]): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setPostProcessVarargs(value: String*): Self = StObject.set(x, "postProcess", js.Array(value :_*))
    
    inline def setReplace(value: js.Any): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReturnObjects(value: Boolean): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    
    inline def setReturnObjectsUndefined: Self = StObject.set(x, "returnObjects", js.undefined)
  }
}
