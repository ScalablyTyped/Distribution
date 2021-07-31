package typings.ibmDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Outparams extends StObject {
    
    var outparams: js.Any
    
    var result: js.Array[js.Any]
  }
  object Outparams {
    
    @scala.inline
    def apply(outparams: js.Any, result: js.Array[js.Any]): Outparams = {
      val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Outparams]
    }
    
    @scala.inline
    implicit class OutparamsMutableBuilder[Self <: Outparams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutparams(value: js.Any): Self = StObject.set(x, "outparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Array[js.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVarargs(value: js.Any*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
  
  trait Params extends StObject {
    
    var params: js.Array[js.Any]
    
    var sql: String
  }
  object Params {
    
    @scala.inline
    def apply(params: js.Array[js.Any], sql: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
}
