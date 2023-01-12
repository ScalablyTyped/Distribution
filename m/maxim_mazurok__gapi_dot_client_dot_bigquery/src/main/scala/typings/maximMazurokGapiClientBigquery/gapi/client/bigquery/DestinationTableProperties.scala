package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationTableProperties extends StObject {
  
  /**
    * [Optional] The description for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the
    * current description is provided, the job will fail.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Internal] This field is for Google internal use only. */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The friendly name for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the
    * current friendly name is provided, the job will fail.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The labels associated with this table. You can use these to organize and group your tables. This will only be used if the destination table is newly created. If the table
    * already exists and labels are different than the current labels are provided, the job will fail.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object DestinationTableProperties {
  
  inline def apply(): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationTableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationTableProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
