package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MarkedOptions extends js.Object {
  /**
           * A prefix URL for any relative link.
           */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Enable GFM line breaks. This option requires the gfm option to be true.
           */
  var breaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable GitHub flavored markdown.
           */
  var gfm: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Include an id attribute when emitting headings.
           */
  var headerIds: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set the prefix for header tag ids.
           */
  var headerPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
           */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* callback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[_], /* code */ java.lang.String, scala.Unit]], 
      java.lang.String
    ]
  ] = js.undefined
  /**
           * Set the prefix for code block classes.
           */
  var langPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Mangle autolinks (<email@domain.com>).
           */
  var mangle: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
           */
  var pedantic: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Type: object Default: new Renderer()
           *
           * An object containing functions to render tokens to HTML.
           */
  var renderer: js.UndefOr[Renderer] = js.undefined
  /**
           * Sanitize the output. Ignore any HTML that has been input.
           */
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optionally sanitize found HTML with a sanitizer function.
           */
  var sanitizer: js.UndefOr[js.Function1[/* html */ java.lang.String, java.lang.String]] = js.undefined
  /**
           * Shows an HTML error message when rendering fails.
           */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
           */
  var smartLists: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Use "smart" typograhic punctuation for things like quotes and dashes.
           */
  var smartypants: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable GFM tables. This option requires the gfm option to be true.
           */
  var tables: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Generate closing slash for self-closing tags (<br/> instead of <br>)
           */
  var xhtml: js.UndefOr[scala.Boolean] = js.undefined
}

