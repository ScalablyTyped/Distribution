package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelDescriptorUrl
  extends LabelDescriptorBase
     with LabelDescriptor {
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconUrl: String = js.native
}
object LabelDescriptorUrl {
  
  @scala.inline
  def apply(iconUrl: String, title: String): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
  
  @scala.inline
  implicit class LabelDescriptorUrlMutableBuilder[Self <: LabelDescriptorUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}
