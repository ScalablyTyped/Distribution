package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification of one of the bundles produced as a result of splitting a
  * Source (e.g. when executing a SourceSplitRequest, or when splitting an
  * active task using WorkItemStatus.dynamic_source_split), relative to the
  * source being split.
  */
trait SchemaDerivedSource extends StObject {
  
  /**
    * What source to base the produced source on (if any).
    */
  var derivationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Specification of the source.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaDerivedSource {
  
  inline def apply(): SchemaDerivedSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerivedSource]
  }
  
  extension [Self <: SchemaDerivedSource](x: Self) {
    
    inline def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    inline def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
