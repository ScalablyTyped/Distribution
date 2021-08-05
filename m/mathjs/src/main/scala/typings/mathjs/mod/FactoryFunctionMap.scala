package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// FactoryFunctionMap can be nested; all nested objects will be flattened
trait FactoryFunctionMap
  extends StObject
     with /* key */ StringDictionary[FactoryFunction[js.Any] | FactoryFunctionMap]
object FactoryFunctionMap {
  
  inline def apply(): FactoryFunctionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FactoryFunctionMap]
  }
}
