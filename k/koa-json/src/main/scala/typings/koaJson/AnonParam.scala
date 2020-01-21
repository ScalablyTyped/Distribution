package typings.koaJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParam extends js.Object {
  /**
    * optional query-string param for pretty responses [none]
    */
  var param: js.UndefOr[String] = js.undefined
  /**
    * default to pretty response [true]
    */
  var pretty: js.UndefOr[Boolean] = js.undefined
  /**
    * JSON spaces [2]
    */
  var spaces: js.UndefOr[Double] = js.undefined
}

object AnonParam {
  @scala.inline
  def apply(param: String = null, pretty: js.UndefOr[Boolean] = js.undefined, spaces: Int | Double = null): AnonParam = {
    val __obj = js.Dynamic.literal()
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParam]
  }
}

