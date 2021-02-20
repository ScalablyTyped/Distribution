package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListSmimeInfoResponse extends StObject {
  
  /**
    * List of SmimeInfo.
    */
  var smimeInfo: js.UndefOr[js.Array[SchemaSmimeInfo]] = js.native
}
object SchemaListSmimeInfoResponse {
  
  @scala.inline
  def apply(): SchemaListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSmimeInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaListSmimeInfoResponseMutableBuilder[Self <: SchemaListSmimeInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmimeInfo(value: js.Array[SchemaSmimeInfo]): Self = StObject.set(x, "smimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmimeInfoUndefined: Self = StObject.set(x, "smimeInfo", js.undefined)
    
    @scala.inline
    def setSmimeInfoVarargs(value: SchemaSmimeInfo*): Self = StObject.set(x, "smimeInfo", js.Array(value :_*))
  }
}
