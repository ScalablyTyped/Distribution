package typings.loadjs.mod

import typings.loadjs.anon.LoadOptionsreturnPromiset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("loadjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(files: String, bundleIdOrLoaded: String): Unit = js.native
  def apply(files: String, bundleIdOrLoaded: LoadOptions): Unit = js.native
  def apply(files: String, bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: String, bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
  def apply(files: String, bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
  def apply(files: String, bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
  def apply(files: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: String): Unit = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: LoadOptions): Unit = js.native
  def apply(files: js.Array[String], bundleIdOrLoaded: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
  def apply(files: js.Array[String], bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
  def apply(files: js.Array[String], options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
}
