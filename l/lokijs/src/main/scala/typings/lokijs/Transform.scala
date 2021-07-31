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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var dataOptions: js.UndefOr[js.Any] = js.undefined
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var joinData: js.UndefOr[js.Any] = js.undefined
  
  var leftJoinKey: js.UndefOr[js.Any] = js.undefined
  
  var mapFun: js.UndefOr[js.Any] = js.undefined
  
  var mapFunction: js.UndefOr[js.Any] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var reduceFunction: js.UndefOr[js.Any] = js.undefined
  
  var rightJoinKey: js.UndefOr[js.Any] = js.undefined
  
  var `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  
  var value: js.UndefOr[js.Any] = js.undefined
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
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataOptions(value: js.Any): Self = StObject.set(x, "dataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOptionsUndefined: Self = StObject.set(x, "dataOptions", js.undefined)
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setJoinData(value: js.Any): Self = StObject.set(x, "joinData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinDataUndefined: Self = StObject.set(x, "joinData", js.undefined)
    
    @scala.inline
    def setLeftJoinKey(value: js.Any): Self = StObject.set(x, "leftJoinKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftJoinKeyUndefined: Self = StObject.set(x, "leftJoinKey", js.undefined)
    
    @scala.inline
    def setMapFun(value: js.Any): Self = StObject.set(x, "mapFun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapFunUndefined: Self = StObject.set(x, "mapFun", js.undefined)
    
    @scala.inline
    def setMapFunction(value: js.Any): Self = StObject.set(x, "mapFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapFunctionUndefined: Self = StObject.set(x, "mapFunction", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setReduceFunction(value: js.Any): Self = StObject.set(x, "reduceFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceFunctionUndefined: Self = StObject.set(x, "reduceFunction", js.undefined)
    
    @scala.inline
    def setRightJoinKey(value: js.Any): Self = StObject.set(x, "rightJoinKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightJoinKeyUndefined: Self = StObject.set(x, "rightJoinKey", js.undefined)
    
    @scala.inline
    def setType(
      value: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
