package typings.lezerGenerator

import org.scalablytyped.runtime.NumberDictionary
import typings.lezerGenerator.distGrammarMod.Term
import typings.lezerGenerator.distNodeMod.Expression
import typings.lezerGenerator.distNodeMod.Identifier
import typings.lezerGenerator.distNodeMod.Prop
import typings.lezerGenerator.distNodeMod.RuleDeclaration
import typings.lezerGenerator.lezerGeneratorStrings.cut
import typings.lezerGenerator.lezerGeneratorStrings.left
import typings.lezerGenerator.lezerGeneratorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ch extends StObject {
    
    var ch: Double
    
    var line: Double
  }
  object Ch {
    
    inline def apply(ch: Double, line: Double): Ch = {
      val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ch] (val x: Self) extends AnyVal {
      
      inline def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var config: js.Object
    
    var configStr: String
    
    var expected: String
    
    var name: String
    
    def run(parser: typings.lezerCommon.mod.Parser): Unit
    
    var strict: Boolean
    
    var text: String
  }
  object Config {
    
    inline def apply(
      config: js.Object,
      configStr: String,
      expected: String,
      name: String,
      run: typings.lezerCommon.mod.Parser => Unit,
      strict: Boolean,
      text: String
    ): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configStr = configStr.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), strict = strict.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigStr(value: String): Self = StObject.set(x, "configStr", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRun(value: typings.lezerCommon.mod.Parser => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dicti
    extends StObject
       with /* i */ NumberDictionary[Double] {
    
    var length: Double
  }
  object Dicti {
    
    inline def apply(length: Double): Dicti = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dicti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dicti] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expr extends StObject {
    
    var expr: Expression
    
    var rules: js.Array[RuleDeclaration]
    
    var topRules: js.Array[RuleDeclaration]
  }
  object Expr {
    
    inline def apply(expr: Expression, rules: js.Array[RuleDeclaration], topRules: js.Array[RuleDeclaration]): Expr = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], topRules = topRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expr] (val x: Self) extends AnyVal {
      
      inline def setExpr(value: Expression): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[RuleDeclaration]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: RuleDeclaration*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setTopRules(value: js.Array[RuleDeclaration]): Self = StObject.set(x, "topRules", value.asInstanceOf[js.Any])
      
      inline def setTopRulesVarargs(value: RuleDeclaration*): Self = StObject.set(x, "topRules", js.Array(value*))
    }
  }
  
  trait Id extends StObject {
    
    var id: Identifier
    
    var `type`: left | right | cut | Null
  }
  object Id {
    
    inline def apply(id: Identifier): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: left | right | cut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait IdProps extends StObject {
    
    var id: Identifier
    
    var props: js.Array[Prop]
  }
  object IdProps {
    
    inline def apply(id: Identifier, props: js.Array[Prop]): IdProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdProps] (val x: Self) extends AnyVal {
      
      inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Array[Prop]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: Prop*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
  
  trait MaxTerm extends StObject {
    
    var maxTerm: Double
    
    var minRepeatTerm: Double
    
    var names: NumberDictionary[String]
    
    var nodeTypes: js.Array[Term]
  }
  object MaxTerm {
    
    inline def apply(maxTerm: Double, minRepeatTerm: Double, names: NumberDictionary[String], nodeTypes: js.Array[Term]): MaxTerm = {
      val __obj = js.Dynamic.literal(maxTerm = maxTerm.asInstanceOf[js.Any], minRepeatTerm = minRepeatTerm.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], nodeTypes = nodeTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxTerm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxTerm] (val x: Self) extends AnyVal {
      
      inline def setMaxTerm(value: Double): Self = StObject.set(x, "maxTerm", value.asInstanceOf[js.Any])
      
      inline def setMinRepeatTerm(value: Double): Self = StObject.set(x, "minRepeatTerm", value.asInstanceOf[js.Any])
      
      inline def setNames(value: NumberDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNodeTypes(value: js.Array[Term]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setNodeTypesVarargs(value: Term*): Self = StObject.set(x, "nodeTypes", js.Array(value*))
    }
  }
  
  trait Parser extends StObject {
    
    var parser: String
    
    var terms: String
  }
  object Parser {
    
    inline def apply(parser: String, terms: String): Parser = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    val id: Identifier
    
    val props: js.Array[Prop]
  }
  object Props {
    
    inline def apply(id: Identifier, props: js.Array[Prop]): Props = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Array[Prop]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: Prop*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
}
