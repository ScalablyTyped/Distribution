package typings
package kramedLib.kramedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KramedOptions extends js.Object {
  /**
       * Enable GFM line breaks. This option requires the gfm option to be true.
       */
  var breaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Enable GitHub flavored kramdown.
       */
  var gfm: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
       */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      java.lang.String
    ]
  ] = js.undefined
  /**
       * Set the prefix for code block classes.
       */
  var langPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Conform to obscure parts of kramdown.pl as much as possible. Don't fix any of the original kramdown bugs or poor behavior.
       */
  var pedantic: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Type: object Default: new Renderer()
       *
       * An object containing functions to render tokens to HTML.
       */
  var renderer: js.UndefOr[KramedRenderer] = js.undefined
  /**
       * Sanitize the output. Ignore any HTML that has been input.
       */
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Shows an HTML error message when rendering fails.
       */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Use smarter list behavior than the original kramdown. May eventually be default with the old behavior moved into pedantic.
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
}

