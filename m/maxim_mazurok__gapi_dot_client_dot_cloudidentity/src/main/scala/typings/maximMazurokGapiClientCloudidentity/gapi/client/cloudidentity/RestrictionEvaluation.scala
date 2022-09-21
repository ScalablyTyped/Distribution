package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictionEvaluation extends StObject {
  
  /** Output only. The current state of the restriction */
  var state: js.UndefOr[String] = js.undefined
}
object RestrictionEvaluation {
  
  inline def apply(): RestrictionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictionEvaluation]
  }
  
  extension [Self <: RestrictionEvaluation](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
