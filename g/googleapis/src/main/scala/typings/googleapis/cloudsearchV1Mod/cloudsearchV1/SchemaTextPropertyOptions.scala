package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for text properties.
  */
@js.native
trait SchemaTextPropertyOptions extends StObject {
  
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTextOperatorOptions] = js.native
  
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.native
}
object SchemaTextPropertyOptions {
  
  @scala.inline
  def apply(): SchemaTextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaTextPropertyOptionsMutableBuilder[Self <: SchemaTextPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: SchemaTextOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    @scala.inline
    def setRetrievalImportance(value: SchemaRetrievalImportance): Self = StObject.set(x, "retrievalImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalImportanceUndefined: Self = StObject.set(x, "retrievalImportance", js.undefined)
  }
}
