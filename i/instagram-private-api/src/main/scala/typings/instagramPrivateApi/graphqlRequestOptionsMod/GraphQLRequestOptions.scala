package typings.instagramPrivateApi.graphqlRequestOptionsMod

import typings.instagramPrivateApi.anon.FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLRequestOptions extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var documentId: String = js.native
  
  var surface: FriendlyName = js.native
  
  var variables: js.Any = js.native
}
object GraphQLRequestOptions {
  
  @scala.inline
  def apply(documentId: String, surface: FriendlyName, variables: js.Any): GraphQLRequestOptions = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestOptions]
  }
  
  @scala.inline
  implicit class GraphQLRequestOptionsOps[Self <: GraphQLRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurface(value: FriendlyName): Self = this.set("surface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: js.Any): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
  }
}
