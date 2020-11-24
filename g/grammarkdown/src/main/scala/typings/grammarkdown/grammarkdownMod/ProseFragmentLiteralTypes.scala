package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownNumbers.`49`
import typings.grammarkdown.grammarkdownNumbers.`50`
import typings.grammarkdown.grammarkdownNumbers.`51`
import typings.grammarkdown.grammarkdownNumbers.`52`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteralKind ]: grammarkdown.grammarkdown/dist/grammarkdown.ProseFragmentLiteral<P>} */
@js.native
trait ProseFragmentLiteralTypes extends js.Object {
  
  var `49`: ProseFragmentLiteral[typings.grammarkdown.grammarkdownNumbers.`49`] = js.native
  
  var `50`: ProseFragmentLiteral[typings.grammarkdown.grammarkdownNumbers.`50`] = js.native
  
  var `51`: ProseFragmentLiteral[typings.grammarkdown.grammarkdownNumbers.`51`] = js.native
  
  var `52`: ProseFragmentLiteral[typings.grammarkdown.grammarkdownNumbers.`52`] = js.native
}
object ProseFragmentLiteralTypes {
  
  @scala.inline
  def apply(
    `49`: ProseFragmentLiteral[`49`],
    `50`: ProseFragmentLiteral[`50`],
    `51`: ProseFragmentLiteral[`51`],
    `52`: ProseFragmentLiteral[`52`]
  ): ProseFragmentLiteralTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("49")(`49`.asInstanceOf[js.Any])
    __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    __obj.updateDynamic("51")(`51`.asInstanceOf[js.Any])
    __obj.updateDynamic("52")(`52`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProseFragmentLiteralTypes]
  }
  
  @scala.inline
  implicit class ProseFragmentLiteralTypesOps[Self <: ProseFragmentLiteralTypes] (val x: Self) extends AnyVal {
    
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
    def set49(value: ProseFragmentLiteral[`49`]): Self = this.set("49", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set50(value: ProseFragmentLiteral[`50`]): Self = this.set("50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set51(value: ProseFragmentLiteral[`51`]): Self = this.set("51", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set52(value: ProseFragmentLiteral[`52`]): Self = this.set("52", value.asInstanceOf[js.Any])
  }
}
