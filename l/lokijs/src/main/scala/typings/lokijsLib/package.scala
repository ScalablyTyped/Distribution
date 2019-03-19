package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijsLib {
  type LokiQuery[E] = PartialModel[
    E with Anon_And, 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ Y in keyof lokijs.LokiOps ]:? any}
    */ lokijsLib.lokijsLibStrings.LokiQuery with js.Any
  ]
  type PartialModel[E, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ lokijsLib.lokijsLibStrings.PartialModel with E
}
