package typings.loadjs.anon

import typings.loadjs.mod.LoadOptions
import typings.loadjs.mod.LoadedFn
import typings.loadjs.mod.ReadyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofloadjs extends js.Object {
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
  def done(bundleId: String): Unit = js.native
  def isDefined(bundleId: String): Boolean = js.native
  def ready(bundleIds: String, optionsOrCallback: LoadedFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(bundleIds: String, optionsOrCallback: ReadyOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(bundleIds: js.Array[String], optionsOrCallback: LoadedFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def ready(bundleIds: js.Array[String], optionsOrCallback: ReadyOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof loadjs */ js.Any = js.native
  def reset(): Unit = js.native
}

