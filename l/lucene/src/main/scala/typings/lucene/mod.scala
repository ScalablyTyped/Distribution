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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lucene", "parse")
  @js.native
  def parse(query: String): AST = js.native
  
  @JSImport("lucene", "phrase")
  @js.native
  val phrase: Parser = js.native
  
  @JSImport("lucene", "term")
  @js.native
  val term: Parser = js.native
  
  @JSImport("lucene", "toString")
  @js.native
  def toString_(ast: AST): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.lucene.mod.LeftOnlyAST
    - typings.lucene.mod.BinaryAST
  */
  trait AST extends StObject
  object AST {
    
    @scala.inline
    def BinaryAST(left: AST | Node, operator: Operator, right: AST | Node): typings.lucene.mod.BinaryAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.BinaryAST]
    }
    
    @scala.inline
    def LeftOnlyAST(left: Node): typings.lucene.mod.LeftOnlyAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.LeftOnlyAST]
    }
  }
  
  @js.native
  trait BinaryAST extends AST {
    
    var left: AST | Node = js.native
    
    var operator: Operator = js.native
    
    var right: AST | Node = js.native
  }
  object BinaryAST {
    
    @scala.inline
    def apply(left: AST | Node, operator: Operator, right: AST | Node): BinaryAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryAST]
    }
    
    @scala.inline
    implicit class BinaryASTMutableBuilder[Self <: BinaryAST] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: AST | Node): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: Operator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: AST | Node): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LeftOnlyAST extends AST {
    
    var left: Node = js.native
    
    var start: js.UndefOr[Operator] = js.native
  }
  object LeftOnlyAST {
    
    @scala.inline
    def apply(left: Node): LeftOnlyAST = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftOnlyAST]
    }
    
    @scala.inline
    implicit class LeftOnlyASTMutableBuilder[Self <: LeftOnlyAST] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Node): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Operator): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lucene.mod.NodeTerm
    - typings.lucene.mod.NodeRangedTerm
  */
  trait Node extends StObject
  object Node {
    
    @scala.inline
    def NodeRangedTerm(
      field: String | LessthansignimplicitGreaterthansign,
      inclusive: both | none | left | right,
      term_max: String,
      term_min: String
    ): typings.lucene.mod.NodeRangedTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.NodeRangedTerm]
    }
    
    @scala.inline
    def NodeTerm(
      field: String | LessthansignimplicitGreaterthansign,
      quoted: Boolean,
      regex: Boolean,
      term: String,
      termLocation: Start
    ): typings.lucene.mod.NodeTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lucene.mod.NodeTerm]
    }
  }
  
  @js.native
  trait NodeField extends StObject {
    
    var field: String | LessthansignimplicitGreaterthansign = js.native
    
    var fieldLocation: Null | End = js.native
  }
  object NodeField {
    
    @scala.inline
    def apply(field: String | LessthansignimplicitGreaterthansign): NodeField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeField]
    }
    
    @scala.inline
    implicit class NodeFieldMutableBuilder[Self <: NodeField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | LessthansignimplicitGreaterthansign): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldLocation(value: End): Self = StObject.set(x, "fieldLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldLocationNull: Self = StObject.set(x, "fieldLocation", null)
    }
  }
  
  @js.native
  trait NodeRangedTerm
    extends NodeField
       with Node {
    
    var inclusive: both | none | left | right = js.native
    
    var term_max: String = js.native
    
    var term_min: String = js.native
  }
  object NodeRangedTerm {
    
    @scala.inline
    def apply(
      field: String | LessthansignimplicitGreaterthansign,
      inclusive: both | none | left | right,
      term_max: String,
      term_min: String
    ): NodeRangedTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeRangedTerm]
    }
    
    @scala.inline
    implicit class NodeRangedTermMutableBuilder[Self <: NodeRangedTerm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInclusive(value: both | none | left | right): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerm_max(value: String): Self = StObject.set(x, "term_max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerm_min(value: String): Self = StObject.set(x, "term_min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeTerm
    extends NodeField
       with Node {
    
    var boost: Null | Double = js.native
    
    var prefix: Null | String = js.native
    
    var quoted: Boolean = js.native
    
    var regex: Boolean = js.native
    
    var similarity: Null | Double = js.native
    
    var term: String = js.native
    
    var termLocation: Start = js.native
  }
  object NodeTerm {
    
    @scala.inline
    def apply(
      field: String | LessthansignimplicitGreaterthansign,
      quoted: Boolean,
      regex: Boolean,
      term: String,
      termLocation: Start
    ): NodeTerm = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTerm]
    }
    
    @scala.inline
    implicit class NodeTermMutableBuilder[Self <: NodeTerm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoostNull: Self = StObject.set(x, "boost", null)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      @scala.inline
      def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimilarity(value: Double): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimilarityNull: Self = StObject.set(x, "similarity", null)
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermLocation(value: Start): Self = StObject.set(x, "termLocation", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def AND: typings.lucene.luceneStrings.AND = "AND".asInstanceOf[typings.lucene.luceneStrings.AND]
    
    @scala.inline
    def `AND NOT`: typings.lucene.luceneStrings.`AND NOT` = ("AND NOT").asInstanceOf[typings.lucene.luceneStrings.`AND NOT`]
    
    @scala.inline
    def LessthansignimplicitGreaterthansign: typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign = "<implicit>".asInstanceOf[typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign]
    
    @scala.inline
    def NOT: typings.lucene.luceneStrings.NOT = "NOT".asInstanceOf[typings.lucene.luceneStrings.NOT]
    
    @scala.inline
    def OR: typings.lucene.luceneStrings.OR = "OR".asInstanceOf[typings.lucene.luceneStrings.OR]
    
    @scala.inline
    def `OR NOT`: typings.lucene.luceneStrings.`OR NOT` = ("OR NOT").asInstanceOf[typings.lucene.luceneStrings.`OR NOT`]
  }
  
  @js.native
  trait Parser extends StObject {
    
    def escape(str: String): String = js.native
    
    def unescape(str: String): String = js.native
  }
  object Parser {
    
    @scala.inline
    def apply(escape: String => String, unescape: String => String): Parser = {
      val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), unescape = js.Any.fromFunction1(unescape))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnescape(value: String => String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TermLocation extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object TermLocation {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): TermLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermLocation]
    }
    
    @scala.inline
    implicit class TermLocationMutableBuilder[Self <: TermLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
