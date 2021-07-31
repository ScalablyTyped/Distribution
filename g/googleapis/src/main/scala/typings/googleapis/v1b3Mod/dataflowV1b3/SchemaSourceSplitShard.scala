package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED in favor of DerivedSource.
  */
trait SchemaSourceSplitShard extends StObject {
  
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String] = js.undefined
  
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceSplitShard {
  
  @scala.inline
  def apply(): SchemaSourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitShard]
  }
  
  @scala.inline
  implicit class SchemaSourceSplitShardMutableBuilder[Self <: SchemaSourceSplitShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
