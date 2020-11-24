package typings.lokijs

import typings.lokijs.lokijsStrings.compoundsort
import typings.lokijs.lokijsStrings.eqJoin
import typings.lokijs.lokijsStrings.find
import typings.lokijs.lokijsStrings.limit
import typings.lokijs.lokijsStrings.map
import typings.lokijs.lokijsStrings.mapReduce
import typings.lokijs.lokijsStrings.offset
import typings.lokijs.lokijsStrings.remove
import typings.lokijs.lokijsStrings.simplesort
import typings.lokijs.lokijsStrings.sort
import typings.lokijs.lokijsStrings.update
import typings.lokijs.lokijsStrings.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  var dataOptions: js.UndefOr[js.Any] = js.native
  
  var desc: js.UndefOr[Boolean] = js.native
  
  var joinData: js.UndefOr[js.Any] = js.native
  
  var leftJoinKey: js.UndefOr[js.Any] = js.native
  
  var mapFun: js.UndefOr[js.Any] = js.native
  
  var mapFunction: js.UndefOr[js.Any] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var reduceFunction: js.UndefOr[js.Any] = js.native
  
  var rightJoinKey: js.UndefOr[js.Any] = js.native
  
  var `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object Transform {
  
  @scala.inline
  def apply(
    `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOptions(value: js.Any): Self = this.set("dataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataOptions: Self = this.set("dataOptions", js.undefined)
    
    @scala.inline
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setJoinData(value: js.Any): Self = this.set("joinData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinData: Self = this.set("joinData", js.undefined)
    
    @scala.inline
    def setLeftJoinKey(value: js.Any): Self = this.set("leftJoinKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftJoinKey: Self = this.set("leftJoinKey", js.undefined)
    
    @scala.inline
    def setMapFun(value: js.Any): Self = this.set("mapFun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapFun: Self = this.set("mapFun", js.undefined)
    
    @scala.inline
    def setMapFunction(value: js.Any): Self = this.set("mapFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapFunction: Self = this.set("mapFunction", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setReduceFunction(value: js.Any): Self = this.set("reduceFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduceFunction: Self = this.set("reduceFunction", js.undefined)
    
    @scala.inline
    def setRightJoinKey(value: js.Any): Self = this.set("rightJoinKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightJoinKey: Self = this.set("rightJoinKey", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
