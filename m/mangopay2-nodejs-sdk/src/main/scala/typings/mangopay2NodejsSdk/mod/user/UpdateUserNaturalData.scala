package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserNaturalData extends BaseUserNaturalData {
  
  var Id: String = js.native
}
object UpdateUserNaturalData {
  
  @scala.inline
  def apply(Id: String, PersonType: NATURAL): UpdateUserNaturalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserNaturalData]
  }
  
  @scala.inline
  implicit class UpdateUserNaturalDataMutableBuilder[Self <: UpdateUserNaturalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
