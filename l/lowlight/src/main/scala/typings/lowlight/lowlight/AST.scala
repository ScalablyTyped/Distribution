package typings.lowlight.lowlight

import org.scalablytyped.runtime.StringDictionary
import typings.lowlight.lowlight.AST.Unist.Node
import typings.lowlight.lowlight.AST.Unist.Parent
import typings.lowlight.lowlightStrings.comment
import typings.lowlight.lowlightStrings.doctype
import typings.lowlight.lowlightStrings.element
import typings.lowlight.lowlightStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AST {
  
  trait Comment
    extends StObject
       with typings.lowlight.lowlight.AST.Unist.Text
       with HastNode {
    
    @JSName("type")
    var type_Comment: comment
  }
  object Comment {
    
    @scala.inline
    def apply(value: String): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Doctype
    extends StObject
       with Node
       with HastNode {
    
    var name: String
    
    var public: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_Doctype: doctype
  }
  object Doctype {
    
    @scala.inline
    def apply(name: String): Doctype = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doctype")
      __obj.asInstanceOf[Doctype]
    }
    
    @scala.inline
    implicit class DoctypeMutableBuilder[Self <: Doctype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      @scala.inline
      def setType(value: doctype): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with Parent
       with HastNode {
    
    var properties: Properties
    
    var tagName: String
    
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    @scala.inline
    def apply(children: js.Array[Node], properties: Properties, tagName: String): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = StringDictionary[js.Any]
  
  trait Root
    extends StObject
       with Parent
       with HastNode {
    
    @JSName("type")
    var type_Root: root
  }
  object Root {
    
    @scala.inline
    def apply(children: js.Array[Node]): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with typings.lowlight.lowlight.AST.Unist.Text
       with HastNode
  object Text {
    
    @scala.inline
    def apply(`type`: String, value: String): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
  }
  
  object Unist {
    
    type Data = StringDictionary[js.Any]
    
    trait Location extends StObject {
      
      var end: Position
      
      var indent: js.UndefOr[js.Array[Double]] = js.undefined
      
      var start: Position
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
        def setIndent(value: js.Array[Double]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
        
        @scala.inline
        def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value :_*))
        
        @scala.inline
        def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    trait Node extends StObject {
      
      var data: js.UndefOr[Data] = js.undefined
      
      var position: js.UndefOr[Location] = js.undefined
      
      var `type`: String
    }
    object Node {
      
      @scala.inline
      def apply(`type`: String): Node = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setPosition(value: Location): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Parent
      extends StObject
         with Node {
      
      var children: js.Array[Node]
    }
    object Parent {
      
      @scala.inline
      def apply(children: js.Array[Node], `type`: String): Parent = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Parent]
      }
      
      @scala.inline
      implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
      }
    }
    
    trait Position extends StObject {
      
      var column: Double
      
      var line: Double
      
      var offset: js.UndefOr[Double] = js.undefined
    }
    object Position {
      
      @scala.inline
      def apply(column: Double, line: Double): Position = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
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
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    trait Text
      extends StObject
         with Node {
      
      var value: String
    }
    object Text {
      
      @scala.inline
      def apply(`type`: String, value: String): typings.lowlight.lowlight.AST.Unist.Text = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.lowlight.lowlight.AST.Unist.Text]
      }
      
      @scala.inline
      implicit class TextMutableBuilder[Self <: typings.lowlight.lowlight.AST.Unist.Text] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
