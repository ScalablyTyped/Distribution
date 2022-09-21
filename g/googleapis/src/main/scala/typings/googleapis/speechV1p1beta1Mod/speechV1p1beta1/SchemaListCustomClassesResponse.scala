package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCustomClassesResponse extends StObject {
  
  /**
    * The custom classes.
    */
  var customClasses: js.UndefOr[js.Array[SchemaCustomClass]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCustomClassesResponse {
  
  inline def apply(): SchemaListCustomClassesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCustomClassesResponse]
  }
  
  extension [Self <: SchemaListCustomClassesResponse](x: Self) {
    
    inline def setCustomClasses(value: js.Array[SchemaCustomClass]): Self = StObject.set(x, "customClasses", value.asInstanceOf[js.Any])
    
    inline def setCustomClassesUndefined: Self = StObject.set(x, "customClasses", js.undefined)
    
    inline def setCustomClassesVarargs(value: SchemaCustomClass*): Self = StObject.set(x, "customClasses", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
