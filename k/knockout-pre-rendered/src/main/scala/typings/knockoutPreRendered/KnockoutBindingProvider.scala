package typings.knockoutPreRendered

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutBindingProvider extends js.Object {
  
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* bindingContext */ KnockoutBindingContext, 
      StringDictionary[String]
    ]
  ] = js.native
  
  def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object = js.native
  
  def nodeHasBindings(node: Node): Boolean = js.native
}
object KnockoutBindingProvider {
  
  @scala.inline
  def apply(getBindings: (Node, KnockoutBindingContext) => js.Object, nodeHasBindings: Node => Boolean): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = js.Any.fromFunction2(getBindings), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
  
  @scala.inline
  implicit class KnockoutBindingProviderOps[Self <: KnockoutBindingProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBindings(value: (Node, KnockoutBindingContext) => js.Object): Self = this.set("getBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNodeHasBindings(value: Node => Boolean): Self = this.set("nodeHasBindings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBindingAccessors(value: (/* node */ Node, /* bindingContext */ KnockoutBindingContext) => StringDictionary[String]): Self = this.set("getBindingAccessors", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetBindingAccessors: Self = this.set("getBindingAccessors", js.undefined)
  }
}
