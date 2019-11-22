package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseLinksItem extends js.Object {
  var androidClass: String
  var appInstallObjectiveInvalidationBehavior: Null
  var callToActionTitle: String
  var deeplinkUri: String
  var igUserId: String
  var leadGenFormId: String
  var linkType: Double
  var `package`: String
  var redirectUri: Null
  var webUri: String
}

object ReelsMediaFeedResponseLinksItem {
  @scala.inline
  def apply(
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: String,
    leadGenFormId: String,
    linkType: Double,
    `package`: String,
    redirectUri: Null,
    webUri: String
  ): ReelsMediaFeedResponseLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass, appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior, callToActionTitle = callToActionTitle, deeplinkUri = deeplinkUri, igUserId = igUserId, leadGenFormId = leadGenFormId, linkType = linkType, redirectUri = redirectUri, webUri = webUri)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[ReelsMediaFeedResponseLinksItem]
  }
}

