package typings.istanbulDashLibDashHook.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRequireOptions extends Options {
  var extensions: js.Array[String]
  def postLoadHook(filename: String): Unit
}

object HookRequireOptions {
  @scala.inline
  def apply(extensions: js.Array[String], postLoadHook: String => Unit, verbose: Boolean): HookRequireOptions = {
    val __obj = js.Dynamic.literal(extensions = extensions, postLoadHook = js.Any.fromFunction1(postLoadHook), verbose = verbose)
  
    __obj.asInstanceOf[HookRequireOptions]
  }
}

