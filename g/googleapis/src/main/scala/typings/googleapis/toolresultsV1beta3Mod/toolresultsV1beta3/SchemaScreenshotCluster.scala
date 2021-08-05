package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScreenshotCluster extends StObject {
  
  /**
    * A string that describes the activity of every screen in the cluster.
    */
  var activity: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the cluster.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * A singular screen that represents the cluster as a whole. This screen
    * will act as the &quot;cover&quot; of the entire cluster. When users look
    * at the clusters, only the key screen from each cluster will be shown.
    * Which screen is the key screen is determined by the ClusteringAlgorithm
    */
  var keyScreen: js.UndefOr[SchemaScreen] = js.undefined
  
  /**
    * Full list of screens.
    */
  var screens: js.UndefOr[js.Array[SchemaScreen]] = js.undefined
}
object SchemaScreenshotCluster {
  
  inline def apply(): SchemaScreenshotCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenshotCluster]
  }
  
  extension [Self <: SchemaScreenshotCluster](x: Self) {
    
    inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setKeyScreen(value: SchemaScreen): Self = StObject.set(x, "keyScreen", value.asInstanceOf[js.Any])
    
    inline def setKeyScreenUndefined: Self = StObject.set(x, "keyScreen", js.undefined)
    
    inline def setScreens(value: js.Array[SchemaScreen]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    
    inline def setScreensUndefined: Self = StObject.set(x, "screens", js.undefined)
    
    inline def setScreensVarargs(value: SchemaScreen*): Self = StObject.set(x, "screens", js.Array(value :_*))
  }
}
