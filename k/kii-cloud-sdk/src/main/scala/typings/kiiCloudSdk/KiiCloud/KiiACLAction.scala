package typings.kiiCloudSdk.KiiCloud

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
  
}

