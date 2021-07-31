package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileApp extends StObject {
  
  /** Mobile app directory. */
  var directory: js.UndefOr[String] = js.undefined
  
  /** ID of this mobile app. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileApp". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Publisher name. */
  var publisherName: js.UndefOr[String] = js.undefined
  
  /** Title of this mobile app. */
  var title: js.UndefOr[String] = js.undefined
}
object MobileApp {
  
  @scala.inline
  def apply(): MobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApp]
  }
  
  @scala.inline
  implicit class MobileAppMutableBuilder[Self <: MobileApp] (val x: Self) extends AnyVal {
    
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
