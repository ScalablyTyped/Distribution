package typings
package insertDashModuleDashGlobalsLib.insertDashModuleDashGlobalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModuleGlobals extends js.Object {
  /**
       * Defaults
       */
  val vars: insertDashModuleDashGlobalsLib.Anon_Process = js.native
  /**
       * Return a transform stream inserter for the filename file that will accept a javascript file as input and
       * will output the file with a closure around the contents as necessary to define extra builtins.
       */
  def apply(file: java.lang.String): nodeLib.streamMod.Transform = js.native
  /**
       * Return a transform stream inserter for the filename file that will accept a javascript file as input and
       * will output the file with a closure around the contents as necessary to define extra builtins.
       */
  def apply(
    file: java.lang.String,
    opts: insertDashModuleDashGlobalsLib.insertDashModuleDashGlobalsMod.InsertModuleGlobalsNs.Options
  ): nodeLib.streamMod.Transform = js.native
}

