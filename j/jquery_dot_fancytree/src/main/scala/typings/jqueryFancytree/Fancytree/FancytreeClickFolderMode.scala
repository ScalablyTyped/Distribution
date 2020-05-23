package typings.jqueryFancytree.Fancytree

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
  
}

