package typings.looksSame.diffClustersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffClusters extends js.Object {
  var _clusters: js.Any = js.native
  var _clustersSize: js.Any = js.native
  def _joinToClusters(x: js.Any, y: js.Any): Unit = js.native
  def clusters: js.Array[_] = js.native
  def update(x: js.Any, y: js.Any): this.type = js.native
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
  @scala.inline
  implicit class DiffClustersOps[Self <: DiffClusters] (val x: Self) extends AnyVal {
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
    def set_clusters(value: js.Any): Self = this.set("_clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def set_clustersSize(value: js.Any): Self = this.set("_clustersSize", value.asInstanceOf[js.Any])
    @scala.inline
    def set_joinToClusters(value: (js.Any, js.Any) => Unit): Self = this.set("_joinToClusters", js.Any.fromFunction2(value))
    @scala.inline
    def setClusters(value: () => js.Array[_]): Self = this.set("clusters", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (js.Any, js.Any) => DiffClusters): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

