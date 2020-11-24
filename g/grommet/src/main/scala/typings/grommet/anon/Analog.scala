package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analog extends js.Object {
  
  var analog: js.UndefOr[Hour] = js.native
  
  var digital: js.UndefOr[Text] = js.native
}
object Analog {
  
  @scala.inline
  def apply(): Analog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analog]
  }
  
  @scala.inline
  implicit class AnalogOps[Self <: Analog] (val x: Self) extends AnyVal {
    
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
    def setAnalog(value: Hour): Self = this.set("analog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalog: Self = this.set("analog", js.undefined)
    
    @scala.inline
    def setDigital(value: Text): Self = this.set("digital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigital: Self = this.set("digital", js.undefined)
  }
}
