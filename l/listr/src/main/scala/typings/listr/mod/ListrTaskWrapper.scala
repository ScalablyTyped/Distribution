package typings.listr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListrTaskWrapper[Ctx] extends js.Object {
  
  var output: String = js.native
  
  def report(error: Error): Unit = js.native
  
  def run(): js.Promise[Unit] = js.native
  def run(ctx: Ctx): js.Promise[Unit] = js.native
  
  def skip(message: String): Unit = js.native
  
  var title: String = js.native
}
