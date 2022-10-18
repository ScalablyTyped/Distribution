package typings.inversifyExpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstantsMod {
  
  @JSImport("inversify-express-utils/lib/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify-express-utils/lib/constants", "DEFAULT_ROUTING_ROOT_PATH")
  @js.native
  val DEFAULT_ROUTING_ROOT_PATH: /* "/" */ String = js.native
  
  inline def DUPLICATED_CONTROLLER_NAME(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DUPLICATED_CONTROLLER_NAME")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  sealed trait HTTP_VERBS_ENUM extends StObject
  @JSImport("inversify-express-utils/lib/constants", "HTTP_VERBS_ENUM")
  @js.native
  object HTTP_VERBS_ENUM extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HTTP_VERBS_ENUM & String] = js.native
    
    @js.native
    sealed trait all
      extends StObject
         with HTTP_VERBS_ENUM
    /* "ALL" */ val all: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.all & String = js.native
    
    @js.native
    sealed trait connect
      extends StObject
         with HTTP_VERBS_ENUM
    /* "CONNECT" */ val connect: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.connect & String = js.native
    
    @js.native
    sealed trait delete
      extends StObject
         with HTTP_VERBS_ENUM
    /* "DELETE" */ val delete: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.delete & String = js.native
    
    @js.native
    sealed trait get
      extends StObject
         with HTTP_VERBS_ENUM
    /* "GET" */ val get: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.get & String = js.native
    
    @js.native
    sealed trait head
      extends StObject
         with HTTP_VERBS_ENUM
    /* "HEAD" */ val head: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.head & String = js.native
    
    @js.native
    sealed trait options
      extends StObject
         with HTTP_VERBS_ENUM
    /* "OPTIONS" */ val options: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.options & String = js.native
    
    @js.native
    sealed trait patch
      extends StObject
         with HTTP_VERBS_ENUM
    /* "PATCH" */ val patch: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.patch & String = js.native
    
    @js.native
    sealed trait post
      extends StObject
         with HTTP_VERBS_ENUM
    /* "POST" */ val post: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.post & String = js.native
    
    @js.native
    sealed trait propfind
      extends StObject
         with HTTP_VERBS_ENUM
    /* "PROPFIND" */ val propfind: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.propfind & String = js.native
    
    @js.native
    sealed trait put
      extends StObject
         with HTTP_VERBS_ENUM
    /* "PUT" */ val put: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.put & String = js.native
    
    @js.native
    sealed trait trace
      extends StObject
         with HTTP_VERBS_ENUM
    /* "TRACE" */ val trace: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.trace & String = js.native
  }
  
  object METADATA_KEY {
    
    @JSImport("inversify-express-utils/lib/constants", "METADATA_KEY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils/lib/constants", "METADATA_KEY.controller")
    @js.native
    def controller: String = js.native
    
    @JSImport("inversify-express-utils/lib/constants", "METADATA_KEY.controllerMethod")
    @js.native
    def controllerMethod: String = js.native
    inline def controllerMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/lib/constants", "METADATA_KEY.controllerParameter")
    @js.native
    def controllerParameter: String = js.native
    inline def controllerParameter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerParameter")(x.asInstanceOf[js.Any])
    
    inline def controller_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/lib/constants", "METADATA_KEY.httpContext")
    @js.native
    def httpContext: String = js.native
    inline def httpContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inversify-express-utils/lib/constants", "NO_CONTROLLERS_FOUND")
  @js.native
  val NO_CONTROLLERS_FOUND: /* "No controllers have been found! Please ensure that you have register at least one Controller." */ String = js.native
  
  @js.native
  sealed trait PARAMETER_TYPE extends StObject
  @JSImport("inversify-express-utils/lib/constants", "PARAMETER_TYPE")
  @js.native
  object PARAMETER_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PARAMETER_TYPE & Double] = js.native
    
    @js.native
    sealed trait BODY
      extends StObject
         with PARAMETER_TYPE
    /* 4 */ val BODY: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.BODY & Double = js.native
    
    @js.native
    sealed trait COOKIES
      extends StObject
         with PARAMETER_TYPE
    /* 6 */ val COOKIES: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.COOKIES & Double = js.native
    
    @js.native
    sealed trait HEADERS
      extends StObject
         with PARAMETER_TYPE
    /* 5 */ val HEADERS: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.HEADERS & Double = js.native
    
    @js.native
    sealed trait NEXT
      extends StObject
         with PARAMETER_TYPE
    /* 7 */ val NEXT: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.NEXT & Double = js.native
    
    @js.native
    sealed trait PARAMS
      extends StObject
         with PARAMETER_TYPE
    /* 2 */ val PARAMS: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.PARAMS & Double = js.native
    
    @js.native
    sealed trait PRINCIPAL
      extends StObject
         with PARAMETER_TYPE
    /* 8 */ val PRINCIPAL: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.PRINCIPAL & Double = js.native
    
    @js.native
    sealed trait QUERY
      extends StObject
         with PARAMETER_TYPE
    /* 3 */ val QUERY: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.QUERY & Double = js.native
    
    @js.native
    sealed trait REQUEST
      extends StObject
         with PARAMETER_TYPE
    /* 0 */ val REQUEST: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.REQUEST & Double = js.native
    
    @js.native
    sealed trait RESPONSE
      extends StObject
         with PARAMETER_TYPE
    /* 1 */ val RESPONSE: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.RESPONSE & Double = js.native
  }
  
  object TYPE {
    
    @JSImport("inversify-express-utils/lib/constants", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils/lib/constants", "TYPE.AuthProvider")
    @js.native
    def AuthProvider: js.Symbol = js.native
    inline def AuthProvider_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/lib/constants", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    inline def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils/lib/constants", "TYPE.HttpContext")
    @js.native
    def HttpContext: js.Symbol = js.native
    inline def HttpContext_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
  }
}
