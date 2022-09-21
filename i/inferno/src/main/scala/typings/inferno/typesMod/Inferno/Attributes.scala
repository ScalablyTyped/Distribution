package typings.inferno.typesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  @JSName("$ChildFlag")
  var $ChildFlag: js.UndefOr[Double] = js.undefined
  
  @JSName("$HasKeyedChildren")
  var $HasKeyedChildren: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$HasNonKeyedChildren")
  var $HasNonKeyedChildren: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$HasTextChildren")
  var $HasTextChildren: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$HasVNodeChildren")
  var $HasVNodeChildren: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def set$ChildFlag(value: Double): Self = StObject.set(x, "$ChildFlag", value.asInstanceOf[js.Any])
    
    inline def set$ChildFlagUndefined: Self = StObject.set(x, "$ChildFlag", js.undefined)
    
    inline def set$HasKeyedChildren(value: Boolean): Self = StObject.set(x, "$HasKeyedChildren", value.asInstanceOf[js.Any])
    
    inline def set$HasKeyedChildrenUndefined: Self = StObject.set(x, "$HasKeyedChildren", js.undefined)
    
    inline def set$HasNonKeyedChildren(value: Boolean): Self = StObject.set(x, "$HasNonKeyedChildren", value.asInstanceOf[js.Any])
    
    inline def set$HasNonKeyedChildrenUndefined: Self = StObject.set(x, "$HasNonKeyedChildren", js.undefined)
    
    inline def set$HasTextChildren(value: Boolean): Self = StObject.set(x, "$HasTextChildren", value.asInstanceOf[js.Any])
    
    inline def set$HasTextChildrenUndefined: Self = StObject.set(x, "$HasTextChildren", js.undefined)
    
    inline def set$HasVNodeChildren(value: Boolean): Self = StObject.set(x, "$HasVNodeChildren", value.asInstanceOf[js.Any])
    
    inline def set$HasVNodeChildrenUndefined: Self = StObject.set(x, "$HasVNodeChildren", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
