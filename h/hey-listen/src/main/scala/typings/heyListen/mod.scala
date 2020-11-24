package typings.heyListen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hey-listen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var invariant: DevMessage = js.native
  
  var warning: DevMessage = js.native
  
  type DevMessage = js.Function2[/* check */ Boolean, /* message */ String, Unit]
}
