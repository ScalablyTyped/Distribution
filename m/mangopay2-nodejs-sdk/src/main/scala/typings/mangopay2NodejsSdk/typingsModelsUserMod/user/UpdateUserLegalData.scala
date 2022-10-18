package typings.mangopay2NodejsSdk.typingsModelsUserMod.user

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserLegalData
  extends StObject
     with BaseUserLegalData {
  
  var Id: String
}
object UpdateUserLegalData {
  
  inline def apply(Id: String): UpdateUserLegalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = "LEGAL")
    __obj.asInstanceOf[UpdateUserLegalData]
  }
  
  extension [Self <: UpdateUserLegalData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
