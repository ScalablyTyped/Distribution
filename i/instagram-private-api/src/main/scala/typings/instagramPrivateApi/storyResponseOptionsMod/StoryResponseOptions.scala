package typings.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryResponseOptions extends js.Object {
  
  var client_context: js.UndefOr[String] = js.native
  
  var mutation_token: js.UndefOr[String] = js.native
}
object StoryResponseOptions {
  
  @scala.inline
  def apply(): StoryResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryResponseOptions]
  }
  
  @scala.inline
  implicit class StoryResponseOptionsOps[Self <: StoryResponseOptions] (val x: Self) extends AnyVal {
    
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
    def deleteClient_context: Self = this.set("client_context", js.undefined)
    
    @scala.inline
    def setMutation_token(value: String): Self = this.set("mutation_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutation_token: Self = this.set("mutation_token", js.undefined)
  }
}
