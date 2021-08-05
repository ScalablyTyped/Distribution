package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides control over how write requests are executed.
  */
trait SchemaWriteControl extends StObject {
  
  /**
    * The revision ID of the presentation required for the write request. If
    * specified and the `required_revision_id` doesn&#39;t exactly match the
    * presentation&#39;s current `revision_id`, the request will not be
    * processed and will return a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String] = js.undefined
}
object SchemaWriteControl {
  
  inline def apply(): SchemaWriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteControl]
  }
  
  extension [Self <: SchemaWriteControl](x: Self) {
    
    inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
    
    inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
  }
}
