package typings.jsonToAst

import typings.jsonToAst.jsonToAstStrings.Array
import typings.jsonToAst.jsonToAstStrings.Identifier
import typings.jsonToAst.jsonToAstStrings.Literal
import typings.jsonToAst.jsonToAstStrings.Object
import typings.jsonToAst.jsonToAstStrings.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-to-ast", JSImport.Namespace)
  @js.native
  def apply(json: String): ValueNode = js.native
  @JSImport("json-to-ast", JSImport.Namespace)
  @js.native
  def apply(json: String, settings: Options): ValueNode = js.native
  
  @js.native
  trait ASTNode extends StObject {
    
    var loc: js.UndefOr[Location] = js.native
    
    var `type`: String = js.native
  }
  object ASTNode {
    
    @scala.inline
    def apply(`type`: String): ASTNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    @scala.inline
    implicit class ASTNodeMutableBuilder[Self <: ASTNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArrayNode
    extends ASTNode
       with ValueNode {
    
    var children: js.Array[ValueNode] = js.native
    
    @JSName("type")
    var type_ArrayNode: Array = js.native
  }
  object ArrayNode {
    
    @scala.inline
    def apply(children: js.Array[ValueNode], `type`: Array): ArrayNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayNode]
    }
    
    @scala.inline
    implicit class ArrayNodeMutableBuilder[Self <: ArrayNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ValueNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ValueNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdentifierNode extends ASTNode {
    
    var raw: String = js.native
    
    @JSName("type")
    var type_IdentifierNode: Identifier = js.native
    
    var value: String = js.native
  }
  object IdentifierNode {
    
    @scala.inline
    def apply(raw: String, `type`: Identifier, value: String): IdentifierNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifierNode]
    }
    
    @scala.inline
    implicit class IdentifierNodeMutableBuilder[Self <: IdentifierNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LiteralNode
    extends ASTNode
       with ValueNode {
    
    var raw: String = js.native
    
    @JSName("type")
    var type_LiteralNode: Literal = js.native
    
    var value: String | Double | Boolean | Null = js.native
  }
  object LiteralNode {
    
    @scala.inline
    def apply(raw: String, `type`: Literal): LiteralNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralNode]
    }
    
    @scala.inline
    implicit class LiteralNodeMutableBuilder[Self <: LiteralNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    var end: Position = js.native
    
    var source: String | Null = js.native
    
    var start: Position = js.native
  }
  object Location {
    
    @scala.inline
    def apply(end: Position, start: Position): Location = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ObjectNode
    extends ASTNode
       with ValueNode {
    
    var children: js.Array[PropertyNode] = js.native
    
    @JSName("type")
    var type_ObjectNode: Object = js.native
  }
  object ObjectNode {
    
    @scala.inline
    def apply(children: js.Array[PropertyNode], `type`: Object): ObjectNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectNode]
    }
    
    @scala.inline
    implicit class ObjectNodeMutableBuilder[Self <: ObjectNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[PropertyNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: PropertyNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Appends location information.
      *
      * @default true
      */
    var loc: js.UndefOr[Boolean] = js.native
    
    /**
      * Appends source information to node’s location.
      *
      * @default null
      */
    var source: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropertyNode extends ASTNode {
    
    var key: IdentifierNode = js.native
    
    @JSName("type")
    var type_PropertyNode: Property = js.native
    
    var value: ValueNode = js.native
  }
  object PropertyNode {
    
    @scala.inline
    def apply(key: IdentifierNode, `type`: Property, value: ValueNode): PropertyNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyNode]
    }
    
    @scala.inline
    implicit class PropertyNodeMutableBuilder[Self <: PropertyNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: IdentifierNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ValueNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonToAst.mod.ObjectNode
    - typings.jsonToAst.mod.ArrayNode
    - typings.jsonToAst.mod.LiteralNode
  */
  trait ValueNode extends StObject
  object ValueNode {
    
    @scala.inline
    def ArrayNode(children: js.Array[ValueNode], `type`: Array): typings.jsonToAst.mod.ArrayNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonToAst.mod.ArrayNode]
    }
    
    @scala.inline
    def LiteralNode(raw: String, `type`: Literal): typings.jsonToAst.mod.LiteralNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonToAst.mod.LiteralNode]
    }
    
    @scala.inline
    def ObjectNode(children: js.Array[PropertyNode], `type`: Object): typings.jsonToAst.mod.ObjectNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonToAst.mod.ObjectNode]
    }
  }
}
