package typings
package atJupyterlabApputilsLib.libSplashMod

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
  def show(): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  def show(light: scala.Boolean): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
}

