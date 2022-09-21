package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Label resource name. May be any of: * `labels/{id\}` (equivalent to labels/{id\}@latest) * `labels/{id\}@latest` * `labels/{id\}@published` * `labels/{id\}@{revision_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server verifies that the user is an admin for the label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When specified, only certain fields belonging to the indicated view are returned.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceLabelsGet {
  
  inline def apply(): ParamsResourceLabelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsGet]
  }
  
  extension [Self <: ParamsResourceLabelsGet](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
