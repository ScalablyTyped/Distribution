package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiACLAction extends js.Object

@JSGlobal("KiiCloud.KiiACLAction")
@js.native
object KiiACLAction extends js.Object {
  @js.native
  sealed trait KiiACLBucketActionCreateObjects
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionDropBucket
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionQueryObjects
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionReadObjects
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionRead
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionWrite
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLSendMessageToTopic
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  @js.native
  sealed trait KiiACLSubscribeToTopic
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction
  
  /* 0 */ val KiiACLBucketActionCreateObjects: KiiACLBucketActionCreateObjects with scala.Double = js.native
  /* 2 */ val KiiACLBucketActionDropBucket: KiiACLBucketActionDropBucket with scala.Double = js.native
  /* 1 */ val KiiACLBucketActionQueryObjects: KiiACLBucketActionQueryObjects with scala.Double = js.native
  /* 5 */ val KiiACLBucketActionReadObjects: KiiACLBucketActionReadObjects with scala.Double = js.native
  /* 3 */ val KiiACLObjectActionRead: KiiACLObjectActionRead with scala.Double = js.native
  /* 4 */ val KiiACLObjectActionWrite: KiiACLObjectActionWrite with scala.Double = js.native
  /* 7 */ val KiiACLSendMessageToTopic: KiiACLSendMessageToTopic with scala.Double = js.native
  /* 6 */ val KiiACLSubscribeToTopic: KiiACLSubscribeToTopic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction with scala.Double] = js.native
}

