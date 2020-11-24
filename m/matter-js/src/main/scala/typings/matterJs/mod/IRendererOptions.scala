package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRendererOptions extends js.Object {
  
  /**
    * Sets scene background
    * @type string
    * default undefined
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type boolean
    * @default false
    */
  var hasBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type number
    * @default 600
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type number
    * @default 800
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Sets wireframe background if `render.options.wireframes` is enabled
    * @type string
    * default undefined
    */
  var wireframeBackground: js.UndefOr[String] = js.native
  
  /**
    * Render wireframes only
    * @type boolean
    * @default true
    */
  var wireframes: js.UndefOr[Boolean] = js.native
}
object IRendererOptions {
  
  @scala.inline
  def apply(): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptions]
  }
  
  @scala.inline
  implicit class IRendererOptionsOps[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setHasBounds(value: Boolean): Self = this.set("hasBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBounds: Self = this.set("hasBounds", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWireframeBackground(value: String): Self = this.set("wireframeBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframeBackground: Self = this.set("wireframeBackground", js.undefined)
    
    @scala.inline
    def setWireframes(value: Boolean): Self = this.set("wireframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWireframes: Self = this.set("wireframes", js.undefined)
  }
}
