package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Campaign ad blocking settings.
  */
@js.native
trait SchemaAdBlockingConfiguration extends js.Object {
  
  /**
    * Click-through URL used by brand-neutral ads. This is a required field
    * when overrideClickThroughUrl is set to true.
    */
  var clickThroughUrl: js.UndefOr[String] = js.native
  
  /**
    * ID of a creative bundle to use for this campaign. If set, brand-neutral
    * ads will select creatives from this bundle. Otherwise, a default
    * transparent pixel will be used.
    */
  var creativeBundleId: js.UndefOr[String] = js.native
  
  /**
    * Whether this campaign has enabled ad blocking. When true, ad blocking is
    * enabled for placements in the campaign, but this may be overridden by
    * site and placement settings. When false, ad blocking is disabled for all
    * placements under the campaign, regardless of site and placement settings.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the brand-neutral ad&#39;s click-through URL comes from the
    * campaign&#39;s creative bundle or the override URL. Must be set to true
    * if ad blocking is enabled and no creative bundle is configured.
    */
  var overrideClickThroughUrl: js.UndefOr[Boolean] = js.native
}
object SchemaAdBlockingConfiguration {
  
  @scala.inline
  def apply(): SchemaAdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdBlockingConfiguration]
  }
  
  @scala.inline
  implicit class SchemaAdBlockingConfigurationOps[Self <: SchemaAdBlockingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClickThroughUrl(value: String): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCreativeBundleId(value: String): Self = this.set("creativeBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeBundleId: Self = this.set("creativeBundleId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOverrideClickThroughUrl(value: Boolean): Self = this.set("overrideClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideClickThroughUrl: Self = this.set("overrideClickThroughUrl", js.undefined)
  }
}
