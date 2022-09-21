package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileApp extends StObject {
  
  /**
    * Mobile app directory.
    */
  var directory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this mobile app.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileApp".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher name.
    */
  var publisherName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of this mobile app.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileApp {
  
  inline def apply(): SchemaMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApp]
  }
  
  extension [Self <: SchemaMobileApp](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNull: Self = StObject.set(x, "directory", null)
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
