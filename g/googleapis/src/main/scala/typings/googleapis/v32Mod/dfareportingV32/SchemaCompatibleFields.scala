package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response to the queryCompatibleFields method.
  */
@js.native
trait SchemaCompatibleFields extends js.Object {
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[SchemaReportCompatibleFields] = js.native
}
object SchemaCompatibleFields {
  
  @scala.inline
  def apply(): SchemaCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompatibleFields]
  }
  
  @scala.inline
  implicit class SchemaCompatibleFieldsOps[Self <: SchemaCompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setCrossDimensionReachReportCompatibleFields(value: SchemaCrossDimensionReachReportCompatibleFields): Self = this.set("crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDimensionReachReportCompatibleFields: Self = this.set("crossDimensionReachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setFloodlightReportCompatibleFields(value: SchemaFloodlightReportCompatibleFields): Self = this.set("floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightReportCompatibleFields: Self = this.set("floodlightReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPathToConversionReportCompatibleFields(value: SchemaPathToConversionReportCompatibleFields): Self = this.set("pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathToConversionReportCompatibleFields: Self = this.set("pathToConversionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReachReportCompatibleFields(value: SchemaReachReportCompatibleFields): Self = this.set("reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachReportCompatibleFields: Self = this.set("reachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReportCompatibleFields(value: SchemaReportCompatibleFields): Self = this.set("reportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportCompatibleFields: Self = this.set("reportCompatibleFields", js.undefined)
  }
}
