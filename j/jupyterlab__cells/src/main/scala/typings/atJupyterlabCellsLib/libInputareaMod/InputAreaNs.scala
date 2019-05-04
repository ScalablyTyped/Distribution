package typings
package atJupyterlabCellsLib.libInputareaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
@js.native
object InputAreaNs extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
    *
    * This defaults to using an `editorFactory` based on CodeMirror.
    */
  @js.native
  /**
    * Construct a `ContentFactory`.
    */
  class ContentFactory () extends IContentFactory {
    def this(options: atJupyterlabCellsLib.libInputareaMod.InputAreaNs.ContentFactoryNs.IOptions) = this()
    var _editor: js.Any = js.native
    /**
      * The editor factory we need to include in `CodeEditorWratter.IOptions`.
      *
      * This is a separate readonly attribute rather than a factory method as we need
      * to pass it around.
      */
    /* CompleteClass */
    override val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
    /**
      * Create an input prompt.
      */
    /* CompleteClass */
    override def createInputPrompt(): atJupyterlabCellsLib.libInputareaMod.IInputPrompt = js.native
  }
  
  /**
    * An input area widget content factory.
    *
    * The content factory is used to create children in a way
    * that can be customized.
    */
  trait IContentFactory extends js.Object {
    /**
      * The editor factory we need to include in `CodeEditorWratter.IOptions`.
      *
      * This is a separate readonly attribute rather than a factory method as we need
      * to pass it around.
      */
    val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
    /**
      * Create an input prompt.
      */
    def createInputPrompt(): atJupyterlabCellsLib.libInputareaMod.IInputPrompt
  }
  
  /**
    * The options used to create an `InputArea`.
    */
  trait IOptions extends js.Object {
    /**
      * The content factory used by the widget to create children.
      *
      * Defaults to one that uses CodeMirror.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    /**
      * The model used by the widget.
      */
    var model: atJupyterlabCellsLib.libModelMod.ICellModel
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
  /**
    * A namespace for the input area content factory.
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

