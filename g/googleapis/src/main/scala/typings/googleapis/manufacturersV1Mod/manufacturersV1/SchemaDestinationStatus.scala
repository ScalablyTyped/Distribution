package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The destination status.
  */
@js.native
trait SchemaDestinationStatus extends StObject {
  
  /**
    * The name of the destination.
    */
  var destination: js.UndefOr[String] = js.native
  
  /**
    * The status of the destination.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaDestinationStatus {
  
  @scala.inline
  def apply(): SchemaDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationStatus]
  }
  
  @scala.inline
  implicit class SchemaDestinationStatusMutableBuilder[Self <: SchemaDestinationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
