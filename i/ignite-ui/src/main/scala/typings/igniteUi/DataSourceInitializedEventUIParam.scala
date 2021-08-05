package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceInitializedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * See if an error has occured during initialization.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the root of the data source metatadata root item.
    */
  var metadataTreeRoot: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataSourceInitializedEventUIParam {
  
  inline def apply(): DataSourceInitializedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceInitializedEventUIParam]
  }
  
  extension [Self <: DataSourceInitializedEventUIParam](x: Self) {
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMetadataTreeRoot(value: js.Any): Self = StObject.set(x, "metadataTreeRoot", value.asInstanceOf[js.Any])
    
    inline def setMetadataTreeRootUndefined: Self = StObject.set(x, "metadataTreeRoot", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
