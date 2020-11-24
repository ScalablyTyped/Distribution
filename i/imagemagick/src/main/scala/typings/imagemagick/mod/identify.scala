package typings.imagemagick.mod

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imagemagick", "identify")
@js.native
object identify extends js.Object {
  
  def apply(path: String, callback: js.Function2[/* err */ Error, /* features */ Features, Unit]): ChildProcess = js.native
  def apply(path: js.Array[_], callback: js.Function2[/* err */ Error, /* result */ String, Unit]): ChildProcess = js.native
  
  var path: String = js.native
}
