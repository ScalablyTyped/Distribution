package typings.intlMessageformat.coreMod

import typings.intlMessageformat.formattersMod.Formatters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var formatters: js.UndefOr[Formatters] = js.native
  
  /**
    * Whether to treat HTML/XML tags as string literal
    * instead of parsing them as tag token.
    * When this is false we only allow simple tags without
    * any attributes
    */
  var ignoreTag: js.UndefOr[Boolean] = js.native
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
    def setFormatters(value: Formatters): Self = this.set("formatters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    
    @scala.inline
    def setIgnoreTag(value: Boolean): Self = this.set("ignoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTag: Self = this.set("ignoreTag", js.undefined)
  }
}
