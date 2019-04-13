package typings
package inputmaskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputmaskMod {
  type DefinitionValidator = js.Function5[
    /* chrs */ java.lang.String, 
    /* buffer */ js.Array[java.lang.String], 
    /* pos */ scala.Double, 
    /* strict */ scala.Boolean, 
    /* opts */ Options, 
    scala.Boolean | inputmaskLib.Anon_C
  ]
  type Range = inputmaskLib.Anon_End | (js.Tuple2[java.lang.String, java.lang.String])
}
