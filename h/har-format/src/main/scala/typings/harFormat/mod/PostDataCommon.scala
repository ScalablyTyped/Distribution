package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDataCommon extends StObject {
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Mime type of posted data. */
  var mimeType: String
}
object PostDataCommon {
  
  inline def apply(mimeType: String): PostDataCommon = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDataCommon]
  }
  
  extension [Self <: PostDataCommon](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
