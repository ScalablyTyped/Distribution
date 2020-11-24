package typings.humanizeDuration.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanizerOptions extends Options {
  
  var languages: js.UndefOr[StringDictionary[UnitTranslationOptions]] = js.native
}
object HumanizerOptions {
  
  @scala.inline
  def apply(): HumanizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanizerOptions]
  }
  
  @scala.inline
  implicit class HumanizerOptionsOps[Self <: HumanizerOptions] (val x: Self) extends AnyVal {
    
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
    def setLanguages(value: StringDictionary[UnitTranslationOptions]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
}
