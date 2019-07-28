package typings.atJupyterlabApputils.libSplashMod

import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplashScreen extends js.Object {
  /**
    * Show the application splash screen.
    *
    * @param light - Whether to show the light splash screen or the dark one.
    *
    * @returns A disposable used to clear the splash screen.
    */
  def show(): IDisposable = js.native
  def show(light: Boolean): IDisposable = js.native
}

