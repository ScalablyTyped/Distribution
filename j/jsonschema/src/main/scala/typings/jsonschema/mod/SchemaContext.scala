package typings.jsonschema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaContext extends js.Object {
  
  var base: String = js.native
  
  var options: Options = js.native
  
  var propertyPath: String = js.native
  
  var schema: Schema = js.native
  
  var schemas: StringDictionary[Schema] = js.native
}
object SchemaContext {
  
  @scala.inline
  def apply(
    base: String,
    options: Options,
    propertyPath: String,
    schema: Schema,
    schemas: StringDictionary[Schema]
  ): SchemaContext = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContext]
  }
  
  @scala.inline
  implicit class SchemaContextOps[Self <: SchemaContext] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyPath(value: String): Self = this.set("propertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: StringDictionary[Schema]): Self = this.set("schemas", value.asInstanceOf[js.Any])
  }
}
