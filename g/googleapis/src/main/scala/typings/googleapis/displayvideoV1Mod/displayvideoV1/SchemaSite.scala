package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSite extends StObject {
  
  /**
    * Output only. The resource name of the site.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The app ID or URL of the site. Must be UTF-8 encoded with a maximum length of 240 bytes.
    */
  var urlOrAppId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSite {
  
  inline def apply(): SchemaSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSite]
  }
  
  extension [Self <: SchemaSite](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrlOrAppId(value: String): Self = StObject.set(x, "urlOrAppId", value.asInstanceOf[js.Any])
    
    inline def setUrlOrAppIdNull: Self = StObject.set(x, "urlOrAppId", null)
    
    inline def setUrlOrAppIdUndefined: Self = StObject.set(x, "urlOrAppId", js.undefined)
  }
}
