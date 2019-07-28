package typings.atJupyterlabCells.libInputareaMod

import typings.atJupyterlabCells.libInputareaMod.InputAreaNs.ContentFactory
import typings.atJupyterlabCells.libInputareaMod.InputAreaNs.IContentFactory
import typings.atJupyterlabCells.libModelMod.ICellModel
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
    def this(options: typings.atJupyterlabCells.libInputareaMod.InputAreaNs.ContentFactoryNs.IOptions) = this()
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
    override def createInputPrompt(): IInputPrompt = js.native
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
    def createInputPrompt(): IInputPrompt
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
    var model: ICellModel
    /**
      * Whether to send an update request to the editor when it is shown.
      */
    var updateOnShow: js.UndefOr[Boolean] = js.undefined
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
      var editorFactory: js.UndefOr[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
          ] = js.undefined
    }
    
  }
  
}

