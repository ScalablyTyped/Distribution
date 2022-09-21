package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBoundEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array actual data which is displayed by chart.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataBoundEventUIParam {
  
  inline def apply(): DataBoundEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBoundEventUIParam]
  }
  
  extension [Self <: DataBoundEventUIParam](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
