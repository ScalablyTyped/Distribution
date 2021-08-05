package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.recordMod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickActionMod {
  
  @JSImport("jsforce/quick-action", "QuickAction")
  @js.native
  class QuickAction () extends StObject {
    
    /** Retrieve default field values in the action */
    def defaultValues(): js.Promise[Record[js.Any]] = js.native
    def defaultValues(callback: Callback[Record[js.Any]]): js.Promise[Record[js.Any]] = js.native
    /**
      * Retrieve default field values in the action for the given record
      * @param contextId Id of record
      * @param callback Callback function
      */
    def defaultValues(contextId: String): js.Promise[Record[js.Any]] = js.native
    def defaultValues(contextId: String, callback: Callback[Record[js.Any]]): js.Promise[Record[js.Any]] = js.native
    
    /**
      * Describe the action's information (including layout, etc.)
      * @param callback Callback function
      */
    def describe(): js.Promise[QuickActionDescribeInfo] = js.native
    def describe(callback: Callback[QuickActionDescribeInfo]): js.Promise[QuickActionDescribeInfo] = js.native
    
    /**
      * Execute the action for given context id and record information
      * @param contextId Context record ID of the action
      * @param record Input record information for the action
      * @param callback Callback function
      */
    def execute[T](contextId: String, record: Record[T]): js.Promise[QuickActionResult] = js.native
    def execute[T](contextId: String, record: Record[T], callback: Callback[QuickActionResult]): js.Promise[QuickActionResult] = js.native
  }
  
  trait QuickActionDescribeInfo extends StObject {
    
    /** Object type used for the action */
    var contextSobjectType: String
    
    /** Layout sections that comprise an action */
    var layout: js.Object
    
    /** Field name in the target object which refers parent(context) object record ID */
    var targetParentField: String
    
    /** Record type of the targeted record */
    var targetRecordTypeId: String
    
    /** Object type of the action to target */
    var targetSobjectType: String
  }
  object QuickActionDescribeInfo {
    
    inline def apply(
      contextSobjectType: String,
      layout: js.Object,
      targetParentField: String,
      targetRecordTypeId: String,
      targetSobjectType: String
    ): QuickActionDescribeInfo = {
      val __obj = js.Dynamic.literal(contextSobjectType = contextSobjectType.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], targetParentField = targetParentField.asInstanceOf[js.Any], targetRecordTypeId = targetRecordTypeId.asInstanceOf[js.Any], targetSobjectType = targetSobjectType.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickActionDescribeInfo]
    }
    
    extension [Self <: QuickActionDescribeInfo](x: Self) {
      
      inline def setContextSobjectType(value: String): Self = StObject.set(x, "contextSobjectType", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: js.Object): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setTargetParentField(value: String): Self = StObject.set(x, "targetParentField", value.asInstanceOf[js.Any])
      
      inline def setTargetRecordTypeId(value: String): Self = StObject.set(x, "targetRecordTypeId", value.asInstanceOf[js.Any])
      
      inline def setTargetSobjectType(value: String): Self = StObject.set(x, "targetSobjectType", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuickActionInfo extends StObject {
    
    /** Label of the action */
    var label: String
    
    /** Name of the action */
    var name: String
    
    /** Type of the action (e.g. Create, Update, Post, LogACall) */
    var `type`: String
    
    /** Endpoint URL information of the action */
    var urls: js.Object
  }
  object QuickActionInfo {
    
    inline def apply(label: String, name: String, `type`: String, urls: js.Object): QuickActionInfo = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickActionInfo]
    }
    
    extension [Self <: QuickActionInfo](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Object): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    }
  }
  
  type QuickActionResult = js.Object
}
