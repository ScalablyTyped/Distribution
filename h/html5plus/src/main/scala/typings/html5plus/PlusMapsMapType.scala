package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图视图类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsMapType extends js.Object {
  
  /**
    * 普通街道视图类型
    * 地图视图类型常量，普通街道视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_NORMAL: js.UndefOr[Double] = js.native
  
  /**
    * 卫星视图
    * 地图视图类型常量，卫星视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_SATELLITE: js.UndefOr[Double] = js.native
}
object PlusMapsMapType {
  
  @scala.inline
  def apply(): PlusMapsMapType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsMapType]
  }
  
  @scala.inline
  implicit class PlusMapsMapTypeOps[Self <: PlusMapsMapType] (val x: Self) extends AnyVal {
    
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
    def setMAPTYPE_NORMAL(value: Double): Self = this.set("MAPTYPE_NORMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMAPTYPE_NORMAL: Self = this.set("MAPTYPE_NORMAL", js.undefined)
    
    @scala.inline
    def setMAPTYPE_SATELLITE(value: Double): Self = this.set("MAPTYPE_SATELLITE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMAPTYPE_SATELLITE: Self = this.set("MAPTYPE_SATELLITE", js.undefined)
  }
}
