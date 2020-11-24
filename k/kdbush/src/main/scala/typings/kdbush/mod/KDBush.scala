package typings.kdbush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KDBush[T] extends js.Object {
  
  var coords: js.Array[Double] = js.native
  
  var ids: js.Array[Double] = js.native
  
  var nodeSize: Double = js.native
  
  var points: js.Array[T] = js.native
  
  def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
  
  def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
}
object KDBush {
  
  @scala.inline
  def apply[T](
    coords: js.Array[Double],
    ids: js.Array[Double],
    nodeSize: Double,
    points: js.Array[T],
    range: (Double, Double, Double, Double) => js.Array[Double],
    within: (Double, Double, Double) => js.Array[Double]
  ): KDBush[T] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
    __obj.asInstanceOf[KDBush[T]]
  }
  
  @scala.inline
  implicit class KDBushOps[Self <: KDBush[_], T] (val x: Self with KDBush[T]) extends AnyVal {
    
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
    def setCoordsVarargs(value: Double*): Self = this.set("coords", js.Array(value :_*))
    
    @scala.inline
    def setCoords(value: js.Array[Double]): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: Double*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[Double]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSize(value: Double): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: T*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[T]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: (Double, Double, Double, Double) => js.Array[Double]): Self = this.set("range", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWithin(value: (Double, Double, Double) => js.Array[Double]): Self = this.set("within", js.Any.fromFunction3(value))
  }
}
