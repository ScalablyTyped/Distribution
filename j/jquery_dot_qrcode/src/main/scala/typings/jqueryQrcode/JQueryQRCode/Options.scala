package typings.jqueryQrcode.JQueryQRCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Background color or image element, null for transparent background
    * @default null
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * Error correction level: 'L', 'M', 'Q' or 'H'
    * @default 'L'
    */
  var ecLevel: js.UndefOr[String] = js.native
  
  /**
    * Code color or image element
    * @default '#000'
    */
  var fill: js.UndefOr[String] = js.native
  
  /** @default '#000' */
  var fontcolor: js.UndefOr[String] = js.native
  
  /** @default 'sans' */
  var fontname: js.UndefOr[String] = js.native
  
  /** @default null */
  var image: js.UndefOr[String] = js.native
  
  /** @default 'no label' */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Left offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var left: js.UndefOr[Double] = js.native
  
  /** @default 0.5 */
  var mPosX: js.UndefOr[Double] = js.native
  
  /** @default 0.5 */
  var mPosY: js.UndefOr[Double] = js.native
  
  /** @default 0.1 */
  var mSize: js.UndefOr[Double] = js.native
  
  /**
    * End of version range, somewhere in 1 .. 40
    * @default 40
    */
  var maxVersion: js.UndefOr[Double] = js.native
  
  /**
    * Start of version range, somewhere in 1 .. 40
    * @default 1
    */
  var minVersion: js.UndefOr[Double] = js.native
  
  /**
    * Mode
    * @default Mode.NORMAL
    */
  var mode: js.UndefOr[Mode] = js.native
  
  /**
    * Quiet zone in modules
    * @default 0
    */
  var quiet: js.UndefOr[Double] = js.native
  
  /**
    * Corner radius relative to module width: 0.0 .. 0.5
    * @default 0
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * Render method: 'canvas', 'image' or 'div'
    * @default 'canvas'
    */
  var render: js.UndefOr[String] = js.native
  
  /**
    * Size in pixel
    * @default 200
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * The text content of the QR code.
    * @default 'no text'
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Top offset in pixels, if drawn onto existing canvas
    * @default 0
    */
  var top: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setEcLevel(value: String): Self = this.set("ecLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcLevel: Self = this.set("ecLevel", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFontcolor(value: String): Self = this.set("fontcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontcolor: Self = this.set("fontcolor", js.undefined)
    
    @scala.inline
    def setFontname(value: String): Self = this.set("fontname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontname: Self = this.set("fontname", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMPosX(value: Double): Self = this.set("mPosX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMPosX: Self = this.set("mPosX", js.undefined)
    
    @scala.inline
    def setMPosY(value: Double): Self = this.set("mPosY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMPosY: Self = this.set("mPosY", js.undefined)
    
    @scala.inline
    def setMSize(value: Double): Self = this.set("mSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMSize: Self = this.set("mSize", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: Double): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: Double): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setQuiet(value: Double): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRender(value: String): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
