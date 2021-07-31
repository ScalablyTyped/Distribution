package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductStatusDestinationStatus extends StObject {
  
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object SchemaProductStatusDestinationStatus {
  
  @scala.inline
  def apply(): SchemaProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDestinationStatus]
  }
  
  @scala.inline
  implicit class SchemaProductStatusDestinationStatusMutableBuilder[Self <: SchemaProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    
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
