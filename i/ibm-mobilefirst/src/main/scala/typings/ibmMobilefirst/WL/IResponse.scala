package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResponse extends StObject {
  
  var invocationContext: js.UndefOr[js.Any] = js.native
}
object IResponse {
  
  @scala.inline
  def apply(): IResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponse]
  }
  
  @scala.inline
  implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
  }
}
