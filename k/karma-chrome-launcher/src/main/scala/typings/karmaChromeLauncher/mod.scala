package typings.karmaChromeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait CustomLauncher extends StObject {
    
    /**
      * The `--user-data-dir` is set to a temporary directory,
      * but can be overridden on a custom launcher as shown below.
      * One reason to do this is to have a permanent Chrome user data directory inside the project directory
      * to be able to install plugins there (e.g. JetBrains IDE Support plugin).
      */
    var chromeDataDir: js.UndefOr[String] = js.native
  }
  object CustomLauncher {
    
    @scala.inline
    def apply(): CustomLauncher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLauncher]
    }
    
    @scala.inline
    implicit class CustomLauncherMutableBuilder[Self <: CustomLauncher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChromeDataDir(value: String): Self = StObject.set(x, "chromeDataDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeDataDirUndefined: Self = StObject.set(x, "chromeDataDir", js.undefined)
    }
  }
}
