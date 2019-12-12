package typings.jqueryDashCropbox.jQueryCropBox

import org.scalablytyped.runtime.TopLevel
import typings.jqueryDashCropbox.jQueryCropBox.ShowControls.always
import typings.jqueryDashCropbox.jQueryCropBox.ShowControls.auto
import typings.jqueryDashCropbox.jQueryCropBox.ShowControls.hover
import typings.jqueryDashCropbox.jQueryCropBox.ShowControls.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowControls extends js.Object

@JSGlobal("jQueryCropBox.ShowControls")
@js.native
object ShowControls extends js.Object {
  @js.native
  sealed trait always extends ShowControls
  
  @js.native
  sealed trait auto extends ShowControls
  
  @js.native
  sealed trait hover extends ShowControls
  
  @js.native
  sealed trait never extends ShowControls
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShowControls with Double] = js.native
  /* 1 */ @js.native
  object always extends TopLevel[always with Double]
  
  /* 3 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 2 */ @js.native
  object hover extends TopLevel[hover with Double]
  
  /* 0 */ @js.native
  object never extends TopLevel[never with Double]
  
}

