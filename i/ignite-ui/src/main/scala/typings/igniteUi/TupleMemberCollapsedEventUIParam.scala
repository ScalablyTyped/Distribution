package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleMemberCollapsedEventUIParam extends StObject {
  
  /**
    * Gets the name of axis, which holds the member and the tuple.
    */
  var axisName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the data source.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the index of the member in the tuple.
    */
  var memberIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the index of the tuple in the axis.
    */
  var tupleIndex: js.UndefOr[Double] = js.undefined
}
object TupleMemberCollapsedEventUIParam {
  
  inline def apply(): TupleMemberCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TupleMemberCollapsedEventUIParam]
  }
  
  extension [Self <: TupleMemberCollapsedEventUIParam](x: Self) {
    
    inline def setAxisName(value: String): Self = StObject.set(x, "axisName", value.asInstanceOf[js.Any])
    
    inline def setAxisNameUndefined: Self = StObject.set(x, "axisName", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setMemberIndex(value: Double): Self = StObject.set(x, "memberIndex", value.asInstanceOf[js.Any])
    
    inline def setMemberIndexUndefined: Self = StObject.set(x, "memberIndex", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTupleIndex(value: Double): Self = StObject.set(x, "tupleIndex", value.asInstanceOf[js.Any])
    
    inline def setTupleIndexUndefined: Self = StObject.set(x, "tupleIndex", js.undefined)
  }
}
