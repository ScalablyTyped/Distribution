package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaAboutPageSettings extends StObject {
  
  /**
    * The status of the verification process for the About page. Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL for the About page.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiaAboutPageSettings {
  
  inline def apply(): SchemaLiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaAboutPageSettings]
  }
  
  extension [Self <: SchemaLiaAboutPageSettings](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
