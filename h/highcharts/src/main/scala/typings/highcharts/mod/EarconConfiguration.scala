package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Earcon configuration, specifying an Earcon and when to play it.
  */
@js.native
trait EarconConfiguration extends js.Object {
  
  /**
    * A function to determine whether or not to play this earcon on a
    * point. The function is called for every point, receiving that point
    * as parameter. It should return either a boolean indicating whether or
    * not to play the earcon, or a new Earcon instance - in which case the
    * new Earcon will be played.
    */
  var condition: js.UndefOr[js.Function] = js.native
  
  /**
    * An Earcon instance.
    */
  var earcon: typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon = js.native
  
  /**
    * The ID of the point to play the Earcon on.
    */
  var onPoint: js.UndefOr[String] = js.native
}
object EarconConfiguration {
  
  @scala.inline
  def apply(earcon: typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon): EarconConfiguration = {
    val __obj = js.Dynamic.literal(earcon = earcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconConfiguration]
  }
  
  @scala.inline
  implicit class EarconConfigurationOps[Self <: EarconConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEarcon(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon): Self = this.set("earcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: js.Function): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setOnPoint(value: String): Self = this.set("onPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPoint: Self = this.set("onPoint", js.undefined)
  }
}
