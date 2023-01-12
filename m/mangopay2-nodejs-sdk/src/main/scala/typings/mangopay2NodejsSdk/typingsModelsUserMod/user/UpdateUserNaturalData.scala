package typings.mangopay2NodejsSdk.typingsModelsUserMod.user

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserNaturalData
  extends StObject
     with BaseUserNaturalData {
  
  var Id: String
}
object UpdateUserNaturalData {
  
  inline def apply(Id: String): UpdateUserNaturalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = "NATURAL")
    __obj.asInstanceOf[UpdateUserNaturalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUserNaturalData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
