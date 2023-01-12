package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata[TValue] extends StObject {
  
  var key: String | Double | js.Symbol
  
  var value: TValue
}
object Metadata {
  
  inline def apply[TValue](key: String | Double | js.Symbol, value: TValue): Metadata[TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata[?], TValue] (val x: Self & Metadata[TValue]) extends AnyVal {
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
