package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListExclusions.
  */
@js.native
trait SchemaListExclusionsResponse extends StObject {
  
  /**
    * A list of exclusions.
    */
  var exclusions: js.UndefOr[js.Array[SchemaLogExclusion]] = js.native
  
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListExclusionsResponse {
  
  @scala.inline
  def apply(): SchemaListExclusionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExclusionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListExclusionsResponseMutableBuilder[Self <: SchemaListExclusionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: js.Array[SchemaLogExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: SchemaLogExclusion*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
