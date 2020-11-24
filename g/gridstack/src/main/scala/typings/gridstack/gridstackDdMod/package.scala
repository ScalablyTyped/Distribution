package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gridstackDdMod {
  
  type DDCallback = js.Function3[
    /* event */ typings.std.Event, 
    /* arg2 */ typings.gridstack.typesMod.GridItemHTMLElement, 
    /* helper */ js.UndefOr[typings.gridstack.typesMod.GridItemHTMLElement], 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.minWidth
    - typings.gridstack.gridstackStrings.minHeight
    - java.lang.String
  */
  type DDKey = typings.gridstack.gridstackDdMod._DDKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.enable
    - typings.gridstack.gridstackStrings.disable
    - typings.gridstack.gridstackStrings.destroy
    - typings.gridstack.gridstackStrings.option
    - java.lang.String
    - js.Any
  */
  type DDOpts = typings.gridstack.gridstackDdMod._DDOpts | java.lang.String | js.Any
  
  type DDValue = scala.Double | java.lang.String
}
