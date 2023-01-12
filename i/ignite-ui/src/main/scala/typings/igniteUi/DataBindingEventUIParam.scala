package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBindingEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataBindingEventUIParam {
  
  inline def apply(): DataBindingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBindingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataBindingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
