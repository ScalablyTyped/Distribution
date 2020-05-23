package typings.looksSame.diffClustersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffClusters extends js.Object {
  var _clusters: js.Any
  var _clustersSize: js.Any
  def _joinToClusters(x: js.Any, y: js.Any): Unit
  def clusters: js.Array[_]
  def update(x: js.Any, y: js.Any): this.type
}

object DiffClusters {
  @scala.inline
  def apply(
    _clusters: js.Any,
    _clustersSize: js.Any,
    _joinToClusters: (js.Any, js.Any) => Unit,
    clusters: () => js.Array[_],
    update: (js.Any, js.Any) => DiffClusters
  ): DiffClusters = {
    val __obj = js.Dynamic.literal(_clusters = _clusters.asInstanceOf[js.Any], _clustersSize = _clustersSize.asInstanceOf[js.Any], _joinToClusters = js.Any.fromFunction2(_joinToClusters), clusters = js.Any.fromFunction0(clusters), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[DiffClusters]
  }
}

