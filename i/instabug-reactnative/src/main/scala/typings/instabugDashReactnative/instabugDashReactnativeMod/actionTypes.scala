package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.addCommentToFeature
import typings.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.allActions
import typings.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.reportBug
import typings.instabugDashReactnative.instabugDashReactnativeMod.actionTypes.requestNewFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait actionTypes extends js.Object

@JSImport("instabug-reactnative", "actionTypes")
@js.native
object actionTypes extends js.Object {
  @js.native
  sealed trait addCommentToFeature extends actionTypes
  
  @js.native
  sealed trait allActions extends actionTypes
  
  @js.native
  sealed trait reportBug extends actionTypes
  
  @js.native
  sealed trait requestNewFeature extends actionTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[actionTypes with Double] = js.native
  /* 3 */ @js.native
  object addCommentToFeature extends TopLevel[addCommentToFeature with Double]
  
  /* 0 */ @js.native
  object allActions extends TopLevel[allActions with Double]
  
  /* 1 */ @js.native
  object reportBug extends TopLevel[reportBug with Double]
  
  /* 2 */ @js.native
  object requestNewFeature extends TopLevel[requestNewFeature with Double]
  
}

