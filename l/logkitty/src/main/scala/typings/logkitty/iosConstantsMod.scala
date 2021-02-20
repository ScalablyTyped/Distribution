package typings.logkitty

import typings.logkitty.logkittyStrings.DEBUG
import typings.logkitty.logkittyStrings.DEFAULT
import typings.logkitty.logkittyStrings.ERROR
import typings.logkitty.logkittyStrings.INFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosConstantsMod {
  
  object Priority {
    
    @JSImport("logkitty/build/ios/constants", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/ios/constants", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    @scala.inline
    def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    @scala.inline
    def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    @scala.inline
    def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.fromLetter")
    @js.native
    def fromLetter(letter: String): Double = js.native
    
    @JSImport("logkitty/build/ios/constants", "Priority.fromName")
    @js.native
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSImport("logkitty/build/ios/constants", "Priority.fromName")
    @js.native
    def fromName_DEFAULT(name: DEFAULT): Double = js.native
    @JSImport("logkitty/build/ios/constants", "Priority.fromName")
    @js.native
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSImport("logkitty/build/ios/constants", "Priority.fromName")
    @js.native
    def fromName_INFO(name: INFO): Double = js.native
    
    @JSImport("logkitty/build/ios/constants", "Priority.toLetter")
    @js.native
    def toLetter(code: Double): String = js.native
    
    @JSImport("logkitty/build/ios/constants", "Priority.toName")
    @js.native
    def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = js.native
  }
  
  /* keyof logkitty.anon.DEFAULT */ /* Rewritten from type alias, can be one of: 
    - typings.logkitty.logkittyStrings.DEBUG
    - typings.logkitty.logkittyStrings.DEFAULT
    - typings.logkitty.logkittyStrings.INFO
    - typings.logkitty.logkittyStrings.ERROR
  */
  trait PriorityNames extends StObject
}
