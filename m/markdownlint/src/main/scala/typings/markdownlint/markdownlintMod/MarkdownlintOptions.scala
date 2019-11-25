package typings.markdownlint.markdownlintMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintOptions extends js.Object {
  var config: js.UndefOr[MarkdownlintConfig] = js.undefined
  var files: js.UndefOr[js.Array[String] | String] = js.undefined
  var frontMatter: js.UndefOr[RegExp] = js.undefined
  var noInlineConfig: js.UndefOr[Boolean] = js.undefined
  var resultVersion: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[StringDictionary[String]] = js.undefined
}

object MarkdownlintOptions {
  @scala.inline
  def apply(
    config: MarkdownlintConfig = null,
    files: js.Array[String] | String = null,
    frontMatter: RegExp = null,
    noInlineConfig: js.UndefOr[Boolean] = js.undefined,
    resultVersion: Int | Double = null,
    strings: StringDictionary[String] = null
  ): MarkdownlintOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (frontMatter != null) __obj.updateDynamic("frontMatter")(frontMatter.asInstanceOf[js.Any])
    if (!js.isUndefined(noInlineConfig)) __obj.updateDynamic("noInlineConfig")(noInlineConfig.asInstanceOf[js.Any])
    if (resultVersion != null) __obj.updateDynamic("resultVersion")(resultVersion.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownlintOptions]
  }
}

