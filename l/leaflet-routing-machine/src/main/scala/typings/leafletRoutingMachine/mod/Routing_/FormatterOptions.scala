package typings.leafletRoutingMachine.mod.Routing_

import typings.leafletRoutingMachine.leafletRoutingMachineStrings.imperial
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.metric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatterOptions extends js.Object {
  
  var distanceTemplate: String = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var roundingSensitivity: js.UndefOr[Double] = js.native
  
  var unitNames: js.UndefOr[js.Object] = js.native
  
  var units: js.UndefOr[metric | imperial] = js.native
}
object FormatterOptions {
  
  @scala.inline
  def apply(distanceTemplate: String): FormatterOptions = {
    val __obj = js.Dynamic.literal(distanceTemplate = distanceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterOptions]
  }
  
  @scala.inline
  implicit class FormatterOptionsOps[Self <: FormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setDistanceTemplate(value: String): Self = this.set("distanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRoundingSensitivity(value: Double): Self = this.set("roundingSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingSensitivity: Self = this.set("roundingSensitivity", js.undefined)
    
    @scala.inline
    def setUnitNames(value: js.Object): Self = this.set("unitNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitNames: Self = this.set("unitNames", js.undefined)
    
    @scala.inline
    def setUnits(value: metric | imperial): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
