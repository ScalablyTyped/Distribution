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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object Priority {
    
    @JSImport("logkitty/build/android/constants", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/android/constants", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    @scala.inline
    def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.FATAL")
    @js.native
    def FATAL: Double = js.native
    @scala.inline
    def FATAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    @scala.inline
    def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.SILENT")
    @js.native
    def SILENT: Double = js.native
    @scala.inline
    def SILENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.UNKNOWN")
    @js.native
    def UNKNOWN: Double = js.native
    @scala.inline
    def UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.VERBOSE")
    @js.native
    def VERBOSE: Double = js.native
    @scala.inline
    def VERBOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.WARN")
    @js.native
    def WARN: Double = js.native
    @scala.inline
    def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/constants", "Priority.fromLetter")
    @js.native
    def fromLetter(letter: String): Double = js.native
    
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_FATAL(name: FATAL): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_INFO(name: INFO): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_SILENT(name: SILENT): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_UNKNOWN(name: UNKNOWN): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_VERBOSE(name: VERBOSE): Double = js.native
    @JSImport("logkitty/build/android/constants", "Priority.fromName")
    @js.native
    def fromName_WARN(name: WARN): Double = js.native
    
    @JSImport("logkitty/build/android/constants", "Priority.toLetter")
    @js.native
    def toLetter(code: Double): String = js.native
    
    @JSImport("logkitty/build/android/constants", "Priority.toName")
    @js.native
    def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = js.native
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
