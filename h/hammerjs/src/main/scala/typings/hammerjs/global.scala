package typings.hammerjs

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Hammer protected () extends HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  
  @js.native
  class HammerInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class MouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class PointerEventInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class SingleTouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class TouchAction protected ()
    extends typings.hammerjs.TouchAction {
    def this(manager: HammerManager, value: String) = this()
  }
  
  @js.native
  class TouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class TouchMouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  object Hammer extends TopLevel[HammerStatic]
  
}

