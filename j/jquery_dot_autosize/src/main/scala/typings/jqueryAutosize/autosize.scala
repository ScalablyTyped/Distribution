package typings.jqueryAutosize

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autosize {
  
  @js.native
  trait AutosizeStatic extends StObject {
    
    def apply(el: JQuery[HTMLElement]): Unit = js.native
    def apply(el: Element): Unit = js.native
    def apply(el: NodeList): Unit = js.native
  }
}
