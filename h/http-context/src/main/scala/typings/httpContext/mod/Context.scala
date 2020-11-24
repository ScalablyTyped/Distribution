package typings.httpContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context
  extends RequestDelegate
     with ResponseDelegate {
  
  var request: Request = js.native
  
  var response: Response = js.native
}
