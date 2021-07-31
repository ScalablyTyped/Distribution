package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bing Maps
  */
trait BingProviderCultureOptions extends StObject {
  
  var c: js.UndefOr[String] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
}
object BingProviderCultureOptions {
  
  @scala.inline
  def apply(): BingProviderCultureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderCultureOptions]
  }
  
  @scala.inline
  implicit class BingProviderCultureOptionsMutableBuilder[Self <: BingProviderCultureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
  }
}
