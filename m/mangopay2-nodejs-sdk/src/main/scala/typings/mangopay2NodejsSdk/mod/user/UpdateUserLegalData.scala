package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserLegalData extends BaseUserLegalData {
  
  var Id: String = js.native
}
object UpdateUserLegalData {
  
  @scala.inline
  def apply(Id: String, PersonType: LEGAL): UpdateUserLegalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserLegalData]
  }
  
  @scala.inline
  implicit class UpdateUserLegalDataMutableBuilder[Self <: UpdateUserLegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
