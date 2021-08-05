package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Project specific details about the content of a YouTube Video.
  */
trait SchemaVideoProjectDetails extends StObject {
  
  /**
    * A list of project tags associated with the video during the upload.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaVideoProjectDetails {
  
  inline def apply(): SchemaVideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProjectDetails]
  }
  
  extension [Self <: SchemaVideoProjectDetails](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
