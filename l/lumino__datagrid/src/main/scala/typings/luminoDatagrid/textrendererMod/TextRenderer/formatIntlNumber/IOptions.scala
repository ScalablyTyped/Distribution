package typings.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber

import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for creating an intl number format function.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The locales to pass to the `Intl.NumberFormat` constructor.
    *
    * The default is determined by the user agent.
    */
  var locales: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.native
  
  /**
    * The options to pass to the `Intl.NumberFormat` constructor.
    *
    * The default is determined by the user agent.
    */
  var options: js.UndefOr[NumberFormatOptions] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: String | js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setMissing(value: String): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    
    @scala.inline
    def setOptions(value: NumberFormatOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
