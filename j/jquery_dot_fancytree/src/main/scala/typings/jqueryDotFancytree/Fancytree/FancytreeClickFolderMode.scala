package typings.jqueryDotFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeClickFolderMode extends js.Object

@JSGlobal("Fancytree.FancytreeClickFolderMode")
@js.native
object FancytreeClickFolderMode extends js.Object {
  @js.native
  sealed trait activate extends FancytreeClickFolderMode
  
  @js.native
  sealed trait activate_and_expand extends FancytreeClickFolderMode
  
  @js.native
  sealed trait activate_dblclick_expands extends FancytreeClickFolderMode
  
  @js.native
  sealed trait expand extends FancytreeClickFolderMode
  
  /* 1 */ val activate: typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate with Double = js.native
  /* 3 */ val activate_and_expand: typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate_and_expand with Double = js.native
  /* 4 */ val activate_dblclick_expands: typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate_dblclick_expands with Double = js.native
  /* 2 */ val expand: typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.expand with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FancytreeClickFolderMode with Double] = js.native
}

