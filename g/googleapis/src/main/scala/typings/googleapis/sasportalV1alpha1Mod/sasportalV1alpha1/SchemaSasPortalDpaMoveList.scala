package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDpaMoveList extends StObject {
  
  /**
    * The ID of the DPA.
    */
  var dpaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The frequency range that the move list affects.
    */
  var frequencyRange: js.UndefOr[SchemaSasPortalFrequencyRange] = js.undefined
}
object SchemaSasPortalDpaMoveList {
  
  inline def apply(): SchemaSasPortalDpaMoveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDpaMoveList]
  }
  
  extension [Self <: SchemaSasPortalDpaMoveList](x: Self) {
    
    inline def setDpaId(value: String): Self = StObject.set(x, "dpaId", value.asInstanceOf[js.Any])
    
    inline def setDpaIdNull: Self = StObject.set(x, "dpaId", null)
    
    inline def setDpaIdUndefined: Self = StObject.set(x, "dpaId", js.undefined)
    
    inline def setFrequencyRange(value: SchemaSasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
  }
}
