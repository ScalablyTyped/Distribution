package typings.jestTestResult

import typings.jestTestResult.typesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestTestResultStrings {
  
  @js.native
  sealed trait disabled extends Status
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait failed extends Status
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait passed extends Status
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  
  @js.native
  sealed trait pending extends Status
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait skipped extends Status
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  
  @js.native
  sealed trait todo extends Status
  @scala.inline
  def todo: todo = "todo".asInstanceOf[todo]
}
