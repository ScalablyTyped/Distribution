package typings.jupyterlabConsole

import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IModelFactoryOptions
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/console", "CodeConsole")
  @js.native
  open class CodeConsole protected ()
    extends typings.jupyterlabConsole.libWidgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  object CodeConsole {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    open class ContentFactory ()
      extends typings.jupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
    }
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.ModelFactory")
    @js.native
    /**
      * Create a new cell model factory.
      */
    open class ModelFactory ()
      extends typings.jupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
    
    /**
      * A default content factory for the code console.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The default `ModelFactory` instance.
      */
    @JSImport("@jupyterlab/console", "CodeConsole.defaultModelFactory")
    @js.native
    val defaultModelFactory: typings.jupyterlabConsole.libWidgetMod.CodeConsole.ModelFactory = js.native
  }
  
  @JSImport("@jupyterlab/console", "ConsoleHistory")
  @js.native
  open class ConsoleHistory protected ()
    extends typings.jupyterlabConsole.libHistoryMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typings.jupyterlabConsole.libHistoryMod.ConsoleHistory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/console", "ConsolePanel")
  @js.native
  open class ConsolePanel protected ()
    extends typings.jupyterlabConsole.libPanelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typings.jupyterlabConsole.libPanelMod.ConsolePanel.IOptions) = this()
  }
  object ConsolePanel {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    open class ContentFactory ()
      extends typings.jupyterlabConsole.libPanelMod.ConsolePanel.ContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
    }
    
    /**
      * The console renderer token.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.IContentFactory")
    @js.native
    val IContentFactory: Token[typings.jupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory] = js.native
    
    /**
      * A default code console content factory.
      */
    @JSImport("@jupyterlab/console", "ConsolePanel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabConsole.libPanelMod.ConsolePanel.IContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/console", "ForeignHandler")
  @js.native
  open class ForeignHandler protected ()
    extends typings.jupyterlabConsole.libForeignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typings.jupyterlabConsole.libForeignMod.ForeignHandler.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/console", "IConsoleTracker")
  @js.native
  val IConsoleTracker: Token[typings.jupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
}
