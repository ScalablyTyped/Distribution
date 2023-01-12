package typings.mangopay2NodejsSdk.typingsBaseMod.base

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodOptionWithoutResponse
  extends StObject
     with MethodOptions {
  
  var resolveWithFullResponse: js.UndefOr[`false`] = js.undefined
}
object MethodOptionWithoutResponse {
  
  inline def apply(): MethodOptionWithoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptionWithoutResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodOptionWithoutResponse] (val x: Self) extends AnyVal {
    
    inline def setResolveWithFullResponse(value: `false`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
    
    inline def setResolveWithFullResponseUndefined: Self = StObject.set(x, "resolveWithFullResponse", js.undefined)
  }
}
