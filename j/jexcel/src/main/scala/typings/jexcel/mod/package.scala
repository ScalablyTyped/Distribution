package typings.jexcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  //
  // Cell values
  // ----------------------------------------------------------------------
  type CellValue = java.lang.String | scala.Double | scala.Boolean
  /**
    * @see https://bossanova.uk/jexcel/v4/docs/quick-reference
    */
  type Options = typings.jexcel.mod.MethodsOptions with typings.jexcel.mod.EventsOptions with typings.jexcel.mod.InitializationOptions with typings.jexcel.mod.TranslationsOptions with typings.jexcel.mod.UnDocumentOptions
  type SourceValue = typings.jexcel.mod.CellValue | typings.jexcel.anon.Id
}
