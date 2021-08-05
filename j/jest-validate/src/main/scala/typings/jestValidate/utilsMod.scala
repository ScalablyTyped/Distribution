package typings.jestValidate

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jest-validate/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-validate/build/utils", "DEPRECATION")
  @js.native
  val DEPRECATION: String = js.native
  
  @JSImport("jest-validate/build/utils", "ERROR")
  @js.native
  val ERROR: String = js.native
  
  @JSImport("jest-validate/build/utils", "ValidationError")
  @js.native
  class ValidationError protected ()
    extends StObject
       with Error {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("jest-validate/build/utils", "WARNING")
  @js.native
  val WARNING: String = js.native
  
  inline def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createDidYouMeanMessage")(unrecognized.asInstanceOf[js.Any], allowedOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatPrettyObject(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPrettyObject")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def logValidationWarning(name: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logValidationWarning(name: String, message: String, comment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
