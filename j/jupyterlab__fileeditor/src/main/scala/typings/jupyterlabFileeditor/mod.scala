package typings.jupyterlabFileeditor

import typings.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/fileeditor", "FileEditor")
  @js.native
  class FileEditor protected ()
    extends typings.jupyterlabFileeditor.widgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorCodeWrapper")
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typings.jupyterlabFileeditor.widgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorFactory")
  @js.native
  class FileEditorFactory protected ()
    extends typings.jupyterlabFileeditor.widgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "IEditorTracker")
  @js.native
  val IEditorTracker: Token[typings.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  
  @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus")
  @js.native
  class TabSpaceStatus protected ()
    extends typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  object TabSpaceStatus {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
  }
  
  /**
    * A namespace for TabSpaceComponent statics.
    */
  object TabSpaceComponent
}
