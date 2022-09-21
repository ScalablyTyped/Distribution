package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimepoint extends StObject {
  
  /**
    * Timepoint name as received from the client within `` tag.
    */
  var markName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time offset in seconds from the start of the synthesized audio.
    */
  var timeSeconds: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTimepoint {
  
  inline def apply(): SchemaTimepoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimepoint]
  }
  
  extension [Self <: SchemaTimepoint](x: Self) {
    
    inline def setMarkName(value: String): Self = StObject.set(x, "markName", value.asInstanceOf[js.Any])
    
    inline def setMarkNameNull: Self = StObject.set(x, "markName", null)
    
    inline def setMarkNameUndefined: Self = StObject.set(x, "markName", js.undefined)
    
    inline def setTimeSeconds(value: Double): Self = StObject.set(x, "timeSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeSecondsNull: Self = StObject.set(x, "timeSeconds", null)
    
    inline def setTimeSecondsUndefined: Self = StObject.set(x, "timeSeconds", js.undefined)
  }
}
