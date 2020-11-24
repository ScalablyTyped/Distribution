package typings.heremaps.H.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which are used to initialize the tile provider.
  * @property crossOrigin {boolean=} - The string to be set for the crossOrigin attribute for loaded images
  */
@js.native
trait TileProviderOptions extends js.Object {
  
  var crossOrigin: js.UndefOr[Boolean] = js.native
}
object TileProviderOptions {
  
  @scala.inline
  def apply(): TileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileProviderOptions]
  }
  
  @scala.inline
  implicit class TileProviderOptionsOps[Self <: TileProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setCrossOrigin(value: Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
  }
}
