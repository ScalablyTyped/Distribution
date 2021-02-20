package typings.ionicCore

import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/segment-button/segment-button", "SegmentButton")
  @js.native
  class SegmentButton ()
    extends ComponentInterface
       with ButtonInterface {
    
    var checked: Boolean = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSegmentButton(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSegmentButton(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ def hasIcon: js.Any = js.native
    
    /* private */ def hasLabel: js.Any = js.native
    
    /**
      * Set the layout of the text and icon in the segment.
      */
    var layout: js.UndefOr[SegmentButtonLayout] = js.native
    
    @JSName("render")
    def render_MSegmentButton(): js.Any = js.native
    
    var segmentEl: js.Any = js.native
    
    var updateState: js.Any = js.native
    
    var updateStyle: js.Any = js.native
    
    /**
      * The value of the segment button.
      */
    var value: String = js.native
  }
}
