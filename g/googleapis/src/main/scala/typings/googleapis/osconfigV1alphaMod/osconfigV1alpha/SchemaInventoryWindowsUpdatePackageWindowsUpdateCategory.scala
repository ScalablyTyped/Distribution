package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryWindowsUpdatePackageWindowsUpdateCategory extends StObject {
  
  /**
    * The identifier of the windows update category.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the windows update category.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryWindowsUpdatePackageWindowsUpdateCategory {
  
  inline def apply(): SchemaInventoryWindowsUpdatePackageWindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryWindowsUpdatePackageWindowsUpdateCategory]
  }
  
  extension [Self <: SchemaInventoryWindowsUpdatePackageWindowsUpdateCategory](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
