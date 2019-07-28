package typings.loadjs

import typings.loadjs.loadjsMod.LoadOptions
import typings.loadjs.loadjsMod.LoadedFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BundleId extends js.Object {
  def apply(files: String, bundleIdOrLoaded: String): Unit = js.native
  def apply(files: String, bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: String): Unit = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
}

