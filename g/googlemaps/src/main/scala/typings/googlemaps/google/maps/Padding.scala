package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding Maps JavaScript API}
  */
@js.native
trait Padding extends js.Object {
  
  /**
    * Padding for the bottom, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.bottom Maps JavaScript API}
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the left, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.left Maps JavaScript API}
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the right, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.right Maps JavaScript API}
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the top, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.top Maps JavaScript API}
    */
  var top: js.UndefOr[Double] = js.native
}
object Padding {
  
  @scala.inline
  def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
