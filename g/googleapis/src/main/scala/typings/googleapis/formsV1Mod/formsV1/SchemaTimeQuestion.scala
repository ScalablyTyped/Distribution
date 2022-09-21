package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeQuestion extends StObject {
  
  /**
    * `true` if the question is about an elapsed time. Otherwise it is about a time of day.
    */
  var duration: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTimeQuestion {
  
  inline def apply(): SchemaTimeQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeQuestion]
  }
  
  extension [Self <: SchemaTimeQuestion](x: Self) {
    
    inline def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
