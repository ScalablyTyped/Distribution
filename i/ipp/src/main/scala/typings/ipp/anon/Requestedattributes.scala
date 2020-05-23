package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requestedattributes extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `job-id`: js.UndefOr[Double] = js.undefined
  var `job-uri`: js.UndefOr[String] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.undefined
}

object Requestedattributes {
  @scala.inline
  def apply(
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    `job-id`: js.UndefOr[Double] = js.undefined,
    `job-uri`: String = null,
    `printer-uri`: String = null,
    `requested-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ] = null
  ): Requestedattributes = {
    val __obj = js.Dynamic.literal()
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-id`)) __obj.updateDynamic("job-id")(`job-id`.get.asInstanceOf[js.Any])
    if (`job-uri` != null) __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    if (`requested-attributes` != null) __obj.updateDynamic("requested-attributes")(`requested-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requestedattributes]
  }
}

