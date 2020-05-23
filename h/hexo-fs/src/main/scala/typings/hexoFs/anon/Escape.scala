package typings.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Escape extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[Boolean] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object Escape {
  @scala.inline
  def apply(encoding: String = null, escape: js.UndefOr[Boolean] = js.undefined, flag: String = null): Escape = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape.get.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escape]
  }
}

