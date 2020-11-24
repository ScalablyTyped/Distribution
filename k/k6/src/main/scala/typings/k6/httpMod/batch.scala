package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/http", "batch")
@js.native
object batch extends js.Object {
  
  def apply[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = js.native
}
