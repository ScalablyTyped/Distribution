package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new table.
  */
trait SchemaCreateTableRequest extends StObject {
  
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.undefined
  
  /**
    * The element properties for the table.  The table will be created at the
    * provided size, subject to a minimum size. If no size is provided, the
    * table will be automatically sized.  Table transforms must have a scale of
    * 1 and no shear components. If no transform is provided, the table will be
    * centered on the page.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.undefined
  
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.undefined
}
object SchemaCreateTableRequest {
  
  inline def apply(): SchemaCreateTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTableRequest]
  }
  
  extension [Self <: SchemaCreateTableRequest](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setElementProperties(value: SchemaPageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
