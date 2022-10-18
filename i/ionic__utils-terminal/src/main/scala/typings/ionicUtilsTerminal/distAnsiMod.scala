package typings.ionicUtilsTerminal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAnsiMod {
  
  @JSImport("@ionic/utils-terminal/dist/ansi", "EscapeCode")
  @js.native
  open class EscapeCode () extends StObject
  /* static members */
  object EscapeCode {
    
    @JSImport("@ionic/utils-terminal/dist/ansi", "EscapeCode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cursorBackward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorBackward")().asInstanceOf[String]
    inline def cursorBackward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorBackward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorDown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorDown")().asInstanceOf[String]
    inline def cursorDown(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorDown")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorForward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorForward")().asInstanceOf[String]
    inline def cursorForward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorForward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorHide(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorHide")().asInstanceOf[String]
    
    inline def cursorLeft(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorLeft")().asInstanceOf[String]
    
    inline def cursorShow(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorShow")().asInstanceOf[String]
    
    inline def cursorUp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorUp")().asInstanceOf[String]
    inline def cursorUp(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorUp")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def eraseDown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseDown")().asInstanceOf[String]
    
    inline def eraseLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseLine")().asInstanceOf[String]
    
    inline def eraseLines(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseLines")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def eraseScreen(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseScreen")().asInstanceOf[String]
    
    inline def eraseUp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseUp")().asInstanceOf[String]
  }
}
