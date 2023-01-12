package typings.luminoDragdrop

import typings.luminoCoreutils.mod.MimeData
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDragdrop.mod.Drag.IOptions
import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/dragdrop", "Drag")
  @js.native
  open class Drag protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new drag object.
      *
      * @param options - The options for initializing the drag.
      */
    def this(options: IOptions) = this()
    
    /**
      * Add the document event listeners for the drag object.
      */
    /* private */ var _addListeners: Any = js.native
    
    /**
      * Attach the drag image element at the specified location.
      *
      * This is a no-op if there is no drag image element.
      */
    /* private */ var _attachDragImage: Any = js.native
    
    /* private */ var _currentElement: Any = js.native
    
    /* private */ var _currentTarget: Any = js.native
    
    /**
      * Detach the drag image element from the DOM.
      *
      * This is a no-op if there is no drag image element.
      */
    /* private */ var _detachDragImage: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _dropAction: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the drag object.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the drag object.
      */
    /* private */ var _evtMouseMove: Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the drag object.
      */
    /* private */ var _evtMouseUp: Any = js.native
    
    /**
      * Finalize the drag operation and resolve the drag promise.
      */
    /* private */ var _finalize: Any = js.native
    
    /**
      * The scroll loop handler function.
      */
    /* private */ var _onScrollFrame: Any = js.native
    
    /* private */ var _override: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /**
      * Remove the document event listeners for the drag object.
      */
    /* private */ var _removeListeners: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /* private */ var _scrollTarget: Any = js.native
    
    /**
      * Set the internal drop action state and update the drag cursor.
      */
    /* private */ var _setDropAction: Any = js.native
    
    /**
      * Update the current target node using the given mouse event.
      */
    /* private */ var _updateCurrentTarget: Any = js.native
    
    /**
      * Update the drag scroll element under the mouse.
      */
    /* private */ var _updateDragScroll: Any = js.native
    
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
      * The target document for dragging events.
      */
    val document: Document | ShadowRoot = js.native
    
    /**
      * The drag image element for the drag object.
      */
    val dragImage: HTMLElement | Null = js.native
    
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
    def handleEvent(event: Event): Unit = js.native
    
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
      * Move the drag image element to the specified location.
      *
      * This is a no-op if there is no drag image element.
      */
    /* protected */ def moveDragImage(clientX: Double, clientY: Double): Unit = js.native
    
    /**
      * The proposed drop action for the drag object.
      */
    val proposedAction: DropAction = js.native
    
    /**
      * Get the drag source for the drag object.
      */
    val source: Any = js.native
    
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
    
    /**
      * The supported drop actions for the drag object.
      */
    val supportedActions: SupportedActions = js.native
  }
  object Drag {
    
    @JSImport("@lumino/dragdrop", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Override the cursor icon for the entire document.
      *
      * @param cursor - The string representing the cursor style.
      *
      * @returns A disposable which will clear the override when disposed.
      *
      * #### Notes
      * The most recent call to `overrideCursor` takes precedence.
      * Disposing an old override has no effect on the current override.
      *
      * This utility function is used by the `Drag` class to override the
      * mouse cursor during a drag-drop operation, but it can also be used
      * by other classes to fix the cursor icon during normal mouse drags.
      *
      * #### Example
      * ```typescript
      * import { Drag } from '@lumino/dragdrop';
      *
      * // Force the cursor to be 'wait' for the entire document.
      * let override = Drag.overrideCursor('wait');
      *
      * // Clear the override by disposing the return value.
      * override.dispose();
      * ```
      */
    inline def overrideCursor(cursor: String): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideCursor")(cursor.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
    inline def overrideCursor(cursor: String, doc: Document): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideCursor")(cursor.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
    inline def overrideCursor(cursor: String, doc: ShadowRoot): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideCursor")(cursor.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
    
    /**
      * An options object for initializing a `Drag` object.
      */
    trait IOptions extends StObject {
      
      /**
        * The root element for dragging DOM artifacts (defaults to document).
        */
      var document: js.UndefOr[Document | ShadowRoot] = js.undefined
      
      /**
        * An optional drag image which follows the mouse cursor.
        *
        * #### Notes
        * The drag image can be any DOM element. It is not limited to
        * image or canvas elements as with the native drag-drop APIs.
        *
        * If provided, this will be positioned at the mouse cursor on each
        * mouse move event. A CSS transform can be used to offset the node
        * from its specified position.
        *
        * The drag image will automatically have the `lm-mod-drag-image`
        * class name added.
        *
        * The default value is `null`.
        */
      var dragImage: js.UndefOr[HTMLElement] = js.undefined
      
      /**
        * The populated mime data for the drag operation.
        */
      var mimeData: MimeData
      
      /**
        * The optional proposed drop action for the drag operation.
        *
        * #### Notes
        * This can be provided as a hint to the drop targets as to which
        * drop action is preferred.
        *
        * The default value is `'copy'`.
        */
      var proposedAction: js.UndefOr[DropAction] = js.undefined
      
      /**
        * An optional object which indicates the source of the drag.
        *
        * #### Notes
        * For advanced applications, the drag initiator may wish to expose
        * a source object to the drop targets. That object can be specified
        * here and will be carried along with the drag events.
        *
        * The default value is `null`.
        */
      var source: js.UndefOr[Any] = js.undefined
      
      /**
        * The drop actions supported by the drag initiator.
        *
        * #### Notes
        * A drop target must indicate that it intends to perform one of the
        * supported actions in order to receive a drop event. However, it is
        * not required to *actually* perform that action when handling the
        * drop event. Therefore, the initiator must be prepared to handle
        * any drop action performed by a drop target.
        *
        * The default value is `'all'`.
        */
      var supportedActions: js.UndefOr[SupportedActions] = js.undefined
    }
    object IOptions {
      
      inline def apply(mimeData: MimeData): IOptions = {
        val __obj = js.Dynamic.literal(mimeData = mimeData.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setDocument(value: Document | ShadowRoot): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
        
        inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
        
        inline def setDragImage(value: HTMLElement): Self = StObject.set(x, "dragImage", value.asInstanceOf[js.Any])
        
        inline def setDragImageUndefined: Self = StObject.set(x, "dragImage", js.undefined)
        
        inline def setMimeData(value: MimeData): Self = StObject.set(x, "mimeData", value.asInstanceOf[js.Any])
        
        inline def setProposedAction(value: DropAction): Self = StObject.set(x, "proposedAction", value.asInstanceOf[js.Any])
        
        inline def setProposedActionUndefined: Self = StObject.set(x, "proposedAction", js.undefined)
        
        inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setSupportedActions(value: SupportedActions): Self = StObject.set(x, "supportedActions", value.asInstanceOf[js.Any])
        
        inline def setSupportedActionsUndefined: Self = StObject.set(x, "supportedActions", js.undefined)
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDragdrop.luminoDragdropStrings.none
    - typings.luminoDragdrop.luminoDragdropStrings.copy
    - typings.luminoDragdrop.luminoDragdropStrings.link
    - typings.luminoDragdrop.luminoDragdropStrings.move
  */
  trait DropAction extends StObject
  object DropAction {
    
    inline def copy: typings.luminoDragdrop.luminoDragdropStrings.copy = "copy".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.copy]
    
    inline def link: typings.luminoDragdrop.luminoDragdropStrings.link = "link".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.link]
    
    inline def move: typings.luminoDragdrop.luminoDragdropStrings.move = "move".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.move]
    
    inline def none: typings.luminoDragdrop.luminoDragdropStrings.none = "none".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.none]
  }
  
  @js.native
  trait IDragEvent
    extends StObject
       with MouseEvent {
    
    /**
      * The drop action supported or taken by the drop target.
      *
      * #### Notes
      * At the start of each event, this value will be `'none'`. During a
      * `'lm-dragover'` event, the drop target must set this value to one
      * of the supported actions, or the drop event will not occur.
      *
      * When handling the drop event, the drop target should set this
      * to the action which was *actually* taken. This value will be
      * reported back to the drag initiator.
      */
    var dropAction: DropAction = js.native
    
    /**
      * The mime data associated with the event.
      *
      * #### Notes
      * This is mime data provided by the drag initiator. Drop targets
      * should use this data to determine if they can handle the drop.
      */
    val mimeData: MimeData = js.native
    
    /**
      * The drop action proposed by the drag initiator.
      *
      * #### Notes
      * This is the action which is *preferred* by the drag initiator. The
      * drop target is not required to perform this action, but should if
      * it all possible.
      */
    val proposedAction: DropAction = js.native
    
    /**
      * The source object of the drag, as provided by the drag initiator.
      *
      * #### Notes
      * For advanced applications, the drag initiator may wish to expose
      * a source object to the drop targets. That will be provided here
      * if given by the drag initiator, otherwise it will be `null`.
      */
    val source: Any = js.native
    
    /**
      * The drop actions supported by the drag initiator.
      *
      * #### Notes
      * If the `dropAction` is not set to one of the supported actions
      * during the `'lm-dragover'` event, the drop event will not occur.
      */
    val supportedActions: SupportedActions = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDragdrop.luminoDragdropStrings.`copy-link`
    - typings.luminoDragdrop.luminoDragdropStrings.`copy-move`
    - typings.luminoDragdrop.luminoDragdropStrings.`link-move`
    - typings.luminoDragdrop.luminoDragdropStrings.all
    - typings.luminoDragdrop.luminoDragdropStrings.none
    - typings.luminoDragdrop.luminoDragdropStrings.copy
    - typings.luminoDragdrop.luminoDragdropStrings.link
    - typings.luminoDragdrop.luminoDragdropStrings.move
  */
  trait SupportedActions extends StObject
  object SupportedActions {
    
    inline def all: typings.luminoDragdrop.luminoDragdropStrings.all = "all".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.all]
    
    inline def copy: typings.luminoDragdrop.luminoDragdropStrings.copy = "copy".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.copy]
    
    inline def `copy-link`: typings.luminoDragdrop.luminoDragdropStrings.`copy-link` = "copy-link".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.`copy-link`]
    
    inline def `copy-move`: typings.luminoDragdrop.luminoDragdropStrings.`copy-move` = "copy-move".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.`copy-move`]
    
    inline def link: typings.luminoDragdrop.luminoDragdropStrings.link = "link".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.link]
    
    inline def `link-move`: typings.luminoDragdrop.luminoDragdropStrings.`link-move` = "link-move".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.`link-move`]
    
    inline def move: typings.luminoDragdrop.luminoDragdropStrings.move = "move".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.move]
    
    inline def none: typings.luminoDragdrop.luminoDragdropStrings.none = "none".asInstanceOf[typings.luminoDragdrop.luminoDragdropStrings.none]
  }
}
