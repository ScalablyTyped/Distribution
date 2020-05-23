package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.WhichJobs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var `my-jobs`: js.UndefOr[Boolean] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.undefined
  var `requesting-user-name`: String
  var `which-jobs`: js.UndefOr[WhichJobs] = js.undefined
}

object Limit {
  @scala.inline
  def apply(
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    `my-jobs`: js.UndefOr[Boolean] = js.undefined,
    `printer-uri`: String = null,
    `requested-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ] = null,
    `which-jobs`: WhichJobs = null
  ): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`my-jobs`)) __obj.updateDynamic("my-jobs")(`my-jobs`.get.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    if (`requested-attributes` != null) __obj.updateDynamic("requested-attributes")(`requested-attributes`.asInstanceOf[js.Any])
    if (`which-jobs` != null) __obj.updateDynamic("which-jobs")(`which-jobs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

