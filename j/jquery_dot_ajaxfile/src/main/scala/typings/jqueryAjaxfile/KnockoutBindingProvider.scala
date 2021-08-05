package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingProvider extends StObject {
  
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* bindingContext */ KnockoutBindingContext, 
      StringDictionary[String]
    ]
  ] = js.undefined
  
  def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object
  
  def nodeHasBindings(node: Node): Boolean
}
object KnockoutBindingProvider {
  
  inline def apply(getBindings: (Node, KnockoutBindingContext) => js.Object, nodeHasBindings: Node => Boolean): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = js.Any.fromFunction2(getBindings), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
  
  extension [Self <: KnockoutBindingProvider](x: Self) {
    
    inline def setGetBindingAccessors(value: (/* node */ Node, /* bindingContext */ KnockoutBindingContext) => StringDictionary[String]): Self = StObject.set(x, "getBindingAccessors", js.Any.fromFunction2(value))
    
    inline def setGetBindingAccessorsUndefined: Self = StObject.set(x, "getBindingAccessors", js.undefined)
    
    inline def setGetBindings(value: (Node, KnockoutBindingContext) => js.Object): Self = StObject.set(x, "getBindings", js.Any.fromFunction2(value))
    
    inline def setNodeHasBindings(value: Node => Boolean): Self = StObject.set(x, "nodeHasBindings", js.Any.fromFunction1(value))
  }
}
