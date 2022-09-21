package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSdfDownloadTask extends StObject {
  
  /**
    * A resource name to be used in media.download to Download the prepared files. Resource names have the format `download/sdfdownloadtasks/media/{media_id\}`. `media_id` will be made available by the long running operation service once the task status is done.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSdfDownloadTask {
  
  inline def apply(): SchemaSdfDownloadTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdfDownloadTask]
  }
  
  extension [Self <: SchemaSdfDownloadTask](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
