package typings.mangopay2NodejsSdk.mod.user

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserNaturalData
  extends StObject
     with BaseUserNaturalData {
  
  var Id: String
}
object UpdateUserNaturalData {
  
  @scala.inline
  def apply(Id: String): UpdateUserNaturalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = "NATURAL")
    __obj.asInstanceOf[UpdateUserNaturalData]
  }
  
  @scala.inline
  implicit class UpdateUserNaturalDataMutableBuilder[Self <: UpdateUserNaturalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
