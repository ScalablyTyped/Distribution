package typings.ibmDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Outparams extends StObject {
    
    var outparams: js.Any = js.native
    
    var result: js.Array[_] = js.native
  }
  object Outparams {
    
    @scala.inline
    def apply(outparams: js.Any, result: js.Array[_]): Outparams = {
      val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Outparams]
    }
    
    @scala.inline
    implicit class OutparamsMutableBuilder[Self <: Outparams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutparams(value: js.Any): Self = StObject.set(x, "outparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Array[_]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVarargs(value: js.Any*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var params: js.Array[_] = js.native
    
    var sql: String = js.native
  }
  object Params {
    
    @scala.inline
    def apply(params: js.Array[_], sql: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
}
