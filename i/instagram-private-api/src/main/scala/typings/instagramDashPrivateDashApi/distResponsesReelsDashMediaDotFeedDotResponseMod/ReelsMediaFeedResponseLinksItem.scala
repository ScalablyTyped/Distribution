package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseLinksItem extends js.Object {
  @JSName("package")
  var _package: String
  var androidClass: String
  var appInstallObjectiveInvalidationBehavior: Null
  var callToActionTitle: String
  var deeplinkUri: String
  var igUserId: String
  var leadGenFormId: String
  var linkType: Double
  var redirectUri: Null
  var webUri: String
}

object ReelsMediaFeedResponseLinksItem {
  @scala.inline
  def apply(
    _package: String,
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: String,
    leadGenFormId: String,
    linkType: Double,
    redirectUri: Null,
    webUri: String
  ): ReelsMediaFeedResponseLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass.asInstanceOf[js.Any], appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior.asInstanceOf[js.Any], callToActionTitle = callToActionTitle.asInstanceOf[js.Any], deeplinkUri = deeplinkUri.asInstanceOf[js.Any], igUserId = igUserId.asInstanceOf[js.Any], leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], webUri = webUri.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseLinksItem]
  }
}

