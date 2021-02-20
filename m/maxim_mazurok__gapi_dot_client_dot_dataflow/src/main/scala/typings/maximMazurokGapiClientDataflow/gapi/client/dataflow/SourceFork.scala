package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFork extends StObject {
  
  /** DEPRECATED */
  var primary: js.UndefOr[SourceSplitShard] = js.native
  
  /** DEPRECATED */
  var primarySource: js.UndefOr[DerivedSource] = js.native
  
  /** DEPRECATED */
  var residual: js.UndefOr[SourceSplitShard] = js.native
  
  /** DEPRECATED */
  var residualSource: js.UndefOr[DerivedSource] = js.native
}
object SourceFork {
  
  @scala.inline
  def apply(): SourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFork]
  }
  
  @scala.inline
  implicit class SourceForkMutableBuilder[Self <: SourceFork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: SourceSplitShard): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimarySource(value: DerivedSource): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimarySourceUndefined: Self = StObject.set(x, "primarySource", js.undefined)
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setResidual(value: SourceSplitShard): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualSource(value: DerivedSource): Self = StObject.set(x, "residualSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualSourceUndefined: Self = StObject.set(x, "residualSource", js.undefined)
    
    @scala.inline
    def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
