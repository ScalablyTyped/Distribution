package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table.
  */
trait SchemaTable extends StObject {
  
  /**
    * Attribution assigned to the table.
    */
  var attribution: js.UndefOr[String] = js.undefined
  
  /**
    * Optional link for attribution.
    */
  var attributionLink: js.UndefOr[String] = js.undefined
  
  /**
    * Base table identifier if this table is a view or merged table.
    */
  var baseTableIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Default JSON schema for validating all JSON column properties.
    */
  var columnPropertiesJsonSchema: js.UndefOr[String] = js.undefined
  
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[SchemaColumn]] = js.undefined
  
  /**
    * Description assigned to the table.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Variable for whether table is exportable.
    */
  var isExportable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The kind of item this is. For a table, this is always fusiontables#table.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name assigned to a table.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * SQL that encodes the table definition for derived tables.
    */
  var sql: js.UndefOr[String] = js.undefined
  
  /**
    * Encrypted unique alphanumeric identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.undefined
  
  /**
    * JSON object containing custom table properties.
    */
  var tablePropertiesJson: js.UndefOr[String] = js.undefined
  
  /**
    * JSON schema for validating the JSON table properties.
    */
  var tablePropertiesJsonSchema: js.UndefOr[String] = js.undefined
}
object SchemaTable {
  
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  @scala.inline
  implicit class SchemaTableMutableBuilder[Self <: SchemaTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionLink(value: String): Self = StObject.set(x, "attributionLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionLinkUndefined: Self = StObject.set(x, "attributionLink", js.undefined)
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBaseTableIds(value: js.Array[String]): Self = StObject.set(x, "baseTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTableIdsUndefined: Self = StObject.set(x, "baseTableIds", js.undefined)
    
    @scala.inline
    def setBaseTableIdsVarargs(value: String*): Self = StObject.set(x, "baseTableIds", js.Array(value :_*))
    
    @scala.inline
    def setColumnPropertiesJsonSchema(value: String): Self = StObject.set(x, "columnPropertiesJsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesJsonSchemaUndefined: Self = StObject.set(x, "columnPropertiesJsonSchema", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[SchemaColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SchemaColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsExportable(value: Boolean): Self = StObject.set(x, "isExportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExportableUndefined: Self = StObject.set(x, "isExportable", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTablePropertiesJson(value: String): Self = StObject.set(x, "tablePropertiesJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablePropertiesJsonSchema(value: String): Self = StObject.set(x, "tablePropertiesJsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablePropertiesJsonSchemaUndefined: Self = StObject.set(x, "tablePropertiesJsonSchema", js.undefined)
    
    @scala.inline
    def setTablePropertiesJsonUndefined: Self = StObject.set(x, "tablePropertiesJson", js.undefined)
  }
}
