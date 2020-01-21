package typings.jupyterlabApputils

import org.scalablytyped.runtime.TopLevel
import typings.phosphorCoreutils.mod.Token
import typings.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/splash", JSImport.Namespace)
@js.native
object splashMod extends js.Object {
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
  
  @js.native
  object ISplashScreen extends TopLevel[Token[ISplashScreen]]
  
}

