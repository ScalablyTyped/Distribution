package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableRow extends StObject {
  
  /**
    * Cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableCell]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableRow {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableRow]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3DocumentPageTableTableCell*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
