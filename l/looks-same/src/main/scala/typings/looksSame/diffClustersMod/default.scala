package typings.looksSame.diffClustersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/diff-clusters", JSImport.Default)
@js.native
class default () extends DiffClusters {
  def this(clustersSize: Double) = this()
  /* CompleteClass */
  override var _clusters: js.Any = js.native
  /* CompleteClass */
  override var _clustersSize: js.Any = js.native
  /* CompleteClass */
  override def _joinToClusters(x: js.Any, y: js.Any): Unit = js.native
  /* CompleteClass */
  override def clusters: js.Array[_] = js.native
  /* CompleteClass */
  override def update(x: js.Any, y: js.Any): this.type = js.native
}

