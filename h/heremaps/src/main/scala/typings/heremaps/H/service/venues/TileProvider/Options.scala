package typings.heremaps.H.service.venues.TileProvider

import typings.heremaps.H.service.venues.Space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration object which can be used to initialize the TileProvider.
  * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
  * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
  * @property onSpaceCreated {function(H.service.venues.Space)=} - A callback function that is called on every created space (see H.service.venues.Space) object. The function can be
  * used for space object styling.
  */
@js.native
trait Options extends js.Object {
  
  var onSpaceCreated: js.UndefOr[js.Function1[/* space */ Space, Unit]] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var tileCacheSize: js.UndefOr[Double] = js.native
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
    def setOnSpaceCreated(value: /* space */ Space => Unit): Self = this.set("onSpaceCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSpaceCreated: Self = this.set("onSpaceCreated", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setTileCacheSize(value: Double): Self = this.set("tileCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileCacheSize: Self = this.set("tileCacheSize", js.undefined)
  }
}
