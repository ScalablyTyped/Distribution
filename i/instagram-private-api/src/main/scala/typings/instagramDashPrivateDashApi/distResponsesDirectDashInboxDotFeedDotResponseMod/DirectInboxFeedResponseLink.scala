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
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], link_context = link_context.asInstanceOf[js.Any], mutation_token = mutation_token.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectInboxFeedResponseLink]
  }
}

