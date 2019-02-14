package typings
package inputmaskLib.inputmaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object InputmaskNs {
  type Casing = inputmaskLib.inputmaskLibStrings.upper | inputmaskLib.inputmaskLibStrings.lower | inputmaskLib.inputmaskLibStrings.title
  type DefinitionValidator = js.Function5[
    /* chrs */ java.lang.String, 
    /* buffer */ js.Array[java.lang.String], 
    /* pos */ scala.Double, 
    /* strict */ scala.Boolean, 
    /* opts */ Options, 
    scala.Boolean | inputmaskLib.Anon_C
  ]
  type InputMode = inputmaskLib.inputmaskLibStrings.verbatim | inputmaskLib.inputmaskLibStrings.none | inputmaskLib.inputmaskLibStrings.text | inputmaskLib.inputmaskLibStrings.decimal | inputmaskLib.inputmaskLibStrings.numeric | inputmaskLib.inputmaskLibStrings.tel | inputmaskLib.inputmaskLibStrings.search | inputmaskLib.inputmaskLibStrings.email | inputmaskLib.inputmaskLibStrings.url
  type PositionCaretOnClick = inputmaskLib.inputmaskLibStrings.none | inputmaskLib.inputmaskLibStrings.lvp | inputmaskLib.inputmaskLibStrings.radixFocus | inputmaskLib.inputmaskLibStrings.select | inputmaskLib.inputmaskLibStrings.ignore
  type Range = inputmaskLib.Anon_End | (js.Tuple2[java.lang.String, java.lang.String])
}
