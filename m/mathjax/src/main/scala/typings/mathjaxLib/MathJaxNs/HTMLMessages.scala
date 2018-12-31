package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLMessages extends js.Object {
  /*The message used for when MathJax must use image fonts rather than local or web-based fonts (for those
    * browsers that don’t handle the @font-face CSS directive).
    */
  var imageFonts: js.UndefOr[js.Array[_]] = js.undefined
  /*The message used when MathJax is unable to find any font to use (i.e., neither local nor web-based nor
    * image-based fonts are available).
    */
  var noFonts: js.UndefOr[js.Array[_]] = js.undefined
  /*The message used for when MathJax uses web-based fonts (rather than local fonts installed on the user’s
    * system).
    */
  var webFont: js.UndefOr[js.Array[_]] = js.undefined
}

