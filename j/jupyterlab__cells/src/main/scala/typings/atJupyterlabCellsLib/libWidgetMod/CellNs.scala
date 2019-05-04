package typings
package atJupyterlabCellsLib.libWidgetMod

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
    def this(options: atJupyterlabCellsLib.libWidgetMod.CellNs.ContentFactoryNs.IOptions) = this()
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
    override def createCellFooter(): atJupyterlabCellsLib.libHeaderfooterMod.ICellFooter = js.native
    /**
      * Create a new cell header for the parent widget.
      */
    /* CompleteClass */
    override def createCellHeader(): atJupyterlabCellsLib.libHeaderfooterMod.ICellHeader = js.native
    /**
      * Create an input prompt.
      */
    /* CompleteClass */
    override def createInputPrompt(): atJupyterlabCellsLib.libInputareaMod.IInputPrompt = js.native
    /**
      * Create an output prompt.
      */
    /* CompleteClass */
    override def createOutputPrompt(): atJupyterlabOutputareaLib.libWidgetMod.IOutputPrompt = js.native
    /**
      * Create an stdin widget.
      */
    /* CompleteClass */
    override def createStdin(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions): atJupyterlabOutputareaLib.libWidgetMod.IStdin = js.native
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
    extends atJupyterlabOutputareaLib.libWidgetMod.OutputAreaNs.IContentFactory
       with atJupyterlabCellsLib.libInputareaMod.InputAreaNs.IContentFactory {
    /**
      * Create a new cell header for the parent widget.
      */
    def createCellFooter(): atJupyterlabCellsLib.libHeaderfooterMod.ICellFooter
    /**
      * Create a new cell header for the parent widget.
      */
    def createCellHeader(): atJupyterlabCellsLib.libHeaderfooterMod.ICellHeader
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
        stdLib.Partial[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
        ]
      ] = js.undefined
    /**
      * The model used by the cell.
      */
    var model: atJupyterlabCellsLib.libModelMod.ICellModel
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
      var editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.UndefOr[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
          ] = js.undefined
    }
    
  }
  
}

