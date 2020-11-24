package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a single field of a struct.
  */
@js.native
trait SchemaField extends js.Object {
  
  /**
    * The name of the field. For reads, this is the column name. For SQL
    * queries, it is the column alias (e.g., `&quot;Word&quot;` in the query
    * `&quot;SELECT &#39;hello&#39; AS Word&quot;`), or the column name (e.g.,
    * `&quot;ColName&quot;` in the query `&quot;SELECT ColName FROM
    * Table&quot;`). Some columns might have an empty name (e.g., !&quot;SELECT
    * UPPER(ColName)&quot;`). Note that a query result can contain multiple
    * fields with the same name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the field.
    */
  var `type`: js.UndefOr[SchemaType] = js.native
}
object SchemaField {
  
  @scala.inline
  def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  @scala.inline
  implicit class SchemaFieldOps[Self <: SchemaField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: SchemaType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
