package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceReference extends StObject {
  
  /**
    * The name of the Cloud SQL instance being referenced. This does not include the project ID.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The region of the Cloud SQL instance being referenced.
    */
  var region: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceReference {
  
  inline def apply(): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceReference]
  }
  
  extension [Self <: SchemaInstanceReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
