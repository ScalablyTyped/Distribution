package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOptionsBase extends StObject {
  
  /**
    * Used for contexts (eg. male\female)
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
    * Count value used for plurals
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Default value to return if a translation was not found
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Override language to lookup key if not found see fallbacks for details
    */
  var fallbackLng: js.UndefOr[FallbackLng] = js.native
  
  /**
    * Override interpolation options
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.native
  
  /**
    * Char, eg. '\n' that arrays will be joined by (can be set globally too)
    */
  var joinArrays: js.UndefOr[String] = js.native
  
  /**
    * Override char to separate keys
    */
  var keySeparator: js.UndefOr[`false` | String] = js.native
  
  /**
    * Override language to use
    */
  var lng: js.UndefOr[String] = js.native
  
  /**
    * Override languages to use
    */
  var lngs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Override namespaces (string or array)
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Override char to split namespace from key
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.native
  
  /**
    * String or array of postProcessors to apply see interval plurals as a sample
    */
  var postProcess: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Object with vars for interpolation - or put them directly in options
    */
  var replace: js.UndefOr[js.Any] = js.native
  
  /**
    * Accessing an object not a translation string (can be set globally too)
    */
  var returnObjects: js.UndefOr[Boolean] = js.native
}
object TOptionsBase {
  
  @scala.inline
  def apply(): TOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TOptionsBase]
  }
  
  @scala.inline
  implicit class TOptionsBaseMutableBuilder[Self <: TOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setFallbackLng(value: FallbackLng): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = StObject.set(x, "fallbackLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackLngUndefined: Self = StObject.set(x, "fallbackLng", js.undefined)
    
    @scala.inline
    def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value :_*))
    
    @scala.inline
    def setInterpolation(value: InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setJoinArrays(value: String): Self = StObject.set(x, "joinArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinArraysUndefined: Self = StObject.set(x, "joinArrays", js.undefined)
    
    @scala.inline
    def setKeySeparator(value: `false` | String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    
    @scala.inline
    def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    @scala.inline
    def setLngs(value: js.Array[String]): Self = StObject.set(x, "lngs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngsUndefined: Self = StObject.set(x, "lngs", js.undefined)
    
    @scala.inline
    def setLngsVarargs(value: String*): Self = StObject.set(x, "lngs", js.Array(value :_*))
    
    @scala.inline
    def setNs(value: String | js.Array[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsSeparator(value: `false` | String): Self = StObject.set(x, "nsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsSeparatorUndefined: Self = StObject.set(x, "nsSeparator", js.undefined)
    
    @scala.inline
    def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    @scala.inline
    def setNsVarargs(value: String*): Self = StObject.set(x, "ns", js.Array(value :_*))
    
    @scala.inline
    def setPostProcess(value: String | js.Array[String]): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    @scala.inline
    def setPostProcessVarargs(value: String*): Self = StObject.set(x, "postProcess", js.Array(value :_*))
    
    @scala.inline
    def setReplace(value: js.Any): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setReturnObjects(value: Boolean): Self = StObject.set(x, "returnObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnObjectsUndefined: Self = StObject.set(x, "returnObjects", js.undefined)
  }
}
