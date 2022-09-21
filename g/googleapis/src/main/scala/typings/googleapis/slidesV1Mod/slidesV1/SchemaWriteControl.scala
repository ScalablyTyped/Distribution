package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWriteControl extends StObject {
  
  /**
    * The revision ID of the presentation required for the write request. If specified and the required revision ID doesn't match the presentation's current revision ID, the request is not processed and returns a 400 bad request error. When a required revision ID is returned in a response, it indicates the revision ID of the document after the request was applied.
    */
  var requiredRevisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWriteControl {
  
  inline def apply(): SchemaWriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteControl]
  }
  
  extension [Self <: SchemaWriteControl](x: Self) {
    
    inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
    
    inline def setRequiredRevisionIdNull: Self = StObject.set(x, "requiredRevisionId", null)
    
    inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
  }
}
