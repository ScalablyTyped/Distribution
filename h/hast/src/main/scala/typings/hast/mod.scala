package typings.hast

import org.scalablytyped.runtime.StringDictionary
import typings.hast.hastStrings.comment
import typings.hast.hastStrings.doctype
import typings.hast.hastStrings.element
import typings.hast.hastStrings.root
import typings.hast.hastStrings.text
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Comment
    extends StObject
       with Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Comment: comment
  }
  object Comment {
    
    @scala.inline
    def apply(value: js.Any): Comment = {
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
  
  trait DocType
    extends StObject
       with Node {
    
    var name: String
    
    /**
      * Represents the document’s public identifier.
      */
    var public: js.UndefOr[String] = js.undefined
    
    /**
      * Represents the document’s system identifier.
      */
    var system: js.UndefOr[String] = js.undefined
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_DocType: doctype
  }
  object DocType {
    
    @scala.inline
    def apply(name: String): DocType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doctype")
      __obj.asInstanceOf[DocType]
    }
    
    @scala.inline
    implicit class DocTypeMutableBuilder[Self <: DocType] (val x: Self) extends AnyVal {
      
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
       with Parent {
    
    /**
      * List representing the children of a node.
      */
    @JSName("children")
    var children_Element: js.Array[Element | Comment | Text]
    
    /**
      * If the tagName field is 'template', a content field can be present.
      */
    var content: js.UndefOr[Root] = js.undefined
    
    /**
      * Represents information associated with the element.
      */
    var properties: js.UndefOr[Properties] = js.undefined
    
    /**
      * Represents the element’s local name.
      */
    var tagName: String
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    @scala.inline
    def apply(children: js.Array[Element | Comment | Text], tagName: String): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Element | Comment | Text]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (Element | Comment | Text)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: Root): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with typings.unist.mod.Literal
  object Literal {
    
    @scala.inline
    def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  trait Parent
    extends StObject
       with typings.unist.mod.Parent
  object Parent {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
  }
  
  type Properties = StringDictionary[js.UndefOr[Boolean | Double | String | Null | (js.Array[String | Double])]]
  
  trait Root
    extends StObject
       with Parent {
    
    /**
      * Represents this variant of a Node.
      */
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
       with Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Text: text
  }
  object Text {
    
    @scala.inline
    def apply(value: js.Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
