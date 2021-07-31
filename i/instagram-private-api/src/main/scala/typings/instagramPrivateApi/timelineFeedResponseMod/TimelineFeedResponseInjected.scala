package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseInjected extends StObject {
  
  var about_ad_params: String
  
  var ad_id: String
  
  var ad_title: String
  
  var cookies: js.Array[String]
  
  var direct_share: Boolean
  
  var display_viewability_eligible: Boolean
  
  var hide_flow_type: Double
  
  var hide_label: String
  
  var hide_reasons_v2: js.Array[TimelineFeedResponseHideReasonsV2Item]
  
  var invalidation: Null
  
  var is_demo: Boolean
  
  var is_holdout: Boolean
  
  var is_leadgen_native_eligible: Boolean
  
  var label: String
  
  var lead_gen_form_id: String | Double
  
  var show_ad_choices: Boolean
  
  var show_icon: Boolean
  
  var tracking_token: String
  
  var view_tags: js.Array[js.Any]
}
object TimelineFeedResponseInjected {
  
  @scala.inline
  def apply(
    about_ad_params: String,
    ad_id: String,
    ad_title: String,
    cookies: js.Array[String],
    direct_share: Boolean,
    display_viewability_eligible: Boolean,
    hide_flow_type: Double,
    hide_label: String,
    hide_reasons_v2: js.Array[TimelineFeedResponseHideReasonsV2Item],
    invalidation: Null,
    is_demo: Boolean,
    is_holdout: Boolean,
    is_leadgen_native_eligible: Boolean,
    label: String,
    lead_gen_form_id: String | Double,
    show_ad_choices: Boolean,
    show_icon: Boolean,
    tracking_token: String,
    view_tags: js.Array[js.Any]
  ): TimelineFeedResponseInjected = {
    val __obj = js.Dynamic.literal(about_ad_params = about_ad_params.asInstanceOf[js.Any], ad_id = ad_id.asInstanceOf[js.Any], ad_title = ad_title.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], direct_share = direct_share.asInstanceOf[js.Any], display_viewability_eligible = display_viewability_eligible.asInstanceOf[js.Any], hide_flow_type = hide_flow_type.asInstanceOf[js.Any], hide_label = hide_label.asInstanceOf[js.Any], hide_reasons_v2 = hide_reasons_v2.asInstanceOf[js.Any], invalidation = invalidation.asInstanceOf[js.Any], is_demo = is_demo.asInstanceOf[js.Any], is_holdout = is_holdout.asInstanceOf[js.Any], is_leadgen_native_eligible = is_leadgen_native_eligible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lead_gen_form_id = lead_gen_form_id.asInstanceOf[js.Any], show_ad_choices = show_ad_choices.asInstanceOf[js.Any], show_icon = show_icon.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any], view_tags = view_tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseInjected]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseInjectedMutableBuilder[Self <: TimelineFeedResponseInjected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout_ad_params(value: String): Self = StObject.set(x, "about_ad_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_id(value: String): Self = StObject.set(x, "ad_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_title(value: String): Self = StObject.set(x, "ad_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    @scala.inline
    def setDirect_share(value: Boolean): Self = StObject.set(x, "direct_share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_viewability_eligible(value: Boolean): Self = StObject.set(x, "display_viewability_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_flow_type(value: Double): Self = StObject.set(x, "hide_flow_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_label(value: String): Self = StObject.set(x, "hide_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_reasons_v2(value: js.Array[TimelineFeedResponseHideReasonsV2Item]): Self = StObject.set(x, "hide_reasons_v2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_reasons_v2Varargs(value: TimelineFeedResponseHideReasonsV2Item*): Self = StObject.set(x, "hide_reasons_v2", js.Array(value :_*))
    
    @scala.inline
    def setInvalidation(value: Null): Self = StObject.set(x, "invalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_demo(value: Boolean): Self = StObject.set(x, "is_demo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_holdout(value: Boolean): Self = StObject.set(x, "is_holdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_leadgen_native_eligible(value: Boolean): Self = StObject.set(x, "is_leadgen_native_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLead_gen_form_id(value: String | Double): Self = StObject.set(x, "lead_gen_form_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_ad_choices(value: Boolean): Self = StObject.set(x, "show_ad_choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_icon(value: Boolean): Self = StObject.set(x, "show_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_token(value: String): Self = StObject.set(x, "tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_tags(value: js.Array[js.Any]): Self = StObject.set(x, "view_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_tagsVarargs(value: js.Any*): Self = StObject.set(x, "view_tags", js.Array(value :_*))
  }
}
