package typings
package markdownlintLib.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintConfig
  extends /* rule */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        java.lang.String | scala.Double | scala.Boolean | org.scalablytyped.runtime.StringDictionary[js.Any]
      ]
    ] {
  var `blanks-around-fences`: js.UndefOr[scala.Boolean] = js.undefined
  var `blanks-around-headings`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Linesabove] = js.undefined
  var `blanks-around-lists`: js.UndefOr[scala.Boolean] = js.undefined
  var `blanks-around_headers`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Linesabove] = js.undefined
  var `commands-show-output`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default state for all rules.
    * @default true
    */
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var `fenced-code-language`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-header-h1`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Level] = js.undefined
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-heading-h1`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Level] = js.undefined
  var `first-line-h1`: js.UndefOr[markdownlintLib.Anon_Frontmattertitle] = js.undefined
  var `first-line-heading`: js.UndefOr[markdownlintLib.Anon_Frontmattertitle] = js.undefined
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `header-increment`: js.UndefOr[scala.Boolean] = js.undefined
  var `header-start-left`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Heading style.
    * @default "consistent"
    */
  var `header-style`: js.UndefOr[markdownlintLib.Anon_Atx] = js.undefined
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `heading-increment`: js.UndefOr[scala.Boolean] = js.undefined
  var `heading-start-left`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Heading style.
    * @default "consistent"
    */
  var `heading-style`: js.UndefOr[markdownlintLib.Anon_Atx] = js.undefined
  var `hr-style`: js.UndefOr[markdownlintLib.Anon_Style] = js.undefined
  var `line-length`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_CodeblocksHeaders] = js.undefined
  /**
    * Inconsistent indentation for list items at the same level
    */
  var `list-indent`: js.UndefOr[scala.Boolean] = js.undefined
  var `list-marker-space`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Olmulti] = js.undefined
  var `no-alt-text`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-bare-urls`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-blanks-blockquote`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-duplicate-header`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Allowdifferentnesting] = js.undefined
  var `no-duplicate-heading`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Allowdifferentnesting] = js.undefined
  var `no-emphasis-as-header`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Punctuation] = js.undefined
  var `no-emphasis-as-heading`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Punctuation] = js.undefined
  var `no-empty-links`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-hard-tabs`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Codeblocks] = js.undefined
  var `no-inline-html`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Allowedelements] = js.undefined
  var `no-missing-space-atx`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-missing-space-closed-atx`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-multiple-blanks`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Maximum] = js.undefined
  var `no-multiple-space-atx`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-multiple-space-blockquote`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-multiple-space-closed-atx`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-reversed-links`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-space-in-code`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-space-in-emphasis`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-space-in-links`: js.UndefOr[scala.Boolean] = js.undefined
  var `no-trailing-punctuation`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Punctuation] = js.undefined
  var `no-trailing-spaces`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Brspaces] = js.undefined
  var `ol-prefix`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_One] = js.undefined
  var `proper-names`: js.UndefOr[markdownlintLib.Anon_CodeblocksNames] = js.undefined
  var `required-headers`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `required-headings`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `single-h1`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Frontmattertitle] = js.undefined
  var `single-title`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Frontmattertitle] = js.undefined
  /**
    * This rule is triggered when list items are not indented by the configured number of spaces.
    * @default 2
    */
  var `ul-indent`: js.UndefOr[scala.Boolean | markdownlintLib.Anon_Indent] = js.undefined
  /**
    * Consider starting bulleted lists at the beginning of the line.
    */
  var `ul-start-left`: js.UndefOr[scala.Boolean] = js.undefined
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
  var `ul-style`: js.UndefOr[markdownlintLib.Anon_Asterisk] = js.undefined
}

