package typings.matrixAppservice.appServiceRegistrationMod

import typings.matrixAppservice.anon.Aliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppServiceOutput extends js.Object {
  
  var as_token: String = js.native
  
  @JSName("de.sorunome.msc2409.push_ephemeral")
  var deDotsorunomeDotmsc2409Dotpush_ephemeral: js.UndefOr[Boolean] = js.native
  
  var hs_token: String = js.native
  
  var id: String = js.native
  
  var namespaces: js.UndefOr[Aliases] = js.native
  
  var protocols: js.UndefOr[js.Array[String] | Null] = js.native
  
  var rate_limited: js.UndefOr[Boolean] = js.native
  
  var sender_localpart: String = js.native
  
  var url: String | Null = js.native
}
object AppServiceOutput {
  
  @scala.inline
  def apply(as_token: String, hs_token: String, id: String, sender_localpart: String): AppServiceOutput = {
    val __obj = js.Dynamic.literal(as_token = as_token.asInstanceOf[js.Any], hs_token = hs_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender_localpart = sender_localpart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceOutput]
  }
  
  @scala.inline
  implicit class AppServiceOutputOps[Self <: AppServiceOutput] (val x: Self) extends AnyVal {
    
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
    def setAs_token(value: String): Self = this.set("as_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHs_token(value: String): Self = this.set("hs_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_localpart(value: String): Self = this.set("sender_localpart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeDotsorunomeDotmsc2409Dotpush_ephemeral(value: Boolean): Self = this.set("de.sorunome.msc2409.push_ephemeral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeDotsorunomeDotmsc2409Dotpush_ephemeral: Self = this.set("de.sorunome.msc2409.push_ephemeral", js.undefined)
    
    @scala.inline
    def setNamespaces(value: Aliases): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setProtocolsNull: Self = this.set("protocols", null)
    
    @scala.inline
    def setRate_limited(value: Boolean): Self = this.set("rate_limited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate_limited: Self = this.set("rate_limited", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
  }
}
