package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableRow extends StObject {
  
  /**
    * Cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableCell]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableRow {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableRow]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageTableTableCell*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
