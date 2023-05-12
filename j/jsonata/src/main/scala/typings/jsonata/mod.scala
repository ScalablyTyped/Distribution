package typings.jsonata

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): Expression = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def apply(str: String, options: JsonataOptions): Expression = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  @JSImport("jsonata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Environment extends StObject {
    
    val async: Boolean
    
    def bind(name: String, value: Any): Unit
    
    def lookup(name: String): Any
    
    val timestamp: js.Date
  }
  object Environment {
    
    inline def apply(async: Boolean, bind: (String, Any) => Unit, lookup: String => Any, timestamp: js.Date): Environment = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), lookup = js.Any.fromFunction1(lookup), timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setBind(value: (String, Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setLookup(value: String => Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExprNode extends StObject {
    
    var arguments: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var expressions: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var lhs: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var procedure: js.UndefOr[ExprNode] = js.undefined
    
    var rhs: js.UndefOr[ExprNode] = js.undefined
    
    var stages: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var steps: js.UndefOr[js.Array[ExprNode]] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ExprNode {
    
    inline def apply(`type`: String): ExprNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExprNode] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Array[ExprNode]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: ExprNode*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setExpressions(value: js.Array[ExprNode]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      inline def setExpressionsVarargs(value: ExprNode*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setLhs(value: js.Array[ExprNode]): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      inline def setLhsUndefined: Self = StObject.set(x, "lhs", js.undefined)
      
      inline def setLhsVarargs(value: ExprNode*): Self = StObject.set(x, "lhs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProcedure(value: ExprNode): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
      
      inline def setRhs(value: ExprNode): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
      
      inline def setRhsUndefined: Self = StObject.set(x, "rhs", js.undefined)
      
      inline def setStages(value: js.Array[ExprNode]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
      
      inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
      
      inline def setStagesVarargs(value: ExprNode*): Self = StObject.set(x, "stages", js.Array(value*))
      
      inline def setSteps(value: js.Array[ExprNode]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: ExprNode*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Expression extends StObject {
    
    def assign(name: String, value: Any): Unit = js.native
    
    def ast(): ExprNode = js.native
    
    def evaluate(input: Any): js.Promise[Any] = js.native
    def evaluate(input: Any, bindings: Unit, callback: js.Function2[/* err */ JsonataError, /* resp */ Any, Unit]): Unit = js.native
    def evaluate(input: Any, bindings: Record[String, Any]): js.Promise[Any] = js.native
    def evaluate(
      input: Any,
      bindings: Record[String, Any],
      callback: js.Function2[/* err */ JsonataError, /* resp */ Any, Unit]
    ): Unit = js.native
    
    def registerFunction(name: String, implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ Any, Any]): Unit = js.native
    def registerFunction(
      name: String,
      implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ Any, Any],
      signature: String
    ): Unit = js.native
  }
  
  trait Focus extends StObject {
    
    val environment: Environment
    
    val input: Any
  }
  object Focus {
    
    inline def apply(environment: Environment, input: Any): Focus = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonataError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonataOptions extends StObject {
    
    var RegexEngine: js.UndefOr[js.RegExp] = js.undefined
    
    var recover: js.UndefOr[Boolean] = js.undefined
  }
  object JsonataOptions {
    
    inline def apply(): JsonataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonataOptions] (val x: Self) extends AnyVal {
      
      inline def setRecover(value: Boolean): Self = StObject.set(x, "recover", value.asInstanceOf[js.Any])
      
      inline def setRecoverUndefined: Self = StObject.set(x, "recover", js.undefined)
      
      inline def setRegexEngine(value: js.RegExp): Self = StObject.set(x, "RegexEngine", value.asInstanceOf[js.Any])
      
      inline def setRegexEngineUndefined: Self = StObject.set(x, "RegexEngine", js.undefined)
    }
  }
}
