package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.line
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var additionalName: js.UndefOr[String] = js.undefined
  var adminCode: js.UndefOr[String] = js.undefined
  var express: js.UndefOr[Boolean] = js.undefined
  var fahrtNr: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var metro: js.UndefOr[Boolean] = js.undefined
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  var name: js.UndefOr[String] = js.undefined
  var night: js.UndefOr[Boolean] = js.undefined
  var nr: js.UndefOr[Double] = js.undefined
  var operator: js.UndefOr[Operator] = js.undefined
  var product: js.UndefOr[String] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  /** routes ids */
  var routes: js.UndefOr[js.Array[String]] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var `type`: line
}

object Line {
  @scala.inline
  def apply(
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    `type`: line,
    additionalName: String = null,
    adminCode: String = null,
    express: js.UndefOr[Boolean] = js.undefined,
    fahrtNr: String = null,
    id: String = null,
    metro: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    night: js.UndefOr[Boolean] = js.undefined,
    nr: js.UndefOr[Double] = js.undefined,
    operator: Operator = null,
    product: String = null,
    public: js.UndefOr[Boolean] = js.undefined,
    routes: js.Array[String] = null,
    symbol: String = null
  ): Line = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (additionalName != null) __obj.updateDynamic("additionalName")(additionalName.asInstanceOf[js.Any])
    if (adminCode != null) __obj.updateDynamic("adminCode")(adminCode.asInstanceOf[js.Any])
    if (!js.isUndefined(express)) __obj.updateDynamic("express")(express.get.asInstanceOf[js.Any])
    if (fahrtNr != null) __obj.updateDynamic("fahrtNr")(fahrtNr.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(metro)) __obj.updateDynamic("metro")(metro.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(night)) __obj.updateDynamic("night")(night.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nr)) __obj.updateDynamic("nr")(nr.get.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

