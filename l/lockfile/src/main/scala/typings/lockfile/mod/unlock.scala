package typings.lockfile.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lockfile", "unlock")
@js.native
object unlock extends js.Object {
  
  def apply(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
}
