package typings.inferno.distCoreTypesMod

import typings.inferno.distCoreTypesMod.Inferno.InfernoNode
import typings.infernoVnodeFlags.mod.ChildFlags
import typings.infernoVnodeFlags.mod.VNodeFlags
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNode extends StObject {
  
  var childFlags: ChildFlags
  
  var children: InfernoNode
  
  var className: js.UndefOr[String | Null] = js.undefined
  
  var dom: Element | Null
  
  var flags: VNodeFlags
  
  var isValidated: js.UndefOr[Boolean] = js.undefined
  
  var key: Null | Double | String
  
  var props: Any
  
  var ref: Any
  
  var `type`: Any
}
object VNode {
  
  inline def apply(childFlags: ChildFlags, flags: VNodeFlags, props: Any, ref: Any, `type`: Any): VNode = {
    val __obj = js.Dynamic.literal(childFlags = childFlags.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], dom = null, key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  
  extension [Self <: VNode](x: Self) {
    
    inline def setChildFlags(value: ChildFlags): Self = StObject.set(x, "childFlags", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDom(value: Element): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomNull: Self = StObject.set(x, "dom", null)
    
    inline def setFlags(value: VNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIsValidated(value: Boolean): Self = StObject.set(x, "isValidated", value.asInstanceOf[js.Any])
    
    inline def setIsValidatedUndefined: Self = StObject.set(x, "isValidated", js.undefined)
    
    inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
