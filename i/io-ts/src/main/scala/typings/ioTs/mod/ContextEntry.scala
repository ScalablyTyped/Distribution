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
  
  @scala.inline
  def apply(key: String, `type`: Decoder[js.Any, js.Any]): ContextEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEntry]
  }
  
  @scala.inline
  implicit class ContextEntryMutableBuilder[Self <: ContextEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Decoder[js.Any, js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
