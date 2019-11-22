package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseLink extends js.Object {
  var client_context: String
  var link_context: DirectInboxFeedResponseLinkContext
  var mutation_token: String
  var text: String
}

object DirectInboxFeedResponseLink {
  @scala.inline
  def apply(
    client_context: String,
    link_context: DirectInboxFeedResponseLinkContext,
    mutation_token: String,
    text: String
  ): DirectInboxFeedResponseLink = {
    val __obj = js.Dynamic.literal(client_context = client_context, link_context = link_context, mutation_token = mutation_token, text = text)
  
    __obj.asInstanceOf[DirectInboxFeedResponseLink]
  }
}

