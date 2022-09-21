package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBrand extends StObject {
  
  /**
    * Application name displayed on OAuth consent screen.
    */
  var applicationTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the brand is only intended for usage inside the G Suite organization only.
    */
  var orgInternalOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Support email displayed on the OAuth consent screen.
    */
  var supportEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaBrand {
  
  inline def apply(): SchemaBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrand]
  }
  
  extension [Self <: SchemaBrand](x: Self) {
    
    inline def setApplicationTitle(value: String): Self = StObject.set(x, "applicationTitle", value.asInstanceOf[js.Any])
    
    inline def setApplicationTitleNull: Self = StObject.set(x, "applicationTitle", null)
    
    inline def setApplicationTitleUndefined: Self = StObject.set(x, "applicationTitle", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgInternalOnly(value: Boolean): Self = StObject.set(x, "orgInternalOnly", value.asInstanceOf[js.Any])
    
    inline def setOrgInternalOnlyNull: Self = StObject.set(x, "orgInternalOnly", null)
    
    inline def setOrgInternalOnlyUndefined: Self = StObject.set(x, "orgInternalOnly", js.undefined)
    
    inline def setSupportEmail(value: String): Self = StObject.set(x, "supportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailNull: Self = StObject.set(x, "supportEmail", null)
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "supportEmail", js.undefined)
  }
}
