package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfernoElement[P] extends StObject {
  
  var key: Key | Null
  
  var props: P
  
  var `type`: String | ComponentClass[P] | SFC[P]
}
object InfernoElement {
  
  inline def apply[P](props: P, `type`: String | ComponentClass[P] | SFC[P]): InfernoElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfernoElement[P]]
  }
  
  extension [Self <: InfernoElement[?], P](x: Self & InfernoElement[P]) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setType(value: String | ComponentClass[P] | SFC[P]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
