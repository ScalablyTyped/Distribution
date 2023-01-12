package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsIdempotencyMod {
  
  object idempotency {
    
    trait IdempotencyData
      extends StObject
         with EntityBaseData {
      
      /**
        * The content length of the API response
        */
      var ContentLength: String
      
      /**
        * The content type of the API response
        */
      var ContentType: String
      
      /**
        * The long format date when the API request was received
        */
      var Date: Timestamp
      
      /**
        * The URL of the API request
        */
      var RequestURL: String
      
      /**
        * An API resource
        */
      var Resource: Any
      
      /**
        * The status code of the API response
        */
      var StatusCode: String
    }
    object IdempotencyData {
      
      inline def apply(
        ContentLength: String,
        ContentType: String,
        CreationDate: Double,
        Date: Timestamp,
        Id: String,
        RequestURL: String,
        Resource: Any,
        StatusCode: String,
        Tag: String
      ): IdempotencyData = {
        val __obj = js.Dynamic.literal(ContentLength = ContentLength.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], RequestURL = RequestURL.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[IdempotencyData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IdempotencyData] (val x: Self) extends AnyVal {
        
        inline def setContentLength(value: String): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
        
        inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
        
        inline def setDate(value: Timestamp): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
        
        inline def setRequestURL(value: String): Self = StObject.set(x, "RequestURL", value.asInstanceOf[js.Any])
        
        inline def setResource(value: Any): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
        
        inline def setStatusCode(value: String): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      }
    }
  }
}
