package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiaAboutPageSettings extends StObject {
  
  /**
    * The status of the verification process for the About page.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The URL for the About page.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaLiaAboutPageSettings {
  
  @scala.inline
  def apply(): SchemaLiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaAboutPageSettings]
  }
  
  @scala.inline
  implicit class SchemaLiaAboutPageSettingsMutableBuilder[Self <: SchemaLiaAboutPageSettings] (val x: Self) extends AnyVal {
    
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
