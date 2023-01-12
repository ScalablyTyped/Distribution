package typings.ipfsUtils

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHttpFetchMod extends Shortcut {
  
  @JSImport("ipfs-utils/dist/src/http/fetch", JSImport.Namespace)
  @js.native
  val ^ : fetchImpl = js.native
  
  type _To = fetchImpl
  
  /* This means you don't have to write `^`, but can instead just say `distSrcHttpFetchMod.foo` */
  override def _to: fetchImpl = ^
  
  trait fetchImpl extends StObject {
    
    var Headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
    
    var Request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any
    
    var Response: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
    
    var fetch: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.fetch */ Any
  }
  object fetchImpl {
    
    inline def apply(
      Headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any,
      Request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any,
      Response: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any,
      fetch: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.fetch */ Any
    ): fetchImpl = {
      val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[fetchImpl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fetchImpl] (val x: Self) extends AnyVal {
      
      inline def setFetch(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.fetch */ Any
      ): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setHeaders(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
      ): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any
      ): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
      ): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
}
