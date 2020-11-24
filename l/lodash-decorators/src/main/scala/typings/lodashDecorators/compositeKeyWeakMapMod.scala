package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/utils/CompositeKeyWeakMap", JSImport.Namespace)
@js.native
object compositeKeyWeakMapMod extends js.Object {
  
  @js.native
  class CompositeKeyWeakMap[T] () extends js.Object {
    
    var _weakMap: js.Any = js.native
    
    def get(keys: js.Array[_]): T = js.native
    
    def has(keys: js.Array[_]): Boolean = js.native
    
    def set(keys: js.Array[_], value: T): Unit = js.native
  }
}
