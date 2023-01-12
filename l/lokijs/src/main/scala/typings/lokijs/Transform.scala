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
  
  var dataOptions: js.UndefOr[Any] = js.undefined
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var joinData: js.UndefOr[Any] = js.undefined
  
  var leftJoinKey: js.UndefOr[Any] = js.undefined
  
  var mapFun: js.UndefOr[Any] = js.undefined
  
  var mapFunction: js.UndefOr[Any] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var reduceFunction: js.UndefOr[Any] = js.undefined
  
  var rightJoinKey: js.UndefOr[Any] = js.undefined
  
  var `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  
  var value: js.UndefOr[Any] = js.undefined
}
object Transform {
  
  inline def apply(
    `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setDataOptions(value: Any): Self = StObject.set(x, "dataOptions", value.asInstanceOf[js.Any])
    
    inline def setDataOptionsUndefined: Self = StObject.set(x, "dataOptions", js.undefined)
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setJoinData(value: Any): Self = StObject.set(x, "joinData", value.asInstanceOf[js.Any])
    
    inline def setJoinDataUndefined: Self = StObject.set(x, "joinData", js.undefined)
    
    inline def setLeftJoinKey(value: Any): Self = StObject.set(x, "leftJoinKey", value.asInstanceOf[js.Any])
    
    inline def setLeftJoinKeyUndefined: Self = StObject.set(x, "leftJoinKey", js.undefined)
    
    inline def setMapFun(value: Any): Self = StObject.set(x, "mapFun", value.asInstanceOf[js.Any])
    
    inline def setMapFunUndefined: Self = StObject.set(x, "mapFun", js.undefined)
    
    inline def setMapFunction(value: Any): Self = StObject.set(x, "mapFunction", value.asInstanceOf[js.Any])
    
    inline def setMapFunctionUndefined: Self = StObject.set(x, "mapFunction", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setReduceFunction(value: Any): Self = StObject.set(x, "reduceFunction", value.asInstanceOf[js.Any])
    
    inline def setReduceFunctionUndefined: Self = StObject.set(x, "reduceFunction", js.undefined)
    
    inline def setRightJoinKey(value: Any): Self = StObject.set(x, "rightJoinKey", value.asInstanceOf[js.Any])
    
    inline def setRightJoinKeyUndefined: Self = StObject.set(x, "rightJoinKey", js.undefined)
    
    inline def setType(
      value: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
