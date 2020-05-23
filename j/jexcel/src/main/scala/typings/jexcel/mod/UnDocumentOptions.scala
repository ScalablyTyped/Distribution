package typings.jexcel.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnDocumentOptions extends js.Object {
  var footers: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.undefined
}

object UnDocumentOptions {
  @scala.inline
  def apply(
    footers: js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ] = null
  ): UnDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (footers != null) __obj.updateDynamic("footers")(footers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnDocumentOptions]
  }
}

