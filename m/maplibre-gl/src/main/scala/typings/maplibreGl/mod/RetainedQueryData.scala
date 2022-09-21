package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RetainedQueryData")
@js.native
open class RetainedQueryData protected () extends StObject {
  def this(
    bucketInstanceId: Double,
    featureIndex: FeatureIndex,
    sourceLayerIndex: Double,
    bucketIndex: Double,
    tileID: OverscaledTileID
  ) = this()
  
  var bucketIndex: Double = js.native
  
  var bucketInstanceId: Double = js.native
  
  var featureIndex: FeatureIndex = js.native
  
  var featureSortOrder: js.Array[Double] = js.native
  
  var sourceLayerIndex: Double = js.native
  
  var tileID: OverscaledTileID = js.native
}
