package typings
package atJupyterlabInspectorLib.libInspectorMod.IInspectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a child item of an inspector.
  */
trait IInspectorItem extends js.Object {
  /**
    * The optional class name added to the inspector child widget.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The display name of the inspector child.
    */
  var name: java.lang.String
  /**
    * The rank order of display priority for inspector updates. A lower rank
    * denotes a higher display priority.
    */
  var rank: scala.Double
  /**
    * A flag that indicates whether the inspector remembers history.
    *
    * The default value is `false`.
    */
  var remembers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of the inspector.
    */
  var `type`: java.lang.String
}

object IInspectorItem {
  @scala.inline
  def apply(
    name: java.lang.String,
    rank: scala.Double,
    `type`: java.lang.String,
    className: java.lang.String = null,
    remembers: js.UndefOr[scala.Boolean] = js.undefined
  ): IInspectorItem = {
    val __obj = js.Dynamic.literal(name = name, rank = rank)
    __obj.updateDynamic("type")(`type`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(remembers)) __obj.updateDynamic("remembers")(remembers)
    __obj.asInstanceOf[IInspectorItem]
  }
}

