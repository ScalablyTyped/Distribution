package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message representing a health dataset.  A health dataset represents a
  * collection of healthcare data pertaining to one or more patients. This may
  * include multiple modalities of healthcare data, such as electronic medical
  * records or medical imaging data.
  */
trait SchemaDataset extends StObject {
  
  /**
    * Output only. Resource name of the dataset, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The default timezone used by this dataset. Must be a either a valid IANA
    * time zone name such as &quot;America/New_York&quot; or empty, which
    * defaults to UTC. This is used for parsing times in resources (e.g., HL7
    * messages) where no explicit timezone is specified.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object SchemaDataset {
  
  inline def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  
  extension [Self <: SchemaDataset](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
