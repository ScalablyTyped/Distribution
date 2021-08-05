package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonItemSlidingElement
import typings.ionicCore.ionicCoreNumbers.`16`
import typings.ionicCore.ionicCoreNumbers.`2`
import typings.ionicCore.ionicCoreNumbers.`32`
import typings.ionicCore.ionicCoreNumbers.`4`
import typings.ionicCore.ionicCoreNumbers.`64`
import typings.ionicCore.ionicCoreNumbers.`8`
import typings.ionicCore.mod.Side
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemSlidingMod {
  
  @JSImport("@ionic/core/dist/types/components/item-sliding/item-sliding", "ItemSliding")
  @js.native
  class ItemSliding ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var calculateOptsWidth: js.Any = js.native
    
    /* private */ var canStart: js.Any = js.native
    
    /**
      * Close the sliding item. Items can also be closed from the [List](../list).
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Close all of the sliding items in the list. Items can also be closed from the [List](../list).
      */
    def closeOpened(): js.Promise[Boolean] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MItemSliding(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the user cannot interact with the sliding item.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MItemSliding(): Unit = js.native
    
    var el: HTMLIonItemSlidingElement = js.native
    
    /* private */ var gesture: js.Any = js.native
    
    /**
      * Get the amount the item is open in pixels.
      */
    def getOpenAmount(): js.Promise[Double] = js.native
    
    /**
      * Given an optional side, return the ion-item-options element.
      *
      * @param side This side of the options to get. If a side is not provided it will
      * return the first one available.
      */
    /* private */ var getOptions: js.Any = js.native
    
    /**
      * Get the ratio of the open amount of the item compared to the width of the options.
      * If the number returned is positive, then the options on the right side are open.
      * If the number returned is negative, then the options on the left side are open.
      * If the absolute value of the number is greater than 1, the item is open more than
      * the width of the options.
      */
    def getSlidingRatio(): js.Promise[Double] = js.native
    
    /* private */ var getSlidingRatioSync: js.Any = js.native
    
    /* private */ var initialOpenAmount: js.Any = js.native
    
    /**
      * Emitted when the sliding position changes.
      */
    var ionDrag: EventEmitter[js.Any] = js.native
    
    /* private */ var item: js.Any = js.native
    
    /* private */ var leftOptions: js.Any = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    /**
      * Open the sliding item.
      *
      * @param side The side of the options to open. If a side is not provided, it will open the first set of options it finds within the item.
      */
    def open(): js.Promise[Unit] = js.native
    def open(side: Side): js.Promise[Unit] = js.native
    
    /* private */ var openAmount: js.Any = js.native
    
    /* private */ var optsDirty: js.Any = js.native
    
    /* private */ var optsWidthLeftSide: js.Any = js.native
    
    /* private */ var optsWidthRightSide: js.Any = js.native
    
    @JSName("render")
    def render_MItemSliding(): js.Any = js.native
    
    /* private */ var rightOptions: js.Any = js.native
    
    /* private */ var setOpenAmount: js.Any = js.native
    
    /* private */ var sides: js.Any = js.native
    
    var state: SlidingState = js.native
    
    /* private */ var tmr: js.Any = js.native
    
    /* private */ var updateOptions: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreNumbers.`2`
    - typings.ionicCore.ionicCoreNumbers.`4`
    - typings.ionicCore.ionicCoreNumbers.`8`
    - typings.ionicCore.ionicCoreNumbers.`16`
    - typings.ionicCore.ionicCoreNumbers.`32`
    - typings.ionicCore.ionicCoreNumbers.`64`
  */
  trait SlidingState extends StObject
  object SlidingState {
    
    inline def Disabled: `2` = 2.asInstanceOf[`2`]
    
    inline def Enabled: `4` = 4.asInstanceOf[`4`]
    
    inline def End: `8` = 8.asInstanceOf[`8`]
    
    inline def Start: `16` = 16.asInstanceOf[`16`]
    
    inline def SwipeEnd: `32` = 32.asInstanceOf[`32`]
    
    inline def SwipeStart: `64` = 64.asInstanceOf[`64`]
  }
}
