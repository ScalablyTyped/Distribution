package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains additional information about the check operation.
  */
@js.native
trait SchemaCheckInfo extends StObject {
  
  /**
    * Consumer info of this check.
    */
  var consumerInfo: js.UndefOr[SchemaConsumerInfo] = js.native
  
  /**
    * A list of fields and label keys that are ignored by the server. The
    * client doesn&#39;t need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCheckInfo {
  
  @scala.inline
  def apply(): SchemaCheckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInfo]
  }
  
  @scala.inline
  implicit class SchemaCheckInfoMutableBuilder[Self <: SchemaCheckInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerInfo(value: SchemaConsumerInfo): Self = StObject.set(x, "consumerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerInfoUndefined: Self = StObject.set(x, "consumerInfo", js.undefined)
    
    @scala.inline
    def setUnusedArguments(value: js.Array[String]): Self = StObject.set(x, "unusedArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedArgumentsUndefined: Self = StObject.set(x, "unusedArguments", js.undefined)
    
    @scala.inline
    def setUnusedArgumentsVarargs(value: String*): Self = StObject.set(x, "unusedArguments", js.Array(value :_*))
  }
}
