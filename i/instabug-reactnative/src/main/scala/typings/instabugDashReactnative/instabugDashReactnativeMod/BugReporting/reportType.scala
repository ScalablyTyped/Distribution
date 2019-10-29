package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

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
  
  /* 0 */ val bug: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.reportType.bug with Double = js.native
  /* 1 */ val feedback: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.reportType.feedback with Double = js.native
  /* 2 */ val question: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.reportType.question with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reportType with Double] = js.native
}

