package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleapis.anon.ColumnId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the id, name and type of a column in a table.
  */
trait SchemaColumn extends StObject {
  
  /**
    * Optional identifier of the base column. If present, this column is
    * derived from the specified base column.
    */
  var baseColumn: js.UndefOr[ColumnId] = js.undefined
  
  /**
    * Identifier for the column.
    */
  var columnId: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional column description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional column predicate. Used to map table to graph data model
    * (subject,predicate,object) See
    * http://www.w3.org/TR/2014/REC-rdf11-concepts-20140225/#data-model
    */
  var graph_predicate: js.UndefOr[String] = js.undefined
  
  /**
    * Type name: a template for an individual column.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Required name of the column.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required type of the column.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaColumn {
  
  @scala.inline
  def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  
  @scala.inline
  implicit class SchemaColumnMutableBuilder[Self <: SchemaColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseColumn(value: ColumnId): Self = StObject.set(x, "baseColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseColumnUndefined: Self = StObject.set(x, "baseColumn", js.undefined)
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGraph_predicate(value: String): Self = StObject.set(x, "graph_predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph_predicateUndefined: Self = StObject.set(x, "graph_predicate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
