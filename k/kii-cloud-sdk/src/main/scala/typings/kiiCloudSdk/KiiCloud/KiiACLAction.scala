package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiACLAction with Double] = js.native
  /* 0 */ @js.native
  object KiiACLBucketActionCreateObjects extends TopLevel[KiiACLBucketActionCreateObjects with Double]
  
  /* 2 */ @js.native
  object KiiACLBucketActionDropBucket extends TopLevel[KiiACLBucketActionDropBucket with Double]
  
  /* 1 */ @js.native
  object KiiACLBucketActionQueryObjects extends TopLevel[KiiACLBucketActionQueryObjects with Double]
  
  /* 5 */ @js.native
  object KiiACLBucketActionReadObjects extends TopLevel[KiiACLBucketActionReadObjects with Double]
  
  /* 3 */ @js.native
  object KiiACLObjectActionRead extends TopLevel[KiiACLObjectActionRead with Double]
  
  /* 4 */ @js.native
  object KiiACLObjectActionWrite extends TopLevel[KiiACLObjectActionWrite with Double]
  
  /* 7 */ @js.native
  object KiiACLSendMessageToTopic extends TopLevel[KiiACLSendMessageToTopic with Double]
  
  /* 6 */ @js.native
  object KiiACLSubscribeToTopic extends TopLevel[KiiACLSubscribeToTopic with Double]
  
}

