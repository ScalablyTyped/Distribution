package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains cluster daemon metrics, such as HDFS and YARN stats.Beta Feature:
  * This report is available for testing purposes only. It may be changed
  * before final release.
  */
trait SchemaClusterMetrics extends StObject {
  
  /**
    * The HDFS metrics.
    */
  var hdfsMetrics: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The YARN metrics.
    */
  var yarnMetrics: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaClusterMetrics {
  
  inline def apply(): SchemaClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterMetrics]
  }
  
  extension [Self <: SchemaClusterMetrics](x: Self) {
    
    inline def setHdfsMetrics(value: StringDictionary[String]): Self = StObject.set(x, "hdfsMetrics", value.asInstanceOf[js.Any])
    
    inline def setHdfsMetricsUndefined: Self = StObject.set(x, "hdfsMetrics", js.undefined)
    
    inline def setYarnMetrics(value: StringDictionary[String]): Self = StObject.set(x, "yarnMetrics", value.asInstanceOf[js.Any])
    
    inline def setYarnMetricsUndefined: Self = StObject.set(x, "yarnMetrics", js.undefined)
  }
}
