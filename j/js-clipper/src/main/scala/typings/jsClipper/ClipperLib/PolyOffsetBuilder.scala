package typings.jsClipper.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyOffsetBuilder extends js.Object {
  
  def AddPoint(pt: IntPoint): Unit = js.native
  
  def DoMiter(): Unit = js.native
  
  def DoRound(): Unit = js.native
  
  def DoSquare(mul: Double): Unit = js.native
  
  def UpdateBotPt(pt: IntPoint): Boolean = js.native
  
  var botPt: PolyOffsetBuilder = js.native
  
  var currentPoly: Polygon = js.native
  
  var delta: Double = js.native
  
  var m_R: Double = js.native
  
  var m_i: Double = js.native
  
  var m_j: Double = js.native
  
  var m_k: Double = js.native
  
  var normals: ArrayLike[IntPoint] = js.native
  
  var pts: Polygons = js.native
}
object PolyOffsetBuilder {
  
  @scala.inline
  def apply(
    AddPoint: IntPoint => Unit,
    DoMiter: () => Unit,
    DoRound: () => Unit,
    DoSquare: Double => Unit,
    UpdateBotPt: IntPoint => Boolean,
    botPt: PolyOffsetBuilder,
    currentPoly: Polygon,
    delta: Double,
    m_R: Double,
    m_i: Double,
    m_j: Double,
    m_k: Double,
    normals: ArrayLike[IntPoint],
    pts: Polygons
  ): PolyOffsetBuilder = {
    val __obj = js.Dynamic.literal(AddPoint = js.Any.fromFunction1(AddPoint), DoMiter = js.Any.fromFunction0(DoMiter), DoRound = js.Any.fromFunction0(DoRound), DoSquare = js.Any.fromFunction1(DoSquare), UpdateBotPt = js.Any.fromFunction1(UpdateBotPt), botPt = botPt.asInstanceOf[js.Any], currentPoly = currentPoly.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], m_R = m_R.asInstanceOf[js.Any], m_i = m_i.asInstanceOf[js.Any], m_j = m_j.asInstanceOf[js.Any], m_k = m_k.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOffsetBuilder]
  }
  
  @scala.inline
  implicit class PolyOffsetBuilderOps[Self <: PolyOffsetBuilder] (val x: Self) extends AnyVal {
    
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
    def setAddPoint(value: IntPoint => Unit): Self = this.set("AddPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoMiter(value: () => Unit): Self = this.set("DoMiter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoRound(value: () => Unit): Self = this.set("DoRound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoSquare(value: Double => Unit): Self = this.set("DoSquare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateBotPt(value: IntPoint => Boolean): Self = this.set("UpdateBotPt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBotPt(value: PolyOffsetBuilder): Self = this.set("botPt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPoly(value: Polygon): Self = this.set("currentPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_R(value: Double): Self = this.set("m_R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_i(value: Double): Self = this.set("m_i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_j(value: Double): Self = this.set("m_j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_k(value: Double): Self = this.set("m_k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormals(value: ArrayLike[IntPoint]): Self = this.set("normals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPts(value: Polygons): Self = this.set("pts", value.asInstanceOf[js.Any])
  }
}
