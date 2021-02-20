package typings.jestCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterDiskLoggerMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/formatters/formatter-loggers/FormatterDiskLogger", "FormatterDiskLogger")
  @js.native
  class FormatterDiskLogger protected () extends StObject {
    def this(path: String) = this()
    
    def log(logText: String): Unit = js.native
    
    var logs: js.Any = js.native
    
    var path: js.Any = js.native
    
    def save(): Unit = js.native
  }
}
