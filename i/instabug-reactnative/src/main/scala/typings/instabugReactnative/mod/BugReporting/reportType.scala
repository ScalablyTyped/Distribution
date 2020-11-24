package typings.instabugReactnative.mod.BugReporting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reportType extends js.Object
@JSImport("instabug-reactnative", "BugReporting.reportType")
@js.native
object reportType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reportType with Double] = js.native
  
  @js.native
  sealed trait bug extends reportType
  /* 0 */ @js.native
  object bug extends TopLevel[bug with Double]
  
  @js.native
  sealed trait feedback extends reportType
  /* 1 */ @js.native
  object feedback extends TopLevel[feedback with Double]
  
  @js.native
  sealed trait question extends reportType
  /* 2 */ @js.native
  object question extends TopLevel[question with Double]
}
