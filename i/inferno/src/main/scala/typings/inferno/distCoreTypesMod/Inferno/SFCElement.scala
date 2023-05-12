package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.anon.Children
import typings.inferno.distCoreTypesMod.Refs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCElement[P]
  extends StObject
     with InfernoElement[P] {
  
  @JSName("type")
  def type_MSFCElement(props: Children & P & Refs[P]): InfernoElement[Any] | Null
  @JSName("type")
  def type_MSFCElement(props: Children & P & Refs[P], context: Any): InfernoElement[Any] | Null
  @JSName("type")
  var type_Original: SFC[P]
}
object SFCElement {
  
  inline def apply[P](props: P, `type`: SFC[P]): SFCElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCElement[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCElement[?], P] (val x: Self & SFCElement[P]) extends AnyVal {
    
    inline def setType(value: SFC[P]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
