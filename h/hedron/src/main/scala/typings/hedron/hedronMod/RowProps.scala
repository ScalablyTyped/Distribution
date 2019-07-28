package typings.hedron.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  /**
    * Sets the value of the CSS align-content property
    */
  var alignContent: js.UndefOr[String] = js.undefined
  /**
    * Sets the value of the CSS align-items property
    */
  var alignItems: js.UndefOr[String] = js.undefined
  /**
    * Sets the value of the CSS align-self property
    */
  var alignSelf: js.UndefOr[String] = js.undefined
  /**
    * Draws all child columns with "bounding boxes" for easy
    * visualization of the grid.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of horizontal columns this row creates.
    * @default 12
    */
  var divisions: js.UndefOr[Double] = js.undefined
  /**
    * Sets the value of the CSS justify-content property
    */
  var justifyContent: js.UndefOr[String] = js.undefined
  /**
    * Sets the value of the CSS order property
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * You can specify component to use specific tag
    * @default 'section'
    */
  var tagName: js.UndefOr[String] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    alignSelf: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    divisions: Int | Double = null,
    justifyContent: String = null,
    order: String = null,
    tagName: String = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent)
    if (order != null) __obj.updateDynamic("order")(order)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[RowProps]
  }
}

