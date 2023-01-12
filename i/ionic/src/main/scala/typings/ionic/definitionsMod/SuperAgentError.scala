package typings.ionic.definitionsMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperAgentError
  extends StObject
     with Error {
  
  var response: typings.superagent.mod.Response
}
object SuperAgentError {
  
  inline def apply(message: String, name: String, response: typings.superagent.mod.Response): SuperAgentError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperAgentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuperAgentError] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: typings.superagent.mod.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
