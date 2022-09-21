package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherReviewStatus extends StObject {
  
  /**
    * The publisher reviewing the creative.
    */
  var publisherName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the publisher review.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublisherReviewStatus {
  
  inline def apply(): SchemaPublisherReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherReviewStatus]
  }
  
  extension [Self <: SchemaPublisherReviewStatus](x: Self) {
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
