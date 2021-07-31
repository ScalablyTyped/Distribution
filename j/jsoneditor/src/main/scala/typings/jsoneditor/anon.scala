package typings.jsoneditor

import typings.jsoneditor.jsoneditorStrings.EqualssignEqualssign
import typings.jsoneditor.jsoneditorStrings.ExclamationmarkEqualssign
import typings.jsoneditor.jsoneditorStrings.Greaterthansign
import typings.jsoneditor.jsoneditorStrings.GreaterthansignEqualssign
import typings.jsoneditor.jsoneditorStrings.Lessthansign
import typings.jsoneditor.jsoneditorStrings.LessthansignEqualssign
import typings.jsoneditor.jsoneditorStrings.`@`
import typings.jsoneditor.jsoneditorStrings.asc
import typings.jsoneditor.jsoneditorStrings.desc
import typings.jsoneditor.mod.JSONPath
import typings.jsoneditor.mod.SelectionPosition
import typings.jsoneditor.mod.SerializableNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction extends StObject {
    
    var direction: asc | desc
    
    var field: String | `@`
  }
  object Direction {
    
    @scala.inline
    def apply(direction: asc | desc, field: String | `@`): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: SerializableNode
    
    var start: SerializableNode
  }
  object End {
    
    @scala.inline
    def apply(end: SerializableNode, start: SerializableNode): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: SerializableNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: SerializableNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var field: String | `@`
    
    var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    
    var value: String
  }
  object Field {
    
    @scala.inline
    def apply(
      field: String | `@`,
      relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
      value: String
    ): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelation(
        value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
      ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.Array[String]
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    var options: js.Array[String]
    
    var startFrom: Double
  }
  object Options {
    
    @scala.inline
    def apply(options: js.Array[String], startFrom: Double): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setStartFrom(value: Double): Self = StObject.set(x, "startFrom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var field: String
    
    var path: js.Array[String]
    
    var value: String
  }
  object Path {
    
    @scala.inline
    def apply(field: String, path: js.Array[String], value: String): Path = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathJSONPath extends StObject {
    
    var path: JSONPath
  }
  object PathJSONPath {
    
    @scala.inline
    def apply(path: JSONPath): PathJSONPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathJSONPath]
    }
    
    @scala.inline
    implicit class PathJSONPathMutableBuilder[Self <: PathJSONPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  trait Start extends StObject {
    
    var end: SelectionPosition
    
    var start: SelectionPosition
    
    var text: String
  }
  object Start {
    
    @scala.inline
    def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: SelectionPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: SelectionPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
