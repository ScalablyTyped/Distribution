package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponse extends StObject {
  
  var invocationContext: js.UndefOr[Any] = js.undefined
}
object IResponse {
  
  inline def apply(): IResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponse]
  }
  
  extension [Self <: IResponse](x: Self) {
    
    inline def setInvocationContext(value: Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    inline def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
  }
}
