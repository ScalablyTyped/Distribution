package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorSettings extends js.Object {
  /*This is an HTML snippet that will be inserted at the location of the mathematics for any formula that causes
          * MathJax to produce an internal error (i.e., an error in the MathJax code itself). See the description of HTML
          * snippets for details on how to represent HTML code in this way.
          */
  var message: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /*This is the CSS style description to use for the error messages produced by internal MathJax errors. See the
          * section on CSS style objects for details on how these are specified in JavaScript.
          */
  var style: js.UndefOr[js.Any] = js.undefined
}

