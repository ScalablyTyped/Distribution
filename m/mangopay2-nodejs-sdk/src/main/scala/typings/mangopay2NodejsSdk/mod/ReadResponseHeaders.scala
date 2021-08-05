package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Determines the shape of the response
trait ReadResponseHeaders extends StObject {
  
  var resolveWithFullResponse: `true`
}
object ReadResponseHeaders {
  
  inline def apply(): ReadResponseHeaders = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = true)
    __obj.asInstanceOf[ReadResponseHeaders]
  }
  
  extension [Self <: ReadResponseHeaders](x: Self) {
    
    inline def setResolveWithFullResponse(value: `true`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
}
