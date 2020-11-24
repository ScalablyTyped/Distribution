package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableSpecification extends js.Object {
  
  /** A Database. */
  var db: Database = js.native
  
  /** Whether the object is a materialized view (default false). */
  var is_matview: js.UndefOr[Boolean] = js.native
  
  /** The table or view's name. */
  var name: String = js.native
  
  /** The name of the schema owning the table or view. */
  var schema: String = js.native
}
object ReadableSpecification {
  
  @scala.inline
  def apply(db: Database, name: String, schema: String): ReadableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableSpecification]
  }
  
  @scala.inline
  implicit class ReadableSpecificationOps[Self <: ReadableSpecification] (val x: Self) extends AnyVal {
    
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
    def setDb(value: Database): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_matview(value: Boolean): Self = this.set("is_matview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_matview: Self = this.set("is_matview", js.undefined)
  }
}
