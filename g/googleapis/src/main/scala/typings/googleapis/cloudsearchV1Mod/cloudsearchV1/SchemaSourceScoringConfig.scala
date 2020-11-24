package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set the scoring configuration. This allows modifying the ranking of results
  * for a source.
  */
@js.native
trait SchemaSourceScoringConfig extends js.Object {
  
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String] = js.native
}
object SchemaSourceScoringConfig {
  
  @scala.inline
  def apply(): SchemaSourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceScoringConfig]
  }
  
  @scala.inline
  implicit class SchemaSourceScoringConfigOps[Self <: SchemaSourceScoringConfig] (val x: Self) extends AnyVal {
    
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
    def setSourceImportance(value: String): Self = this.set("sourceImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImportance: Self = this.set("sourceImportance", js.undefined)
  }
}
