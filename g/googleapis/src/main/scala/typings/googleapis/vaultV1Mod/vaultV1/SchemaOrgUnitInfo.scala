package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Org Unit to search
  */
trait SchemaOrgUnitInfo extends StObject {
  
  /**
    * Org unit to search, as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/directory/&quot;&gt;Admin
    * SDK Directory API&lt;/a&gt;.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
}
object SchemaOrgUnitInfo {
  
  inline def apply(): SchemaOrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnitInfo]
  }
  
  extension [Self <: SchemaOrgUnitInfo](x: Self) {
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
