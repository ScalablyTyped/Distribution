package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonHTMLOutputProcessor extends js.Object {
  /*This is an object that configures automatic linebreaking in the CommonHTML output. In order to be backward
           * compatible with earlier versions of MathJax, only explicit line breaks are performed by default, so you must
           * enable line breaks if you want automatic ones.
           */
  var linebreaks: js.UndefOr[LineBreaks] = js.undefined
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
           * surrounding text. This will prevent MathJax from making the mathematics too small.
           */
  var minScaleAdjust: js.UndefOr[scala.Double] = js.undefined
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
           * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
           * inherited from the surrounding paragraph.
           */
  var mtextFontInherit: js.UndefOr[scala.Boolean] = js.undefined
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The CommonHTML output
           * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
           * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
           * menu item associated with the typeset mathematics.
           */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

