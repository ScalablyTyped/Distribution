package typings.istanbulLibReport

import typings.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object istanbulLibReportStrings {
  
  @scala.inline
  def branches: branches = "branches".asInstanceOf[branches]
  
  @scala.inline
  def defaultSummarizer: defaultSummarizer = "defaultSummarizer".asInstanceOf[defaultSummarizer]
  
  @scala.inline
  def flat: flat = "flat".asInstanceOf[flat]
  
  @scala.inline
  def functions: functions = "functions".asInstanceOf[functions]
  
  @scala.inline
  def lines: lines = "lines".asInstanceOf[lines]
  
  @scala.inline
  def nested: nested = "nested".asInstanceOf[nested]
  
  @scala.inline
  def pkg: pkg = "pkg".asInstanceOf[pkg]
  
  @scala.inline
  def statements: statements = "statements".asInstanceOf[statements]
  
  @js.native
  sealed trait branches extends js.Object
  
  @js.native
  sealed trait defaultSummarizer extends Summarizers
  
  @js.native
  sealed trait flat extends Summarizers
  
  @js.native
  sealed trait functions extends js.Object
  
  @js.native
  sealed trait lines extends js.Object
  
  @js.native
  sealed trait nested extends Summarizers
  
  @js.native
  sealed trait pkg extends Summarizers
  
  @js.native
  sealed trait statements extends js.Object
}
