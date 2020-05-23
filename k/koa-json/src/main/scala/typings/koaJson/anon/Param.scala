package typings.koaJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Param extends js.Object {
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

object Param {
  @scala.inline
  def apply(
    param: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    spaces: js.UndefOr[Double] = js.undefined
  ): Param = {
    val __obj = js.Dynamic.literal()
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaces)) __obj.updateDynamic("spaces")(spaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

