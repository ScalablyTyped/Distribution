package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.event.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hook {
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData, 'Tag', 'EventType' | 'Url'> */
  @js.native
  trait CreateHook extends StObject {
    
    var EventType: typings.mangopay2NodejsSdk.mod.event.EventType = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var Url: String = js.native
  }
  object CreateHook {
    
    @scala.inline
    def apply(EventType: EventType, Url: String): CreateHook = {
      val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHook]
    }
    
    @scala.inline
    implicit class CreateHookMutableBuilder[Self <: CreateHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HookData extends EntityBaseData {
    
    /**
      * The event type
      */
    var EventType: typings.mangopay2NodejsSdk.mod.event.EventType = js.native
    
    /**
      * Whether the hook is enabled or not
      */
    var Status: HookStatus = js.native
    
    /**
      * This is the URL where your receive notification for each EventType
      */
    var Url: String = js.native
    
    /**
      * Whether the hook is valid or not
      */
    var Validity: HookValidity = js.native
  }
  object HookData {
    
    @scala.inline
    def apply(
      CreationDate: Double,
      EventType: EventType,
      Id: String,
      Status: HookStatus,
      Tag: String,
      Url: String,
      Validity: HookValidity
    ): HookData = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookData]
    }
    
    @scala.inline
    implicit class HookDataMutableBuilder[Self <: HookData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: HookStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidity(value: HookValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED
  */
  trait HookStatus extends StObject
  object HookStatus {
    
    @scala.inline
    def DISABLED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED]
    
    @scala.inline
    def ENABLED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
  */
  trait HookValidity extends StObject
  object HookValidity {
    
    @scala.inline
    def INVALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = "INVALID".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID]
    
    @scala.inline
    def UNKNOWN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
    
    @scala.inline
    def VALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = "VALID".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID]
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData, 'EventType' | 'Url' | 'Tag', 'Id'> */
  @js.native
  trait UpdateHook extends StObject {
    
    var EventType: js.UndefOr[typings.mangopay2NodejsSdk.mod.event.EventType] = js.native
    
    var Id: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var Url: js.UndefOr[String] = js.native
  }
  object UpdateHook {
    
    @scala.inline
    def apply(Id: String): UpdateHook = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateHook]
    }
    
    @scala.inline
    implicit class UpdateHookMutableBuilder[Self <: UpdateHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
}
