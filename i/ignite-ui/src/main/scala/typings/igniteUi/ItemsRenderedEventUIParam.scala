package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsRenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ItemsRenderedEventUIParam {
  
  @scala.inline
  def apply(): ItemsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class ItemsRenderedEventUIParamMutableBuilder[Self <: ItemsRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
