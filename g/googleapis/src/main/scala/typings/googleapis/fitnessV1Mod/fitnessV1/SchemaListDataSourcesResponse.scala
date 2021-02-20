package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListDataSourcesResponse extends StObject {
  
  /**
    * A previously created data source.
    */
  var dataSource: js.UndefOr[js.Array[SchemaDataSource]] = js.native
}
object SchemaListDataSourcesResponse {
  
  @scala.inline
  def apply(): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDataSourcesResponseMutableBuilder[Self <: SchemaListDataSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[SchemaDataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: SchemaDataSource*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
  }
}
