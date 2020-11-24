package typings.logform.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorizeOptions extends js.Object {
  
  /**
    * If set to `true` the color will be applied to the `message` and `level`.
    */
  var all: js.UndefOr[Boolean] = js.native
  
  /**
    * An object containing the colors for the log levels. For example: `{ info: 'blue', error: 'red' }`.
    */
  var colors: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * If set to `true` the color will be applied to the `level`.
    */
  var level: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to `true` the color will be applied to the `message`.
    */
  var message: js.UndefOr[Boolean] = js.native
}
object ColorizeOptions {
  
  @scala.inline
  def apply(): ColorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorizeOptions]
  }
  
  @scala.inline
  implicit class ColorizeOptionsOps[Self <: ColorizeOptions] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setColors(value: Record[String, String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setLevel(value: Boolean): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMessage(value: Boolean): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
