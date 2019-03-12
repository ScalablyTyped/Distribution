package typings
package heremapsLib.HNs.clusteringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface which specifies the methods a theme must implement.
  */
trait ITheme extends js.Object {
  /**
    * Function returns a cluster presentation as a map object.
    * @param cluster {H.clustering.ICluster}
    * @returns {H.map.Object}
    */
  def getClusterPresentation(cluster: ICluster): heremapsLib.HNs.mapNs.Object
  /**
    * Function returns noise point presentation as a map object
    * @param noisePoint {H.clustering.INoisePoint}
    * @returns {H.map.Object}
    */
  def getNoisePresentation(noisePoint: INoisePoint): heremapsLib.HNs.mapNs.Object
}

object ITheme {
  @scala.inline
  def apply(
    getClusterPresentation: ICluster => heremapsLib.HNs.mapNs.Object,
    getNoisePresentation: INoisePoint => heremapsLib.HNs.mapNs.Object
  ): ITheme = {
    val __obj = js.Dynamic.literal(getClusterPresentation = js.Any.fromFunction1(getClusterPresentation), getNoisePresentation = js.Any.fromFunction1(getNoisePresentation))
  
    __obj.asInstanceOf[ITheme]
  }
}

