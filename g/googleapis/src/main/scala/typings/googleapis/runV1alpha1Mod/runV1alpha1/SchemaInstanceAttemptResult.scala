package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceAttemptResult extends StObject {
  
  /**
    * Optional. The exit code of this attempt. This may be unset if the container was unable to exit cleanly with a code due to some other failure. See status field for possible failure details.
    */
  var exitCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The status of this attempt. If the status code is OK, then the attempt succeeded.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaInstanceAttemptResult {
  
  inline def apply(): SchemaInstanceAttemptResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceAttemptResult]
  }
  
  extension [Self <: SchemaInstanceAttemptResult](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeNull: Self = StObject.set(x, "exitCode", null)
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
