package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /** The resource name of the row. Row names have the form `tables/{table}/rows/{row}`. The name is ignored when creating a row. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The values of the row. This is a map of column key to value. Key is user entered name(default) or the internal column id based on the view in the request. */
  var values: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.Row & TopLevel[js.Any]
  ] = js.undefined
}
object Row {
  
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.Row & TopLevel[js.Any]
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
