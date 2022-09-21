package typings.kendoUi.global.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filemanager {
  
  @JSGlobal("kendo.ui.filemanager.FileManagerCommand")
  @js.native
  open class FileManagerCommand ()
    extends StObject
       with typings.kendoUi.kendo.ui.filemanager.FileManagerCommand
  object FileManagerCommand {
    
    @JSGlobal("kendo.ui.filemanager.FileManagerCommand")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def extend(prototype: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    @JSGlobal("kendo.ui.filemanager.FileManagerCommand.fn")
    @js.native
    def fn: Any = js.native
    inline def fn_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  }
  
  object commands {
    
    @JSGlobal("kendo.ui.filemanager.commands.ChangeViewCommand")
    @js.native
    open class ChangeViewCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.ChangeViewCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.CopyCommand")
    @js.native
    open class CopyCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.CopyCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.CreateFolderCommand")
    @js.native
    open class CreateFolderCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.CreateFolderCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.DeleteCommand")
    @js.native
    open class DeleteCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.DeleteCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.MoveCommand")
    @js.native
    open class MoveCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.MoveCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.OpenDialogCommand")
    @js.native
    open class OpenDialogCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.OpenDialogCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.RenameCommand")
    @js.native
    open class RenameCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.RenameCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.SearchCommand")
    @js.native
    open class SearchCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.SearchCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.SortCommand")
    @js.native
    open class SortCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.SortCommand
    
    @JSGlobal("kendo.ui.filemanager.commands.TogglePaneCommand")
    @js.native
    open class TogglePaneCommand ()
      extends StObject
         with typings.kendoUi.kendo.ui.filemanager.commands.TogglePaneCommand {
      
      /* CompleteClass */
      override def getResizable(): Unit = js.native
    }
  }
}
