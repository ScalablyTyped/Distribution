package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.JobHoldUntil
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jobholduntil extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.undefined
  var `job-id`: js.UndefOr[Double] = js.undefined
  var `job-uri`: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requesting-user-name`: String
}

object Jobholduntil {
  @scala.inline
  def apply(
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    `job-hold-until`: JobHoldUntil = null,
    `job-id`: js.UndefOr[Double] = js.undefined,
    `job-uri`: String = null,
    message: String = null,
    `printer-uri`: String = null
  ): Jobholduntil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`job-hold-until` != null) __obj.updateDynamic("job-hold-until")(`job-hold-until`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-id`)) __obj.updateDynamic("job-id")(`job-id`.get.asInstanceOf[js.Any])
    if (`job-uri` != null) __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobholduntil]
  }
}

