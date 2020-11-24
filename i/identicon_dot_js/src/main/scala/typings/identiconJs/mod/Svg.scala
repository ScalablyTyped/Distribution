package typings.identiconJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Svg extends js.Object {
  
  var background: Color = js.native
  
  /**
    * Returns a string with the structure 'rgb(r, g, b, a)'.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def color(red: Double, green: Double, blue: Double, alpha: Double): String = js.native
  
  var foreground: Color = js.native
  
  /**
    * Returns the Svg as a base64 encoded string.
    */
  def getBase64(): String = js.native
  
  /**
    * Returns the Svg as string.
    */
  def getDump(): String = js.native
  
  var rectangles: js.Array[typings.identiconJs.anon.Color] = js.native
  
  var size: Double = js.native
}
object Svg {
  
  @scala.inline
  def apply(
    background: Color,
    color: (Double, Double, Double, Double) => String,
    foreground: Color,
    getBase64: () => String,
    getDump: () => String,
    rectangles: js.Array[typings.identiconJs.anon.Color],
    size: Double
  ): Svg = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = js.Any.fromFunction4(color), foreground = foreground.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
  
  @scala.inline
  implicit class SvgOps[Self <: Svg] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: (Double, Double, Double, Double) => String): Self = this.set("color", js.Any.fromFunction4(value))
    
    @scala.inline
    def setForeground(value: Color): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBase64(value: () => String): Self = this.set("getBase64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDump(value: () => String): Self = this.set("getDump", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRectanglesVarargs(value: typings.identiconJs.anon.Color*): Self = this.set("rectangles", js.Array(value :_*))
    
    @scala.inline
    def setRectangles(value: js.Array[typings.identiconJs.anon.Color]): Self = this.set("rectangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
