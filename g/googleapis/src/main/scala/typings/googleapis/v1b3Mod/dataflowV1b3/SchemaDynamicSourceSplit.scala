package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicSourceSplit extends StObject {
  
  /**
    * Primary part (continued to be processed by worker). Specified relative to the previously-current source. Becomes current.
    */
  var primary: js.UndefOr[SchemaDerivedSource] = js.undefined
  
  /**
    * Residual part (returned to the pool of work). Specified relative to the previously-current source.
    */
  var residual: js.UndefOr[SchemaDerivedSource] = js.undefined
}
object SchemaDynamicSourceSplit {
  
  inline def apply(): SchemaDynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSourceSplit]
  }
  
  extension [Self <: SchemaDynamicSourceSplit](x: Self) {
    
    inline def setPrimary(value: SchemaDerivedSource): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setResidual(value: SchemaDerivedSource): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    inline def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
