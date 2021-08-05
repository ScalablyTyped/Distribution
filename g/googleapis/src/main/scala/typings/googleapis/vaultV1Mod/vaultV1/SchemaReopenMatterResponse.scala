package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a ReopenMatterRequest.
  */
trait SchemaReopenMatterResponse extends StObject {
  
  /**
    * The updated matter, with state OPEN.
    */
  var matter: js.UndefOr[SchemaMatter] = js.undefined
}
object SchemaReopenMatterResponse {
  
  inline def apply(): SchemaReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReopenMatterResponse]
  }
  
  extension [Self <: SchemaReopenMatterResponse](x: Self) {
    
    inline def setMatter(value: SchemaMatter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    inline def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
