package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnDocumentOptions extends StObject {
  
  var footers: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
    ]
  ] = js.undefined
}
object UnDocumentOptions {
  
  inline def apply(): UnDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnDocumentOptions]
  }
  
  extension [Self <: UnDocumentOptions](x: Self) {
    
    inline def setFooters(
      value: js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
        ]
    ): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
    
    inline def setFootersUndefined: Self = StObject.set(x, "footers", js.undefined)
    
    inline def setFootersVarargs(
      value: ((/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue])*
    ): Self = StObject.set(x, "footers", js.Array(value*))
  }
}
