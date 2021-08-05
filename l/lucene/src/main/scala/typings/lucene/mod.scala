package typings.lucene

import typings.lucene.anon.End
import typings.lucene.anon.Start
import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import typings.lucene.luceneStrings.both
import typings.lucene.luceneStrings.left
import typings.lucene.luceneStrings.none
import typings.lucene.luceneStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lucene", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(query: String): AST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[AST]
  
  @JSImport("lucene", "phrase")
  @js.native
  val phrase: Parser = js.native
  
  @JSImport("lucene", "term")
  @js.native
  val term: Parser = js.native
  
  inline def toString_(ast: AST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lucene.mod.LeftOnlyAST
    - typings.lucene.mod.BinaryAST
  */
  trait AST extends StObject
  object AST {
    
    inline def BinaryAST(left: AST | Node, operator: Operator, right: AST | Node): typings.lucene.mod.BinaryAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.BinaryAST]
    }
    
    inline def LeftOnlyAST(left: Node): typings.lucene.mod.LeftOnlyAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.LeftOnlyAST]
    }
  }
  
  trait BinaryAST
    extends StObject
       with AST {
    
    var left: AST | Node
    
    var operator: Operator
    
    var right: AST | Node
  }
  object BinaryAST {
    
    inline def apply(left: AST | Node, operator: Operator, right: AST | Node): BinaryAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryAST]
    }
    
    extension [Self <: BinaryAST](x: Self) {
      
      inline def setLeft(value: AST | Node): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: Operator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setRight(value: AST | Node): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait LeftOnlyAST
    extends StObject
       with AST {
    
    var left: Node
    
    var start: js.UndefOr[Operator] = js.undefined
  }
  object LeftOnlyAST {
    
    inline def apply(left: Node): LeftOnlyAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftOnlyAST]
    }
    
    extension [Self <: LeftOnlyAST](x: Self) {
      
      inline def setLeft(value: Node): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Operator): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lucene.mod.NodeTerm
    - typings.lucene.mod.NodeRangedTerm
  */
  trait Node extends StObject
  object Node {
    
    inline def NodeRangedTerm(
      field: String | LessthansignimplicitGreaterthansign,
      inclusive: both | none | left | right,
      term_max: String,
      term_min: String
    ): typings.lucene.mod.NodeRangedTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any], fieldLocation = null)
      __obj.asInstanceOf[typings.lucene.mod.NodeRangedTerm]
    }
    
    inline def NodeTerm(
      field: String | LessthansignimplicitGreaterthansign,
      quoted: Boolean,
      regex: Boolean,
      term: String,
      termLocation: Start
    ): typings.lucene.mod.NodeTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any], boost = null, fieldLocation = null, prefix = null, similarity = null)
      __obj.asInstanceOf[typings.lucene.mod.NodeTerm]
    }
  }
  
  trait NodeField extends StObject {
    
    var field: String | LessthansignimplicitGreaterthansign
    
    var fieldLocation: Null | End
  }
  object NodeField {
    
    inline def apply(field: String | LessthansignimplicitGreaterthansign): NodeField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = null)
      __obj.asInstanceOf[NodeField]
    }
    
    extension [Self <: NodeField](x: Self) {
      
      inline def setField(value: String | LessthansignimplicitGreaterthansign): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldLocation(value: End): Self = StObject.set(x, "fieldLocation", value.asInstanceOf[js.Any])
      
      inline def setFieldLocationNull: Self = StObject.set(x, "fieldLocation", null)
    }
  }
  
  trait NodeRangedTerm
    extends StObject
       with NodeField
       with Node {
    
    var inclusive: both | none | left | right
    
    var term_max: String
    
    var term_min: String
  }
  object NodeRangedTerm {
    
    inline def apply(
      field: String | LessthansignimplicitGreaterthansign,
      inclusive: both | none | left | right,
      term_max: String,
      term_min: String
    ): NodeRangedTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any], fieldLocation = null)
      __obj.asInstanceOf[NodeRangedTerm]
    }
    
    extension [Self <: NodeRangedTerm](x: Self) {
      
      inline def setInclusive(value: both | none | left | right): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setTerm_max(value: String): Self = StObject.set(x, "term_max", value.asInstanceOf[js.Any])
      
      inline def setTerm_min(value: String): Self = StObject.set(x, "term_min", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeTerm
    extends StObject
       with NodeField
       with Node {
    
    var boost: Null | Double
    
    var prefix: Null | String
    
    var quoted: Boolean
    
    var regex: Boolean
    
    var similarity: Null | Double
    
    var term: String
    
    var termLocation: Start
  }
  object NodeTerm {
    
    inline def apply(
      field: String | LessthansignimplicitGreaterthansign,
      quoted: Boolean,
      regex: Boolean,
      term: String,
      termLocation: Start
    ): NodeTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any], boost = null, fieldLocation = null, prefix = null, similarity = null)
      __obj.asInstanceOf[NodeTerm]
    }
    
    extension [Self <: NodeTerm](x: Self) {
      
      inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      inline def setBoostNull: Self = StObject.set(x, "boost", null)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setSimilarity(value: Double): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
      
      inline def setSimilarityNull: Self = StObject.set(x, "similarity", null)
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermLocation(value: Start): Self = StObject.set(x, "termLocation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
    - typings.lucene.luceneStrings.NOT
    - typings.lucene.luceneStrings.OR
    - typings.lucene.luceneStrings.AND
    - typings.lucene.luceneStrings.`AND NOT`
    - typings.lucene.luceneStrings.`OR NOT`
  */
  trait Operator extends StObject
  object Operator {
    
    inline def AND: typings.lucene.luceneStrings.AND = "AND".asInstanceOf[typings.lucene.luceneStrings.AND]
    
    inline def `AND NOT`: typings.lucene.luceneStrings.`AND NOT` = ("AND NOT").asInstanceOf[typings.lucene.luceneStrings.`AND NOT`]
    
    inline def LessthansignimplicitGreaterthansign: typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign = "<implicit>".asInstanceOf[typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign]
    
    inline def NOT: typings.lucene.luceneStrings.NOT = "NOT".asInstanceOf[typings.lucene.luceneStrings.NOT]
    
    inline def OR: typings.lucene.luceneStrings.OR = "OR".asInstanceOf[typings.lucene.luceneStrings.OR]
    
    inline def `OR NOT`: typings.lucene.luceneStrings.`OR NOT` = ("OR NOT").asInstanceOf[typings.lucene.luceneStrings.`OR NOT`]
  }
  
  trait Parser extends StObject {
    
    def escape(str: String): String
    
    def unescape(str: String): String
  }
  object Parser {
    
    inline def apply(escape: String => String, unescape: String => String): Parser = {
      val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), unescape = js.Any.fromFunction1(unescape))
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setUnescape(value: String => String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
    }
  }
  
  trait TermLocation extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object TermLocation {
    
    inline def apply(column: Double, line: Double, offset: Double): TermLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermLocation]
    }
    
    extension [Self <: TermLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
