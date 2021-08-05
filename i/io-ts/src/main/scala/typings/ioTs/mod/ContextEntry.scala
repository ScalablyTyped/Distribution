package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextEntry extends StObject {
  
  /** the input data */
  val actual: js.UndefOr[js.Any] = js.undefined
  
  val key: String
  
  val `type`: Decoder[js.Any, js.Any]
}
object ContextEntry {
  
  inline def apply(key: String, `type`: Decoder[js.Any, js.Any]): ContextEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEntry]
  }
  
  extension [Self <: ContextEntry](x: Self) {
    
    inline def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: Decoder[js.Any, js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
