package typings.magicString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<magic-string.magic-string.SourceMapOptions> */
trait PartialSourceMapOptions extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var hires: js.UndefOr[Boolean] = js.undefined
  var includeContent: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object PartialSourceMapOptions {
  @scala.inline
  def apply(
    file: String = null,
    hires: js.UndefOr[Boolean] = js.undefined,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): PartialSourceMapOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(hires)) __obj.updateDynamic("hires")(hires.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSourceMapOptions]
  }
}

