package typings.inputmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputmaskMod {
  import typings.inputmask.Anon_C
  import typings.inputmask.Anon_End

  type DefinitionValidator = js.Function5[
    /* chrs */ String, 
    /* buffer */ js.Array[String], 
    /* pos */ Double, 
    /* strict */ Boolean, 
    /* opts */ Options, 
    Boolean | Anon_C
  ]
  type Range = Anon_End | (js.Tuple2[String, String])
}
