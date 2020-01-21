package typings.kss.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KssOptions extends Options {
  var builder: js.UndefOr[js.Any] = js.undefined
  @JSName("clone")
  var clone_FKssOptions: js.UndefOr[Boolean] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var logErrorFunction: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.undefined
  var source: js.Array[String]
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object KssOptions {
  @scala.inline
  def apply(
    source: js.Array[String],
    builder: js.Any = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    custom: js.Any = null,
    header: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    logErrorFunction: /* repeated */ String => Unit = null,
    markdown: js.UndefOr[Boolean] = js.undefined,
    mask: String | RegExp = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): KssOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (builder != null) __obj.updateDynamic("builder")(builder.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (logErrorFunction != null) __obj.updateDynamic("logErrorFunction")(js.Any.fromFunction1(logErrorFunction))
    if (!js.isUndefined(markdown)) __obj.updateDynamic("markdown")(markdown.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[KssOptions]
  }
}

