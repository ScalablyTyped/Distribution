package typings.jqueryCropbox.jQueryCropBox

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
  
}

