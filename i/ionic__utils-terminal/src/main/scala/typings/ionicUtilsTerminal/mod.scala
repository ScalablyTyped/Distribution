package typings.ionicUtilsTerminal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-terminal", "CI_ENVIRONMENT_VARIABLES")
  @js.native
  val CI_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  @JSImport("@ionic/utils-terminal", "CI_ENVIRONMENT_VARIABLES_DETECTED")
  @js.native
  val CI_ENVIRONMENT_VARIABLES_DETECTED: js.Array[String] = js.native
  
  @JSImport("@ionic/utils-terminal", "TERMINAL_INFO")
  @js.native
  val TERMINAL_INFO: TerminalInfo = js.native
  
  trait TerminalInfo extends StObject {
    
    /**
      * Whether this is in CI or not.
      */
    val ci: Boolean
    
    /**
      * Path to the user's shell program.
      */
    val shell: String
    
    /**
      * Whether the terminal is an interactive TTY or not.
      */
    val tty: Boolean
    
    /**
      * Whether this is a Windows shell or not.
      */
    val windows: Boolean
  }
  object TerminalInfo {
    
    inline def apply(ci: Boolean, shell: String, tty: Boolean, windows: Boolean): TerminalInfo = {
      val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminalInfo]
    }
    
    extension [Self <: TerminalInfo](x: Self) {
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
