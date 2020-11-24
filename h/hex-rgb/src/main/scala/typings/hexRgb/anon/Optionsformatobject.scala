package typings.hexRgb.anon

import typings.hexRgb.hexRgbStrings.`object`
import typings.hexRgb.hexRgbStrings.array
import typings.hexRgb.hexRgbStrings.css
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hex-rgb.hex-rgb.Options & {  format :'object'} */
@js.native
trait Optionsformatobject extends js.Object {
  
  /**
  		The RGB output format.
  		Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
  		@default 'object'
  		*/
  val format: (js.UndefOr[`object` | array | css]) with `object` = js.native
}
object Optionsformatobject {
  
  @scala.inline
  def apply(format: (js.UndefOr[`object` | array | css]) with `object`): Optionsformatobject = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsformatobject]
  }
  
  @scala.inline
  implicit class OptionsformatobjectOps[Self <: Optionsformatobject] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: (js.UndefOr[`object` | array | css]) with `object`): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
