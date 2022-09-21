package typings.ltx

import typings.ltx.srcElementMod.Element
import typings.ltx.srcJsonifyMod.ElementJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonifyMod {
  
  inline def apply(el: String): String | ElementJson = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[String | ElementJson]
  inline def apply(el: Element): Element | ElementJson = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[Element | ElementJson]
  
  @JSImport("ltx/lib/JSONify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
