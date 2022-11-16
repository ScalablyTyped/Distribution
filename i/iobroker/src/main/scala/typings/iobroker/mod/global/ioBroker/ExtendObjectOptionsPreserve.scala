package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ExtendObjectOptionsPreserve = {[prop: string] : iobroker.iobroker.<global>.ioBroker.ExtendObjectOptionsPreserve | boolean | std.Array<string>}
}}}
to avoid circular code involving: 
- iobroker.iobroker.<global>.ioBroker.ExtendObjectOptionsPreserve
*/
trait ExtendObjectOptionsPreserve
  extends StObject
     with /* prop */ StringDictionary[ExtendObjectOptionsPreserve | Boolean | js.Array[String]]
object ExtendObjectOptionsPreserve {
  
  inline def apply(): ExtendObjectOptionsPreserve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendObjectOptionsPreserve]
  }
}
