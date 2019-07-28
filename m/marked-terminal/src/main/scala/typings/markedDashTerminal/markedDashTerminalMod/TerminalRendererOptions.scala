package typings.markedDashTerminal.markedDashTerminalMod

import typings.chalk.chalkMod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalRendererOptions extends js.Object {
  var blockquote: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var code: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var codespan: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var del: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var em: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  // Whether or not to show emojis
  var emoji: js.UndefOr[Boolean] = js.undefined
  var firstHeading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var heading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var hr: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var href: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var html: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var link: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  // Formats the bulletpoints and numbers for lists
  var list: js.UndefOr[js.Function2[/* body */ String, /* ordered */ js.UndefOr[Boolean], String]] = js.undefined
  var listitem: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  var paragraph: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
   // only applicable when reflow is true
  var reflowText: js.UndefOr[Boolean] = js.undefined
  // Should it prefix headers?
  var showSectionPrefix: js.UndefOr[Boolean] = js.undefined
  var strong: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  // The size of tabs in number of spaces or as tab characters
  var tab: js.UndefOr[Double] = js.undefined
  var table: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.undefined
  // Options passed to cli-table
  var tableOptions: js.UndefOr[js.Any] = js.undefined
  // Whether or not to undo marked escaping
  // of enitities (" -> &quot; etc)
  var unescape: js.UndefOr[Boolean] = js.undefined
  // Reflow and print-out width
  var width: js.UndefOr[Double] = js.undefined
}

object TerminalRendererOptions {
  @scala.inline
  def apply(
    blockquote: Chalk | (js.Function1[/* s */ String, String]) = null,
    code: Chalk | (js.Function1[/* s */ String, String]) = null,
    codespan: Chalk | (js.Function1[/* s */ String, String]) = null,
    del: Chalk | (js.Function1[/* s */ String, String]) = null,
    em: Chalk | (js.Function1[/* s */ String, String]) = null,
    emoji: js.UndefOr[Boolean] = js.undefined,
    firstHeading: Chalk | (js.Function1[/* s */ String, String]) = null,
    heading: Chalk | (js.Function1[/* s */ String, String]) = null,
    hr: Chalk | (js.Function1[/* s */ String, String]) = null,
    href: Chalk | (js.Function1[/* s */ String, String]) = null,
    html: Chalk | (js.Function1[/* s */ String, String]) = null,
    link: Chalk | (js.Function1[/* s */ String, String]) = null,
    list: (/* body */ String, /* ordered */ js.UndefOr[Boolean]) => String = null,
    listitem: Chalk | (js.Function1[/* s */ String, String]) = null,
    paragraph: Chalk | (js.Function1[/* s */ String, String]) = null,
    reflowText: js.UndefOr[Boolean] = js.undefined,
    showSectionPrefix: js.UndefOr[Boolean] = js.undefined,
    strong: Chalk | (js.Function1[/* s */ String, String]) = null,
    tab: Int | Double = null,
    table: Chalk | (js.Function1[/* s */ String, String]) = null,
    tableOptions: js.Any = null,
    unescape: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): TerminalRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (blockquote != null) __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (codespan != null) __obj.updateDynamic("codespan")(codespan.asInstanceOf[js.Any])
    if (del != null) __obj.updateDynamic("del")(del.asInstanceOf[js.Any])
    if (em != null) __obj.updateDynamic("em")(em.asInstanceOf[js.Any])
    if (!js.isUndefined(emoji)) __obj.updateDynamic("emoji")(emoji)
    if (firstHeading != null) __obj.updateDynamic("firstHeading")(firstHeading.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(js.Any.fromFunction2(list))
    if (listitem != null) __obj.updateDynamic("listitem")(listitem.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (!js.isUndefined(reflowText)) __obj.updateDynamic("reflowText")(reflowText)
    if (!js.isUndefined(showSectionPrefix)) __obj.updateDynamic("showSectionPrefix")(showSectionPrefix)
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions)
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalRendererOptions]
  }
}

