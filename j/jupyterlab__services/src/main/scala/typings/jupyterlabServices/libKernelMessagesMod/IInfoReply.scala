package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInfoReply
  extends StObject
     with IReplyOkContent {
  
  var banner: String
  
  var help_links: js.Array[Text]
  
  var implementation: String
  
  var implementation_version: String
  
  var language_info: ILanguageInfo
  
  var protocol_version: String
}
object IInfoReply {
  
  inline def apply(
    banner: String,
    help_links: js.Array[Text],
    implementation: String,
    implementation_version: String,
    language_info: ILanguageInfo,
    protocol_version: String
  ): IInfoReply = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], help_links = help_links.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], implementation_version = implementation_version.asInstanceOf[js.Any], language_info = language_info.asInstanceOf[js.Any], protocol_version = protocol_version.asInstanceOf[js.Any], status = "ok")
    __obj.asInstanceOf[IInfoReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInfoReply] (val x: Self) extends AnyVal {
    
    inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setHelp_links(value: js.Array[Text]): Self = StObject.set(x, "help_links", value.asInstanceOf[js.Any])
    
    inline def setHelp_linksVarargs(value: Text*): Self = StObject.set(x, "help_links", js.Array(value*))
    
    inline def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementation_version(value: String): Self = StObject.set(x, "implementation_version", value.asInstanceOf[js.Any])
    
    inline def setLanguage_info(value: ILanguageInfo): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    inline def setProtocol_version(value: String): Self = StObject.set(x, "protocol_version", value.asInstanceOf[js.Any])
  }
}
