package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowFactory[EntityType] extends js.Object {
  
  var rowCache: js.Array[Row[EntityType]] = js.native
}
object RowFactory {
  
  @scala.inline
  def apply[EntityType](rowCache: js.Array[Row[EntityType]]): RowFactory[EntityType] = {
    val __obj = js.Dynamic.literal(rowCache = rowCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFactory[EntityType]]
  }
  
  @scala.inline
  implicit class RowFactoryOps[Self <: RowFactory[_], EntityType] (val x: Self with RowFactory[EntityType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRowCacheVarargs(value: Row[EntityType]*): Self = this.set("rowCache", js.Array(value :_*))
    
    @scala.inline
    def setRowCache(value: js.Array[Row[EntityType]]): Self = this.set("rowCache", value.asInstanceOf[js.Any])
  }
}
