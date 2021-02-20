package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Text
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import org.scalablytyped.runtime.StObject
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
  implicit class IInfoReplyMutableBuilder[Self <: IInfoReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp_links(value: js.Array[Text]): Self = StObject.set(x, "help_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp_linksVarargs(value: Text*): Self = StObject.set(x, "help_links", js.Array(value :_*))
    
    @scala.inline
    def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation_version(value: String): Self = StObject.set(x, "implementation_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_info(value: ILanguageInfo): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol_version(value: String): Self = StObject.set(x, "protocol_version", value.asInstanceOf[js.Any])
  }
}
