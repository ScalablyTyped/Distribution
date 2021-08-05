package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a mobile app. Used as a landing page deep link.
  */
trait SchemaMobileApp extends StObject {
  
  /**
    * Mobile app directory.
    */
  var directory: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this mobile app.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileApp&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Publisher name.
    */
  var publisherName: js.UndefOr[String] = js.undefined
  
  /**
    * Title of this mobile app.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaMobileApp {
  
  inline def apply(): SchemaMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApp]
  }
  
  extension [Self <: SchemaMobileApp](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
