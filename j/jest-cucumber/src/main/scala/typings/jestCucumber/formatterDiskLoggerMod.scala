package typings.jestCucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/formatters/formatter-loggers/FormatterDiskLogger", JSImport.Namespace)
@js.native
object formatterDiskLoggerMod extends js.Object {
  
  @js.native
  class FormatterDiskLogger protected () extends js.Object {
    def this(path: String) = this()
    
    def log(logText: String): Unit = js.native
    
    var logs: js.Any = js.native
    
    var path: js.Any = js.native
    
    def save(): Unit = js.native
  }
}
