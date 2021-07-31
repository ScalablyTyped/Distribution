package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListDelegates method.
  */
trait SchemaListDelegatesResponse extends StObject {
  
  /**
    * List of the user&#39;s delegates (with any verification status).
    */
  var delegates: js.UndefOr[js.Array[SchemaDelegate]] = js.undefined
}
object SchemaListDelegatesResponse {
  
  @scala.inline
  def apply(): SchemaListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDelegatesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDelegatesResponseMutableBuilder[Self <: SchemaListDelegatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegates(value: js.Array[SchemaDelegate]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: SchemaDelegate*): Self = StObject.set(x, "delegates", js.Array(value :_*))
  }
}
