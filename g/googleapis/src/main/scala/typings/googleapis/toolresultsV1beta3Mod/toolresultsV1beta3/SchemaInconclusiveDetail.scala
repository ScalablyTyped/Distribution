package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInconclusiveDetail extends StObject {
  
  /**
    * If the end user aborted the test execution before a pass or fail could be
    * determined. For example, the user pressed ctrl-c which sent a kill signal
    * to the test runner while the test was running.
    */
  var abortedByUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the test runner could not determine success or failure because the
    * test depends on a component other than the system under test which
    * failed.  For example, a mobile test requires provisioning a device where
    * the test executes, and that provisioning can fail.
    */
  var infrastructureFailure: js.UndefOr[Boolean] = js.undefined
}
object SchemaInconclusiveDetail {
  
  inline def apply(): SchemaInconclusiveDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInconclusiveDetail]
  }
  
  extension [Self <: SchemaInconclusiveDetail](x: Self) {
    
    inline def setAbortedByUser(value: Boolean): Self = StObject.set(x, "abortedByUser", value.asInstanceOf[js.Any])
    
    inline def setAbortedByUserUndefined: Self = StObject.set(x, "abortedByUser", js.undefined)
    
    inline def setInfrastructureFailure(value: Boolean): Self = StObject.set(x, "infrastructureFailure", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureFailureUndefined: Self = StObject.set(x, "infrastructureFailure", js.undefined)
  }
}
