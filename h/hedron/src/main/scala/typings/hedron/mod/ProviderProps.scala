package typings.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  /**
    * Object specifying the breakpoints
    */
  var breakpoints: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of padding added
    */
  var padding: js.UndefOr[String] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    breakpoints: StringDictionary[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    padding: String = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}

