package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates which [regional endpoint]
  * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) failed
  * to respond to a request for data.
  */
@js.native
trait SchemaFailedLocation extends StObject {
  
  /**
    * The name of the [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaFailedLocation {
  
  @scala.inline
  def apply(): SchemaFailedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedLocation]
  }
  
  @scala.inline
  implicit class SchemaFailedLocationMutableBuilder[Self <: SchemaFailedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
