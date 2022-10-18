package typings.logkitty

import typings.logkitty.logkittyStrings.DEBUG
import typings.logkitty.logkittyStrings.ERROR
import typings.logkitty.logkittyStrings.FATAL
import typings.logkitty.logkittyStrings.INFO
import typings.logkitty.logkittyStrings.SILENT
import typings.logkitty.logkittyStrings.UNKNOWN
import typings.logkitty.logkittyStrings.VERBOSE
import typings.logkitty.logkittyStrings.WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidConstantsMod {
  
  object Priority {
    
    @JSImport("logkitty/build/android/constants", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/android/constants", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.FATAL")
    @js.native
    def FATAL: Double = js.native
    inline def FATAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.SILENT")
    @js.native
    def SILENT: Double = js.native
    inline def SILENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.UNKNOWN")
    @js.native
    def UNKNOWN: Double = js.native
    inline def UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.VERBOSE")
    @js.native
    def VERBOSE: Double = js.native
    inline def VERBOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.WARN")
    @js.native
    def WARN: Double = js.native
    inline def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT]
  }
  
  /* keyof logkitty.anon.DEBUG */ /* Rewritten from type alias, can be one of: 
    - typings.logkitty.logkittyStrings.UNKNOWN
    - typings.logkitty.logkittyStrings.VERBOSE
    - typings.logkitty.logkittyStrings.DEBUG
    - typings.logkitty.logkittyStrings.INFO
    - typings.logkitty.logkittyStrings.WARN
    - typings.logkitty.logkittyStrings.ERROR
    - typings.logkitty.logkittyStrings.FATAL
    - typings.logkitty.logkittyStrings.SILENT
  */
  trait PriorityNames extends StObject
}
