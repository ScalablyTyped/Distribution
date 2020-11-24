package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of the type, names/ids, and input/outputs for a transform.
  */
@js.native
trait SchemaTransformSummary extends js.Object {
  
  /**
    * Transform-specific display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.native
  
  /**
    * SDK generated id of this transform instance.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * User names for all collection inputs to this transform.
    */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Type of transform.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * User provided name for this transform instance.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User  names for all collection outputs to this transform.
    */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTransformSummary {
  
  @scala.inline
  def apply(): SchemaTransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransformSummary]
  }
  
  @scala.inline
  implicit class SchemaTransformSummaryOps[Self <: SchemaTransformSummary] (val x: Self) extends AnyVal {
    
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
    def setDisplayDataVarargs(value: SchemaDisplayData*): Self = this.set("displayData", js.Array(value :_*))
    
    @scala.inline
    def setDisplayData(value: js.Array[SchemaDisplayData]): Self = this.set("displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayData: Self = this.set("displayData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputCollectionNameVarargs(value: String*): Self = this.set("inputCollectionName", js.Array(value :_*))
    
    @scala.inline
    def setInputCollectionName(value: js.Array[String]): Self = this.set("inputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputCollectionName: Self = this.set("inputCollectionName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputCollectionNameVarargs(value: String*): Self = this.set("outputCollectionName", js.Array(value :_*))
    
    @scala.inline
    def setOutputCollectionName(value: js.Array[String]): Self = this.set("outputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputCollectionName: Self = this.set("outputCollectionName", js.undefined)
  }
}
