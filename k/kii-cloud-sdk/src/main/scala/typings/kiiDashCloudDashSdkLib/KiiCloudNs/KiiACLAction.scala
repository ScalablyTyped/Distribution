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
  
  val KiiACLBucketActionCreateObjects: KiiACLBucketActionCreateObjects with java.lang.String = js.native
  val KiiACLBucketActionDropBucket: KiiACLBucketActionDropBucket with java.lang.String = js.native
  val KiiACLBucketActionQueryObjects: KiiACLBucketActionQueryObjects with java.lang.String = js.native
  val KiiACLBucketActionReadObjects: KiiACLBucketActionReadObjects with java.lang.String = js.native
  val KiiACLObjectActionRead: KiiACLObjectActionRead with java.lang.String = js.native
  val KiiACLObjectActionWrite: KiiACLObjectActionWrite with java.lang.String = js.native
  val KiiACLSendMessageToTopic: KiiACLSendMessageToTopic with java.lang.String = js.native
  val KiiACLSubscribeToTopic: KiiACLSubscribeToTopic with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLAction with java.lang.String] = js.native
}

