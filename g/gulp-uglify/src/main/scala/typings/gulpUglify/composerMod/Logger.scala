package typings.gulpUglify.composerMod

import typings.gulpUglify.anon.FnCallMessageOptionalParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: FnCallMessageOptionalParams = js.native
}
