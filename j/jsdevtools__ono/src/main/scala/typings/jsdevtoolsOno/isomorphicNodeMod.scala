package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.OnoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/ono/esm/isomorphic.node", JSImport.Namespace)
@js.native
object isomorphicNodeMod extends js.Object {
  
  def addInspectMethod[T](newError: OnoError[T]): Unit = js.native
  
  val format: js.Function2[/* format */ js.Any, /* repeated */ js.Any, String] = js.native
}
