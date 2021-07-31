package typings.got.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotPromise[B /* <: Buffer | String | js.Object */]
  extends js.Promise[Response[B]] {
  
  def cancel(): Unit = js.native
}
