package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWriteControl extends StObject {
  
  /**
    * The revision ID of the form that the write request is applied to. If this is not the latest revision of the form, the request is not processed and returns a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target revision ID of the form that the write request is applied to. If changes have occurred after this revision, the changes in this update request are transformed against those changes. This results in a new revision of the form that incorporates both the changes in the request and the intervening changes, with the server resolving conflicting changes. The target revision ID may only be used to write to recent versions of a form. If the target revision is too far behind the latest revision, the request is not processed and returns a 400 (Bad Request Error). The request may be retried after reading the latest version of the form. In most cases a target revision ID remains valid for several minutes after it is read, but for frequently-edited forms this window may be shorter.
    */
  var targetRevisionId: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setTargetRevisionId(value: String): Self = StObject.set(x, "targetRevisionId", value.asInstanceOf[js.Any])
    
    inline def setTargetRevisionIdNull: Self = StObject.set(x, "targetRevisionId", null)
    
    inline def setTargetRevisionIdUndefined: Self = StObject.set(x, "targetRevisionId", js.undefined)
  }
}
