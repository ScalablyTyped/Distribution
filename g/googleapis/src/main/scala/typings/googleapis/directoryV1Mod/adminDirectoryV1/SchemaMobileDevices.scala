package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Mobile Devices operation in Directory API.
  */
@js.native
trait SchemaMobileDevices extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of Mobile Device objects.
    */
  var mobiledevices: js.UndefOr[js.Array[SchemaMobileDevice]] = js.native
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaMobileDevices {
  
  @scala.inline
  def apply(): SchemaMobileDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevices]
  }
  
  @scala.inline
  implicit class SchemaMobileDevicesMutableBuilder[Self <: SchemaMobileDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMobiledevices(value: js.Array[SchemaMobileDevice]): Self = StObject.set(x, "mobiledevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobiledevicesUndefined: Self = StObject.set(x, "mobiledevices", js.undefined)
    
    @scala.inline
    def setMobiledevicesVarargs(value: SchemaMobileDevice*): Self = StObject.set(x, "mobiledevices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
