package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (Highstock) Highcharts Stock only.
  */
trait DataGroupingResultObject extends StObject {
  
  var groupMap: js.Array[
    typings.highcharts.modulesDatagroupingMod.highchartsAugmentingMod.DataGroupingInfoObject
  ]
  
  var groupedXData: js.Array[Double]
  
  var groupedYData: js.Array[js.UndefOr[(js.Array[js.UndefOr[Double | Null]]) | Double | Null]]
}
object DataGroupingResultObject {
  
  inline def apply(
    groupMap: js.Array[
      typings.highcharts.modulesDatagroupingMod.highchartsAugmentingMod.DataGroupingInfoObject
    ],
    groupedXData: js.Array[Double],
    groupedYData: js.Array[js.UndefOr[(js.Array[js.UndefOr[Double | Null]]) | Double | Null]]
  ): DataGroupingResultObject = {
    val __obj = js.Dynamic.literal(groupMap = groupMap.asInstanceOf[js.Any], groupedXData = groupedXData.asInstanceOf[js.Any], groupedYData = groupedYData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroupingResultObject]
  }
  
  extension [Self <: DataGroupingResultObject](x: Self) {
    
    inline def setGroupMap(
      value: js.Array[
          typings.highcharts.modulesDatagroupingMod.highchartsAugmentingMod.DataGroupingInfoObject
        ]
    ): Self = StObject.set(x, "groupMap", value.asInstanceOf[js.Any])
    
    inline def setGroupMapVarargs(value: typings.highcharts.modulesDatagroupingMod.highchartsAugmentingMod.DataGroupingInfoObject*): Self = StObject.set(x, "groupMap", js.Array(value*))
    
    inline def setGroupedXData(value: js.Array[Double]): Self = StObject.set(x, "groupedXData", value.asInstanceOf[js.Any])
    
    inline def setGroupedXDataVarargs(value: Double*): Self = StObject.set(x, "groupedXData", js.Array(value*))
    
    inline def setGroupedYData(value: js.Array[js.UndefOr[(js.Array[js.UndefOr[Double | Null]]) | Double | Null]]): Self = StObject.set(x, "groupedYData", value.asInstanceOf[js.Any])
    
    inline def setGroupedYDataVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[Double | Null]]) | Double | Null])*): Self = StObject.set(x, "groupedYData", js.Array(value*))
  }
}
