package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSourceSplit extends StObject {
  
  /** Primary part (continued to be processed by worker). Specified relative to the previously-current source. Becomes current. */
  var primary: js.UndefOr[DerivedSource] = js.native
  
  /** Residual part (returned to the pool of work). Specified relative to the previously-current source. */
  var residual: js.UndefOr[DerivedSource] = js.native
}
object DynamicSourceSplit {
  
  @scala.inline
  def apply(): DynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSourceSplit]
  }
  
  @scala.inline
  implicit class DynamicSourceSplitMutableBuilder[Self <: DynamicSourceSplit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: DerivedSource): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setResidual(value: DerivedSource): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
