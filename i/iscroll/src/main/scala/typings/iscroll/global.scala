package typings.iscroll

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class IScroll protected ()
    extends typings.iscroll.IScroll {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, options: IScrollOptions) = this()
    def this(element: HTMLElement, options: IScrollOptions) = this()
  }
  
}

