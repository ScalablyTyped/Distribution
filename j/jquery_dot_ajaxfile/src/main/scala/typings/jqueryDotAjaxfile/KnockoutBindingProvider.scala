package typings.jqueryDotAjaxfile

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingProvider extends js.Object {
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
  @scala.inline
  def apply(
    getBindings: (Node, KnockoutBindingContext) => js.Object,
    nodeHasBindings: Node => Boolean,
    getBindingAccessors: (/* node */ Node, /* bindingContext */ KnockoutBindingContext) => StringDictionary[String] = null
  ): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = js.Any.fromFunction2(getBindings), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    if (getBindingAccessors != null) __obj.updateDynamic("getBindingAccessors")(js.Any.fromFunction2(getBindingAccessors))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
}

