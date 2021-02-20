package typings.jsonata

import typings.std.Date
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonata", JSImport.Namespace)
  @js.native
  def apply(str: String): Expression = js.native
  
  @js.native
  trait Environment extends StObject {
    
    val async: Boolean = js.native
    
    def bind(name: String, value: js.Any): Unit = js.native
    
    def lookup(name: String): js.Any = js.native
    
    val timestamp: Date = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(async: Boolean, bind: (String, js.Any) => Unit, lookup: String => js.Any, timestamp: Date): Environment = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), lookup = js.Any.fromFunction1(lookup), timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBind(value: (String, js.Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExprNode extends StObject {
    
    var arguments: js.UndefOr[js.Array[ExprNode]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var procedure: js.UndefOr[ExprNode] = js.native
    
    var steps: js.UndefOr[js.Array[ExprNode]] = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object ExprNode {
    
    @scala.inline
    def apply(`type`: String): ExprNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprNode]
    }
    
    @scala.inline
    implicit class ExprNodeMutableBuilder[Self <: ExprNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[ExprNode]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setArgumentsVarargs(value: ExprNode*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setProcedure(value: ExprNode): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[ExprNode]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: ExprNode*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Expression extends StObject {
    
    def assign(name: String, value: js.Any): Unit = js.native
    
    def ast(): ExprNode = js.native
    
    def evaluate(input: js.Any): js.Any = js.native
    def evaluate(
      input: js.Any,
      bindings: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
    ): Unit = js.native
    def evaluate(input: js.Any, bindings: Record[String, _]): js.Any = js.native
    def evaluate(
      input: js.Any,
      bindings: Record[String, _],
      callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
    ): Unit = js.native
    
    def registerFunction(name: String, implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, _]): Unit = js.native
    def registerFunction(
      name: String,
      implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, _],
      signature: String
    ): Unit = js.native
  }
  
  @js.native
  trait Focus extends StObject {
    
    val environment: Environment = js.native
    
    val input: js.Any = js.native
  }
  object Focus {
    
    @scala.inline
    def apply(environment: Environment, input: js.Any): Focus = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsonataError extends Error {
    
    var code: String = js.native
    
    var position: Double = js.native
    
    var token: String = js.native
  }
  object JsonataError {
    
    @scala.inline
    def apply(code: String, message: String, name: String, position: Double, token: String): JsonataError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonataError]
    }
    
    @scala.inline
    implicit class JsonataErrorMutableBuilder[Self <: JsonataError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
