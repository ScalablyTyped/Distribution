package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingContext extends js.Object {
  @JSName("$component")
  var $component: js.Any = js.native
  @JSName("$componentTemplateNodes")
  var $componentTemplateNodes: js.Array[stdLib.Node] = js.native
  @JSName("$data")
  var $data: js.Any = js.native
  @JSName("$index")
  var $index: js.UndefOr[KnockoutObservable[scala.Double]] = js.native
  @JSName("$parent")
  var $parent: js.Any = js.native
  @JSName("$parentContext")
  var $parentContext: js.UndefOr[KnockoutBindingContext] = js.native
  @JSName("$parents")
  var $parents: js.Array[_] = js.native
  @JSName("$rawData")
  var $rawData: js.Any | KnockoutObservable[_] = js.native
  @JSName("$root")
  var $root: js.Any = js.native
  def createChildContext(dataItemOrAccessor: js.Any): js.Any = js.native
  def createChildContext(dataItemOrAccessor: js.Any, dataItemAlias: js.Any): js.Any = js.native
  def createChildContext(dataItemOrAccessor: js.Any, dataItemAlias: js.Any, extendCallback: js.Function): js.Any = js.native
  def extend(properties: js.Any): js.Any = js.native
}

