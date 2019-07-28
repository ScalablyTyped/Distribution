package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiACLAction extends js.Object

@JSGlobal("KiiCloud.KiiACLAction")
@js.native
object KiiACLAction extends js.Object {
  @js.native
  sealed trait KiiACLBucketActionCreateObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionDropBucket extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionQueryObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionReadObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionRead extends KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionWrite extends KiiACLAction
  
  @js.native
  sealed trait KiiACLSendMessageToTopic extends KiiACLAction
  
  @js.native
  sealed trait KiiACLSubscribeToTopic extends KiiACLAction
  
  /* 0 */ val KiiACLBucketActionCreateObjects: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLBucketActionCreateObjects with Double = js.native
  /* 2 */ val KiiACLBucketActionDropBucket: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLBucketActionDropBucket with Double = js.native
  /* 1 */ val KiiACLBucketActionQueryObjects: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLBucketActionQueryObjects with Double = js.native
  /* 5 */ val KiiACLBucketActionReadObjects: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLBucketActionReadObjects with Double = js.native
  /* 3 */ val KiiACLObjectActionRead: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLObjectActionRead with Double = js.native
  /* 4 */ val KiiACLObjectActionWrite: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLObjectActionWrite with Double = js.native
  /* 7 */ val KiiACLSendMessageToTopic: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLSendMessageToTopic with Double = js.native
  /* 6 */ val KiiACLSubscribeToTopic: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLAction.KiiACLSubscribeToTopic with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiACLAction with Double] = js.native
}

