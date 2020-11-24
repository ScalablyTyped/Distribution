package typings.knockoutPaging

import typings.knockoutPaging.anon.Dictname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagingOptions extends js.Object {
  
  var defaults: KnockoutPagingDefaultOptions = js.native
  
  var generators: Dictname = js.native
}
object KnockoutPagingOptions {
  
  @scala.inline
  def apply(defaults: KnockoutPagingDefaultOptions, generators: Dictname): KnockoutPagingOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], generators = generators.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingOptions]
  }
  
  @scala.inline
  implicit class KnockoutPagingOptionsOps[Self <: KnockoutPagingOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: KnockoutPagingDefaultOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerators(value: Dictname): Self = this.set("generators", value.asInstanceOf[js.Any])
  }
}
