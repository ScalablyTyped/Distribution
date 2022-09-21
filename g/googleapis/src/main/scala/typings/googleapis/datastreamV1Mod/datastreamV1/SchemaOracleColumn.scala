package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleColumn extends StObject {
  
  /**
    * Column name.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Oracle data type.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Column encoding.
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
  
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
    * Column precision.
    */
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether or not the column represents a primary key.
    */
  var primaryKey: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Column scale.
    */
  var scale: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOracleColumn {
  
  inline def apply(): SchemaOracleColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleColumn]
  }
  
  extension [Self <: SchemaOracleColumn](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableNull: Self = StObject.set(x, "nullable", null)
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setOrdinalPosition(value: Double): Self = StObject.set(x, "ordinalPosition", value.asInstanceOf[js.Any])
    
    inline def setOrdinalPositionNull: Self = StObject.set(x, "ordinalPosition", null)
    
    inline def setOrdinalPositionUndefined: Self = StObject.set(x, "ordinalPosition", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyNull: Self = StObject.set(x, "primaryKey", null)
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
