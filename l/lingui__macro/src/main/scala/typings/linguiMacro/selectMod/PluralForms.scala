package typings.linguiMacro.selectMod

import org.scalablytyped.runtime.NumberDictionary
import typings.linguiCore.i18nMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralForms extends /* exact */ NumberDictionary[String | MessageDescriptor] {
  
  var few: js.UndefOr[String | MessageDescriptor] = js.native
  
  var many: js.UndefOr[String | MessageDescriptor] = js.native
  
  var one: js.UndefOr[String | MessageDescriptor] = js.native
  
  var other: String | MessageDescriptor = js.native
  
  var two: js.UndefOr[String | MessageDescriptor] = js.native
  
  var zero: js.UndefOr[String | MessageDescriptor] = js.native
}
object PluralForms {
  
  @scala.inline
  def apply(other: String | MessageDescriptor): PluralForms = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralForms]
  }
  
  @scala.inline
  implicit class PluralFormsOps[Self <: PluralForms] (val x: Self) extends AnyVal {
    
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
    def setOther(value: String | MessageDescriptor): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFew(value: String | MessageDescriptor): Self = this.set("few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    
    @scala.inline
    def setMany(value: String | MessageDescriptor): Self = this.set("many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    
    @scala.inline
    def setOne(value: String | MessageDescriptor): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    
    @scala.inline
    def setTwo(value: String | MessageDescriptor): Self = this.set("two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    
    @scala.inline
    def setZero(value: String | MessageDescriptor): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}
