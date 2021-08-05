package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of tags to be filtered.
  */
trait SchemaTagFilterList extends StObject {
  
  /**
    * Tags to be filtered. Tags must be DICOM Data Elements, File Meta
    * Elements, or Directory Structuring Elements, as defined at:
    * http://dicom.nema.org/medical/dicom/current/output/html/part06.html#table_6-1,.
    * They may be provided by &quot;Keyword&quot; or &quot;Tag&quot;. For
    * example &quot;PatientID&quot;, &quot;0010,0010&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTagFilterList {
  
  inline def apply(): SchemaTagFilterList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagFilterList]
  }
  
  extension [Self <: SchemaTagFilterList](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
