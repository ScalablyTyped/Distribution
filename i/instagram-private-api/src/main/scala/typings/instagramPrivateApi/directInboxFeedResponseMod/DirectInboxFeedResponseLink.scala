package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseLink extends js.Object {
  
  var client_context: String = js.native
  
  var link_context: DirectInboxFeedResponseLinkContext = js.native
  
  var mutation_token: String = js.native
  
  var text: String = js.native
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
  implicit class DirectInboxFeedResponseLinkOps[Self <: DirectInboxFeedResponseLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_context(value: String): Self = this.set("client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_context(value: DirectInboxFeedResponseLinkContext): Self = this.set("link_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutation_token(value: String): Self = this.set("mutation_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
