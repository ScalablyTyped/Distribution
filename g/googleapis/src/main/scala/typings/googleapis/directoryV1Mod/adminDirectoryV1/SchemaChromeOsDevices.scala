package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Chrome OS Devices operation in Directory
  * API.
  */
@js.native
trait SchemaChromeOsDevices extends StObject {
  
  /**
    * List of Chrome OS Device objects.
    */
  var chromeosdevices: js.UndefOr[js.Array[SchemaChromeOsDevice]] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaChromeOsDevices {
  
  @scala.inline
  def apply(): SchemaChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevices]
  }
  
  @scala.inline
  implicit class SchemaChromeOsDevicesMutableBuilder[Self <: SchemaChromeOsDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChromeosdevices(value: js.Array[SchemaChromeOsDevice]): Self = StObject.set(x, "chromeosdevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeosdevicesUndefined: Self = StObject.set(x, "chromeosdevices", js.undefined)
    
    @scala.inline
    def setChromeosdevicesVarargs(value: SchemaChromeOsDevice*): Self = StObject.set(x, "chromeosdevices", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
