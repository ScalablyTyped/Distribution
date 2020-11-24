package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utils {
  
  type ArrayChanges[T] = js.Array[typings.knockout.mod.utils.ArrayChange[T]]
  
  type MappingAfterAddFunction[T] = js.Function3[
    /* arrayEntry */ T, 
    /* nodes */ js.Array[typings.std.Node], 
    /* index */ typings.knockout.mod.Observable_[scala.Double], 
    js.Array[typings.std.Node]
  ]
  
  type MappingFunction[T] = js.Function3[
    /* valueToMap */ T, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[typings.std.Node], 
    js.Array[typings.std.Node]
  ]
  
  type MappingHookFunction[T] = js.Function3[
    /* nodes */ js.Array[typings.std.Node], 
    /* index */ scala.Double, 
    /* arrayEntry */ T, 
    scala.Unit
  ]
}
