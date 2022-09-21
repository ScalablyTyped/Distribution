package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow extends StObject {
  
  /**
    * Cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableCell]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2DocumentPageTableTableCell*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
