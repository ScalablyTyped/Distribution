package typings.hyperAws4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hyper-aws4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sign(request: Request): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(request.asInstanceOf[js.Any]).asInstanceOf[Header]
  inline def sign(request: Request, credential: Credentials): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(request.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  trait Credentials extends StObject {
    
    var accessKey: String
    
    var secretKey: String
  }
  object Credentials {
    
    inline def apply(accessKey: String, secretKey: String): Credentials = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  type Header = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperAws4.hyperAws4Strings.GET
    - typings.hyperAws4.hyperAws4Strings.POST
    - typings.hyperAws4.hyperAws4Strings.PUT
    - typings.hyperAws4.hyperAws4Strings.DELETE
    - typings.hyperAws4.hyperAws4Strings.PATCH
  */
  trait HttpMethods extends StObject
  object HttpMethods {
    
    inline def DELETE: typings.hyperAws4.hyperAws4Strings.DELETE = "DELETE".asInstanceOf[typings.hyperAws4.hyperAws4Strings.DELETE]
    
    inline def GET: typings.hyperAws4.hyperAws4Strings.GET = "GET".asInstanceOf[typings.hyperAws4.hyperAws4Strings.GET]
    
    inline def PATCH: typings.hyperAws4.hyperAws4Strings.PATCH = "PATCH".asInstanceOf[typings.hyperAws4.hyperAws4Strings.PATCH]
    
    inline def POST: typings.hyperAws4.hyperAws4Strings.POST = "POST".asInstanceOf[typings.hyperAws4.hyperAws4Strings.POST]
    
    inline def PUT: typings.hyperAws4.hyperAws4Strings.PUT = "PUT".asInstanceOf[typings.hyperAws4.hyperAws4Strings.PUT]
  }
  
  trait Request extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var credential: js.UndefOr[Credentials] = js.undefined
    
    var headers: js.UndefOr[Header] = js.undefined
    
    var method: js.UndefOr[HttpMethods] = js.undefined
    
    var url: String
  }
  object Request {
    
    inline def apply(url: String): Request = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredential(value: Credentials): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      inline def setHeaders(value: Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
