package typings.atJupyterlabFileeditor

import typings.atJupyterlabFileeditor.libWidgetMod.FileEditor.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor", JSImport.Namespace)
@js.native
object atJupyterlabFileeditorMod extends js.Object {
  @js.native
  class FileEditor protected ()
    extends typings.atJupyterlabFileeditor.libWidgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typings.atJupyterlabFileeditor.libWidgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorFactory protected ()
    extends typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @js.native
  class TabSpaceStatus protected ()
    extends typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  
  val IEditorTracker: Token[typings.atJupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  /**
    * A namespace for TabSpaceComponent statics.
    */
  @js.native
  object TabSpaceComponent extends js.Object
  
  @js.native
  object TabSpaceStatus extends js.Object {
    /**
      * A VDomModel for the TabSpace status item.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.Model
    
  }
  
}

