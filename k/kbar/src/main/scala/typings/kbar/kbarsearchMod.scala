package typings.kbar

import typings.kbar.anon.InputHTMLAttributesHTMLIn
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kbarsearchMod {
  
  @JSImport("kbar/lib/KBarSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kbar/lib/KBarSearch", "KBAR_LISTBOX")
  @js.native
  val KBAR_LISTBOX: /* "kbar-listbox" */ String = js.native
  
  inline def KBarSearch(props: InputHTMLAttributesHTMLIn): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarSearch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getListboxItemId(id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListboxItemId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
}
