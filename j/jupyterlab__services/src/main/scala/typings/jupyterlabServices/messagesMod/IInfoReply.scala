package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Text
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfoReply extends IReplyOkContent {
  
  var banner: String = js.native
  
  var help_links: js.Array[Text] = js.native
  
  var implementation: String = js.native
  
  var implementation_version: String = js.native
  
  var language_info: ILanguageInfo = js.native
  
  var protocol_version: String = js.native
}
object IInfoReply {
  
  @scala.inline
  def apply(
    banner: String,
    help_links: js.Array[Text],
    implementation: String,
    implementation_version: String,
    language_info: ILanguageInfo,
    protocol_version: String,
    status: ok
  ): IInfoReply = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], help_links = help_links.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], implementation_version = implementation_version.asInstanceOf[js.Any], language_info = language_info.asInstanceOf[js.Any], protocol_version = protocol_version.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReply]
  }
  
  @scala.inline
  implicit class IInfoReplyOps[Self <: IInfoReply] (val x: Self) extends AnyVal {
    
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
    def setBanner(value: String): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp_linksVarargs(value: Text*): Self = this.set("help_links", js.Array(value :_*))
    
    @scala.inline
    def setHelp_links(value: js.Array[Text]): Self = this.set("help_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: String): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation_version(value: String): Self = this.set("implementation_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_info(value: ILanguageInfo): Self = this.set("language_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol_version(value: String): Self = this.set("protocol_version", value.asInstanceOf[js.Any])
  }
}
