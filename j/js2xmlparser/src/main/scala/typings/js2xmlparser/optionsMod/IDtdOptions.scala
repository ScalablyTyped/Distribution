package typings.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDtdOptions extends js.Object {
  /**
    * Whether to include a DTD in the generated XML. By default, no DTD is
    * included.
    */
  var include: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the DTD. This value cannot be left undefined if `include`
    * is true.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The public identifier of the DTD, excluding quotation marks. If a public
    * identifier is provided, a system identifier must be provided as well.
    * By default, no public identifier is included.
    */
  var pubId: js.UndefOr[String] = js.undefined
  /**
    * The system identifier of the DTD, excluding quotation marks. By default,
    * no system identifier is included.
    */
  var sysId: js.UndefOr[String] = js.undefined
}

object IDtdOptions {
  @scala.inline
  def apply(
    include: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pubId: String = null,
    sysId: String = null
  ): IDtdOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pubId != null) __obj.updateDynamic("pubId")(pubId.asInstanceOf[js.Any])
    if (sysId != null) __obj.updateDynamic("sysId")(sysId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDtdOptions]
  }
}

