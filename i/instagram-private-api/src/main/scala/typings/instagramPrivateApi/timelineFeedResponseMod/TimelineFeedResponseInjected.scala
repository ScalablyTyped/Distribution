package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseInjected extends js.Object {
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
  var view_tags: js.Array[_]
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
    view_tags: js.Array[_]
  ): TimelineFeedResponseInjected = {
    val __obj = js.Dynamic.literal(about_ad_params = about_ad_params.asInstanceOf[js.Any], ad_id = ad_id.asInstanceOf[js.Any], ad_title = ad_title.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], direct_share = direct_share.asInstanceOf[js.Any], display_viewability_eligible = display_viewability_eligible.asInstanceOf[js.Any], hide_flow_type = hide_flow_type.asInstanceOf[js.Any], hide_label = hide_label.asInstanceOf[js.Any], hide_reasons_v2 = hide_reasons_v2.asInstanceOf[js.Any], invalidation = invalidation.asInstanceOf[js.Any], is_demo = is_demo.asInstanceOf[js.Any], is_holdout = is_holdout.asInstanceOf[js.Any], is_leadgen_native_eligible = is_leadgen_native_eligible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lead_gen_form_id = lead_gen_form_id.asInstanceOf[js.Any], show_ad_choices = show_ad_choices.asInstanceOf[js.Any], show_icon = show_icon.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any], view_tags = view_tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineFeedResponseInjected]
  }
}

