package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAws extends StObject {
  
  /**
    * Required. The AWS account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAws {
  
  inline def apply(): SchemaAws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAws]
  }
  
  extension [Self <: SchemaAws](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
