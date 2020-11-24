package typings.jqueryAppear.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    /**
      * Initialize appear plugin
      */
    def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit]): JQuery = js.native
    def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit], options: Options[T]): JQuery = js.native
  }
}
