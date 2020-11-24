package typings.licenseChecker.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("license-checker", "init")
@js.native
object init extends js.Object {
  
  def apply(opts: InitOpts, callback: js.Function2[/* err */ Error, /* ret */ ModuleInfos, Unit]): Unit = js.native
}
