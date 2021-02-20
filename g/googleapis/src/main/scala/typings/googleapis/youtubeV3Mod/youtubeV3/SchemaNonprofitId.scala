package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNonprofitId extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object SchemaNonprofitId {
  
  @scala.inline
  def apply(): SchemaNonprofitId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonprofitId]
  }
  
  @scala.inline
  implicit class SchemaNonprofitIdMutableBuilder[Self <: SchemaNonprofitId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
