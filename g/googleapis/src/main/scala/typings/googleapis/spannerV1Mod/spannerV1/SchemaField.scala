package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a single field of a struct.
  */
trait SchemaField extends StObject {
  
  /**
    * The name of the field. For reads, this is the column name. For SQL
    * queries, it is the column alias (e.g., `&quot;Word&quot;` in the query
    * `&quot;SELECT &#39;hello&#39; AS Word&quot;`), or the column name (e.g.,
    * `&quot;ColName&quot;` in the query `&quot;SELECT ColName FROM
    * Table&quot;`). Some columns might have an empty name (e.g., !&quot;SELECT
    * UPPER(ColName)&quot;`). Note that a query result can contain multiple
    * fields with the same name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the field.
    */
  var `type`: js.UndefOr[SchemaType] = js.undefined
}
object SchemaField {
  
  @scala.inline
  def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  @scala.inline
  implicit class SchemaFieldMutableBuilder[Self <: SchemaField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: SchemaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
