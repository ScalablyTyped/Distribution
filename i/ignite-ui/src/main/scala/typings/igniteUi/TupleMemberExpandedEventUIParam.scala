package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleMemberExpandedEventUIParam extends StObject {
  
  /**
    * Gets the name of axis, which holds the member and the tuple.
    */
  var axisName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the index of the member in the tuple.
    */
  var memberIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the index of the tuple in the axis.
    */
  var tupleIndex: js.UndefOr[Double] = js.undefined
}
object TupleMemberExpandedEventUIParam {
  
  @scala.inline
  def apply(): TupleMemberExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TupleMemberExpandedEventUIParam]
  }
  
  @scala.inline
  implicit class TupleMemberExpandedEventUIParamMutableBuilder[Self <: TupleMemberExpandedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisName(value: String): Self = StObject.set(x, "axisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisNameUndefined: Self = StObject.set(x, "axisName", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setMemberIndex(value: Double): Self = StObject.set(x, "memberIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIndexUndefined: Self = StObject.set(x, "memberIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTupleIndex(value: Double): Self = StObject.set(x, "tupleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleIndexUndefined: Self = StObject.set(x, "tupleIndex", js.undefined)
  }
}
