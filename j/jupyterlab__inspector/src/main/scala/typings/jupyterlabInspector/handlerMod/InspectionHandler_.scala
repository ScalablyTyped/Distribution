package typings.jupyterlabInspector.handlerMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectorUpdate
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jupyterlabInspector.tokensMod.IInspector.IInspectable because var conflicts: isDisposed. Inlined cleared, disposed, inspected, standby */ @JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
@js.native
class InspectionHandler_ protected () extends IDisposable {
  /**
    * Construct a new inspection handler for a widget.
    */
  def this(options: IOptions) = this()
  
  var _cleared: js.Any = js.native
  
  var _connector: js.Any = js.native
  
  var _debouncer: js.Any = js.native
  
  var _disposed: js.Any = js.native
  
  var _editor: js.Any = js.native
  
  var _inspected: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Handle changes to the editor state, debouncing.
    */
  var _onChange: js.Any = js.native
  
  var _pending: js.Any = js.native
  
  var _rendermime: js.Any = js.native
  
  var _standby: js.Any = js.native
  
  /**
    * A signal emitted when the inspector should clear all items.
    */
  def cleared: ISignal[InspectionHandler, Unit] = js.native
  /**
    * A signal emitted when the inspector should clear all items.
    */
  @JSName("cleared")
  var cleared_FInspectionHandler_ : ISignal[_, Unit] = js.native
  
  /**
    * A signal emitted when the handler is disposed.
    */
  def disposed: ISignal[InspectionHandler, Unit] = js.native
  /**
    * A signal emitted when the inspectable is disposed.
    */
  @JSName("disposed")
  var disposed_FInspectionHandler_ : ISignal[_, Unit] = js.native
  
  /**
    * The editor widget used by the inspection handler.
    */
  def editor: IEditor | Null = js.native
  def editor_=(newValue: IEditor | Null): Unit = js.native
  
  /**
    * A signal emitted when an inspector value is generated.
    */
  def inspected: ISignal[InspectionHandler, IInspectorUpdate] = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  @JSName("inspected")
  var inspected_FInspectionHandler_ : ISignal[_, IInspectorUpdate] = js.native
  
  /**
    * Get whether the inspection handler is disposed.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("isDisposed")
  def isDisposed_MInspectionHandler_ : Boolean = js.native
  
  /**
    * Handle a text changed signal from an editor.
    *
    * #### Notes
    * Update the hints inspector based on a text change.
    */
  /* protected */ def onEditorChange(): Unit = js.native
  
  /**
    * Indicates whether the handler makes API inspection requests or stands by.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible.
    */
  def standby: Boolean = js.native
  def standby_=(value: Boolean): Unit = js.native
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible. It can be modified by the consumer of the source.
    */
  @JSName("standby")
  var standby_FInspectionHandler_ : Boolean = js.native
}
