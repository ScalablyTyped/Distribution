package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotCreateDashGroupDashThreadDotResponseMod.DirectRepositoryCreateGroupThreadResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotGetDashPresenceDotResponseMod.DirectRepositoryGetPresenceResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotRankedDashRecipientsDotResponseMod.DirectRepositoryRankedRecipientsResponseRootObject
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.raven
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.reshare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/direct.repository", JSImport.Namespace)
@js.native
object distRepositoriesDirectDotRepositoryMod extends js.Object {
  @js.native
  class DirectRepository () extends Repository {
    def createGroupThread(recipientUsers: js.Array[String], threadTitle: String): js.Promise[DirectRepositoryCreateGroupThreadResponseRootObject] = js.native
    def getPresence(): js.Promise[DirectRepositoryGetPresenceResponseRootObject] = js.native
    def rankedRecipients(): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_raven(mode: raven): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_raven(mode: raven, query: String): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_reshare(mode: reshare): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_reshare(mode: reshare, query: String): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
  }
  
}

