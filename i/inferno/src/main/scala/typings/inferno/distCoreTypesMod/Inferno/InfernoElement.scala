package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfernoElement[P] extends StObject {
  
  var key: js.UndefOr[Key] = js.undefined
  
  var props: P
  
  var `type`: String | ComponentClass[P] | SFC[P]
}
object InfernoElement {
  
  inline def apply[P](props: P, `type`: String | ComponentClass[P] | SFC[P]): InfernoElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfernoElement[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfernoElement[?], P] (val x: Self & InfernoElement[P]) extends AnyVal {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setType(value: String | ComponentClass[P] | SFC[P]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
