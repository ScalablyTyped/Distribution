package typings.jupyterlabFileeditor

import typings.jupyterlabFileeditor.libWidgetMod.FileEditor.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/fileeditor", "FileEditor")
  @js.native
  open class FileEditor protected ()
    extends typings.jupyterlabFileeditor.libWidgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorCodeWrapper")
  @js.native
  open class FileEditorCodeWrapper protected ()
    extends typings.jupyterlabFileeditor.libWidgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorFactory")
  @js.native
  open class FileEditorFactory protected ()
    extends typings.jupyterlabFileeditor.libWidgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typings.jupyterlabFileeditor.libWidgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "IEditorTracker")
  @js.native
  val IEditorTracker: Token[typings.jupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  
  @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus")
  @js.native
  open class TabSpaceStatus protected ()
    extends typings.jupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typings.jupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  object TabSpaceStatus {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.Model
  }
}
