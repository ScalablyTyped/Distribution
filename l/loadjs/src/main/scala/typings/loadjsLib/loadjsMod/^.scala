package typings
package loadjsLib.loadjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    files: java.lang.String | js.Array[java.lang.String],
    bundleIdOrLoaded: java.lang.String | loadjsLib.loadjsMod.loadjsNs.LoadedFn
  ): scala.Unit = js.native
  def apply(
    files: js.Array[java.lang.String],
    bundleId: java.lang.String,
    optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadOptions | loadjsLib.loadjsMod.loadjsNs.LoadedFn
  ): scala.Unit = js.native
  def done(bundleId: java.lang.String): scala.Unit = js.native
  def isDefined(bundleId: java.lang.String): scala.Boolean = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadedFn): loadjsLib.Anon_BundleId = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.ReadyOptions): loadjsLib.Anon_BundleId = js.native
  def ready(bundleIds: js.Array[java.lang.String], optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadedFn): loadjsLib.Anon_BundleId = js.native
  def ready(
    bundleIds: js.Array[java.lang.String],
    optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.ReadyOptions
  ): loadjsLib.Anon_BundleId = js.native
  def reset(): scala.Unit = js.native
}

