package typings.mapboxHastUtilTableCellStyle

import typings.hast.mod.Element
import typings.hast.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This simple utility transforms the following deprecated styling attributes on `<td>`, `<th>`, and `<tr>` elements to equivalent inline styles:
    *
    * - `align`
    * - `valign`
    * - `width`
    * - `height`
    *
    * Mutates the HAST AST you pass in, and returns it.
    */
  inline def apply(ast: Element): Element = ^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(ast: Root): Root = ^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any]).asInstanceOf[Root]
  
  @JSImport("@mapbox/hast-util-table-cell-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
