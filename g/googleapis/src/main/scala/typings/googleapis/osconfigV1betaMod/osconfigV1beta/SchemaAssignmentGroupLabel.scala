package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignmentGroupLabel extends StObject {
  
  /**
    * Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaAssignmentGroupLabel {
  
  inline def apply(): SchemaAssignmentGroupLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignmentGroupLabel]
  }
  
  extension [Self <: SchemaAssignmentGroupLabel](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