object MarkdownlintConfig {
  @scala.inline
  def apply(
    StringDictionary: /* rule */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        java.lang.String | scala.Double | scala.Boolean | org.scalablytyped.runtime.StringDictionary[js.Any]
      ]
    ] = null,
    `blanks-around-fences`: js.UndefOr[scala.Boolean] = js.undefined,
    `blanks-around-headings`: scala.Boolean | markdownlintLib.Anon_Linesabove = null,
    `blanks-around-lists`: js.UndefOr[scala.Boolean] = js.undefined,
    `blanks-around_headers`: scala.Boolean | markdownlintLib.Anon_Linesabove = null,
    `commands-show-output`: js.UndefOr[scala.Boolean] = js.undefined,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    `fenced-code-language`: js.UndefOr[scala.Boolean] = js.undefined,
    `first-header-h1`: scala.Boolean | markdownlintLib.Anon_Level = null,
    `first-heading-h1`: scala.Boolean | markdownlintLib.Anon_Level = null,
    `first-line-h1`: markdownlintLib.Anon_Frontmattertitle = null,
    `first-line-heading`: markdownlintLib.Anon_Frontmattertitle = null,
    `header-increment`: js.UndefOr[scala.Boolean] = js.undefined,
    `header-start-left`: js.UndefOr[scala.Boolean] = js.undefined,
    `header-style`: markdownlintLib.Anon_Atx = null,
    `heading-increment`: js.UndefOr[scala.Boolean] = js.undefined,
    `heading-start-left`: js.UndefOr[scala.Boolean] = js.undefined,
    `heading-style`: markdownlintLib.Anon_Atx = null,
    `hr-style`: markdownlintLib.Anon_Style = null,
    `line-length`: scala.Boolean | markdownlintLib.Anon_CodeblocksHeaders = null,
    `list-indent`: js.UndefOr[scala.Boolean] = js.undefined,
    `list-marker-space`: scala.Boolean | markdownlintLib.Anon_Olmulti = null,
    `no-alt-text`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-bare-urls`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-blanks-blockquote`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-duplicate-header`: scala.Boolean | markdownlintLib.Anon_Allowdifferentnesting = null,
    `no-duplicate-heading`: scala.Boolean | markdownlintLib.Anon_Allowdifferentnesting = null,
    `no-emphasis-as-header`: scala.Boolean | markdownlintLib.Anon_Punctuation = null,
    `no-emphasis-as-heading`: scala.Boolean | markdownlintLib.Anon_Punctuation = null,
    `no-empty-links`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-hard-tabs`: scala.Boolean | markdownlintLib.Anon_Codeblocks = null,
    `no-inline-html`: scala.Boolean | markdownlintLib.Anon_Allowedelements = null,
    `no-missing-space-atx`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-missing-space-closed-atx`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-multiple-blanks`: scala.Boolean | markdownlintLib.Anon_Maximum = null,
    `no-multiple-space-atx`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-multiple-space-blockquote`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-multiple-space-closed-atx`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-reversed-links`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-space-in-code`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-space-in-emphasis`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-space-in-links`: js.UndefOr[scala.Boolean] = js.undefined,
    `no-trailing-punctuation`: scala.Boolean | markdownlintLib.Anon_Punctuation = null,
    `no-trailing-spaces`: scala.Boolean | markdownlintLib.Anon_Brspaces = null,
    `ol-prefix`: scala.Boolean | markdownlintLib.Anon_One = null,
    `proper-names`: markdownlintLib.Anon_CodeblocksNames = null,
    `required-headers`: js.Array[java.lang.String] = null,
    `required-headings`: js.Array[java.lang.String] = null,
    `single-h1`: scala.Boolean | markdownlintLib.Anon_Frontmattertitle = null,
    `single-title`: scala.Boolean | markdownlintLib.Anon_Frontmattertitle = null,
    `ul-indent`: scala.Boolean | markdownlintLib.Anon_Indent = null,
    `ul-start-left`: js.UndefOr[scala.Boolean] = js.undefined,
    `ul-style`: markdownlintLib.Anon_Asterisk = null
  ): MarkdownlintConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`blanks-around-fences`)) __obj.updateDynamic("blanks-around-fences")(`blanks-around-fences`)
    if (`blanks-around-headings` != null) __obj.updateDynamic("blanks-around-headings")(`blanks-around-headings`.asInstanceOf[js.Any])
    if (!js.isUndefined(`blanks-around-lists`)) __obj.updateDynamic("blanks-around-lists")(`blanks-around-lists`)
    if (`blanks-around_headers` != null) __obj.updateDynamic("blanks-around_headers")(`blanks-around_headers`.asInstanceOf[js.Any])
    if (!js.isUndefined(`commands-show-output`)) __obj.updateDynamic("commands-show-output")(`commands-show-output`)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(`fenced-code-language`)) __obj.updateDynamic("fenced-code-language")(`fenced-code-language`)
    if (`first-header-h1` != null) __obj.updateDynamic("first-header-h1")(`first-header-h1`.asInstanceOf[js.Any])
    if (`first-heading-h1` != null) __obj.updateDynamic("first-heading-h1")(`first-heading-h1`.asInstanceOf[js.Any])
    if (`first-line-h1` != null) __obj.updateDynamic("first-line-h1")(`first-line-h1`)
    if (`first-line-heading` != null) __obj.updateDynamic("first-line-heading")(`first-line-heading`)
    if (!js.isUndefined(`header-increment`)) __obj.updateDynamic("header-increment")(`header-increment`)
    if (!js.isUndefined(`header-start-left`)) __obj.updateDynamic("header-start-left")(`header-start-left`)
    if (`header-style` != null) __obj.updateDynamic("header-style")(`header-style`)
    if (!js.isUndefined(`heading-increment`)) __obj.updateDynamic("heading-increment")(`heading-increment`)
    if (!js.isUndefined(`heading-start-left`)) __obj.updateDynamic("heading-start-left")(`heading-start-left`)
    if (`heading-style` != null) __obj.updateDynamic("heading-style")(`heading-style`)
    if (`hr-style` != null) __obj.updateDynamic("hr-style")(`hr-style`)
    if (`line-length` != null) __obj.updateDynamic("line-length")(`line-length`.asInstanceOf[js.Any])
    if (!js.isUndefined(`list-indent`)) __obj.updateDynamic("list-indent")(`list-indent`)
    if (`list-marker-space` != null) __obj.updateDynamic("list-marker-space")(`list-marker-space`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-alt-text`)) __obj.updateDynamic("no-alt-text")(`no-alt-text`)
    if (!js.isUndefined(`no-bare-urls`)) __obj.updateDynamic("no-bare-urls")(`no-bare-urls`)
    if (!js.isUndefined(`no-blanks-blockquote`)) __obj.updateDynamic("no-blanks-blockquote")(`no-blanks-blockquote`)
    if (`no-duplicate-header` != null) __obj.updateDynamic("no-duplicate-header")(`no-duplicate-header`.asInstanceOf[js.Any])
    if (`no-duplicate-heading` != null) __obj.updateDynamic("no-duplicate-heading")(`no-duplicate-heading`.asInstanceOf[js.Any])
    if (`no-emphasis-as-header` != null) __obj.updateDynamic("no-emphasis-as-header")(`no-emphasis-as-header`.asInstanceOf[js.Any])
    if (`no-emphasis-as-heading` != null) __obj.updateDynamic("no-emphasis-as-heading")(`no-emphasis-as-heading`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-empty-links`)) __obj.updateDynamic("no-empty-links")(`no-empty-links`)
    if (`no-hard-tabs` != null) __obj.updateDynamic("no-hard-tabs")(`no-hard-tabs`.asInstanceOf[js.Any])
    if (`no-inline-html` != null) __obj.updateDynamic("no-inline-html")(`no-inline-html`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-missing-space-atx`)) __obj.updateDynamic("no-missing-space-atx")(`no-missing-space-atx`)
    if (!js.isUndefined(`no-missing-space-closed-atx`)) __obj.updateDynamic("no-missing-space-closed-atx")(`no-missing-space-closed-atx`)
    if (`no-multiple-blanks` != null) __obj.updateDynamic("no-multiple-blanks")(`no-multiple-blanks`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-multiple-space-atx`)) __obj.updateDynamic("no-multiple-space-atx")(`no-multiple-space-atx`)
    if (!js.isUndefined(`no-multiple-space-blockquote`)) __obj.updateDynamic("no-multiple-space-blockquote")(`no-multiple-space-blockquote`)
    if (!js.isUndefined(`no-multiple-space-closed-atx`)) __obj.updateDynamic("no-multiple-space-closed-atx")(`no-multiple-space-closed-atx`)
    if (!js.isUndefined(`no-reversed-links`)) __obj.updateDynamic("no-reversed-links")(`no-reversed-links`)
    if (!js.isUndefined(`no-space-in-code`)) __obj.updateDynamic("no-space-in-code")(`no-space-in-code`)
    if (!js.isUndefined(`no-space-in-emphasis`)) __obj.updateDynamic("no-space-in-emphasis")(`no-space-in-emphasis`)
    if (!js.isUndefined(`no-space-in-links`)) __obj.updateDynamic("no-space-in-links")(`no-space-in-links`)
    if (`no-trailing-punctuation` != null) __obj.updateDynamic("no-trailing-punctuation")(`no-trailing-punctuation`.asInstanceOf[js.Any])
    if (`no-trailing-spaces` != null) __obj.updateDynamic("no-trailing-spaces")(`no-trailing-spaces`.asInstanceOf[js.Any])
    if (`ol-prefix` != null) __obj.updateDynamic("ol-prefix")(`ol-prefix`.asInstanceOf[js.Any])
    if (`proper-names` != null) __obj.updateDynamic("proper-names")(`proper-names`)
    if (`required-headers` != null) __obj.updateDynamic("required-headers")(`required-headers`)
    if (`required-headings` != null) __obj.updateDynamic("required-headings")(`required-headings`)
    if (`single-h1` != null) __obj.updateDynamic("single-h1")(`single-h1`.asInstanceOf[js.Any])
    if (`single-title` != null) __obj.updateDynamic("single-title")(`single-title`.asInstanceOf[js.Any])
    if (`ul-indent` != null) __obj.updateDynamic("ul-indent")(`ul-indent`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ul-start-left`)) __obj.updateDynamic("ul-start-left")(`ul-start-left`)
    if (`ul-style` != null) __obj.updateDynamic("ul-style")(`ul-style`)
    __obj.asInstanceOf[MarkdownlintConfig]
  }
}

