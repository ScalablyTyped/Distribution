package typings.googleapis.v1b3Mod.dataflowV1b3

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
trait SchemaDerivedSource extends js.Object {
  
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
  implicit class SchemaDerivedSourceOps[Self <: SchemaDerivedSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDerivationMode(value: String): Self = this.set("derivationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDerivationMode: Self = this.set("derivationMode", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
