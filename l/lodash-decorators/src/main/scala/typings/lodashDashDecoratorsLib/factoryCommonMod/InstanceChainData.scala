package typings
package lodashDashDecoratorsLib.factoryCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceChainData extends js.Object {
  var fns: js.Array[js.Function]
  var isGetter: scala.Boolean
  var isMethod: scala.Boolean
  var isProperty: scala.Boolean
  var isSetter: scala.Boolean
  var properties: js.Array[java.lang.String]
}

object InstanceChainData {
  @scala.inline
  def apply(
    fns: js.Array[js.Function],
    isGetter: scala.Boolean,
    isMethod: scala.Boolean,
    isProperty: scala.Boolean,
    isSetter: scala.Boolean,
    properties: js.Array[java.lang.String]
  ): InstanceChainData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fns")(fns)
    __obj.updateDynamic("isGetter")(isGetter)
    __obj.updateDynamic("isMethod")(isMethod)
    __obj.updateDynamic("isProperty")(isProperty)
    __obj.updateDynamic("isSetter")(isSetter)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[InstanceChainData]
  }
}

