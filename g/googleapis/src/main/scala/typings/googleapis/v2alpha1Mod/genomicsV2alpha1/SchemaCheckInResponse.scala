package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to the CheckIn method.
  */
trait SchemaCheckInResponse extends StObject {
  
  /**
    * The deadline by which the worker must request an extension.  The backend
    * will allow for network transmission time and other delays, but the worker
    * must attempt to transmit the extension request no later than the
    * deadline.
    */
  var deadline: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata that describes the operation assigned to the worker.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaCheckInResponse {
  
  @scala.inline
  def apply(): SchemaCheckInResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInResponse]
  }
  
  @scala.inline
  implicit class SchemaCheckInResponseMutableBuilder[Self <: SchemaCheckInResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: String): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
