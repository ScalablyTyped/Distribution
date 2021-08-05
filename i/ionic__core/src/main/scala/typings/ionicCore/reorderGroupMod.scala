package typings.ionicCore

import typings.ionicCore.ionicCoreNumbers.`0`
import typings.ionicCore.ionicCoreNumbers.`1`
import typings.ionicCore.ionicCoreNumbers.`2`
import typings.ionicCore.reorderGroupInterfaceMod.ItemReorderEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reorderGroupMod {
  
  @JSImport("@ionic/core/dist/types/components/reorder-group/reorder-group", "ReorderGroup")
  @js.native
  class ReorderGroup ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var autoscroll: js.Any = js.native
    
    /* private */ var cachedHeights: js.Any = js.native
    
    /* private */ var canStart: js.Any = js.native
    
    /**
      * Completes the reorder operation. Must be called by the `ionItemReorder` event.
      *
      * If a list of items is passed, the list will be reordered and returned in the
      * proper order.
      *
      * If no parameters are passed or if `true` is passed in, the reorder will complete
      * and the item will remain in the position it was dragged to. If `false` is passed,
      * the reorder will complete and the item will bounce back to its original position.
      *
      * @param listOrReorder A list of items to be sorted and returned in the new order or a
      * boolean of whether or not the reorder should reposition the item.
      */
    def complete(): js.Promise[js.Any] = js.native
    def complete(listOrReorder: js.Array[js.Any]): js.Promise[js.Any] = js.native
    def complete(listOrReorder: Boolean): js.Promise[js.Any] = js.native
    
    /* private */ var completeSync: js.Any = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MReorderGroup(): js.Promise[Unit] = js.native
    
    /* private */ var containerBottom: js.Any = js.native
    
    /* private */ var containerTop: js.Any = js.native
    
    /**
      * If `true`, the reorder will be hidden.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MReorderGroup(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var gesture: js.Any = js.native
    
    /**
      * Event that needs to be listened to in order to complete the reorder action.
      * Once the event has been emitted, the `complete()` method then needs
      * to be called in order to finalize the reorder action.
      */
    var ionItemReorder: EventEmitter[ItemReorderEventDetail] = js.native
    
    /* private */ var itemIndexForTop: js.Any = js.native
    
    /* private */ var lastToIndex: js.Any = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    @JSName("render")
    def render_MReorderGroup(): js.Any = js.native
    
    /********* DOM WRITE ********* */
    /* private */ var reorderMove: js.Any = js.native
    
    /* private */ var scrollEl: js.Any = js.native
    
    /* private */ var scrollElBottom: js.Any = js.native
    
    /* private */ var scrollElInitial: js.Any = js.native
    
    /* private */ var scrollElTop: js.Any = js.native
    
    /* private */ var selectedItemEl: js.Any = js.native
    
    /* private */ var selectedItemHeight: js.Any = js.native
    
    var state: ReorderGroupState = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreNumbers.`0`
    - typings.ionicCore.ionicCoreNumbers.`1`
    - typings.ionicCore.ionicCoreNumbers.`2`
  */
  trait ReorderGroupState extends StObject
  object ReorderGroupState {
    
    inline def Active: `1` = 1.asInstanceOf[`1`]
    
    inline def Complete: `2` = 2.asInstanceOf[`2`]
    
    inline def Idle: `0` = 0.asInstanceOf[`0`]
  }
}
