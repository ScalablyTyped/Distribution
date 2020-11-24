package typings.jestCore

import typings.jestTypes.configMod.ProjectConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/collectHandles", JSImport.Namespace)
@js.native
object collectHandlesMod extends js.Object {
  
  def default(): js.Function0[js.Array[Error]] = js.native
  
  def formatHandleErrors(errors: js.Array[Error], config: ProjectConfig): js.Array[String] = js.native
}
