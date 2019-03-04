package typings
package istanbulDashLibDashHookLib.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRequireOptions extends Options {
  var extensions: js.Array[java.lang.String]
  def postLoadHook(filename: java.lang.String): scala.Unit
}

object HookRequireOptions {
  @scala.inline
  def apply(
    extensions: js.Array[java.lang.String],
    postLoadHook: js.Function1[java.lang.String, scala.Unit],
    verbose: scala.Boolean
  ): HookRequireOptions = {
    val __obj = js.Dynamic.literal(extensions = extensions, postLoadHook = postLoadHook, verbose = verbose)
  
    __obj.asInstanceOf[HookRequireOptions]
  }
}

