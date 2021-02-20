package typings.hermesProfileTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Category extends StObject {
    
    var category: String = js.native
    
    var column: String = js.native
    
    var funcColumn: String = js.native
    
    var funcLine: String = js.native
    
    var line: String = js.native
    
    var name: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Category {
    
    @scala.inline
    def apply(category: String, column: String, funcColumn: String, funcLine: String, line: String, name: String): Category = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], funcColumn = funcColumn.asInstanceOf[js.Any], funcLine = funcLine.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncColumn(value: String): Self = StObject.set(x, "funcColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncLine(value: String): Self = StObject.set(x, "funcLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Issuets extends StObject {
    
    var issue_ts: js.UndefOr[Double] = js.native
    
    var sync_id: String = js.native
  }
  object Issuets {
    
    @scala.inline
    def apply(sync_id: String): Issuets = {
      val __obj = js.Dynamic.literal(sync_id = sync_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issuets]
    }
    
    @scala.inline
    implicit class IssuetsMutableBuilder[Self <: Issuets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssue_ts(value: Double): Self = StObject.set(x, "issue_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssue_tsUndefined: Self = StObject.set(x, "issue_ts", js.undefined)
      
      @scala.inline
      def setSync_id(value: String): Self = StObject.set(x, "sync_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Linkedid extends StObject {
    
    var linked_id: Double = js.native
  }
  object Linkedid {
    
    @scala.inline
    def apply(linked_id: Double): Linkedid = {
      val __obj = js.Dynamic.literal(linked_id = linked_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkedid]
    }
    
    @scala.inline
    implicit class LinkedidMutableBuilder[Self <: Linkedid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinked_id(value: Double): Self = StObject.set(x, "linked_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mappings extends StObject {
    
    var mappings: String = js.native
    
    var names: js.Array[String] = js.native
  }
  object Mappings {
    
    @scala.inline
    def apply(mappings: String, names: js.Array[String]): Mappings = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mappings]
    }
    
    @scala.inline
    implicit class MappingsMutableBuilder[Self <: Mappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
