package typings.jupyterlabLogconsole

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.source
import typings.jupyterlabLogconsole.tokensMod.ILogger
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.StackedPanel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/logconsole/lib/widget", "LogConsolePanel")
  @js.native
  class LogConsolePanel protected () extends StackedPanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: ILoggerRegistry) = this()
    
    /* private */ var _bindLoggerSignals: js.Any = js.native
    
    /* private */ var _handlePlaceholder: js.Any = js.native
    
    /* private */ var _loggerRegistry: js.Any = js.native
    
    /* private */ var _loggersWatched: js.Any = js.native
    
    /* private */ var _outputAreas: js.Any = js.native
    
    /* private */ var _placeholder: js.Any = js.native
    
    /* private */ var _showOutputFromSource: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
    
    /* private */ var _sourceChanged: js.Any = js.native
    
    /* private */ var _sourceDisplayed: js.Any = js.native
    
    /* private */ var _updateOutputAreas: js.Any = js.native
    
    /**
      * The current logger.
      */
    def logger: ILogger | Null = js.native
    
    /**
      * The logger registry providing the logs.
      */
    def loggerRegistry: ILoggerRegistry = js.native
    
    /**
      * The log source displayed
      */
    def source: String | Null = js.native
    
    /**
      * Signal for source changes
      */
    def sourceChanged: ISignal[this.type, IChangedArgs[String | Null, String | Null, source]] = js.native
    
    /**
      * Signal for source changes
      */
    def sourceDisplayed: ISignal[this.type, ISourceDisplayed] = js.native
    
    /**
      * The source version displayed.
      */
    def sourceVersion: Double | Null = js.native
    
    def source_=(name: String | Null): Unit = js.native
  }
  
  @JSImport("@jupyterlab/logconsole/lib/widget", "ScrollingWidget")
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected () extends Widget {
    def this(hasContentOptions: IOptions[T]) = this()
    
    /* private */ var _content: js.Any = js.native
    
    /* private */ var _handleScroll: js.Any = js.native
    
    /* private */ var _observer: js.Any = js.native
    
    /* private */ var _scrollHeight: js.Any = js.native
    
    /* private */ var _sentinel: js.Any = js.native
    
    /* private */ var _tracking: js.Any = js.native
    
    /**
      * The content widget.
      */
    def content: T = js.native
  }
  object ScrollingWidget {
    
    trait IOptions[T /* <: Widget */]
      extends StObject
         with typings.luminoWidgets.widgetMod.Widget.IOptions {
      
      var content: T
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */](content: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: Widget */](x: Self & IOptions[T]) {
        
        inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait ISourceDisplayed extends StObject {
    
    var source: String | Null
    
    var version: Double | Null
  }
  object ISourceDisplayed {
    
    inline def apply(): ISourceDisplayed = {
      val __obj = js.Dynamic.literal(source = null, version = null)
      __obj.asInstanceOf[ISourceDisplayed]
    }
    
    extension [Self <: ISourceDisplayed](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
}
