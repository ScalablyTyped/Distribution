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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Comment extends Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Comment: comment = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(`type`: comment, value: js.Any): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocType extends Node {
    
    var name: String = js.native
    
    /**
      * Represents the document’s public identifier.
      */
    var public: js.UndefOr[String] = js.native
    
    /**
      * Represents the document’s system identifier.
      */
    var system: js.UndefOr[String] = js.native
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_DocType: doctype = js.native
  }
  object DocType {
    
    @scala.inline
    def apply(name: String, `type`: doctype): DocType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Element extends Parent {
    
    /**
      * List representing the children of a node.
      */
    @JSName("children")
    var children_Element: js.Array[Element | Comment | Text] = js.native
    
    /**
      * If the tagName field is 'template', a content field can be present.
      */
    var content: js.UndefOr[Root] = js.native
    
    /**
      * Represents information associated with the element.
      */
    var properties: js.UndefOr[Properties] = js.native
    
    /**
      * Represents the element’s local name.
      */
    var tagName: String = js.native
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_Element: element = js.native
  }
  object Element {
    
    @scala.inline
    def apply(children: js.Array[Element | Comment | Text], tagName: String, `type`: element): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait Literal
    extends typings.unist.mod.Literal
  object Literal {
    
    @scala.inline
    def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  @js.native
  trait Parent
    extends typings.unist.mod.Parent
  object Parent {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
  }
  
  type Properties = StringDictionary[js.UndefOr[Boolean | Double | String | Null | (js.Array[String | Double])]]
  
  @js.native
  trait Root extends Parent {
    
    /**
      * Represents this variant of a Node.
      */
    @JSName("type")
    var type_Root: root = js.native
  }
  object Root {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: root): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends Literal {
    
    /**
      * Represents this variant of a Literal.
      */
    @JSName("type")
    var type_Text: text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(`type`: text, value: js.Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
