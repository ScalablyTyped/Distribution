package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a mobile app. Used as a landing page deep link.
  */
@js.native
trait SchemaMobileApp extends StObject {
  
  /**
    * Mobile app directory.
    */
  var directory: js.UndefOr[String] = js.native
  
  /**
    * ID of this mobile app.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileApp&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Publisher name.
    */
  var publisherName: js.UndefOr[String] = js.native
  
  /**
    * Title of this mobile app.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaMobileApp {
  
  @scala.inline
  def apply(): SchemaMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApp]
  }
  
  @scala.inline
  implicit class SchemaMobileAppMutableBuilder[Self <: SchemaMobileApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
