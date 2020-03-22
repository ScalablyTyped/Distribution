package typings.luminoDragdrop.mod

import typings.luminoCoreutils.mod.MimeData
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDragdrop.mod.Drag.IOptions
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/dragdrop", "Drag")
@js.native
class Drag_ protected () extends IDisposable {
  /**
    * Construct a new drag object.
    *
    * @param options - The options for initializing the drag.
    */
  def this(options: IOptions) = this()
  /**
    * Add the document event listeners for the drag object.
    */
  var _addListeners: js.Any = js.native
  /**
    * Attach the drag image element at the specified location.
    *
    * This is a no-op if there is no drag image element.
    */
  var _attachDragImage: js.Any = js.native
  var _currentElement: js.Any = js.native
  var _currentTarget: js.Any = js.native
  /**
    * Detach the drag image element from the DOM.
    *
    * This is a no-op if there is no drag image element.
    */
  var _detachDragImage: js.Any = js.native
  var _disposed: js.Any = js.native
  var _dropAction: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the drag object.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the drag object.
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the drag object.
    */
  var _evtMouseUp: js.Any = js.native
  /**
    * Finalize the drag operation and resolve the drag promise.
    */
  var _finalize: js.Any = js.native
  /**
    * Move the drag image element to the specified location.
    *
    * This is a no-op if there is no drag image element.
    */
  var _moveDragImage: js.Any = js.native
  /**
    * The scroll loop handler function.
    */
  var _onScrollFrame: js.Any = js.native
  var _override: js.Any = js.native
  var _promise: js.Any = js.native
  /**
    * Remove the document event listeners for the drag object.
    */
  var _removeListeners: js.Any = js.native
  var _resolve: js.Any = js.native
  var _scrollTarget: js.Any = js.native
  /**
    * Set the internal drop action state and update the drag cursor.
    */
  var _setDropAction: js.Any = js.native
  /**
    * Update the current target node using the given mouse event.
    */
  var _updateCurrentTarget: js.Any = js.native
  /**
    * Update the drag scroll element under the mouse.
    */
  var _updateDragScroll: js.Any = js.native
  /**
    * The drag image element for the drag object.
    */
  val dragImage: HTMLElement | Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The mime data for the drag object.
    */
  val mimeData: MimeData = js.native
  /**
    * The proposed drop action for the drag object.
    */
  val proposedAction: DropAction = js.native
  /**
    * Get the drag source for the drag object.
    */
  val source: js.Any = js.native
  /**
    * The supported drop actions for the drag object.
    */
  val supportedActions: SupportedActions = js.native
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
    * Handle the DOM events for the drag operation.
    *
    * @param event - The DOM event sent to the drag object.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the document. It should not be
    * called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Start the drag operation at the specified client position.
    *
    * @param clientX - The client X position for the drag start.
    *
    * @param clientY - The client Y position for the drag start.
    *
    * @returns A promise which resolves to the result of the drag.
    *
    * #### Notes
    * If the drag has already been started, the promise created by the
    * first call to `start` is returned.
    *
    * If the drag operation has ended, or if the drag object has been
    * disposed, the returned promise will resolve to `'none'`.
    *
    * The drag object will be automatically disposed when drag operation
    * completes. This means `Drag` objects are for single-use only.
    *
    * This method assumes the left mouse button is already held down.
    */
  def start(clientX: Double, clientY: Double): js.Promise[DropAction] = js.native
}

