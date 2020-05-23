package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeSelectMode extends js.Object

@JSGlobal("Fancytree.FancytreeSelectMode")
@js.native
object FancytreeSelectMode extends js.Object {
  @js.native
  sealed trait multi extends FancytreeSelectMode
  
  @js.native
  sealed trait mutlti_hier extends FancytreeSelectMode
  
  @js.native
  sealed trait single extends FancytreeSelectMode
  
}

