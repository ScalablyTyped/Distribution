package typings.jqueryAnimateScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    def animateScroll(): JQuery = js.native
    def animateScroll(options: Options): JQuery = js.native
    
    def scrollHere(): JQuery = js.native
    def scrollHere(options: Options): JQuery = js.native
  }
  
  @js.native
  trait JQueryStatic extends js.Object {
    
    def scrollTo(element: JQuery): Unit = js.native
    def scrollTo(element: JQuery, options: Options): Unit = js.native
  }
}
