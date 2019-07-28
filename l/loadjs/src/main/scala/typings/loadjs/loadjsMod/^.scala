package typings.loadjs.loadjsMod

import typings.loadjs.Fn_BundleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(files: String | js.Array[String], bundleIdOrLoaded: String | LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions | LoadedFn): Unit = js.native
  def done(bundleId: String): Unit = js.native
  def isDefined(bundleId: String): Boolean = js.native
  def ready(bundleIds: String, optionsOrCallback: LoadedFn): Fn_BundleId = js.native
  def ready(bundleIds: String, optionsOrCallback: ReadyOptions): Fn_BundleId = js.native
  def ready(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): Fn_BundleId = js.native
  def ready(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): Fn_BundleId = js.native
  def reset(): Unit = js.native
}

