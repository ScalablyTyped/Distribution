package typings.hlsDashParser

import typings.hlsDashParser.hlsDashParserMod.types.Key
import typings.hlsDashParser.hlsDashParserMod.types.SessionData
import typings.hlsDashParser.hlsDashParserMod.types.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentVariant extends js.Object {
  var currentVariant: js.UndefOr[Double] = js.undefined
  var sessionDataList: js.UndefOr[js.Array[SessionData]] = js.undefined
  var sessionKeyList: js.UndefOr[js.Array[Key]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
}

object Anon_CurrentVariant {
  @scala.inline
  def apply(
    currentVariant: Int | Double = null,
    sessionDataList: js.Array[SessionData] = null,
    sessionKeyList: js.Array[Key] = null,
    source: String = null,
    variants: js.Array[Variant] = null
  ): Anon_CurrentVariant = {
    val __obj = js.Dynamic.literal()
    if (currentVariant != null) __obj.updateDynamic("currentVariant")(currentVariant.asInstanceOf[js.Any])
    if (sessionDataList != null) __obj.updateDynamic("sessionDataList")(sessionDataList.asInstanceOf[js.Any])
    if (sessionKeyList != null) __obj.updateDynamic("sessionKeyList")(sessionKeyList.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentVariant]
  }
}

