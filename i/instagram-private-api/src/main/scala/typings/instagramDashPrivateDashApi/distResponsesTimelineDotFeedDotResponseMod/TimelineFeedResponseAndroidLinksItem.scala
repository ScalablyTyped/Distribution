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
    val __obj = js.Dynamic.literal(androidClass = androidClass, appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior, callToActionTitle = callToActionTitle, deeplinkUri = deeplinkUri, igUserId = igUserId, leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType, redirectUri = redirectUri, webUri = webUri)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[TimelineFeedResponseAndroidLinksItem]
  }
}

