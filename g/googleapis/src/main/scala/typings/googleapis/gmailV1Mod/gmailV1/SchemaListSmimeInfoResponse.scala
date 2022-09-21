package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSmimeInfoResponse extends StObject {
  
  /**
    * List of SmimeInfo.
    */
  var smimeInfo: js.UndefOr[js.Array[SchemaSmimeInfo]] = js.undefined
}
object SchemaListSmimeInfoResponse {
  
  inline def apply(): SchemaListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSmimeInfoResponse]
  }
  
  extension [Self <: SchemaListSmimeInfoResponse](x: Self) {
    
    inline def setSmimeInfo(value: js.Array[SchemaSmimeInfo]): Self = StObject.set(x, "smimeInfo", value.asInstanceOf[js.Any])
    
    inline def setSmimeInfoUndefined: Self = StObject.set(x, "smimeInfo", js.undefined)
    
    inline def setSmimeInfoVarargs(value: SchemaSmimeInfo*): Self = StObject.set(x, "smimeInfo", js.Array(value*))
  }
}
