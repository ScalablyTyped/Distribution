package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodOptionWithResponse extends MethodOptions {
  
  var resolveWithFullResponse: `true` = js.native
}
object MethodOptionWithResponse {
  
  @scala.inline
  def apply(resolveWithFullResponse: `true`): MethodOptionWithResponse = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = resolveWithFullResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodOptionWithResponse]
  }
  
  @scala.inline
  implicit class MethodOptionWithResponseMutableBuilder[Self <: MethodOptionWithResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveWithFullResponse(value: `true`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
}
