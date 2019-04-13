package typings
package markdownlintLib.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintOptions extends js.Object {
  var config: js.UndefOr[MarkdownlintConfig] = js.undefined
  var files: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var frontMatter: js.UndefOr[stdLib.RegExp] = js.undefined
  var noInlineConfig: js.UndefOr[scala.Boolean] = js.undefined
  var resultVersion: js.UndefOr[scala.Double] = js.undefined
  var strings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object MarkdownlintOptions {
  @scala.inline
  def apply(
    config: MarkdownlintConfig = null,
    files: js.Array[java.lang.String] | java.lang.String = null,
    frontMatter: stdLib.RegExp = null,
    noInlineConfig: js.UndefOr[scala.Boolean] = js.undefined,
    resultVersion: scala.Int | scala.Double = null,
    strings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): MarkdownlintOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (frontMatter != null) __obj.updateDynamic("frontMatter")(frontMatter)
    if (!js.isUndefined(noInlineConfig)) __obj.updateDynamic("noInlineConfig")(noInlineConfig)
    if (resultVersion != null) __obj.updateDynamic("resultVersion")(resultVersion.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings)
    __obj.asInstanceOf[MarkdownlintOptions]
  }
}

