package typings
package markedDashTerminalLib.markedDashTerminalMod.TerminalRendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TerminalRendererOptions extends js.Object {
  var blockquote: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var code: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var codespan: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var del: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var em: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Whether or not to show emojis
  var emoji: js.UndefOr[scala.Boolean] = js.undefined
  var firstHeading: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var heading: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var hr: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var href: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var html: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var link: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Formats the bulletpoints and numbers for lists
  var list: js.UndefOr[
    js.Function2[
      /* body */ java.lang.String, 
      /* ordered */ js.UndefOr[scala.Boolean], 
      java.lang.String
    ]
  ] = js.undefined
  var listitem: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var paragraph: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
   // only applicable when reflow is true
  var reflowText: js.UndefOr[scala.Boolean] = js.undefined
  // Should it prefix headers?
  var showSectionPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var strong: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // The size of tabs in number of spaces or as tab characters
  var tab: js.UndefOr[scala.Double] = js.undefined
  var table: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Options passed to cli-table
  var tableOptions: js.UndefOr[js.Any] = js.undefined
  // Whether or not to undo marked escaping
  // of enitities (" -> &quot; etc)
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
  // Reflow and print-out width
  var width: js.UndefOr[scala.Double] = js.undefined
}

