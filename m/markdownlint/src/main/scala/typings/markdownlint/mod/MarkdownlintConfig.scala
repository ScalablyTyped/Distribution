package typings.markdownlint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownlint.anon.Allowdifferentnesting
import typings.markdownlint.anon.Allowedelements
import typings.markdownlint.anon.Brspaces
import typings.markdownlint.anon.Codeblocks
import typings.markdownlint.anon.Frontmattertitle
import typings.markdownlint.anon.Headers
import typings.markdownlint.anon.Indent
import typings.markdownlint.anon.Level
import typings.markdownlint.anon.Linesabove
import typings.markdownlint.anon.Maximum
import typings.markdownlint.anon.Names
import typings.markdownlint.anon.Olmulti
import typings.markdownlint.anon.Punctuation
import typings.markdownlint.anon.Style
import typings.markdownlint.anon.StyleString
import typings.markdownlint.anon.`0`
import typings.markdownlint.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintConfig
  extends /* rule */ StringDictionary[js.UndefOr[String | Double | Boolean | StringDictionary[js.Any]]] {
  var `blanks-around-fences`: js.UndefOr[Boolean] = js.undefined
  var `blanks-around-headings`: js.UndefOr[Boolean | Linesabove] = js.undefined
  var `blanks-around-lists`: js.UndefOr[Boolean] = js.undefined
  var `blanks-around_headers`: js.UndefOr[Boolean | Linesabove] = js.undefined
  var `commands-show-output`: js.UndefOr[Boolean] = js.undefined
  /**
    * Default state for all rules.
    * @default true
    */
  var default: js.UndefOr[Boolean] = js.undefined
  var `fenced-code-language`: js.UndefOr[Boolean] = js.undefined
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-header-h1`: js.UndefOr[Boolean | Level] = js.undefined
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-heading-h1`: js.UndefOr[Boolean | Level] = js.undefined
  var `first-line-h1`: js.UndefOr[Frontmattertitle] = js.undefined
  var `first-line-heading`: js.UndefOr[Frontmattertitle] = js.undefined
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `header-increment`: js.UndefOr[Boolean] = js.undefined
  var `header-start-left`: js.UndefOr[Boolean] = js.undefined
  /**
    * Heading style.
    * @default "consistent"
    */
  var `header-style`: js.UndefOr[Style] = js.undefined
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `heading-increment`: js.UndefOr[Boolean] = js.undefined
  var `heading-start-left`: js.UndefOr[Boolean] = js.undefined
  /**
    * Heading style.
    * @default "consistent"
    */
  var `heading-style`: js.UndefOr[Style] = js.undefined
  var `hr-style`: js.UndefOr[StyleString] = js.undefined
  var `line-length`: js.UndefOr[Boolean | Headers] = js.undefined
  /**
    * Inconsistent indentation for list items at the same level
    */
  var `list-indent`: js.UndefOr[Boolean] = js.undefined
  var `list-marker-space`: js.UndefOr[Boolean | Olmulti] = js.undefined
  var `no-alt-text`: js.UndefOr[Boolean] = js.undefined
  var `no-bare-urls`: js.UndefOr[Boolean] = js.undefined
  var `no-blanks-blockquote`: js.UndefOr[Boolean] = js.undefined
  var `no-duplicate-header`: js.UndefOr[Boolean | Allowdifferentnesting] = js.undefined
  var `no-duplicate-heading`: js.UndefOr[Boolean | Allowdifferentnesting] = js.undefined
  var `no-emphasis-as-header`: js.UndefOr[Boolean | Punctuation] = js.undefined
  var `no-emphasis-as-heading`: js.UndefOr[Boolean | Punctuation] = js.undefined
  var `no-empty-links`: js.UndefOr[Boolean] = js.undefined
  var `no-hard-tabs`: js.UndefOr[Boolean | Codeblocks] = js.undefined
  var `no-inline-html`: js.UndefOr[Boolean | Allowedelements] = js.undefined
  var `no-missing-space-atx`: js.UndefOr[Boolean] = js.undefined
  var `no-missing-space-closed-atx`: js.UndefOr[Boolean] = js.undefined
  var `no-multiple-blanks`: js.UndefOr[Boolean | Maximum] = js.undefined
  var `no-multiple-space-atx`: js.UndefOr[Boolean] = js.undefined
  var `no-multiple-space-blockquote`: js.UndefOr[Boolean] = js.undefined
  var `no-multiple-space-closed-atx`: js.UndefOr[Boolean] = js.undefined
  var `no-reversed-links`: js.UndefOr[Boolean] = js.undefined
  var `no-space-in-code`: js.UndefOr[Boolean] = js.undefined
  var `no-space-in-emphasis`: js.UndefOr[Boolean] = js.undefined
  var `no-space-in-links`: js.UndefOr[Boolean] = js.undefined
  var `no-trailing-punctuation`: js.UndefOr[Boolean | Punctuation] = js.undefined
  var `no-trailing-spaces`: js.UndefOr[Boolean | Brspaces] = js.undefined
  var `ol-prefix`: js.UndefOr[Boolean | `1`] = js.undefined
  var `proper-names`: js.UndefOr[Names] = js.undefined
  var `required-headers`: js.UndefOr[js.Array[String]] = js.undefined
  var `required-headings`: js.UndefOr[js.Array[String]] = js.undefined
  var `single-h1`: js.UndefOr[Boolean | Frontmattertitle] = js.undefined
  var `single-title`: js.UndefOr[Boolean | Frontmattertitle] = js.undefined
  /**
    * This rule is triggered when list items are not indented by the configured number of spaces.
    * @default 2
    */
  var `ul-indent`: js.UndefOr[Boolean | Indent] = js.undefined
  /**
    * Consider starting bulleted lists at the beginning of the line.
    */
  var `ul-start-left`: js.UndefOr[Boolean] = js.undefined
  /**
    * This rule is triggered when the symbols used in the document for unordered list items do not match the configured unordered list style:
    *
    * ```md
    * * Item 1
    * + Item 2
    * - Item 3
    * ```
    *
    * @default "consistent"
    */
  var `ul-style`: js.UndefOr[`0`] = js.undefined
}

