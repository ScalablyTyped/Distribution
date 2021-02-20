package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaAboutPageSettings extends StObject {
  
  /** The status of the verification process for the About page. Acceptable values are: - "`active`" - "`inactive`" - "`pending`" */
  var status: js.UndefOr[String] = js.native
  
  /** The URL for the About page. */
  var url: js.UndefOr[String] = js.native
}
object LiaAboutPageSettings {
  
  @scala.inline
  def apply(): LiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaAboutPageSettings]
  }
  
  @scala.inline
  implicit class LiaAboutPageSettingsMutableBuilder[Self <: LiaAboutPageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
