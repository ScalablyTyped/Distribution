package typings.konva.transformerMod

import typings.konva.containerMod.ContainerConfig
import typings.konva.rectMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformerConfig extends ContainerConfig {
  
  var anchorFill: js.UndefOr[String] = js.native
  
  var anchorSize: js.UndefOr[Double] = js.native
  
  var anchorStroke: js.UndefOr[String] = js.native
  
  var anchorStrokeWidth: js.UndefOr[Double] = js.native
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var borderEnabled: js.UndefOr[Boolean] = js.native
  
  var borderStroke: js.UndefOr[String] = js.native
  
  var borderStrokeWidth: js.UndefOr[Double] = js.native
  
  var boundBoxFunc: js.UndefOr[js.Function2[/* oldBox */ Box, /* newBox */ Box, Box]] = js.native
  
  var centeredScaling: js.UndefOr[Boolean] = js.native
  
  var enabledAnchors: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreStroke: js.UndefOr[Boolean] = js.native
  
  var keepRatio: js.UndefOr[Boolean] = js.native
  
  var node: js.UndefOr[Rect] = js.native
  
  var resizeEnabled: js.UndefOr[Boolean] = js.native
  
  var rotateAnchorOffset: js.UndefOr[Double] = js.native
  
  var rotateEnabled: js.UndefOr[Boolean] = js.native
  
  var rotationSnapTolerance: js.UndefOr[Double] = js.native
  
  var rotationSnaps: js.UndefOr[js.Array[Double]] = js.native
}
object TransformerConfig {
  
  @scala.inline
  def apply(): TransformerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformerConfig]
  }
  
  @scala.inline
  implicit class TransformerConfigOps[Self <: TransformerConfig] (val x: Self) extends AnyVal {
    
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
    def setAnchorFill(value: String): Self = this.set("anchorFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorFill: Self = this.set("anchorFill", js.undefined)
    
    @scala.inline
    def setAnchorSize(value: Double): Self = this.set("anchorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorSize: Self = this.set("anchorSize", js.undefined)
    
    @scala.inline
    def setAnchorStroke(value: String): Self = this.set("anchorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorStroke: Self = this.set("anchorStroke", js.undefined)
    
    @scala.inline
    def setAnchorStrokeWidth(value: Double): Self = this.set("anchorStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorStrokeWidth: Self = this.set("anchorStrokeWidth", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: Double*): Self = this.set("borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    
    @scala.inline
    def setBorderEnabled(value: Boolean): Self = this.set("borderEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderEnabled: Self = this.set("borderEnabled", js.undefined)
    
    @scala.inline
    def setBorderStroke(value: String): Self = this.set("borderStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStroke: Self = this.set("borderStroke", js.undefined)
    
    @scala.inline
    def setBorderStrokeWidth(value: Double): Self = this.set("borderStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStrokeWidth: Self = this.set("borderStrokeWidth", js.undefined)
    
    @scala.inline
    def setBoundBoxFunc(value: (/* oldBox */ Box, /* newBox */ Box) => Box): Self = this.set("boundBoxFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBoundBoxFunc: Self = this.set("boundBoxFunc", js.undefined)
    
    @scala.inline
    def setCenteredScaling(value: Boolean): Self = this.set("centeredScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenteredScaling: Self = this.set("centeredScaling", js.undefined)
    
    @scala.inline
    def setEnabledAnchorsVarargs(value: String*): Self = this.set("enabledAnchors", js.Array(value :_*))
    
    @scala.inline
    def setEnabledAnchors(value: js.Array[String]): Self = this.set("enabledAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledAnchors: Self = this.set("enabledAnchors", js.undefined)
    
    @scala.inline
    def setIgnoreStroke(value: Boolean): Self = this.set("ignoreStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreStroke: Self = this.set("ignoreStroke", js.undefined)
    
    @scala.inline
    def setKeepRatio(value: Boolean): Self = this.set("keepRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepRatio: Self = this.set("keepRatio", js.undefined)
    
    @scala.inline
    def setNode(value: Rect): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setResizeEnabled(value: Boolean): Self = this.set("resizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeEnabled: Self = this.set("resizeEnabled", js.undefined)
    
    @scala.inline
    def setRotateAnchorOffset(value: Double): Self = this.set("rotateAnchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateAnchorOffset: Self = this.set("rotateAnchorOffset", js.undefined)
    
    @scala.inline
    def setRotateEnabled(value: Boolean): Self = this.set("rotateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateEnabled: Self = this.set("rotateEnabled", js.undefined)
    
    @scala.inline
    def setRotationSnapTolerance(value: Double): Self = this.set("rotationSnapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationSnapTolerance: Self = this.set("rotationSnapTolerance", js.undefined)
    
    @scala.inline
    def setRotationSnapsVarargs(value: Double*): Self = this.set("rotationSnaps", js.Array(value :_*))
    
    @scala.inline
    def setRotationSnaps(value: js.Array[Double]): Self = this.set("rotationSnaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationSnaps: Self = this.set("rotationSnaps", js.undefined)
  }
}
