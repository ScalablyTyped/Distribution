package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED in favor of DynamicSourceSplit.
  */
trait SchemaSourceFork extends StObject {
  
  /**
    * DEPRECATED
    */
  var primary: js.UndefOr[SchemaSourceSplitShard] = js.undefined
  
  /**
    * DEPRECATED
    */
  var primarySource: js.UndefOr[SchemaDerivedSource] = js.undefined
  
  /**
    * DEPRECATED
    */
  var residual: js.UndefOr[SchemaSourceSplitShard] = js.undefined
  
  /**
    * DEPRECATED
    */
  var residualSource: js.UndefOr[SchemaDerivedSource] = js.undefined
}
object SchemaSourceFork {
  
  @scala.inline
  def apply(): SchemaSourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceFork]
  }
  
  @scala.inline
  implicit class SchemaSourceForkMutableBuilder[Self <: SchemaSourceFork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: SchemaSourceSplitShard): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimarySource(value: SchemaDerivedSource): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimarySourceUndefined: Self = StObject.set(x, "primarySource", js.undefined)
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setResidual(value: SchemaSourceSplitShard): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualSource(value: SchemaDerivedSource): Self = StObject.set(x, "residualSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidualSourceUndefined: Self = StObject.set(x, "residualSource", js.undefined)
    
    @scala.inline
    def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
