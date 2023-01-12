package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabOutputarea.jupyterlabOutputareaStrings.input_request
import typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IContentFactory
import typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IOptions
import typings.jupyterlabRendermime.libOutputmodelMod.IOutputModel
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libKernelKernelMod.IShellFuture
import typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg
import typings.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg
import typings.jupyterlabServices.libKernelMessagesMod.IHeader
import typings.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg
import typings.jupyterlabServices.libKernelMessagesMod.IShellMessage
import typings.jupyterlabServices.libKernelMessagesMod.ShellMessageType
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.PanelLayout
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
  @js.native
  open class OutputArea protected () extends Widget {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * Clear the widget inputs and outputs.
      */
    /* private */ var _clear: Any = js.native
    
    /* private */ var _displayIdMap: Any = js.native
    
    /* private */ var _future: Any = js.native
    
    /**
      * Render and insert a single output into the layout.
      *
      * @param index - The index of the output to be inserted.
      * @param model - The model of the output to be inserted.
      */
    /* private */ var _insertOutput: Any = js.native
    
    /**
      * The maximum outputs to show in the trimmed
      * output area.
      */
    /* private */ var _maxNumberOutputs: Any = js.native
    
    /* private */ var _minHeightTimeout: Any = js.native
    
    /**
      * Update indices in _displayIdMap in response to element remove from model items
      * *
      * @param startIndex - The index of first element removed
      *
      * @param count - The number of elements removed from model items
      *
      */
    /* private */ var _moveDisplayIdIndices: Any = js.native
    
    /**
      * Handle an execute reply message.
      */
    /* private */ var _onExecuteReply: Any = js.native
    
    /**
      * Handle an iopub message.
      */
    /* private */ var _onIOPub: Any = js.native
    
    /* private */ var _outputTracker: Any = js.native
    
    /* private */ var _preventHeightChangeJitter: Any = js.native
    
    /**
      * Update an output in the layout in place.
      */
    /* private */ var _setOutput: Any = js.native
    
    /**
      * Dispose information message and show output models from the given
      * index to maxNumberOutputs
      *
      * @param lastShown Starting model index to insert.
      */
    /* private */ var _showTrimmedOutputs: Any = js.native
    
    /**
      * Wrap a output widget within a output panel
      *
      * @param output Output widget to wrap
      * @param executionCount Execution count
      * @returns The output panel
      */
    /* private */ var _wrappedOutput: Any = js.native
    
    /**
      * The content factory used by the widget.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Create an output item with a prompt and actual output
      *
      * @returns a rendered widget, or null if we cannot render
      * #### Notes
      */
    /* protected */ def createOutputItem(model: IOutputModel): Widget | Null = js.native
    
    /**
      * Render a mimetype
      */
    /* protected */ def createRenderedMimetype(model: IOutputModel): Widget | Null = js.native
    
    /**
      * The kernel future associated with the output area.
      */
    def future: IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
    def future_=(value: IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg]): Unit = js.native
    
    /**
      * Narrow the type of OutputArea's layout prop
      */
    @JSName("layout")
    val layout_OutputArea: PanelLayout = js.native
    
    /**
      * The maximum number of output items to display on top and bottom of cell output.
      *
      * ### Notes
      * It is set to Infinity if no trim is applied.
      */
    def maxNumberOutputs: Double = js.native
    def maxNumberOutputs_=(limit: Double): Unit = js.native
    
    /**
      * The model used by the widget.
      */
    val model: IOutputAreaModel = js.native
    
    /**
      * Handle an input request from a kernel.
      */
    /* protected */ def onInputRequest(
      msg: IInputRequestMsg,
      future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
    ): Unit = js.native
    
    /**
      * Follow changes on the model state.
      */
    /* protected */ def onModelChanged(sender: IOutputAreaModel, args: ChangedArgs): Unit = js.native
    
    /**
      * Follow changes on the output model state.
      */
    /* protected */ def onStateChanged(sender: IOutputAreaModel): Unit = js.native
    
    /**
      * A public signal used to indicate the number of outputs has changed.
      *
      * #### Notes
      * This is useful for parents who want to apply styling based on the number
      * of outputs. Emits the current number of outputs.
      */
    val outputLengthChanged: Signal[this.type, Double] = js.native
    
    /**
      * A widget tracker for individual output widgets in the output area.
      */
    def outputTracker: WidgetTracker[Widget] = js.native
    
    /**
      * The rendermime instance used by the widget.
      */
    val rendermime: IRenderMimeRegistry = js.native
    
    /**
      * A read-only sequence of the children widgets in the output area.
      */
    def widgets: js.Array[Widget] = js.native
  }
  object OutputArea {
    
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output prompt.
        */
      /* CompleteClass */
      override def createOutputPrompt(): IOutputPrompt = js.native
      
      /**
        * Create an stdin widget.
        */
      /* CompleteClass */
      override def createStdin(options: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
    }
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * Execute code on an output area.
      */
    inline def execute(code: String, output: OutputArea, sessionContext: ISessionContext): js.Promise[js.UndefOr[IExecuteReplyMsg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], output.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IExecuteReplyMsg]]]
    inline def execute(code: String, output: OutputArea, sessionContext: ISessionContext, metadata: JSONObject): js.Promise[js.UndefOr[IExecuteReplyMsg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], output.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IExecuteReplyMsg]]]
    
    inline def isIsolated(mimeType: String, metadata: ReadonlyPartialJSONObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIsolated")(mimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * An output area widget content factory.
      *
      * The content factory is used to create children in a way
      * that can be customized.
      */
    trait IContentFactory extends StObject {
      
      /**
        * Create an output prompt.
        */
      def createOutputPrompt(): IOutputPrompt
      
      /**
        * Create an stdin widget.
        */
      def createStdin(options: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin
    }
    object IContentFactory {
      
      inline def apply(
        createOutputPrompt: () => IOutputPrompt,
        createStdin: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        inline def setCreateOutputPrompt(value: () => IOutputPrompt): Self = StObject.set(x, "createOutputPrompt", js.Any.fromFunction0(value))
        
        inline def setCreateStdin(value: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin): Self = StObject.set(x, "createStdin", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options to create an `OutputArea`.
      */
    trait IOptions extends StObject {
      
      /**
        * The content factory used by the widget to create children.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * The maximum number of output items to display on top and bottom of cell output.
        */
      var maxNumberOutputs: js.UndefOr[Double] = js.undefined
      
      /**
        * The model used by the widget.
        */
      var model: IOutputAreaModel
      
      /**
        * The rendermime instance used by the widget.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(model: IOutputAreaModel, rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setMaxNumberOutputs(value: Double): Self = StObject.set(x, "maxNumberOutputs", value.asInstanceOf[js.Any])
        
        inline def setMaxNumberOutputsUndefined: Self = StObject.set(x, "maxNumberOutputs", js.undefined)
        
        inline def setModel(value: IOutputAreaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "OutputPrompt")
  @js.native
  open class OutputPrompt () extends IOutputPrompt {
    
    /* private */ var _executionCount: Any = js.native
    
    /**
      * The execution count for the prompt.
      */
    @JSName("executionCount")
    def executionCount_MOutputPrompt: ExecutionCount = js.native
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "SimplifiedOutputArea")
  @js.native
  open class SimplifiedOutputArea protected () extends OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "Stdin")
  @js.native
  open class Stdin protected () extends IStdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions) = this()
    
    /* private */ var _future: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _parentHeader: Any = js.native
    
    /* private */ var _password: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the dock panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The value of the widget.
      */
    @JSName("value")
    def value_MStdin: js.Promise[String] = js.native
  }
  object Stdin {
    
    /**
      * The options to create a stdin widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The kernel future associated with the request.
        */
      var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
      
      /**
        * The header of the input_request message.
        */
      var parent_header: js.UndefOr[IHeader[input_request]] = js.undefined
      
      /**
        * Whether the input is a password.
        */
      var password: Boolean
      
      /**
        * The prompt text.
        */
      var prompt: String
    }
    object IOptions {
      
      inline def apply(
        future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
        password: Boolean,
        prompt: String
      ): typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions = {
        val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions] (val x: Self) extends AnyVal {
        
        inline def setFuture(value: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
        
        inline def setParent_header(value: IHeader[input_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
        
        inline def setParent_headerUndefined: Self = StObject.set(x, "parent_header", js.undefined)
        
        inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait IOutputPrompt extends Widget {
    
    /**
      * The execution count for the prompt.
      */
    var executionCount: ExecutionCount = js.native
  }
  
  @js.native
  trait IStdin extends Widget {
    
    /**
      * The stdin value.
      */
    val value: js.Promise[String] = js.native
  }
}
