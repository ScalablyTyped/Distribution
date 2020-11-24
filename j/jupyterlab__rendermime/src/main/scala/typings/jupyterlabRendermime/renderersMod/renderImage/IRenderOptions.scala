package typings.jupyterlabRendermime.renderersMod.renderImage

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the `renderImage` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  
  /**
    * The optional height for the image.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The image node to update with the content.
    */
  var host: HTMLElement = js.native
  
  /**
    * The mime type for the image.
    */
  var mimeType: String = js.native
  
  /**
    * Whether an image requires a background for legibility.
    */
  var needsBackground: js.UndefOr[String] = js.native
  
  /**
    * The base64 encoded source for the image.
    */
  var source: String = js.native
  
  /**
    * Whether the image should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional width for the image.
    */
  var width: js.UndefOr[Double] = js.native
}
object IRenderOptions {
  
  @scala.inline
  def apply(host: HTMLElement, mimeType: String, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
  
  @scala.inline
  implicit class IRenderOptionsOps[Self <: IRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setNeedsBackground(value: String): Self = this.set("needsBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsBackground: Self = this.set("needsBackground", js.undefined)
    
    @scala.inline
    def setUnconfined(value: Boolean): Self = this.set("unconfined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnconfined: Self = this.set("unconfined", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
