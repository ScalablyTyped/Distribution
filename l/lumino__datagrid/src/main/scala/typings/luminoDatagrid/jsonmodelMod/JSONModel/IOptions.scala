package typings.luminoDatagrid.jsonmodelMod.JSONModel

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a JSON data model.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The data source for the data model.
    *
    * The data model takes full ownership of the data source.
    */
  var data: DataSource = js.native
  
  /**
    * The schema for the for the data model.
    *
    * The schema should be treated as an immutable object.
    */
  var schema: Schema = js.native
}
object IOptions {
  
  @scala.inline
  def apply(data: DataSource, schema: Schema): IOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ReadonlyJSONObject*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: DataSource): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
