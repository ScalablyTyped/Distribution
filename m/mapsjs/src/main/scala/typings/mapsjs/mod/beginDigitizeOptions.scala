package typings.mapsjs.mod

import typings.mapsjs.mod.geometry.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait beginDigitizeOptions extends js.Object {
  
  var circleEndAction: js.UndefOr[js.Function1[/* circle */ polygon, Unit]] = js.native
  
  var envelopeEndAction: js.UndefOr[js.Function1[/* env */ envelope, Unit]] = js.native
  
  var geometryStyle: js.UndefOr[typings.mapsjs.mod.geometryStyle] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var leavePath: js.UndefOr[Boolean] = js.native
  
  var nodeMoveAction: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* actionType */ String, _]] = js.native
  
  var nodeTapAndHoldAction: js.UndefOr[js.Function2[/* setIdx */ Double, /* idx */ Double, Boolean]] = js.native
  
  var shapeChangeAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var shapeType: String = js.native
  
  var styledGeometry: js.UndefOr[typings.mapsjs.mod.styledGeometry] = js.native
  
  var suppressNodeAdd: js.UndefOr[Boolean] = js.native
}
object beginDigitizeOptions {
  
  @scala.inline
  def apply(shapeType: String): beginDigitizeOptions = {
    val __obj = js.Dynamic.literal(shapeType = shapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[beginDigitizeOptions]
  }
  
  @scala.inline
  implicit class beginDigitizeOptionsOps[Self <: beginDigitizeOptions] (val x: Self) extends AnyVal {
    
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
    def setShapeType(value: String): Self = this.set("shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleEndAction(value: /* circle */ polygon => Unit): Self = this.set("circleEndAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCircleEndAction: Self = this.set("circleEndAction", js.undefined)
    
    @scala.inline
    def setEnvelopeEndAction(value: /* env */ envelope => Unit): Self = this.set("envelopeEndAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnvelopeEndAction: Self = this.set("envelopeEndAction", js.undefined)
    
    @scala.inline
    def setGeometryStyle(value: geometryStyle): Self = this.set("geometryStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryStyle: Self = this.set("geometryStyle", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLeavePath(value: Boolean): Self = this.set("leavePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeavePath: Self = this.set("leavePath", js.undefined)
    
    @scala.inline
    def setNodeMoveAction(value: (/* x */ Double, /* y */ Double, /* actionType */ String) => _): Self = this.set("nodeMoveAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNodeMoveAction: Self = this.set("nodeMoveAction", js.undefined)
    
    @scala.inline
    def setNodeTapAndHoldAction(value: (/* setIdx */ Double, /* idx */ Double) => Boolean): Self = this.set("nodeTapAndHoldAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNodeTapAndHoldAction: Self = this.set("nodeTapAndHoldAction", js.undefined)
    
    @scala.inline
    def setShapeChangeAction(value: () => Unit): Self = this.set("shapeChangeAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShapeChangeAction: Self = this.set("shapeChangeAction", js.undefined)
    
    @scala.inline
    def setStyledGeometry(value: styledGeometry): Self = this.set("styledGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyledGeometry: Self = this.set("styledGeometry", js.undefined)
    
    @scala.inline
    def setSuppressNodeAdd(value: Boolean): Self = this.set("suppressNodeAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressNodeAdd: Self = this.set("suppressNodeAdd", js.undefined)
  }
}
