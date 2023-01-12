package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextEntry extends StObject {
  
  /** the input data */
  val actual: js.UndefOr[Any] = js.undefined
  
  val key: String
  
  val `type`: Decoder[Any, Any]
}
object ContextEntry {
  
  inline def apply(key: String, `type`: Decoder[Any, Any]): ContextEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextEntry] (val x: Self) extends AnyVal {
    
    inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: Decoder[Any, Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
