package typings.hostValidation

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.hostValidation.hostValidationStrings.both
import typings.hostValidation.hostValidationStrings.either
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: config): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  @JSImport("host-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait config extends StObject {
    
    var fail: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* res */ Response_[js.Any], 
          /* next */ NextFunction, 
          Unit
        ]
      ] = js.undefined
    
    var hosts: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var mode: js.UndefOr[both | either] = js.undefined
    
    var referers: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  }
  object config {
    
    inline def apply(): config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[config]
    }
    
    extension [Self <: config](x: Self) {
      
      inline def setFail(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "fail", js.Any.fromFunction3(value))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setHosts(value: js.Array[String | RegExp]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      inline def setMode(value: both | either): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReferers(value: js.Array[String | RegExp]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
      
      inline def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
      
      inline def setReferersVarargs(value: (String | RegExp)*): Self = StObject.set(x, "referers", js.Array(value :_*))
    }
  }
}
