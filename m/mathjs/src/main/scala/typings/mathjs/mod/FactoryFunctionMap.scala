package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// FactoryFunctionMap can be nested; all nested objects will be flattened
@js.native
trait FactoryFunctionMap extends /* key */ StringDictionary[FactoryFunction[_] | FactoryFunctionMap]
object FactoryFunctionMap {
  
  @scala.inline
  def apply(): FactoryFunctionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FactoryFunctionMap]
  }
}
