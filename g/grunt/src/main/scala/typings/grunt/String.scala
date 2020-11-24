package typings.grunt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/marak/colors.js/}
  */
@js.native
trait String extends js.Object {
  
  var blue: java.lang.String = js.native
  
  var cyan: java.lang.String = js.native
  
  var green: java.lang.String = js.native
  
  var grey: java.lang.String = js.native
  
  var magenta: java.lang.String = js.native
  
  var red: java.lang.String = js.native
  
  var white: java.lang.String = js.native
  
  var yellow: java.lang.String = js.native
}
object String {
  
  @scala.inline
  def apply(
    blue: java.lang.String,
    cyan: java.lang.String,
    green: java.lang.String,
    grey: java.lang.String,
    magenta: java.lang.String,
    red: java.lang.String,
    white: java.lang.String,
    yellow: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlue(value: java.lang.String): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: java.lang.String): Self = this.set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: java.lang.String): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey(value: java.lang.String): Self = this.set("grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagenta(value: java.lang.String): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: java.lang.String): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: java.lang.String): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: java.lang.String): Self = this.set("yellow", value.asInstanceOf[js.Any])
  }
}
