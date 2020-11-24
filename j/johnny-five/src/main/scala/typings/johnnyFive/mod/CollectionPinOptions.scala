package typings.johnnyFive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPinOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var pins: js.Array[String | Double] = js.native
}
object CollectionPinOptions {
  
  @scala.inline
  def apply(pins: js.Array[String | Double]): CollectionPinOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPinOptions]
  }
  
  @scala.inline
  implicit class CollectionPinOptionsOps[Self <: CollectionPinOptions] (val x: Self) extends AnyVal {
    
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
    def setPinsVarargs(value: (String | Double)*): Self = this.set("pins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[String | Double]): Self = this.set("pins", value.asInstanceOf[js.Any])
  }
}
