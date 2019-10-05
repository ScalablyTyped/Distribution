package typings.atJupyterlabConsole

import typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IModelFactoryOptions
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console", JSImport.Namespace)
@js.native
object atJupyterlabConsoleMod extends js.Object {
  @js.native
  class CodeConsole protected ()
    extends typings.atJupyterlabConsole.libWidgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ConsoleHistory protected ()
    extends typings.atJupyterlabConsole.libHistoryMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typings.atJupyterlabConsole.libHistoryMod.ConsoleHistory.IOptions) = this()
  }
  
  @js.native
  class ConsolePanel protected ()
    extends typings.atJupyterlabConsole.libPanelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typings.atJupyterlabConsole.libPanelMod.ConsolePanel.IOptions) = this()
  }
  
  @js.native
  class ForeignHandler protected ()
    extends typings.atJupyterlabConsole.libForeignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typings.atJupyterlabConsole.libForeignMod.ForeignHandler.IOptions) = this()
  }
  
  val IConsoleTracker: Token[typings.atJupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
  @js.native
  object CodeConsole extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.atJupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory ()
      extends typings.atJupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
    
    /**
      * A default content factory for the code console.
      */
    val defaultContentFactory: IContentFactory = js.native
    /**
      * The default `ModelFactory` instance.
      */
    val defaultModelFactory: typings.atJupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory = js.native
    /**
      * A namespace for the code console content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
  @js.native
  object ConsolePanel extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.atJupyterlabConsole.libPanelMod.ConsolePanel.ContentFactory
    
    /**
      * The console renderer token.
      */
    val IContentFactory: Token[typings.atJupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory] = js.native
    /**
      * A default code console content factory.
      */
    val defaultContentFactory: typings.atJupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory = js.native
    /**
      * A namespace for the console panel content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
}

