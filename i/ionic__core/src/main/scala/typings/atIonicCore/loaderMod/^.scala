package typings.atIonicCore.loaderMod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/loader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPolyfills(): js.Promise[Unit] = js.native
  def defineCustomElements(win: Window): js.Promise[Unit] = js.native
  def defineCustomElements(win: Window, opts: CustomElementsDefineOptions): js.Promise[Unit] = js.native
}

