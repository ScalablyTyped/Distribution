package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to grid's data source.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object PagerRenderingEventUIParam {
  
  inline def apply(): PagerRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerRenderingEventUIParam]
  }
  
  extension [Self <: PagerRenderingEventUIParam](x: Self) {
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
