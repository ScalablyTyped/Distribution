package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGeneratedEventUIParam extends StObject {
  
  /**
    * Gets reference to data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to data source schema.
    */
  var schema: js.UndefOr[js.Any] = js.native
}
object SchemaGeneratedEventUIParam {
  
  @scala.inline
  def apply(): SchemaGeneratedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedEventUIParam]
  }
  
  @scala.inline
  implicit class SchemaGeneratedEventUIParamMutableBuilder[Self <: SchemaGeneratedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
