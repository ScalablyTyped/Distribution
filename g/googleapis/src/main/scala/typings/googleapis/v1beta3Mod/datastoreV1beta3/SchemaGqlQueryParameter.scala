package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A binding parameter for a GQL query.
  */
@js.native
trait SchemaGqlQueryParameter extends StObject {
  
  /**
    * A query cursor. Query cursors are returned in query result batches.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * A value parameter.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}
object SchemaGqlQueryParameter {
  
  @scala.inline
  def apply(): SchemaGqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQueryParameter]
  }
  
  @scala.inline
  implicit class SchemaGqlQueryParameterMutableBuilder[Self <: SchemaGqlQueryParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
