package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipInfo extends StObject {
  
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not
    * provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double] = js.undefined
  
  /** URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'. */
  var sourceUrl: js.UndefOr[String] = js.undefined
}
object ZipInfo {
  
  inline def apply(): ZipInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipInfo]
  }
  
  extension [Self <: ZipInfo](x: Self) {
    
    inline def setFilesCount(value: Double): Self = StObject.set(x, "filesCount", value.asInstanceOf[js.Any])
    
    inline def setFilesCountUndefined: Self = StObject.set(x, "filesCount", js.undefined)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
