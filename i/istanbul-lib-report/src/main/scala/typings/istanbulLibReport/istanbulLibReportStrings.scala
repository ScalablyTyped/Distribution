package typings.istanbulLibReport

import typings.istanbulLibReport.mod.Summarizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object istanbulLibReportStrings {
  
  @js.native
  sealed trait branches extends StObject
  inline def branches: branches = "branches".asInstanceOf[branches]
  
  @js.native
  sealed trait defaultSummarizer
    extends StObject
       with Summarizers
  inline def defaultSummarizer: defaultSummarizer = "defaultSummarizer".asInstanceOf[defaultSummarizer]
  
  @js.native
  sealed trait flat
    extends StObject
       with Summarizers
  inline def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait functions extends StObject
  inline def functions: functions = "functions".asInstanceOf[functions]
  
  @js.native
  sealed trait lines extends StObject
  inline def lines: lines = "lines".asInstanceOf[lines]
  
  @js.native
  sealed trait nested
    extends StObject
       with Summarizers
  inline def nested: nested = "nested".asInstanceOf[nested]
  
  @js.native
  sealed trait pkg
    extends StObject
       with Summarizers
  inline def pkg: pkg = "pkg".asInstanceOf[pkg]
  
  @js.native
  sealed trait statements extends StObject
  inline def statements: statements = "statements".asInstanceOf[statements]
}
