package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification of one of the bundles produced as a result of splitting a
  * Source (e.g. when executing a SourceSplitRequest, or when splitting an
  * active task using WorkItemStatus.dynamic_source_split), relative to the
  * source being split.
  */
@js.native
trait SchemaDerivedSource extends StObject {
  
  /**
    * What source to base the produced source on (if any).
    */
  var derivationMode: js.UndefOr[String] = js.native
  
  /**
    * Specification of the source.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaDerivedSource {
  
  @scala.inline
  def apply(): SchemaDerivedSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerivedSource]
  }
  
  @scala.inline
  implicit class SchemaDerivedSourceMutableBuilder[Self <: SchemaDerivedSource] (val x: Self) extends AnyVal {
    
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
