package typings.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends js.Object {
  
  def apply(title: String, options: TestOptions, test: Action): Unit = js.native
  def apply(title: String, test: Action): Unit = js.native
  
  def only(title: String, options: TestOptions, test: Action): Unit = js.native
  def only(title: String, test: Action): Unit = js.native
  
  def skip(title: String, options: TestOptions, test: Action): Unit = js.native
  def skip(title: String, test: Action): Unit = js.native
}
