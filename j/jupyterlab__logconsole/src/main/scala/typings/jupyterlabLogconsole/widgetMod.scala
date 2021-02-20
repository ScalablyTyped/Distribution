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
import scala.scalajs.js.`|`
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
    
    var _bindLoggerSignals: js.Any = js.native
    
    var _handlePlaceholder: js.Any = js.native
    
    var _loggerRegistry: js.Any = js.native
    
    var _loggersWatched: js.Any = js.native
    
    var _outputAreas: js.Any = js.native
    
    var _placeholder: js.Any = js.native
    
    var _showOutputFromSource: js.Any = js.native
    
    var _source: js.Any = js.native
    
    var _sourceChanged: js.Any = js.native
    
    var _sourceDisplayed: js.Any = js.native
    
    var _updateOutputAreas: js.Any = js.native
    
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
    
    var _content: js.Any = js.native
    
    var _handleScroll: js.Any = js.native
    
    var _observer: js.Any = js.native
    
    var _scrollHeight: js.Any = js.native
    
    var _sentinel: js.Any = js.native
    
    var _tracking: js.Any = js.native
    
    /**
      * The content widget.
      */
    def content: T = js.native
  }
  object ScrollingWidget {
    
    @js.native
    trait IOptions[T /* <: Widget */]
      extends typings.luminoWidgets.widgetMod.Widget.IOptions {
      
      var content: T = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: Widget */](content: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: Widget */] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ISourceDisplayed extends StObject {
    
    var source: String | Null = js.native
    
    var version: Double | Null = js.native
  }
  object ISourceDisplayed {
    
    @scala.inline
    def apply(): ISourceDisplayed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISourceDisplayed]
    }
    
    @scala.inline
    implicit class ISourceDisplayedMutableBuilder[Self <: ISourceDisplayed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
}
