package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetPoolInstanceHealth extends StObject {
  
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth
    * when checking the health of an instance.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTargetPoolInstanceHealth {
  
  @scala.inline
  def apply(): SchemaTargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolInstanceHealth]
  }
  
  @scala.inline
  implicit class SchemaTargetPoolInstanceHealthMutableBuilder[Self <: SchemaTargetPoolInstanceHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: js.Array[SchemaHealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setHealthStatusVarargs(value: SchemaHealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
