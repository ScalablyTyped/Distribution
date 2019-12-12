package typings.jqueryDotFancytree.Fancytree

import org.scalablytyped.runtime.TopLevel
import typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate
import typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate_and_expand
import typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.activate_dblclick_expands
import typings.jqueryDotFancytree.Fancytree.FancytreeClickFolderMode.expand
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FancytreeClickFolderMode with Double] = js.native
  /* 1 */ @js.native
  object activate extends TopLevel[activate with Double]
  
  /* 3 */ @js.native
  object activate_and_expand extends TopLevel[activate_and_expand with Double]
  
  /* 4 */ @js.native
  object activate_dblclick_expands extends TopLevel[activate_dblclick_expands with Double]
  
  /* 2 */ @js.native
  object expand extends TopLevel[expand with Double]
  
}

