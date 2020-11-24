package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOptionsBase extends js.Object {
  
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
  implicit class TOptionsBaseOps[Self <: TOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setFallbackLngVarargs(value: String*): Self = this.set("fallbackLng", js.Array(value :_*))
    
    @scala.inline
    def setFallbackLngFunction1(value: /* code */ String => String | js.Array[String] | FallbackLngObjList): Self = this.set("fallbackLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackLng(value: FallbackLng): Self = this.set("fallbackLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLng: Self = this.set("fallbackLng", js.undefined)
    
    @scala.inline
    def setInterpolation(value: InterpolationOptions): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setJoinArrays(value: String): Self = this.set("joinArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinArrays: Self = this.set("joinArrays", js.undefined)
    
    @scala.inline
    def setKeySeparator(value: `false` | String): Self = this.set("keySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySeparator: Self = this.set("keySeparator", js.undefined)
    
    @scala.inline
    def setLng(value: String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLngsVarargs(value: String*): Self = this.set("lngs", js.Array(value :_*))
    
    @scala.inline
    def setLngs(value: js.Array[String]): Self = this.set("lngs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLngs: Self = this.set("lngs", js.undefined)
    
    @scala.inline
    def setNsVarargs(value: String*): Self = this.set("ns", js.Array(value :_*))
    
    @scala.inline
    def setNs(value: String | js.Array[String]): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    
    @scala.inline
    def setNsSeparator(value: `false` | String): Self = this.set("nsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsSeparator: Self = this.set("nsSeparator", js.undefined)
    
    @scala.inline
    def setPostProcessVarargs(value: String*): Self = this.set("postProcess", js.Array(value :_*))
    
    @scala.inline
    def setPostProcess(value: String | js.Array[String]): Self = this.set("postProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    
    @scala.inline
    def setReplace(value: js.Any): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setReturnObjects(value: Boolean): Self = this.set("returnObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnObjects: Self = this.set("returnObjects", js.undefined)
  }
}
