package typings.atJupyterlabCompleter

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabCompleter.libWidgetMod.Completer.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer", JSImport.Namespace)
@js.native
object atJupyterlabCompleterMod extends js.Object {
  @js.native
  class Completer protected ()
    extends typings.atJupyterlabCompleter.libWidgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class CompleterModel ()
    extends typings.atJupyterlabCompleter.libModelMod.CompleterModel
  
  @js.native
  class CompletionConnector protected ()
    extends typings.atJupyterlabCompleter.libConnectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: typings.atJupyterlabCompleter.libConnectorMod.CompletionConnector.IOptions) = this()
  }
  
  @js.native
  class CompletionHandler protected ()
    extends typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IOptions) = this()
  }
  
  @js.native
  class ContextConnector protected ()
    extends typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  @js.native
  class KernelConnector protected ()
    extends typings.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typings.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions) = this()
  }
  
  @js.native
  object Completer extends js.Object {
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer ()
      extends typings.atJupyterlabCompleter.libWidgetMod.Completer.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    val defaultRenderer: typings.atJupyterlabCompleter.libWidgetMod.Completer.Renderer = js.native
  }
  
  @js.native
  object CompletionHandler extends js.Object {
    /**
      * A namespace for completion handler messages.
      */
    @js.native
    object Msg extends js.Object {
      /**
        * A singleton `'invoke-request'` message.
        */
      val InvokeRequest: Message = js.native
    }
    
  }
  
  @js.native
  object ICompletionManager
    extends TopLevel[Token[typings.atJupyterlabCompleter.libTokensMod.ICompletionManager]]
  
}

