package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodOptionWithResponse
  extends StObject
     with MethodOptions {
  
  var resolveWithFullResponse: `true`
}
object MethodOptionWithResponse {
  
  @scala.inline
  def apply(): MethodOptionWithResponse = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = true)
    __obj.asInstanceOf[MethodOptionWithResponse]
  }
  
  @scala.inline
  implicit class MethodOptionWithResponseMutableBuilder[Self <: MethodOptionWithResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveWithFullResponse(value: `true`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
}
