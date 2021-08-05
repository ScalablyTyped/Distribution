package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.Lists.LabelDescriptorHtml
  - typings.inboxsdk.mod.Lists.LabelDescriptorUrl
*/
trait LabelDescriptor extends StObject
object LabelDescriptor {
  
  inline def LabelDescriptorHtml(iconHtml: String, title: String): typings.inboxsdk.mod.Lists.LabelDescriptorHtml = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.Lists.LabelDescriptorHtml]
  }
  
  inline def LabelDescriptorUrl(iconUrl: String, title: String): typings.inboxsdk.mod.Lists.LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.Lists.LabelDescriptorUrl]
  }
}
