package typings
package istanbulDashLibDashHookLib.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRunInContextOptions extends Options {
  var coverageVariable: java.lang.String
}

object HookRunInContextOptions {
  @scala.inline
  def apply(coverageVariable: java.lang.String, verbose: scala.Boolean): HookRunInContextOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable, verbose = verbose)
  
    __obj.asInstanceOf[HookRunInContextOptions]
  }
}

