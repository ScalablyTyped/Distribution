package typings.mathjs.mod

import typings.mathjs.mathjsStrings.binary_long
import typings.mathjs.mathjsStrings.binary_short
import typings.mathjs.mathjsStrings.long
import typings.mathjs.mathjsStrings.none
import typings.mathjs.mathjsStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUnitOptions extends js.Object {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var prefixes: js.UndefOr[none | short | long | binary_short | binary_long] = js.native
}
object CreateUnitOptions {
  
  @scala.inline
  def apply(): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnitOptions]
  }
  
  @scala.inline
  implicit class CreateUnitOptionsOps[Self <: CreateUnitOptions] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setPrefixes(value: none | short | long | binary_short | binary_long): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
  }
}
