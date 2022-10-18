package typings.jupyterlabHtmlviewer

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabApputils.mod.IFrame
import typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptionsOptionalContent
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoWidgets.typesWidgetMod.Widget because Already inherited
  - typings.luminoWidgets.mod.Widget because Already inherited
  - typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget because Already inherited typings.luminoMessaging.mod.IMessageHandler */ @JSImport("@jupyterlab/htmlviewer", "HTMLViewer")
  @js.native
  open class HTMLViewer protected () extends DocumentWidget[IFrame, IModel] {
    /**
      * Create a new widget for rendering HTML.
      */
    def this(options: IOptionsOptionalContent[Widget, IModel]) = this()
    
    /* private */ var _monitor: Any = js.native
    
    /* private */ var _objectUrl: Any = js.native
    
    /* private */ var _parser: Any = js.native
    
    /**
      * Render HTML in IFrame into this widget's node.
      */
    /* private */ var _renderModel: Any = js.native
    
    /* private */ var _renderPending: Any = js.native
    
    /**
      * Set a <base> element in the HTML string so that the iframe
      * can correctly dereference relative links.
      */
    /* private */ var _setBase: Any = js.native
    
    /* private */ var _trustedChanged: Any = js.native
    
    /**
      * Handle and update request.
      */
    /* protected */ def onUpdateRequest(): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
    
    /**
      * Whether the HTML document is trusted. If trusted,
      * it can execute Javascript in the iframe sandbox.
      */
    def trusted: Boolean = js.native
    
    /**
      * Emitted when the trust state of the document changes.
      */
    def trustedChanged: ISignal[this.type, Boolean] = js.native
    
    def trusted_=(value: Boolean): Unit = js.native
  }
  
  @JSImport("@jupyterlab/htmlviewer", "HTMLViewerFactory")
  @js.native
  open class HTMLViewerFactory protected () extends ABCWidgetFactory[HTMLViewer, IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[HTMLViewer]) = this()
  }
  
  @JSImport("@jupyterlab/htmlviewer", "IHTMLViewerTracker")
  @js.native
  val IHTMLViewerTracker: Token[typings.jupyterlabHtmlviewer.mod.IHTMLViewerTracker] = js.native
  type IHTMLViewerTracker = IWidgetTracker[HTMLViewer]
  
  object ToolbarItems {
    
    @JSImport("@jupyterlab/htmlviewer", "ToolbarItems")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create the refresh button
      *
      * @param widget HTML viewer widget
      * @param translator Application translator object
      * @returns Toolbar item button
      */
    inline def createRefreshButton(widget: HTMLViewer): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshButton")(widget.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createRefreshButton(widget: HTMLViewer, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshButton")(widget.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create the trust button
      *
      * @param document HTML viewer widget
      * @param translator Application translator object
      * @returns Toolbar item button
      */
    inline def createTrustButton(document: HTMLViewer, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createTrustButton")(document.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
  }
}