object MarkdownlintConfig {
  @scala.inline
  def apply(
    StringDictionary: /* rule */ StringDictionary[js.UndefOr[String | Double | Boolean | StringDictionary[js.Any]]] = null,
    `blanks-around-fences`: js.UndefOr[Boolean] = js.undefined,
    `blanks-around-headings`: Boolean | Linesabove = null,
    `blanks-around-lists`: js.UndefOr[Boolean] = js.undefined,
    `blanks-around_headers`: Boolean | Linesabove = null,
    `commands-show-output`: js.UndefOr[Boolean] = js.undefined,
    default: js.UndefOr[Boolean] = js.undefined,
    `fenced-code-language`: js.UndefOr[Boolean] = js.undefined,
    `first-header-h1`: Boolean | Level = null,
    `first-heading-h1`: Boolean | Level = null,
    `first-line-h1`: Frontmattertitle = null,
    `first-line-heading`: Frontmattertitle = null,
    `header-increment`: js.UndefOr[Boolean] = js.undefined,
    `header-start-left`: js.UndefOr[Boolean] = js.undefined,
    `header-style`: Style = null,
    `heading-increment`: js.UndefOr[Boolean] = js.undefined,
    `heading-start-left`: js.UndefOr[Boolean] = js.undefined,
    `heading-style`: Style = null,
    `hr-style`: StyleString = null,
    `line-length`: Boolean | Headers = null,
    `list-indent`: js.UndefOr[Boolean] = js.undefined,
    `list-marker-space`: Boolean | Olmulti = null,
    `no-alt-text`: js.UndefOr[Boolean] = js.undefined,
    `no-bare-urls`: js.UndefOr[Boolean] = js.undefined,
    `no-blanks-blockquote`: js.UndefOr[Boolean] = js.undefined,
    `no-duplicate-header`: Boolean | Allowdifferentnesting = null,
    `no-duplicate-heading`: Boolean | Allowdifferentnesting = null,
    `no-emphasis-as-header`: Boolean | Punctuation = null,
    `no-emphasis-as-heading`: Boolean | Punctuation = null,
    `no-empty-links`: js.UndefOr[Boolean] = js.undefined,
    `no-hard-tabs`: Boolean | Codeblocks = null,
    `no-inline-html`: Boolean | Allowedelements = null,
    `no-missing-space-atx`: js.UndefOr[Boolean] = js.undefined,
    `no-missing-space-closed-atx`: js.UndefOr[Boolean] = js.undefined,
    `no-multiple-blanks`: Boolean | Maximum = null,
    `no-multiple-space-atx`: js.UndefOr[Boolean] = js.undefined,
    `no-multiple-space-blockquote`: js.UndefOr[Boolean] = js.undefined,
    `no-multiple-space-closed-atx`: js.UndefOr[Boolean] = js.undefined,
    `no-reversed-links`: js.UndefOr[Boolean] = js.undefined,
    `no-space-in-code`: js.UndefOr[Boolean] = js.undefined,
    `no-space-in-emphasis`: js.UndefOr[Boolean] = js.undefined,
    `no-space-in-links`: js.UndefOr[Boolean] = js.undefined,
    `no-trailing-punctuation`: Boolean | Punctuation = null,
    `no-trailing-spaces`: Boolean | Brspaces = null,
    `ol-prefix`: Boolean | `1` = null,
    `proper-names`: Names = null,
    `required-headers`: js.Array[String] = null,
    `required-headings`: js.Array[String] = null,
    `single-h1`: Boolean | Frontmattertitle = null,
    `single-title`: Boolean | Frontmattertitle = null,
    `ul-indent`: Boolean | Indent = null,
    `ul-start-left`: js.UndefOr[Boolean] = js.undefined,
    `ul-style`: `0` = null
  ): MarkdownlintConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`blanks-around-fences`)) __obj.updateDynamic("blanks-around-fences")(`blanks-around-fences`.get.asInstanceOf[js.Any])
    if (`blanks-around-headings` != null) __obj.updateDynamic("blanks-around-headings")(`blanks-around-headings`.asInstanceOf[js.Any])
    if (!js.isUndefined(`blanks-around-lists`)) __obj.updateDynamic("blanks-around-lists")(`blanks-around-lists`.get.asInstanceOf[js.Any])
    if (`blanks-around_headers` != null) __obj.updateDynamic("blanks-around_headers")(`blanks-around_headers`.asInstanceOf[js.Any])
    if (!js.isUndefined(`commands-show-output`)) __obj.updateDynamic("commands-show-output")(`commands-show-output`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`fenced-code-language`)) __obj.updateDynamic("fenced-code-language")(`fenced-code-language`.get.asInstanceOf[js.Any])
    if (`first-header-h1` != null) __obj.updateDynamic("first-header-h1")(`first-header-h1`.asInstanceOf[js.Any])
    if (`first-heading-h1` != null) __obj.updateDynamic("first-heading-h1")(`first-heading-h1`.asInstanceOf[js.Any])
    if (`first-line-h1` != null) __obj.updateDynamic("first-line-h1")(`first-line-h1`.asInstanceOf[js.Any])
    if (`first-line-heading` != null) __obj.updateDynamic("first-line-heading")(`first-line-heading`.asInstanceOf[js.Any])
    if (!js.isUndefined(`header-increment`)) __obj.updateDynamic("header-increment")(`header-increment`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`header-start-left`)) __obj.updateDynamic("header-start-left")(`header-start-left`.get.asInstanceOf[js.Any])
    if (`header-style` != null) __obj.updateDynamic("header-style")(`header-style`.asInstanceOf[js.Any])
    if (!js.isUndefined(`heading-increment`)) __obj.updateDynamic("heading-increment")(`heading-increment`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`heading-start-left`)) __obj.updateDynamic("heading-start-left")(`heading-start-left`.get.asInstanceOf[js.Any])
    if (`heading-style` != null) __obj.updateDynamic("heading-style")(`heading-style`.asInstanceOf[js.Any])
    if (`hr-style` != null) __obj.updateDynamic("hr-style")(`hr-style`.asInstanceOf[js.Any])
    if (`line-length` != null) __obj.updateDynamic("line-length")(`line-length`.asInstanceOf[js.Any])
    if (!js.isUndefined(`list-indent`)) __obj.updateDynamic("list-indent")(`list-indent`.get.asInstanceOf[js.Any])
    if (`list-marker-space` != null) __obj.updateDynamic("list-marker-space")(`list-marker-space`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-alt-text`)) __obj.updateDynamic("no-alt-text")(`no-alt-text`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-bare-urls`)) __obj.updateDynamic("no-bare-urls")(`no-bare-urls`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-blanks-blockquote`)) __obj.updateDynamic("no-blanks-blockquote")(`no-blanks-blockquote`.get.asInstanceOf[js.Any])
    if (`no-duplicate-header` != null) __obj.updateDynamic("no-duplicate-header")(`no-duplicate-header`.asInstanceOf[js.Any])
    if (`no-duplicate-heading` != null) __obj.updateDynamic("no-duplicate-heading")(`no-duplicate-heading`.asInstanceOf[js.Any])
    if (`no-emphasis-as-header` != null) __obj.updateDynamic("no-emphasis-as-header")(`no-emphasis-as-header`.asInstanceOf[js.Any])
    if (`no-emphasis-as-heading` != null) __obj.updateDynamic("no-emphasis-as-heading")(`no-emphasis-as-heading`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-empty-links`)) __obj.updateDynamic("no-empty-links")(`no-empty-links`.get.asInstanceOf[js.Any])
    if (`no-hard-tabs` != null) __obj.updateDynamic("no-hard-tabs")(`no-hard-tabs`.asInstanceOf[js.Any])
    if (`no-inline-html` != null) __obj.updateDynamic("no-inline-html")(`no-inline-html`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-missing-space-atx`)) __obj.updateDynamic("no-missing-space-atx")(`no-missing-space-atx`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-missing-space-closed-atx`)) __obj.updateDynamic("no-missing-space-closed-atx")(`no-missing-space-closed-atx`.get.asInstanceOf[js.Any])
    if (`no-multiple-blanks` != null) __obj.updateDynamic("no-multiple-blanks")(`no-multiple-blanks`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-multiple-space-atx`)) __obj.updateDynamic("no-multiple-space-atx")(`no-multiple-space-atx`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-multiple-space-blockquote`)) __obj.updateDynamic("no-multiple-space-blockquote")(`no-multiple-space-blockquote`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-multiple-space-closed-atx`)) __obj.updateDynamic("no-multiple-space-closed-atx")(`no-multiple-space-closed-atx`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-reversed-links`)) __obj.updateDynamic("no-reversed-links")(`no-reversed-links`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-space-in-code`)) __obj.updateDynamic("no-space-in-code")(`no-space-in-code`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-space-in-emphasis`)) __obj.updateDynamic("no-space-in-emphasis")(`no-space-in-emphasis`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-space-in-links`)) __obj.updateDynamic("no-space-in-links")(`no-space-in-links`.get.asInstanceOf[js.Any])
    if (`no-trailing-punctuation` != null) __obj.updateDynamic("no-trailing-punctuation")(`no-trailing-punctuation`.asInstanceOf[js.Any])
    if (`no-trailing-spaces` != null) __obj.updateDynamic("no-trailing-spaces")(`no-trailing-spaces`.asInstanceOf[js.Any])
    if (`ol-prefix` != null) __obj.updateDynamic("ol-prefix")(`ol-prefix`.asInstanceOf[js.Any])
    if (`proper-names` != null) __obj.updateDynamic("proper-names")(`proper-names`.asInstanceOf[js.Any])
    if (`required-headers` != null) __obj.updateDynamic("required-headers")(`required-headers`.asInstanceOf[js.Any])
    if (`required-headings` != null) __obj.updateDynamic("required-headings")(`required-headings`.asInstanceOf[js.Any])
    if (`single-h1` != null) __obj.updateDynamic("single-h1")(`single-h1`.asInstanceOf[js.Any])
    if (`single-title` != null) __obj.updateDynamic("single-title")(`single-title`.asInstanceOf[js.Any])
    if (`ul-indent` != null) __obj.updateDynamic("ul-indent")(`ul-indent`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ul-start-left`)) __obj.updateDynamic("ul-start-left")(`ul-start-left`.get.asInstanceOf[js.Any])
    if (`ul-style` != null) __obj.updateDynamic("ul-style")(`ul-style`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownlintConfig]
  }
}

