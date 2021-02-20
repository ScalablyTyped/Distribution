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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("host-validation", JSImport.Namespace)
  @js.native
  def apply(opts: config): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @js.native
  trait config extends StObject {
    
    var fail: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* next */ NextFunction, 
          Unit
        ]
      ] = js.native
    
    var hosts: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var mode: js.UndefOr[both | either] = js.native
    
    var referers: js.UndefOr[js.Array[String | RegExp]] = js.native
  }
  object config {
    
    @scala.inline
    def apply(): config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[config]
    }
    
    @scala.inline
    implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFail(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "fail", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setHosts(value: js.Array[String | RegExp]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: both | either): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setReferers(value: js.Array[String | RegExp]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
      
      @scala.inline
      def setReferersVarargs(value: (String | RegExp)*): Self = StObject.set(x, "referers", js.Array(value :_*))
    }
  }
}
