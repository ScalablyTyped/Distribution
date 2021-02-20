package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to grid's data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object PagerRenderingEventUIParam {
  
  @scala.inline
  def apply(): PagerRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class PagerRenderingEventUIParamMutableBuilder[Self <: PagerRenderingEventUIParam] (val x: Self) extends AnyVal {
    
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
