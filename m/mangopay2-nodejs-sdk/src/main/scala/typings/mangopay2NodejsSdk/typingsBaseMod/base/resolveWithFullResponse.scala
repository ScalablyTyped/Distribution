package typings.mangopay2NodejsSdk.typingsBaseMod.base

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Determines the shape of the response
trait resolveWithFullResponse extends StObject {
  
  var resolveWithFullResponse: `true`
}
object resolveWithFullResponse {
  
  inline def apply(): resolveWithFullResponse = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = true)
    __obj.asInstanceOf[resolveWithFullResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: resolveWithFullResponse] (val x: Self) extends AnyVal {
    
    inline def setResolveWithFullResponse(value: `true`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
}
