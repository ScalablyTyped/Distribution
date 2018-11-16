package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeClickFolderMode extends js.Object

@JSGlobal("Fancytree.FancytreeClickFolderMode")
@js.native
object FancytreeClickFolderMode extends js.Object {
  @js.native
  sealed trait activate
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeClickFolderMode
  
  @js.native
  sealed trait activate_and_expand
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeClickFolderMode
  
  @js.native
  sealed trait activate_dblclick_expands
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeClickFolderMode
  
  @js.native
  sealed trait expand
    extends jqueryDotFancytreeLib.FancytreeNs.FancytreeClickFolderMode
  
  /* 1 */ val activate: activate with scala.Double = js.native
  /* 3 */ val activate_and_expand: activate_and_expand with scala.Double = js.native
  /* 4 */ val activate_dblclick_expands: activate_dblclick_expands with scala.Double = js.native
  /* 2 */ val expand: expand with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jqueryDotFancytreeLib.FancytreeNs.FancytreeClickFolderMode with scala.Double] = js.native
}

