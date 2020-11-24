package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.moveScale
    - typings.gridstack.gridstackStrings.move
    - typings.gridstack.gridstackStrings.scale
    - typings.gridstack.gridstackStrings.none
    - js.Function4[
  / * column * / scala.Double, 
  / * oldColumn * / scala.Double, 
  / * nodes * / js.Array[typings.gridstack.typesMod.GridStackNode], 
  / * oldNodes * / js.Array[typings.gridstack.typesMod.GridStackNode], 
  scala.Unit]
  */
  type ColumnOptions = typings.gridstack.typesMod._ColumnOptions | (js.Function4[
    /* column */ scala.Double, 
    /* oldColumn */ scala.Double, 
    /* nodes */ js.Array[typings.gridstack.typesMod.GridStackNode], 
    /* oldNodes */ js.Array[typings.gridstack.typesMod.GridStackNode], 
    scala.Unit
  ])
  
  type numberOrString = scala.Double | java.lang.String
}
