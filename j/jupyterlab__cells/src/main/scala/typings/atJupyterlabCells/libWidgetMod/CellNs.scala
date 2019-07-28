package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atJupyterlabCells.libWidgetMod.CellNs.ContentFactory
import typings.atJupyterlabCells.libWidgetMod.CellNs.IContentFactory
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "Cell")
@js.native
object CellNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    *
    * This includes a CodeMirror editor factory to make it easy to use out of the box.
    */
  @js.native
  /**
    * Create a content factory for a cell.
    */
  class ContentFactory () extends IContentFactory {
    def this(options: typings.atJupyterlabCells.libWidgetMod.CellNs.ContentFactoryNs.IOptions) = this()
    var _editorFactory: js.Any = js.native
    /**
      * The editor factory we need to include in `CodeEditorWratter.IOptions`.
      *
      * This is a separate readonly attribute rather than a factory method as we need
      * to pass it around.
      */
    /* CompleteClass */
    override val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
    /**
      * Create a new cell header for the parent widget.
      */
    /* CompleteClass */
    override def createCellFooter(): ICellFooter = js.native
    /**
      * Create a new cell header for the parent widget.
      */
    /* CompleteClass */
    override def createCellHeader(): ICellHeader = js.native
    /**
      * Create an input prompt.
      */
    /* CompleteClass */
    override def createInputPrompt(): IInputPrompt = js.native
    /**
      * Create an output prompt.
      */
    /* CompleteClass */
    override def createOutputPrompt(): IOutputPrompt = js.native
    /**
      * Create an stdin widget.
      */
    /* CompleteClass */
    override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.StdinNs.IOptions): IStdin = js.native
  }
  
  /**
    * The factory object for customizable cell children.
    *
    * This is used to allow users of cells to customize child content.
    *
    * This inherits from `OutputArea.IContentFactory` to avoid needless nesting and
    * provide a single factory object for all notebook/cell/outputarea related
    * widgets.
    */
  trait IContentFactory
    extends typings.atJupyterlabOutputarea.libWidgetMod.OutputAreaNs.IContentFactory
       with typings.atJupyterlabCells.libInputareaMod.InputAreaNs.IContentFactory {
    /**
      * Create a new cell header for the parent widget.
      */
    def createCellFooter(): ICellFooter
    /**
      * Create a new cell header for the parent widget.
      */
    def createCellHeader(): ICellHeader
  }
  
  /**
    * An options object for initializing a cell widget.
    */
  trait IOptions extends js.Object {
    /**
      * The factory object for customizable cell children.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    /**
      * The configuration options for the text editor widget.
      */
    var editorConfig: js.UndefOr[
        Partial[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
        ]
      ] = js.undefined
    /**
      * The model used by the cell.
      */
    var model: ICellModel
    /**
      * Whether to send an update request to the editor when it is shown.
      */
    var updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  }
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: ContentFactory = js.native
  /**
    * A namespace for cell content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * Options for the content factory.
      */
    trait IOptions extends js.Object {
      /**
        * The editor factory used by the content factory.
        *
        * If this is not passed, a default CodeMirror editor factory
        * will be used.
        */
      var editorFactory: js.UndefOr[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
          ] = js.undefined
    }
    
  }
  
}

