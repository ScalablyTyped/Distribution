package typings.jupyterlabApputils

import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplashMod {
  
  @js.native
  trait ISplashScreen extends StObject {
    
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
  @JSImport("@jupyterlab/apputils/lib/splash", "ISplashScreen")
  @js.native
  val ISplashScreen: Token[typings.jupyterlabApputils.libSplashMod.ISplashScreen] = js.native
}
