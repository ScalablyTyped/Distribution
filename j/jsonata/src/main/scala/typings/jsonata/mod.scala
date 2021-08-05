package typings.jsonata

import typings.std.Date
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): Expression = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  @JSImport("jsonata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Environment extends StObject {
    
    val async: Boolean
    
    def bind(name: String, value: js.Any): Unit
    
    def lookup(name: String): js.Any
    
    val timestamp: Date
  }
  object Environment {
    
    inline def apply(async: Boolean, bind: (String, js.Any) => Unit, lookup: String => js.Any, timestamp: Date): Environment = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), lookup = js.Any.fromFunction1(lookup), timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    extension [Self <: Environment](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setBind(value: (String, js.Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExprNode extends StObject {
    
    var arguments: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var procedure: js.UndefOr[ExprNode] = js.undefined
    
    var steps: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object ExprNode {
    
    inline def apply(`type`: String): ExprNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprNode]
    }
    
    extension [Self <: ExprNode](x: Self) {
      
      inline def setArguments(value: js.Array[ExprNode]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: ExprNode*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProcedure(value: ExprNode): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
      
      inline def setSteps(value: js.Array[ExprNode]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: ExprNode*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Expression extends StObject {
    
    def assign(name: String, value: js.Any): Unit = js.native
    
    def ast(): ExprNode = js.native
    
    def evaluate(input: js.Any): js.Any = js.native
    def evaluate(
      input: js.Any,
      bindings: Unit,
      callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
    ): Unit = js.native
    def evaluate(input: js.Any, bindings: Record[String, js.Any]): js.Any = js.native
    def evaluate(
      input: js.Any,
      bindings: Record[String, js.Any],
      callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
    ): Unit = js.native
    
    def registerFunction(name: String, implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, js.Any]): Unit = js.native
    def registerFunction(
      name: String,
      implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, js.Any],
      signature: String
    ): Unit = js.native
  }
  
  trait Focus extends StObject {
    
    val environment: Environment
    
    val input: js.Any
  }
  object Focus {
    
    inline def apply(environment: Environment, input: js.Any): Focus = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus]
    }
    
    extension [Self <: Focus](x: Self) {
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonataError
    extends StObject
       with Error {
    
    var code: String
    
    var position: Double
    
    var token: String
  }
  object JsonataError {
    
    inline def apply(code: String, message: String, name: String, position: Double, token: String): JsonataError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonataError]
    }
    
    extension [Self <: JsonataError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
