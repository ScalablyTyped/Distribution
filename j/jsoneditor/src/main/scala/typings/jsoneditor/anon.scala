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
    
    inline def apply(direction: asc | desc, field: String | `@`): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: SerializableNode
    
    var start: SerializableNode
  }
  object End {
    
    inline def apply(end: SerializableNode, start: SerializableNode): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: SerializableNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SerializableNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var field: String | `@`
    
    var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    
    var value: String
  }
  object Field {
    
    inline def apply(
      field: String | `@`,
      relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
      value: String
    ): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setRelation(
        value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
      ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.Array[String]
  }
  object Fields {
    
    inline def apply(fields: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    var options: js.Array[String]
    
    var startFrom: Double
  }
  object Options {
    
    inline def apply(options: js.Array[String], startFrom: Double): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setStartFrom(value: Double): Self = StObject.set(x, "startFrom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var field: String
    
    var path: js.Array[String]
    
    var value: String
  }
  object Path {
    
    inline def apply(field: String, path: js.Array[String], value: String): Path = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathJSONPath extends StObject {
    
    var path: JSONPath
  }
  object PathJSONPath {
    
    inline def apply(path: JSONPath): PathJSONPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathJSONPath]
    }
    
    extension [Self <: PathJSONPath](x: Self) {
      
      inline def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  trait Start extends StObject {
    
    var end: SelectionPosition
    
    var start: SelectionPosition
    
    var text: String
  }
  object Start {
    
    inline def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setEnd(value: SelectionPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SelectionPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
