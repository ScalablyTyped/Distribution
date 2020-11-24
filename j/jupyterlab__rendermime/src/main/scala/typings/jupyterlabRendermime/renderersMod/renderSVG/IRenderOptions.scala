package typings.jupyterlabRendermime.renderersMod.renderSVG

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the `renderSVG` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  
  /**
    * The host node for the rendered SVG.
    */
  var host: HTMLElement = js.native
  
  /**
    * The SVG source.
    */
  var source: String = js.native
  
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean = js.native
  
  /**
    * Whether the svg should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.native
}
object IRenderOptions {
  
  @scala.inline
  def apply(host: HTMLElement, source: String, trusted: Boolean): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnconfined(value: Boolean): Self = this.set("unconfined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnconfined: Self = this.set("unconfined", js.undefined)
  }
}
