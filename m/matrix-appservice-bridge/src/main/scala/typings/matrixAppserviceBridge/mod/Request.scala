package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.libComponentsRequestMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Request")
@js.native
open class Request[T] protected ()
  extends typings.matrixAppserviceBridge.libComponentsRequestMod.Request[T] {
  /**
    * Construct a new Request.
    * @param opts Options for this request.
    * @param opts.id Optional ID to set on this request. One will be
    * generated if this is not provided.
    * @param opts.data Optional data to associate with this request.
    */
  def this(opts: RequestOpts[T]) = this()
}
