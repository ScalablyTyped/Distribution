package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijs {
  type LokiQuery[E] = PartialModel[
    E with Anon_And, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Y in keyof lokijs.LokiOps ]:? any}
    */ typings.lokijs.lokijsStrings.LokiQuery with js.Any
  ]
  type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ typings.lokijs.lokijsStrings.PartialModel with E
}
