package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/searchinstance", JSImport.Namespace)
@js.native
object searchinstanceMod extends js.Object {
  @js.native
  class SearchInstance protected () extends IDisposable {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
    var _activeProvider: js.Any = js.native
    var _displayState: js.Any = js.native
    var _displayUpdateSignal: js.Any = js.native
    var _disposed: js.Any = js.native
    var _highlightNext: js.Any = js.native
    var _highlightPrevious: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _onCaseSensitiveToggled: js.Any = js.native
    var _onRegexToggled: js.Any = js.native
    var _replaceAll: js.Any = js.native
    var _replaceCurrent: js.Any = js.native
    var _searchWidget: js.Any = js.native
    var _startQuery: js.Any = js.native
    var _updateDisplay: js.Any = js.native
    var _widget: js.Any = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Display search widget.
      */
    def _displaySearchWidget(): Unit = js.native
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    def disposed: ISignal[this.type, Unit] = js.native
    /**
      * Focus the search widget input.
      */
    def focusInput(): Unit = js.native
    /**
      * Test if the object has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSearchInstance: Boolean = js.native
    /**
      * The search provider.
      */
    def provider: ISearchProvider[Widget] = js.native
    /**
      * The search widget.
      */
    def searchWidget: Widget = js.native
    /**
      * If there is a replace box, show it.
      */
    def showReplace(): Unit = js.native
    /**
      * Updates the match index and total display in the search widget.
      */
    def updateIndices(): Unit = js.native
  }
  
}

