package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// FactoryFunctionMap can be nested; all nested objects will be flattened
/** 
NOTE: Rewritten from type alias:
{{{
type FactoryFunctionMap = {[key: string] : mathjs.mathjs.FactoryFunction<any> | mathjs.mathjs.FactoryFunctionMap}
}}}
to avoid circular code involving: 
- mathjs.mathjs.FactoryFunctionMap
*/
trait FactoryFunctionMap
  extends StObject
     with // eslint-disable-next-line @typescript-eslint/no-explicit-any
/* key */ StringDictionary[FactoryFunction[Any] | FactoryFunctionMap]
object FactoryFunctionMap {
  
  inline def apply(): FactoryFunctionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FactoryFunctionMap]
  }
}
