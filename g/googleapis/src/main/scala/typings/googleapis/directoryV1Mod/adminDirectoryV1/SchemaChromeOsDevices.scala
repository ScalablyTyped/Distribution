package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChromeOsDevices extends StObject {
  
  /**
    * List of Chrome OS Device objects.
    */
  var chromeosdevices: js.UndefOr[js.Array[SchemaChromeOsDevice]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token used to access the next page of this result. To access the next page, use this token's value in the `pageToken` query string of this request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaChromeOsDevices {
  
  inline def apply(): SchemaChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevices]
  }
  
  extension [Self <: SchemaChromeOsDevices](x: Self) {
    
    inline def setChromeosdevices(value: js.Array[SchemaChromeOsDevice]): Self = StObject.set(x, "chromeosdevices", value.asInstanceOf[js.Any])
    
    inline def setChromeosdevicesUndefined: Self = StObject.set(x, "chromeosdevices", js.undefined)
    
    inline def setChromeosdevicesVarargs(value: SchemaChromeOsDevice*): Self = StObject.set(x, "chromeosdevices", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
