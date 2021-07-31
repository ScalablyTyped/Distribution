package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponseLink extends StObject {
  
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
  
  @scala.inline
  implicit class DirectInboxFeedResponseLinkMutableBuilder[Self <: DirectInboxFeedResponseLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_context(value: DirectInboxFeedResponseLinkContext): Self = StObject.set(x, "link_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutation_token(value: String): Self = StObject.set(x, "mutation_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
