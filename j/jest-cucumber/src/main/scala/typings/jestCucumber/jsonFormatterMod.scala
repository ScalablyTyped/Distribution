package typings.jestCucumber

import typings.jestCucumber.anon.Path
import typings.jestCucumber.reportEventGeneratorMod.ReportEventGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/formatters/JsonFormatter", JSImport.Namespace)
@js.native
object jsonFormatterMod extends js.Object {
  
  @js.native
  class JsonFormatter protected () extends js.Object {
    def this(reportEventGenerator: ReportEventGenerator, options: Path) = this()
  }
}
