package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterMetrics extends StObject {
  
  /**
    * The HDFS metrics.
    */
  var hdfsMetrics: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The YARN metrics.
    */
  var yarnMetrics: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaClusterMetrics {
  
  inline def apply(): SchemaClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterMetrics]
  }
  
  extension [Self <: SchemaClusterMetrics](x: Self) {
    
    inline def setHdfsMetrics(value: StringDictionary[String]): Self = StObject.set(x, "hdfsMetrics", value.asInstanceOf[js.Any])
    
    inline def setHdfsMetricsNull: Self = StObject.set(x, "hdfsMetrics", null)
    
    inline def setHdfsMetricsUndefined: Self = StObject.set(x, "hdfsMetrics", js.undefined)
    
    inline def setYarnMetrics(value: StringDictionary[String]): Self = StObject.set(x, "yarnMetrics", value.asInstanceOf[js.Any])
    
    inline def setYarnMetricsNull: Self = StObject.set(x, "yarnMetrics", null)
    
    inline def setYarnMetricsUndefined: Self = StObject.set(x, "yarnMetrics", js.undefined)
  }
}
