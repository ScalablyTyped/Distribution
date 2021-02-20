package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.kernelKernelMod.IShellFuture
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typings.jupyterlabServices.messagesMod.IInputRequestMsg
import typings.jupyterlabServices.messagesMod.IShellMessage
import typings.jupyterlabServices.messagesMod.ShellMessageType
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
  @js.native
  class OutputArea protected () extends Widget {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * Clear the widget inputs and outputs.
      */
    var _clear: js.Any = js.native
    
    var _displayIdMap: js.Any = js.native
    
    var _future: js.Any = js.native
    
    /**
      * Render and insert a single output into the layout.
      */
    var _insertOutput: js.Any = js.native
    
    var _minHeightTimeout: js.Any = js.native
    
    /**
      * Update indices in _displayIdMap in response to element remove from model items
      * *
      * @param startIndex - The index of first element removed
      *
      * @param count - The number of elements removed from model items
      *
      */
    var _moveDisplayIdIndices: js.Any = js.native
    
    /**
      * Handle an execute reply message.
      */
    var _onExecuteReply: js.Any = js.native
    
    /**
      * Handle an iopub message.
      */
    var _onIOPub: js.Any = js.native
    
    var _preventHeightChangeJitter: js.Any = js.native
    
    /**
      * Update an output in the layout in place.
      */
    var _setOutput: js.Any = js.native
    
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
      * The rendermime instance used by the widget.
      */
    val rendermime: IRenderMimeRegistry = js.native
    
    /**
      * A read-only sequence of the chidren widgets in the output area.
      */
    def widgets: js.Array[Widget] = js.native
  }
  object OutputArea {
    
    /**
      * The default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.ContentFactory")
    @js.native
    class ContentFactory () extends IContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * Execute code on an output area.
      */
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
    @js.native
    def execute(code: String, output: OutputArea, sessionContext: ISessionContext): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
    @js.native
    def execute(code: String, output: OutputArea, sessionContext: ISessionContext, metadata: JSONObject): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    
    @JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.isIsolated")
    @js.native
    def isIsolated(mimeType: String, metadata: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * An output area widget content factory.
      *
      * The content factory is used to create children in a way
      * that can be customized.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Create an output prompt.
        */
      def createOutputPrompt(): IOutputPrompt = js.native
      
      /**
        * Create an stdin widget.
        */
      def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createOutputPrompt: () => IOutputPrompt,
        createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateOutputPrompt(value: () => IOutputPrompt): Self = StObject.set(x, "createOutputPrompt", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreateStdin(value: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin): Self = StObject.set(x, "createStdin", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options to create an `OutputArea`.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The content factory used by the widget to create children.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
      
      /**
        * The model used by the widget.
        */
      var model: IOutputAreaModel = js.native
      
      /**
        * The rendermime instance used by the widget.
        */
      var rendermime: IRenderMimeRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: IOutputAreaModel, rendermime: IRenderMimeRegistry): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        @scala.inline
        def setModel(value: IOutputAreaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "OutputPrompt")
  @js.native
  class OutputPrompt () extends IOutputPrompt {
    
    var _executionCount: js.Any = js.native
    
    /**
      * The execution count for the prompt.
      */
    @JSName("executionCount")
    def executionCount_MOutputPrompt: ExecutionCount = js.native
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "SimplifiedOutputArea")
  @js.native
  class SimplifiedOutputArea protected () extends OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/outputarea/lib/widget", "Stdin")
  @js.native
  class Stdin protected () extends IStdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions) = this()
    
    var _future: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    var _value: js.Any = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The kernel future associated with the request.
        */
      var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
      
      /**
        * Whether the input is a password.
        */
      var password: Boolean = js.native
      
      /**
        * The prompt text.
        */
      var prompt: String = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
        password: Boolean,
        prompt: String
      ): typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions = {
        val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFuture(value: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
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
