package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingProvider extends js.Object {
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ stdLib.Node, 
      /* bindingContext */ KnockoutBindingContext, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String]
    ]
  ] = js.undefined
  def getBindings(node: stdLib.Node, bindingContext: KnockoutBindingContext): js.Object
  def nodeHasBindings(node: stdLib.Node): scala.Boolean
}

object KnockoutBindingProvider {
  @scala.inline
  def apply(
    getBindings: (stdLib.Node, KnockoutBindingContext) => js.Object,
    nodeHasBindings: stdLib.Node => scala.Boolean,
    getBindingAccessors: (/* node */ stdLib.Node, /* bindingContext */ KnockoutBindingContext) => org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = js.Any.fromFunction2(getBindings), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    if (getBindingAccessors != null) __obj.updateDynamic("getBindingAccessors")(js.Any.fromFunction2(getBindingAccessors))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
}

