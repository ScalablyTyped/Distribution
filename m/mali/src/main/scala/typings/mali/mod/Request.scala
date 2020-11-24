package typings.mali.mod

import typings.grpc.mod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mali", "Request")
@js.native
class Request protected () extends js.Object {
  def this(call: js.Any, `type`: String) = this()
  
  var call: js.Any = js.native
  
  def get(field: String): js.Any = js.native
  
  def getMetadata(): Metadata = js.native
  
  var metadata: js.Any = js.native
  
  var req: GrpcRequest = js.native
  
  var `type`: String = js.native
}
