package typings
package idyllDashCompilerLib.idyllDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idyll-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compiles the given idyllMarkup and returns an AST either synchronously
    * or asynchronously.
    *
    * If postProcessors are provided or options.async is set to true:
    *      compiler returns a promise
    * Otherwise, compile returns the AST synchronously
    *
    */
  def apply(input: java.lang.String): js.Promise[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST] | idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def apply(input: java.lang.String, options: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Options): js.Promise[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST] | idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
  def apply(
    input: java.lang.String,
    options: idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.Options,
    callback: js.Function0[scala.Unit]
  ): js.Promise[idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST] | idyllDashCompilerLib.idyllDashCompilerMod.compilerNs.AST = js.native
}

