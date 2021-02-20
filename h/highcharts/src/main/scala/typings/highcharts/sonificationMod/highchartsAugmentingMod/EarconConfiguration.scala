package typings.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Earcon configuration, specifying an Earcon and when to play it.
  */
@js.native
trait EarconConfiguration extends StObject {
  
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
  var earcon: Earcon = js.native
  
  /**
    * The ID of the point to play the Earcon on.
    */
  var onPoint: js.UndefOr[String] = js.native
}
object EarconConfiguration {
  
  @scala.inline
  def apply(earcon: Earcon): EarconConfiguration = {
    val __obj = js.Dynamic.literal(earcon = earcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconConfiguration]
  }
  
  @scala.inline
  implicit class EarconConfigurationMutableBuilder[Self <: EarconConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: js.Function): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setEarcon(value: Earcon): Self = StObject.set(x, "earcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPoint(value: String): Self = StObject.set(x, "onPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointUndefined: Self = StObject.set(x, "onPoint", js.undefined)
  }
}
