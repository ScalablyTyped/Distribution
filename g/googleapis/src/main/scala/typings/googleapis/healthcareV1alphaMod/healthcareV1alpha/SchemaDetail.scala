package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains multiple sensitive information findings for each resource slice.
  */
trait SchemaDetail extends StObject {
  
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.undefined
}
object SchemaDetail {
  
  @scala.inline
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  
  @scala.inline
  implicit class SchemaDetailMutableBuilder[Self <: SchemaDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: js.Array[SchemaFinding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    @scala.inline
    def setFindingsVarargs(value: SchemaFinding*): Self = StObject.set(x, "findings", js.Array(value :_*))
  }
}
