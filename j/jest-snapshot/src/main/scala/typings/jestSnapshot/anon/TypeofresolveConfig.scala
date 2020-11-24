package typings.jestSnapshot.anon

import typings.prettier.mod.Options
import typings.prettier.mod.ResolveConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofresolveConfig extends js.Object {
  
  def apply(filePath: String): js.Promise[Null | Options] = js.native
  def apply(filePath: String, options: ResolveConfigOptions): js.Promise[Null | Options] = js.native
  
  def sync(filePath: String): Null | Options = js.native
  def sync(filePath: String, options: ResolveConfigOptions): Null | Options = js.native
}
