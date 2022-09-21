package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlColumn extends StObject {
  
  /**
    * Column collation.
    */
  var collation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Column name.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Column length.
    */
  var length: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether or not the column can accept a null value.
    */
  var nullable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ordinal position of the column in the table.
    */
  var ordinalPosition: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether or not the column represents a primary key.
    */
  var primaryKey: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMysqlColumn {
  
  inline def apply(): SchemaMysqlColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlColumn]
  }
  
  extension [Self <: SchemaMysqlColumn](x: Self) {
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationNull: Self = StObject.set(x, "collation", null)
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableNull: Self = StObject.set(x, "nullable", null)
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setOrdinalPosition(value: Double): Self = StObject.set(x, "ordinalPosition", value.asInstanceOf[js.Any])
    
    inline def setOrdinalPositionNull: Self = StObject.set(x, "ordinalPosition", null)
    
    inline def setOrdinalPositionUndefined: Self = StObject.set(x, "ordinalPosition", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyNull: Self = StObject.set(x, "primaryKey", null)
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
  }
}
