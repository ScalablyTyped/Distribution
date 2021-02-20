package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When a task splits using WorkItemStatus.dynamic_source_split, this message
  * describes the two parts of the split relative to the description of the
  * current task&#39;s input.
  */
@js.native
trait SchemaDynamicSourceSplit extends StObject {
  
  /**
    * Primary part (continued to be processed by worker). Specified relative to
    * the previously-current source. Becomes current.
    */
  var primary: js.UndefOr[SchemaDerivedSource] = js.native
  
  /**
    * Residual part (returned to the pool of work). Specified relative to the
    * previously-current source.
    */
  var residual: js.UndefOr[SchemaDerivedSource] = js.native
}
object SchemaDynamicSourceSplit {
  
  @scala.inline
  def apply(): SchemaDynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSourceSplit]
  }
  
  @scala.inline
  implicit class SchemaDynamicSourceSplitMutableBuilder[Self <: SchemaDynamicSourceSplit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: SchemaDerivedSource): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setResidual(value: SchemaDerivedSource): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
