package typings.ionicCliFramework.loggerMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.formatMod.WordWrapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaggedFormatterOptions extends js.Object {
  
  var colors: js.UndefOr[Colors] = js.native
  
  var prefix: js.UndefOr[String | js.Function0[String]] = js.native
  
  var titleize: js.UndefOr[Boolean] = js.native
  
  var wrap: js.UndefOr[Boolean | WordWrapOptions] = js.native
}
object CreateTaggedFormatterOptions {
  
  @scala.inline
  def apply(): CreateTaggedFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaggedFormatterOptions]
  }
  
  @scala.inline
  implicit class CreateTaggedFormatterOptionsOps[Self <: CreateTaggedFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setPrefixFunction0(value: () => String): Self = this.set("prefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefix(value: String | js.Function0[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setTitleize(value: Boolean): Self = this.set("titleize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleize: Self = this.set("titleize", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean | WordWrapOptions): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
