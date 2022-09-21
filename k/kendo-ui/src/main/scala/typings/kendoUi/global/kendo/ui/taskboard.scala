package typings.kendoUi.global.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskboard {
  
  @JSGlobal("kendo.ui.taskboard.Command")
  @js.native
  open class Command ()
    extends StObject
       with typings.kendoUi.kendo.ui.taskboard.Command
  object Command {
    
    @JSGlobal("kendo.ui.taskboard.Command")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def extend(prototype: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    @JSGlobal("kendo.ui.taskboard.Command.fn")
    @js.native
    def fn: Any = js.native
    inline def fn_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  }
  
  object commands {
    
    @JSGlobal("kendo.ui.taskboard.commands.AddCardCommand")
    @js.native
    open class AddCardCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.AddColumnCommand")
    @js.native
    open class AddColumnCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.CancelEditColumnCommand")
    @js.native
    open class CancelEditColumnCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.ClosePaneCommand")
    @js.native
    open class ClosePaneCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.DeleteCardCommand")
    @js.native
    open class DeleteCardCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.DeleteColumnCommand")
    @js.native
    open class DeleteColumnCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.EditCardCommand")
    @js.native
    open class EditCardCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.EditColumnCommand")
    @js.native
    open class EditColumnCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.MoveCardCommand")
    @js.native
    open class MoveCardCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.MoveFocusCommand")
    @js.native
    open class MoveFocusCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.OpenPaneCommand")
    @js.native
    open class OpenPaneCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.SaveChangesCommand")
    @js.native
    open class SaveChangesCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.SaveColumnCommand")
    @js.native
    open class SaveColumnCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.SearchCommand")
    @js.native
    open class SearchCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
    
    @JSGlobal("kendo.ui.taskboard.commands.SelectCardCommand")
    @js.native
    open class SelectCardCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.taskboard.Command
  }
}
