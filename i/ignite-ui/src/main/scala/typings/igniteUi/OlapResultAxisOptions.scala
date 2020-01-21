package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultAxisOptions
  extends /**
	 * Option for OlapResultAxisOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" the count of the $.ig.OlapResultAxisMember objects of each tuple.
  	 */
  var tupleSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Optional="false" array of $.ig.OlapResultTuple objects which form the axis.
  	 */
  var tuples: js.UndefOr[js.Array[_]] = js.undefined
}

object OlapResultAxisOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapResultAxisOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    tupleSize: Int | Double = null,
    tuples: js.Array[_] = null
  ): OlapResultAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tupleSize != null) __obj.updateDynamic("tupleSize")(tupleSize.asInstanceOf[js.Any])
    if (tuples != null) __obj.updateDynamic("tuples")(tuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapResultAxisOptions]
  }
}

