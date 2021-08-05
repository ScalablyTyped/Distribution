package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a context.
  */
trait SchemaGoogleCloudDialogflowV2Context extends StObject {
  
  /**
    * Optional. The number of conversational query requests after which the
    * context expires. If set to `0` (the default) the context expires
    * immediately. Contexts expire automatically after 20 minutes if there are
    * no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/contexts/&lt;Context ID&gt;`.  The `Context ID` is always
    * converted to lowercase, may only contain characters in [a-zA-Z0-9_-%] and
    * may be at most 250 bytes long.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The collection of parameters associated with this context.
    * Refer to [this
    * doc](https://cloud.google.com/dialogflow-enterprise/docs/intents-actions-parameters)
    * for syntax.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Context {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Context]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Context](x: Self) {
    
    inline def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    inline def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
