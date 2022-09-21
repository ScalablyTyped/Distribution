package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloseMatterResponse extends StObject {
  
  /**
    * The updated matter, with state **CLOSED**.
    */
  var matter: js.UndefOr[SchemaMatter] = js.undefined
}
object SchemaCloseMatterResponse {
  
  inline def apply(): SchemaCloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloseMatterResponse]
  }
  
  extension [Self <: SchemaCloseMatterResponse](x: Self) {
    
    inline def setMatter(value: SchemaMatter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    inline def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
