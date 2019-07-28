package typings.koaDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Param extends js.Object {
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

object Anon_Param {
  @scala.inline
  def apply(param: String = null, pretty: js.UndefOr[Boolean] = js.undefined, spaces: Int | Double = null): Anon_Param = {
    val __obj = js.Dynamic.literal()
    if (param != null) __obj.updateDynamic("param")(param)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Param]
  }
}

