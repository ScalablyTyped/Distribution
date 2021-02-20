package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location information about a resource.
  */
@js.native
trait SchemaResourceLocation extends StObject {
  
  /**
    * The locations of a resource after the execution of the operation.
    * Requests to create or delete a location based resource must populate the
    * &#39;current_locations&#39; field and not the
    * &#39;original_locations&#39; field. For example:
    * &quot;europe-west1-a&quot;     &quot;us-east1&quot;     &quot;nam3&quot;
    */
  var currentLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The locations of a resource prior to the execution of the operation.
    * Requests that mutate the resource&#39;s location must populate both the
    * &#39;original_locations&#39; as well as the &#39;current_locations&#39;
    * fields. For example:      &quot;europe-west1-a&quot; &quot;us-east1&quot;
    * &quot;nam3&quot;
    */
  var originalLocations: js.UndefOr[js.Array[String]] = js.native
}
object SchemaResourceLocation {
  
  @scala.inline
  def apply(): SchemaResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLocation]
  }
  
  @scala.inline
  implicit class SchemaResourceLocationMutableBuilder[Self <: SchemaResourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentLocations(value: js.Array[String]): Self = StObject.set(x, "currentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLocationsUndefined: Self = StObject.set(x, "currentLocations", js.undefined)
    
    @scala.inline
    def setCurrentLocationsVarargs(value: String*): Self = StObject.set(x, "currentLocations", js.Array(value :_*))
    
    @scala.inline
    def setOriginalLocations(value: js.Array[String]): Self = StObject.set(x, "originalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalLocationsUndefined: Self = StObject.set(x, "originalLocations", js.undefined)
    
    @scala.inline
    def setOriginalLocationsVarargs(value: String*): Self = StObject.set(x, "originalLocations", js.Array(value :_*))
  }
}
