package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialHookData
import typings.mangopay2NodejsSdk.hookMod.hook.HookData
import typings.mangopay2NodejsSdk.hookMod.hook.HookStatus
import typings.mangopay2NodejsSdk.hookMod.hook.HookValidity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Hook")
@js.native
open class Hook ()
  extends EntityBase[HookData]
     with HookData {
  def this(data: PartialHookData) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The event type
    */
  /* CompleteClass */
  var EventType: typings.mangopay2NodejsSdk.eventMod.event.EventType = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * Whether the hook is enabled or not
    */
  /* CompleteClass */
  var Status: HookStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * This is the URL where your receive notification for each EventType
    */
  /* CompleteClass */
  var Url: String = js.native
  
  /**
    * Whether the hook is valid or not
    */
  /* CompleteClass */
  var Validity: HookValidity = js.native
}
