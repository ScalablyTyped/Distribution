package typings.kahootJsUpdated.mod

import typings.kahootJsUpdated.kahootJsUpdatedStrings.bronze
import typings.kahootJsUpdated.kahootJsUpdatedStrings.gold
import typings.kahootJsUpdated.kahootJsUpdatedStrings.silver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Podium extends StObject {
  
  var podiumMedalType: js.UndefOr[gold | silver | bronze | Null] = js.undefined
}
object Podium {
  
  inline def apply(): Podium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Podium]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Podium] (val x: Self) extends AnyVal {
    
    inline def setPodiumMedalType(value: gold | silver | bronze): Self = StObject.set(x, "podiumMedalType", value.asInstanceOf[js.Any])
    
    inline def setPodiumMedalTypeNull: Self = StObject.set(x, "podiumMedalType", null)
    
    inline def setPodiumMedalTypeUndefined: Self = StObject.set(x, "podiumMedalType", js.undefined)
  }
}
