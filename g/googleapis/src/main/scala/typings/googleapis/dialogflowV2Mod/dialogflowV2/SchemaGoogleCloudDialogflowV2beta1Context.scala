package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a context.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1Context extends StObject {
  
  /**
    * Optional. The number of conversational query requests after which the
    * context expires. If set to `0` (the default) the context expires
    * immediately. Contexts expire automatically after 20 minutes if there are
    * no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.native
  
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/contexts/&lt;Context ID&gt;`, or `projects/&lt;Project
    * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
    * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.  The
    * `Context ID` is always converted to lowercase, may only contain
    * characters in a-zA-Z0-9_-% and may be at most 250 bytes long.  If
    * `Environment ID` is not specified, we assume default &#39;draft&#39;
    * environment. If `User ID` is not specified, we assume default &#39;-&#39;
    * user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of parameters associated with this context.
    * Refer to [this
    * doc](https://cloud.google.com/dialogflow-enterprise/docs/intents-actions-parameters)
    * for syntax.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1Context {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Context]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ContextMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
