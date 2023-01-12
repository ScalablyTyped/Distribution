package typings.ibmDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Outparams extends StObject {
    
    var outparams: Any
    
    var result: js.Array[Any]
  }
  object Outparams {
    
    inline def apply(outparams: Any, result: js.Array[Any]): Outparams = {
      val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Outparams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Outparams] (val x: Self) extends AnyVal {
      
      inline def setOutparams(value: Any): Self = StObject.set(x, "outparams", value.asInstanceOf[js.Any])
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
    }
  }
  
  trait Params extends StObject {
    
    var params: js.Array[Any]
    
    var sql: String
  }
  object Params {
    
    inline def apply(params: js.Array[Any], sql: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
}
