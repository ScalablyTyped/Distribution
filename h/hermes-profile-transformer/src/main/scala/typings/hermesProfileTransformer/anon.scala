package typings.hermesProfileTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Category extends StObject {
    
    var category: String
    
    var column: String
    
    var funcColumn: String
    
    var funcLine: String
    
    var line: String
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Category {
    
    inline def apply(category: String, column: String, funcColumn: String, funcLine: String, line: String, name: String): Category = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], funcColumn = funcColumn.asInstanceOf[js.Any], funcLine = funcLine.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFuncColumn(value: String): Self = StObject.set(x, "funcColumn", value.asInstanceOf[js.Any])
      
      inline def setFuncLine(value: String): Self = StObject.set(x, "funcLine", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Issuets extends StObject {
    
    var issue_ts: js.UndefOr[Double] = js.undefined
    
    var sync_id: String
  }
  object Issuets {
    
    inline def apply(sync_id: String): Issuets = {
      val __obj = js.Dynamic.literal(sync_id = sync_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issuets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Issuets] (val x: Self) extends AnyVal {
      
      inline def setIssue_ts(value: Double): Self = StObject.set(x, "issue_ts", value.asInstanceOf[js.Any])
      
      inline def setIssue_tsUndefined: Self = StObject.set(x, "issue_ts", js.undefined)
      
      inline def setSync_id(value: String): Self = StObject.set(x, "sync_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Linkedid extends StObject {
    
    var linked_id: Double
  }
  object Linkedid {
    
    inline def apply(linked_id: Double): Linkedid = {
      val __obj = js.Dynamic.literal(linked_id = linked_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkedid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Linkedid] (val x: Self) extends AnyVal {
      
      inline def setLinked_id(value: Double): Self = StObject.set(x, "linked_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mappings extends StObject {
    
    var mappings: String
    
    var names: js.Array[String]
  }
  object Mappings {
    
    inline def apply(mappings: String, names: js.Array[String]): Mappings = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mappings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mappings] (val x: Self) extends AnyVal {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
}
