package typings.hapiHapi

import org.scalablytyped.runtime.StringDictionary
import typings.hapiHapi.hapiHapiStrings.delete_
import typings.hapiHapi.hapiHapiStrings.get_
import typings.hapiHapi.hapiHapiStrings.options_
import typings.hapiHapi.hapiHapiStrings.patch_
import typings.hapiHapi.hapiHapiStrings.post_
import typings.hapiHapi.hapiHapiStrings.put_
import typings.hapiHapi.libTypesServerOptionsMod.ServerOptions
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @JSImport("@hapi/hapi/lib/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/hapi/lib/types", "Server")
  @js.native
  /**
    * Creates a new server object
    * @param options server configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptions)
    */
  open class Server_[A] ()
    extends typings.hapiHapi.libTypesServerMod.Server_[A] {
    def this(options: ServerOptions) = this()
  }
  
  inline def server[A](): typings.hapiHapi.libTypesServerServerMod.Server_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[typings.hapiHapi.libTypesServerServerMod.Server_[A]]
  inline def server[A](opts: ServerOptions): typings.hapiHapi.libTypesServerServerMod.Server_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.hapiHapi.libTypesServerServerMod.Server_[A]]
  
  object Utils {
    
    type Dictionary[T] = StringDictionary[T]
    
    /* Rewritten from type alias, can be one of: 
      - typings.hapiHapi.hapiHapiStrings.HEAD
      - typings.hapiHapi.hapiHapiStrings.head_
      - typings.hapiHapi.libTypesMod.Utils.HTTP_METHODS_PARTIAL
    */
    type HTTP_METHODS = _HTTP_METHODS | HTTP_METHODS_PARTIAL
    
    type HTTP_METHODS_PARTIAL = Uppercase[HTTP_METHODS_PARTIAL_LOWERCASE] | HTTP_METHODS_PARTIAL_LOWERCASE
    
    /* Rewritten from type alias, can be one of: 
      - typings.hapiHapi.hapiHapiStrings.get_
      - typings.hapiHapi.hapiHapiStrings.post_
      - typings.hapiHapi.hapiHapiStrings.put_
      - typings.hapiHapi.hapiHapiStrings.patch_
      - typings.hapiHapi.hapiHapiStrings.delete_
      - typings.hapiHapi.hapiHapiStrings.options_
    */
    trait HTTP_METHODS_PARTIAL_LOWERCASE extends StObject
    object HTTP_METHODS_PARTIAL_LOWERCASE {
      
      inline def delete: delete_ = "delete".asInstanceOf[delete_]
      
      inline def get: get_ = "get".asInstanceOf[get_]
      
      inline def options: options_ = "options".asInstanceOf[options_]
      
      inline def patch: patch_ = "patch".asInstanceOf[patch_]
      
      inline def post: post_ = "post".asInstanceOf[post_]
      
      inline def put: put_ = "put".asInstanceOf[put_]
    }
    
    trait _HTTP_METHODS extends StObject
  }
}
