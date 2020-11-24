package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 检索策略类型
  * 在线路检索时设置检索策略时使用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearchPolicy extends js.Object {
  
  /**
    * 最短距离优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_DIS_FIRST: js.UndefOr[Double] = js.native
  
  /**
    * 最少费用优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_FEE_FIRST: js.UndefOr[Double] = js.native
  
  /**
    * 无高速公路线路
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_NO_EXPRESSWAY: js.UndefOr[Double] = js.native
  
  /**
    * 选择车票花销最少优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_FEE_FIRST: js.UndefOr[Double] = js.native
  
  /**
    * 时间优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TIME_FIRST: js.UndefOr[Double] = js.native
  
  /**
    * 最少换乘优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TRANSFER_FIRST: js.UndefOr[Double] = js.native
  
  /**
    * 最少步行距离优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_WALK_FIRST: js.UndefOr[Double] = js.native
}
object PlusMapsSearchPolicy {
  
  @scala.inline
  def apply(): PlusMapsSearchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsSearchPolicy]
  }
  
  @scala.inline
  implicit class PlusMapsSearchPolicyOps[Self <: PlusMapsSearchPolicy] (val x: Self) extends AnyVal {
    
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
    def setDRIVING_DIS_FIRST(value: Double): Self = this.set("DRIVING_DIS_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDRIVING_DIS_FIRST: Self = this.set("DRIVING_DIS_FIRST", js.undefined)
    
    @scala.inline
    def setDRIVING_FEE_FIRST(value: Double): Self = this.set("DRIVING_FEE_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDRIVING_FEE_FIRST: Self = this.set("DRIVING_FEE_FIRST", js.undefined)
    
    @scala.inline
    def setDRIVING_NO_EXPRESSWAY(value: Double): Self = this.set("DRIVING_NO_EXPRESSWAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDRIVING_NO_EXPRESSWAY: Self = this.set("DRIVING_NO_EXPRESSWAY", js.undefined)
    
    @scala.inline
    def setTRANSIT_FEE_FIRST(value: Double): Self = this.set("TRANSIT_FEE_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTRANSIT_FEE_FIRST: Self = this.set("TRANSIT_FEE_FIRST", js.undefined)
    
    @scala.inline
    def setTRANSIT_TIME_FIRST(value: Double): Self = this.set("TRANSIT_TIME_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTRANSIT_TIME_FIRST: Self = this.set("TRANSIT_TIME_FIRST", js.undefined)
    
    @scala.inline
    def setTRANSIT_TRANSFER_FIRST(value: Double): Self = this.set("TRANSIT_TRANSFER_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTRANSIT_TRANSFER_FIRST: Self = this.set("TRANSIT_TRANSFER_FIRST", js.undefined)
    
    @scala.inline
    def setTRANSIT_WALK_FIRST(value: Double): Self = this.set("TRANSIT_WALK_FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTRANSIT_WALK_FIRST: Self = this.set("TRANSIT_WALK_FIRST", js.undefined)
  }
}
