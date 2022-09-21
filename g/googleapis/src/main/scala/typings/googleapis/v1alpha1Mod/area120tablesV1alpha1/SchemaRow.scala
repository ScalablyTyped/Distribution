package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRow extends StObject {
  
  /**
    * Time when the row was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the row. Row names have the form `tables/{table\}/rows/{row\}`. The name is ignored when creating a row.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the row was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values of the row. This is a map of column key to value. Key is user entered name(default) or the internal column id based on the view in the request.
    */
  var values: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaRow {
  
  inline def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  extension [Self <: SchemaRow](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setValues(value: StringDictionary[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
