package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseAndroidLinksItem extends js.Object {
  var androidClass: String
  var appInstallObjectiveInvalidationBehavior: Null
  var callToActionTitle: String
  var deeplinkUri: String
  var igUserId: Null
  var leadGenFormId: String | Double
  var linkType: Double
  var `package`: String
  var redirectUri: String
  var webUri: String
}

object TimelineFeedResponseAndroidLinksItem {
  @scala.inline
  def apply(
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: Null,
    leadGenFormId: String | Double,
    linkType: Double,
    `package`: String,
    redirectUri: String,
    webUri: String
  ): TimelineFeedResponseAndroidLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass.asInstanceOf[js.Any], appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior.asInstanceOf[js.Any], callToActionTitle = callToActionTitle.asInstanceOf[js.Any], deeplinkUri = deeplinkUri.asInstanceOf[js.Any], igUserId = igUserId.asInstanceOf[js.Any], leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], webUri = webUri.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseAndroidLinksItem]
  }
}

