package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of actions to perform on a message.
  */
@js.native
trait SchemaFilterAction extends StObject {
  
  /**
    * List of labels to add to the message.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Email address that the message should be forwarded to.
    */
  var forward: js.UndefOr[String] = js.native
  
  /**
    * List of labels to remove from the message.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaFilterAction {
  
  @scala.inline
  def apply(): SchemaFilterAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterAction]
  }
  
  @scala.inline
  implicit class SchemaFilterActionMutableBuilder[Self <: SchemaFilterAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
    
    @scala.inline
    def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value :_*))
    
    @scala.inline
    def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    @scala.inline
    def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
    
    @scala.inline
    def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value :_*))
  }
}
