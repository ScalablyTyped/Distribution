package typings.hippyReact.mod

import typings.hippyReact.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMeta extends StObject {
  
  var component: Name
  
  var skipAddToDom: js.UndefOr[Boolean] = js.undefined
}
object NodeMeta {
  
  inline def apply(component: Name): NodeMeta = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMeta]
  }
  
  extension [Self <: NodeMeta](x: Self) {
    
    inline def setComponent(value: Name): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setSkipAddToDom(value: Boolean): Self = StObject.set(x, "skipAddToDom", value.asInstanceOf[js.Any])
    
    inline def setSkipAddToDomUndefined: Self = StObject.set(x, "skipAddToDom", js.undefined)
  }
}
