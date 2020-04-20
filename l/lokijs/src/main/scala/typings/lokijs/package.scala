package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijs {
  type LokiQuery[E] = typings.lokijs.PartialModel[E with typings.lokijs.AnonAnd, typings.lokijs.YinkeyofLokiOpsany]
  type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ typings.lokijs.lokijsStrings.PartialModel with org.scalablytyped.runtime.TopLevel[E]
}
