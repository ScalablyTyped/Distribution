package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The input content for the `ImportProductSets` method.
  */
@js.native
trait SchemaImportProductSetsInputConfig extends js.Object {
  
  /**
    * The Google Cloud Storage location for a csv file which preserves a list
    * of ImportProductSetRequests in each line.
    */
  var gcsSource: js.UndefOr[SchemaImportProductSetsGcsSource] = js.native
}
object SchemaImportProductSetsInputConfig {
  
  @scala.inline
  def apply(): SchemaImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsInputConfig]
  }
  
  @scala.inline
  implicit class SchemaImportProductSetsInputConfigOps[Self <: SchemaImportProductSetsInputConfig] (val x: Self) extends AnyVal {
    
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
    def setGcsSource(value: SchemaImportProductSetsGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}
