package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
import typings.jupyterlabCompleter.widgetMod.Completer.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/completer", "Completer")
  @js.native
  class Completer protected ()
    extends typings.jupyterlabCompleter.widgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  object Completer {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/completer", "Completer.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabCompleter.widgetMod.Completer.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/completer", "Completer.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabCompleter.widgetMod.Completer.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/completer", "CompleterModel")
  @js.native
  class CompleterModel ()
    extends typings.jupyterlabCompleter.modelMod.CompleterModel
  
  @JSImport("@jupyterlab/completer", "CompletionConnector")
  @js.native
  class CompletionConnector protected ()
    extends typings.jupyterlabCompleter.connectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: typings.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/completer", "CompletionHandler")
  @js.native
  class CompletionHandler protected ()
    extends typings.jupyterlabCompleter.handlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typings.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions) = this()
  }
  object CompletionHandler {
    
    @JSImport("@jupyterlab/completer", "CompletionHandler.ICompletionItemsResponseType")
    @js.native
    val ICompletionItemsResponseType: ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    object Msg {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      @JSImport("@jupyterlab/completer", "CompletionHandler.Msg.InvokeRequest")
      @js.native
      val InvokeRequest: Message = js.native
    }
  }
  
  @JSImport("@jupyterlab/completer", "ContextConnector")
  @js.native
  class ContextConnector protected ()
    extends typings.jupyterlabCompleter.contextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/completer", "ICompletionManager")
  @js.native
  val ICompletionManager: Token[typings.jupyterlabCompleter.tokensMod.ICompletionManager] = js.native
  
  @JSImport("@jupyterlab/completer", "KernelConnector")
  @js.native
  class KernelConnector protected ()
    extends typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
