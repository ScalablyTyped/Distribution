package typings.highcharts.accessibilityMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the keyboard navigation handler.
  */
trait KeyboardNavigationHandlerOptionsObject extends js.Object {
  /**
    * Function to run on initialization of module.
    */
  var init: js.Function
  /**
    * An array containing pairs of an array of keycodes, mapped to a
    * handler function. When the keycode is received, the handler is called
    * with the keycode as parameter.
    */
  var keyCodeMap: js.Array[js.Tuple2[js.Array[Double], js.Function]]
  /**
    * Function to run before moving to next/prev module. Receives moving
    * direction as parameter: +1 for next, -1 for previous.
    */
  var terminate: js.UndefOr[js.Function] = js.undefined
  /**
    * Function to run to validate module. Should return false if module
    * should not run, true otherwise. Receives chart as parameter.
    */
  var validate: js.UndefOr[js.Function] = js.undefined
}

object KeyboardNavigationHandlerOptionsObject {
  @scala.inline
  def apply(
    init: js.Function,
    keyCodeMap: js.Array[js.Tuple2[js.Array[Double], js.Function]],
    terminate: js.Function = null,
    validate: js.Function = null
  ): KeyboardNavigationHandlerOptionsObject = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], keyCodeMap = keyCodeMap.asInstanceOf[js.Any])
    if (terminate != null) __obj.updateDynamic("terminate")(terminate.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigationHandlerOptionsObject]
  }
}

