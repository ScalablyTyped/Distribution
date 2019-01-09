package typings
package loadjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BundleId extends js.Object {
  def apply(files: java.lang.String, bundleIdOrLoaded: java.lang.String): scala.Unit = js.native
  def apply(files: java.lang.String, bundleIdOrLoaded: loadjsLib.loadjsMod.loadjsNs.LoadedFn): scala.Unit = js.native
  def apply(files: js.Array[java.lang.String], bundleIdOrLoaded: java.lang.String): scala.Unit = js.native
  def apply(files: js.Array[java.lang.String], bundleIdOrLoaded: loadjsLib.loadjsMod.loadjsNs.LoadedFn): scala.Unit = js.native
  def apply(
    files: js.Array[java.lang.String],
    bundleId: java.lang.String,
    optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadOptions
  ): scala.Unit = js.native
  def apply(
    files: js.Array[java.lang.String],
    bundleId: java.lang.String,
    optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadedFn
  ): scala.Unit = js.native
  def done(bundleId: java.lang.String): scala.Unit = js.native
  def isDefined(bundleId: java.lang.String): scala.Boolean = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadedFn): /* import warning: ImportType.apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.ReadyOptions): /* import warning: ImportType.apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(bundleIds: js.Array[java.lang.String], optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.LoadedFn): /* import warning: ImportType.apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(
    bundleIds: js.Array[java.lang.String],
    optionsOrCallback: loadjsLib.loadjsMod.loadjsNs.ReadyOptions
  ): /* import warning: ImportType.apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def reset(): scala.Unit = js.native
}

