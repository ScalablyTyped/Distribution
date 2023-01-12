package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAnalysisResult extends StObject {
  
  /** Blocking information that would prevent the target resource from moving to the specified destination at runtime. */
  var blockers: js.UndefOr[js.Array[MoveImpact]] = js.undefined
  
  /**
    * Warning information indicating that moving the target resource to the specified destination might be unsafe. This can include important policy information and configuration changes,
    * but will not block moves at runtime.
    */
  var warnings: js.UndefOr[js.Array[MoveImpact]] = js.undefined
}
object MoveAnalysisResult {
  
  inline def apply(): MoveAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setBlockers(value: js.Array[MoveImpact]): Self = StObject.set(x, "blockers", value.asInstanceOf[js.Any])
    
    inline def setBlockersUndefined: Self = StObject.set(x, "blockers", js.undefined)
    
    inline def setBlockersVarargs(value: MoveImpact*): Self = StObject.set(x, "blockers", js.Array(value*))
    
    inline def setWarnings(value: js.Array[MoveImpact]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: MoveImpact*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
