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

@js.native
trait MarkdownlintConfig
  extends /* rule */ StringDictionary[js.UndefOr[String | Double | Boolean | StringDictionary[js.Any]]] {
  var `blanks-around-fences`: js.UndefOr[Boolean] = js.native
  var `blanks-around-headings`: js.UndefOr[Boolean | Linesabove] = js.native
  var `blanks-around-lists`: js.UndefOr[Boolean] = js.native
  var `blanks-around_headers`: js.UndefOr[Boolean | Linesabove] = js.native
  var `commands-show-output`: js.UndefOr[Boolean] = js.native
  /**
    * Default state for all rules.
    * @default true
    */
  var default: js.UndefOr[Boolean] = js.native
  var `fenced-code-language`: js.UndefOr[Boolean] = js.native
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-header-h1`: js.UndefOr[Boolean | Level] = js.native
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-heading-h1`: js.UndefOr[Boolean | Level] = js.native
  var `first-line-h1`: js.UndefOr[Frontmattertitle] = js.native
  var `first-line-heading`: js.UndefOr[Frontmattertitle] = js.native
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `header-increment`: js.UndefOr[Boolean] = js.native
  var `header-start-left`: js.UndefOr[Boolean] = js.native
  /**
    * Heading style.
    * @default "consistent"
    */
  var `header-style`: js.UndefOr[Style] = js.native
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `heading-increment`: js.UndefOr[Boolean] = js.native
  var `heading-start-left`: js.UndefOr[Boolean] = js.native
  /**
    * Heading style.
    * @default "consistent"
    */
  var `heading-style`: js.UndefOr[Style] = js.native
  var `hr-style`: js.UndefOr[StyleString] = js.native
  var `line-length`: js.UndefOr[Boolean | Headers] = js.native
  /**
    * Inconsistent indentation for list items at the same level
    */
  var `list-indent`: js.UndefOr[Boolean] = js.native
  var `list-marker-space`: js.UndefOr[Boolean | Olmulti] = js.native
  var `no-alt-text`: js.UndefOr[Boolean] = js.native
  var `no-bare-urls`: js.UndefOr[Boolean] = js.native
  var `no-blanks-blockquote`: js.UndefOr[Boolean] = js.native
  var `no-duplicate-header`: js.UndefOr[Boolean | Allowdifferentnesting] = js.native
  var `no-duplicate-heading`: js.UndefOr[Boolean | Allowdifferentnesting] = js.native
  var `no-emphasis-as-header`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-emphasis-as-heading`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-empty-links`: js.UndefOr[Boolean] = js.native
  var `no-hard-tabs`: js.UndefOr[Boolean | Codeblocks] = js.native
  var `no-inline-html`: js.UndefOr[Boolean | Allowedelements] = js.native
  var `no-missing-space-atx`: js.UndefOr[Boolean] = js.native
  var `no-missing-space-closed-atx`: js.UndefOr[Boolean] = js.native
  var `no-multiple-blanks`: js.UndefOr[Boolean | Maximum] = js.native
  var `no-multiple-space-atx`: js.UndefOr[Boolean] = js.native
  var `no-multiple-space-blockquote`: js.UndefOr[Boolean] = js.native
  var `no-multiple-space-closed-atx`: js.UndefOr[Boolean] = js.native
  var `no-reversed-links`: js.UndefOr[Boolean] = js.native
  var `no-space-in-code`: js.UndefOr[Boolean] = js.native
  var `no-space-in-emphasis`: js.UndefOr[Boolean] = js.native
  var `no-space-in-links`: js.UndefOr[Boolean] = js.native
  var `no-trailing-punctuation`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-trailing-spaces`: js.UndefOr[Boolean | Brspaces] = js.native
  var `ol-prefix`: js.UndefOr[Boolean | `1`] = js.native
  var `proper-names`: js.UndefOr[Names] = js.native
  var `required-headers`: js.UndefOr[js.Array[String]] = js.native
  var `required-headings`: js.UndefOr[js.Array[String]] = js.native
  var `single-h1`: js.UndefOr[Boolean | Frontmattertitle] = js.native
  var `single-title`: js.UndefOr[Boolean | Frontmattertitle] = js.native
  /**
    * This rule is triggered when list items are not indented by the configured number of spaces.
    * @default 2
    */
  var `ul-indent`: js.UndefOr[Boolean | Indent] = js.native
  /**
    * Consider starting bulleted lists at the beginning of the line.
    */
  var `ul-start-left`: js.UndefOr[Boolean] = js.native
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
  var `ul-style`: js.UndefOr[`0`] = js.native
}

object MarkdownlintConfig {
  @scala.inline
  def apply(): MarkdownlintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownlintConfig]
  }
  @scala.inline
  implicit class MarkdownlintConfigOps[Self <: MarkdownlintConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setBlanks-around-fences`(value: Boolean): Self = this.set("blanks-around-fences", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlanks-around-fences`: Self = this.set("blanks-around-fences", js.undefined)
    @scala.inline
    def `setBlanks-around-headings`(value: Boolean | Linesabove): Self = this.set("blanks-around-headings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlanks-around-headings`: Self = this.set("blanks-around-headings", js.undefined)
    @scala.inline
    def `setBlanks-around-lists`(value: Boolean): Self = this.set("blanks-around-lists", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlanks-around-lists`: Self = this.set("blanks-around-lists", js.undefined)
    @scala.inline
    def `setBlanks-around_headers`(value: Boolean | Linesabove): Self = this.set("blanks-around_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlanks-around_headers`: Self = this.set("blanks-around_headers", js.undefined)
    @scala.inline
    def `setCommands-show-output`(value: Boolean): Self = this.set("commands-show-output", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCommands-show-output`: Self = this.set("commands-show-output", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def `setFenced-code-language`(value: Boolean): Self = this.set("fenced-code-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFenced-code-language`: Self = this.set("fenced-code-language", js.undefined)
    @scala.inline
    def `setFirst-header-h1`(value: Boolean | Level): Self = this.set("first-header-h1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-header-h1`: Self = this.set("first-header-h1", js.undefined)
    @scala.inline
    def `setFirst-heading-h1`(value: Boolean | Level): Self = this.set("first-heading-h1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-heading-h1`: Self = this.set("first-heading-h1", js.undefined)
    @scala.inline
    def `setFirst-line-h1`(value: Frontmattertitle): Self = this.set("first-line-h1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-line-h1`: Self = this.set("first-line-h1", js.undefined)
    @scala.inline
    def `setFirst-line-heading`(value: Frontmattertitle): Self = this.set("first-line-heading", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-line-heading`: Self = this.set("first-line-heading", js.undefined)
    @scala.inline
    def `setHeader-increment`(value: Boolean): Self = this.set("header-increment", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeader-increment`: Self = this.set("header-increment", js.undefined)
    @scala.inline
    def `setHeader-start-left`(value: Boolean): Self = this.set("header-start-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeader-start-left`: Self = this.set("header-start-left", js.undefined)
    @scala.inline
    def `setHeader-style`(value: Style): Self = this.set("header-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeader-style`: Self = this.set("header-style", js.undefined)
    @scala.inline
    def `setHeading-increment`(value: Boolean): Self = this.set("heading-increment", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeading-increment`: Self = this.set("heading-increment", js.undefined)
    @scala.inline
    def `setHeading-start-left`(value: Boolean): Self = this.set("heading-start-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeading-start-left`: Self = this.set("heading-start-left", js.undefined)
    @scala.inline
    def `setHeading-style`(value: Style): Self = this.set("heading-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeading-style`: Self = this.set("heading-style", js.undefined)
    @scala.inline
    def `setHr-style`(value: StyleString): Self = this.set("hr-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHr-style`: Self = this.set("hr-style", js.undefined)
    @scala.inline
    def `setLine-length`(value: Boolean | Headers): Self = this.set("line-length", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-length`: Self = this.set("line-length", js.undefined)
    @scala.inline
    def `setList-indent`(value: Boolean): Self = this.set("list-indent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteList-indent`: Self = this.set("list-indent", js.undefined)
    @scala.inline
    def `setList-marker-space`(value: Boolean | Olmulti): Self = this.set("list-marker-space", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteList-marker-space`: Self = this.set("list-marker-space", js.undefined)
    @scala.inline
    def `setNo-alt-text`(value: Boolean): Self = this.set("no-alt-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-alt-text`: Self = this.set("no-alt-text", js.undefined)
    @scala.inline
    def `setNo-bare-urls`(value: Boolean): Self = this.set("no-bare-urls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-bare-urls`: Self = this.set("no-bare-urls", js.undefined)
    @scala.inline
    def `setNo-blanks-blockquote`(value: Boolean): Self = this.set("no-blanks-blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-blanks-blockquote`: Self = this.set("no-blanks-blockquote", js.undefined)
    @scala.inline
    def `setNo-duplicate-header`(value: Boolean | Allowdifferentnesting): Self = this.set("no-duplicate-header", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-duplicate-header`: Self = this.set("no-duplicate-header", js.undefined)
    @scala.inline
    def `setNo-duplicate-heading`(value: Boolean | Allowdifferentnesting): Self = this.set("no-duplicate-heading", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-duplicate-heading`: Self = this.set("no-duplicate-heading", js.undefined)
    @scala.inline
    def `setNo-emphasis-as-header`(value: Boolean | Punctuation): Self = this.set("no-emphasis-as-header", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-emphasis-as-header`: Self = this.set("no-emphasis-as-header", js.undefined)
    @scala.inline
    def `setNo-emphasis-as-heading`(value: Boolean | Punctuation): Self = this.set("no-emphasis-as-heading", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-emphasis-as-heading`: Self = this.set("no-emphasis-as-heading", js.undefined)
    @scala.inline
    def `setNo-empty-links`(value: Boolean): Self = this.set("no-empty-links", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-empty-links`: Self = this.set("no-empty-links", js.undefined)
    @scala.inline
    def `setNo-hard-tabs`(value: Boolean | Codeblocks): Self = this.set("no-hard-tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-hard-tabs`: Self = this.set("no-hard-tabs", js.undefined)
    @scala.inline
    def `setNo-inline-html`(value: Boolean | Allowedelements): Self = this.set("no-inline-html", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-inline-html`: Self = this.set("no-inline-html", js.undefined)
    @scala.inline
    def `setNo-missing-space-atx`(value: Boolean): Self = this.set("no-missing-space-atx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-missing-space-atx`: Self = this.set("no-missing-space-atx", js.undefined)
    @scala.inline
    def `setNo-missing-space-closed-atx`(value: Boolean): Self = this.set("no-missing-space-closed-atx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-missing-space-closed-atx`: Self = this.set("no-missing-space-closed-atx", js.undefined)
    @scala.inline
    def `setNo-multiple-blanks`(value: Boolean | Maximum): Self = this.set("no-multiple-blanks", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-multiple-blanks`: Self = this.set("no-multiple-blanks", js.undefined)
    @scala.inline
    def `setNo-multiple-space-atx`(value: Boolean): Self = this.set("no-multiple-space-atx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-multiple-space-atx`: Self = this.set("no-multiple-space-atx", js.undefined)
    @scala.inline
    def `setNo-multiple-space-blockquote`(value: Boolean): Self = this.set("no-multiple-space-blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-multiple-space-blockquote`: Self = this.set("no-multiple-space-blockquote", js.undefined)
    @scala.inline
    def `setNo-multiple-space-closed-atx`(value: Boolean): Self = this.set("no-multiple-space-closed-atx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-multiple-space-closed-atx`: Self = this.set("no-multiple-space-closed-atx", js.undefined)
    @scala.inline
    def `setNo-reversed-links`(value: Boolean): Self = this.set("no-reversed-links", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-reversed-links`: Self = this.set("no-reversed-links", js.undefined)
    @scala.inline
    def `setNo-space-in-code`(value: Boolean): Self = this.set("no-space-in-code", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-space-in-code`: Self = this.set("no-space-in-code", js.undefined)
    @scala.inline
    def `setNo-space-in-emphasis`(value: Boolean): Self = this.set("no-space-in-emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-space-in-emphasis`: Self = this.set("no-space-in-emphasis", js.undefined)
    @scala.inline
    def `setNo-space-in-links`(value: Boolean): Self = this.set("no-space-in-links", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-space-in-links`: Self = this.set("no-space-in-links", js.undefined)
    @scala.inline
    def `setNo-trailing-punctuation`(value: Boolean | Punctuation): Self = this.set("no-trailing-punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-trailing-punctuation`: Self = this.set("no-trailing-punctuation", js.undefined)
    @scala.inline
    def `setNo-trailing-spaces`(value: Boolean | Brspaces): Self = this.set("no-trailing-spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-trailing-spaces`: Self = this.set("no-trailing-spaces", js.undefined)
    @scala.inline
    def `setOl-prefix`(value: Boolean | `1`): Self = this.set("ol-prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOl-prefix`: Self = this.set("ol-prefix", js.undefined)
    @scala.inline
    def `setProper-names`(value: Names): Self = this.set("proper-names", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProper-names`: Self = this.set("proper-names", js.undefined)
    @scala.inline
    def `setRequired-headersVarargs`(value: String*): Self = this.set("required-headers", js.Array(value :_*))
    @scala.inline
    def `setRequired-headers`(value: js.Array[String]): Self = this.set("required-headers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequired-headers`: Self = this.set("required-headers", js.undefined)
    @scala.inline
    def `setRequired-headingsVarargs`(value: String*): Self = this.set("required-headings", js.Array(value :_*))
    @scala.inline
    def `setRequired-headings`(value: js.Array[String]): Self = this.set("required-headings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequired-headings`: Self = this.set("required-headings", js.undefined)
    @scala.inline
    def `setSingle-h1`(value: Boolean | Frontmattertitle): Self = this.set("single-h1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSingle-h1`: Self = this.set("single-h1", js.undefined)
    @scala.inline
    def `setSingle-title`(value: Boolean | Frontmattertitle): Self = this.set("single-title", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSingle-title`: Self = this.set("single-title", js.undefined)
    @scala.inline
    def `setUl-indent`(value: Boolean | Indent): Self = this.set("ul-indent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUl-indent`: Self = this.set("ul-indent", js.undefined)
    @scala.inline
    def `setUl-start-left`(value: Boolean): Self = this.set("ul-start-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUl-start-left`: Self = this.set("ul-start-left", js.undefined)
    @scala.inline
    def `setUl-style`(value: `0`): Self = this.set("ul-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUl-style`: Self = this.set("ul-style", js.undefined)
  }
  
}

