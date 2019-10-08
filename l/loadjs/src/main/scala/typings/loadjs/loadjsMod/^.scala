package typings.loadjs.loadjsMod

import typings.loadjs.Anon_ReturnPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(files: String, bundleIdOrLoaded: String): Unit = js.native
  def apply(files: String, bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: String, bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
  def apply(files: String, bundleId: String, options: LoadOptions with Anon_ReturnPromise): js.Promise[Unit] = js.native
  def apply(files: String, options: LoadOptions with Anon_ReturnPromise): js.Promise[Unit] = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: String): Unit = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, options: LoadOptions with Anon_ReturnPromise): js.Promise[Unit] = js.native
  def apply(files: js.Array[String], options: LoadOptions with Anon_ReturnPromise): js.Promise[Unit] = js.native
}

