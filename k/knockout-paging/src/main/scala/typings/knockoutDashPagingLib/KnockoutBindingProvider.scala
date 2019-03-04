package typings
package knockoutDashPagingLib

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
    getBindings: js.Function2[stdLib.Node, KnockoutBindingContext, js.Object],
    nodeHasBindings: js.Function1[stdLib.Node, scala.Boolean],
    getBindingAccessors: js.Function2[
      /* node */ stdLib.Node, 
      /* bindingContext */ KnockoutBindingContext, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String]
    ] = null
  ): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = getBindings, nodeHasBindings = nodeHasBindings)
    if (getBindingAccessors != null) __obj.updateDynamic("getBindingAccessors")(getBindingAccessors)
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
}

