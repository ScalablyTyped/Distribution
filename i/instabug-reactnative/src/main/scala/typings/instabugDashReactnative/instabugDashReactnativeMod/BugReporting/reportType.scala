package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait reportType extends js.Object

@JSImport("instabug-reactnative", "BugReporting.reportType")
@js.native
object reportType extends js.Object {
  @js.native
  sealed trait bug extends reportType
  
  @js.native
  sealed trait feedback extends reportType
  
  @js.native
  sealed trait question extends reportType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reportType with Double] = js.native
  /* 0 */ @js.native
  object bug extends TopLevel[bug with Double]
  
  /* 1 */ @js.native
  object feedback extends TopLevel[feedback with Double]
  
  /* 2 */ @js.native
  object question extends TopLevel[question with Double]
  
}

