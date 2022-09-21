package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageTableTableRow extends StObject {
  
  /**
    * Cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageTableTableRow {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageTableTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageTableTableRow]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageTableTableRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageTableTableCell*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
