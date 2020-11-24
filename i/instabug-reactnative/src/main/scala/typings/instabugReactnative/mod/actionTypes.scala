package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait actionTypes extends js.Object
@JSImport("instabug-reactnative", "actionTypes")
@js.native
object actionTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[actionTypes with Double] = js.native
  
  @js.native
  sealed trait addCommentToFeature extends actionTypes
  /* 3 */ @js.native
  object addCommentToFeature extends TopLevel[addCommentToFeature with Double]
  
  @js.native
  sealed trait allActions extends actionTypes
  /* 0 */ @js.native
  object allActions extends TopLevel[allActions with Double]
  
  @js.native
  sealed trait reportBug extends actionTypes
  /* 1 */ @js.native
  object reportBug extends TopLevel[reportBug with Double]
  
  @js.native
  sealed trait requestNewFeature extends actionTypes
  /* 2 */ @js.native
  object requestNewFeature extends TopLevel[requestNewFeature with Double]
}
