package typings.koaCsrf

import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisableQuery extends StObject {
    
    var disableQuery: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* ctx */ Context, scala.Nothing]] = js.undefined
    
    var excludedMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoredPathGlobs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DisableQuery {
    
    inline def apply(): DisableQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableQuery]
    }
    
    extension [Self <: DisableQuery](x: Self) {
      
      inline def setDisableQuery(value: Boolean): Self = StObject.set(x, "disableQuery", value.asInstanceOf[js.Any])
      
      inline def setDisableQueryUndefined: Self = StObject.set(x, "disableQuery", js.undefined)
      
      inline def setErrorHandler(value: /* ctx */ Context => scala.Nothing): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setExcludedMethods(value: js.Array[String]): Self = StObject.set(x, "excludedMethods", value.asInstanceOf[js.Any])
      
      inline def setExcludedMethodsUndefined: Self = StObject.set(x, "excludedMethods", js.undefined)
      
      inline def setExcludedMethodsVarargs(value: String*): Self = StObject.set(x, "excludedMethods", js.Array(value*))
      
      inline def setIgnoredPathGlobs(value: js.Array[String]): Self = StObject.set(x, "ignoredPathGlobs", value.asInstanceOf[js.Any])
      
      inline def setIgnoredPathGlobsUndefined: Self = StObject.set(x, "ignoredPathGlobs", js.undefined)
      
      inline def setIgnoredPathGlobsVarargs(value: String*): Self = StObject.set(x, "ignoredPathGlobs", js.Array(value*))
    }
  }
}
