package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBindingEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataBindingEventUIParam {
  
  inline def apply(): DataBindingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBindingEventUIParam]
  }
  
  extension [Self <: DataBindingEventUIParam](x: Self) {
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
