package typings.materialBanner

import typings.materialBanner.adapterMod.MDCBannerAdapter
import typings.materialBanner.anon.PartialMDCBannerAdapter
import typings.materialBanner.constantsMod.CloseReason
import typings.materialBase.foundationMod.MDCFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/banner/foundation", "MDCBannerFoundation")
  @js.native
  class MDCBannerFoundation () extends MDCFoundation[MDCBannerAdapter] {
    def this(adapter: PartialMDCBannerAdapter) = this()
    
    /**
      * @param reason Why the banner was closed. Value will be passed to
      *     events.CLOSING and events.CLOSED via the `event.detail.reason`
      *     property. Standard values are CloseReason.PRIMARY and
      *     CloseReason.SECONDARY, but CloseReason.UNSPECIFIED is provided for
      *     custom handling of programmatic closing of the banner.
      */
    def close(reason: CloseReason): Unit = js.native
    
    def handlePrimaryActionClick(): Unit = js.native
    
    def handleSecondaryActionClick(): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    def open(): Unit = js.native
  }
}
