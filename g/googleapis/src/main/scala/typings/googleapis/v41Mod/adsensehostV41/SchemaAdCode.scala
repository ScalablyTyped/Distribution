package typings.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdCode extends js.Object {
  /**
    * The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.native
  /**
    * Kind this is, in this case adsensehost#adCode.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdCode {
  @scala.inline
  def apply(adCode: String = null, kind: String = null): SchemaAdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdCode]
  }
}

