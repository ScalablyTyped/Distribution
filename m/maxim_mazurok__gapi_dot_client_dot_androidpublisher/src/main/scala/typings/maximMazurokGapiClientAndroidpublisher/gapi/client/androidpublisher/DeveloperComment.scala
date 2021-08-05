package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeveloperComment extends StObject {
  
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  
  /** The content of the comment, i.e. reply body. */
  var text: js.UndefOr[String] = js.undefined
}
object DeveloperComment {
  
  inline def apply(): DeveloperComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperComment]
  }
  
  extension [Self <: DeveloperComment](x: Self) {
    
    inline def setLastModified(value: Timestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
