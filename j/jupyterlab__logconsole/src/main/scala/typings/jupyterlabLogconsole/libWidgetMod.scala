package typings.jupyterlabLogconsole

import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.source
import typings.jupyterlabLogconsole.libTokensMod.ILogger
import typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.libWidgetMod.ScrollingWidget.IOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.StackedPanel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/logconsole/lib/widget", "LogConsolePanel")
  @js.native
  open class LogConsolePanel protected () extends StackedPanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: ILoggerRegistry) = this()
    def this(loggerRegistry: ILoggerRegistry, translator: ITranslator) = this()
    
    /* private */ var _bindLoggerSignals: Any = js.native
    
    /* private */ var _handlePlaceholder: Any = js.native
    
    /* private */ var _loggerRegistry: Any = js.native
    
    /* private */ var _loggersWatched: Any = js.native
    
    /* private */ var _outputAreas: Any = js.native
    
    /* private */ var _placeholder: Any = js.native
    
    /* private */ var _showOutputFromSource: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _sourceChanged: Any = js.native
    
    /* private */ var _sourceDisplayed: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* private */ var _updateOutputAreas: Any = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
  }
  
  @JSImport("@jupyterlab/logconsole/lib/widget", "ScrollingWidget")
  @js.native
  open class ScrollingWidget[T /* <: Widget */] protected () extends Widget {
    def this(param0: IOptions[T]) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _handleScroll: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _scrollHeight: Any = js.native
    
    /* private */ var _sentinel: Any = js.native
    
    /* private */ var _tracking: Any = js.native
    
    /**
      * The content widget.
      */
    def content: T = js.native
  }
  object ScrollingWidget {
    
    trait IOptions[T /* <: Widget */]
      extends StObject
         with typings.luminoWidgets.typesWidgetMod.Widget.IOptions {
      
      var content: T
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */](content: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?], T /* <: Widget */] (val x: Self & IOptions[T]) extends AnyVal {
        
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISourceDisplayed] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
}
