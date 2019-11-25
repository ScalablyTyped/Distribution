package typings.istanbulDashLibDashHook.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRunInContextOptions extends Options {
  var coverageVariable: String
}

object HookRunInContextOptions {
  @scala.inline
  def apply(coverageVariable: String, verbose: Boolean): HookRunInContextOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookRunInContextOptions]
  }
}

