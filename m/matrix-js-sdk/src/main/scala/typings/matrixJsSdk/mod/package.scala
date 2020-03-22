package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CryptoDeviceInfo = js.Any
  type CryptoVerificationBase = js.Any
  type EventStatus = js.Any
  type EventTimeline = js.Any
  type EventTimelineSet = js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Nothing
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotcanonical_alias
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotencryption
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotguest_access
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDothistory_visibility
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotjoin_rules
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmember
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmessage
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotname
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotpower_levels
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotredaction
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDottombstone
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDottopic
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotsticker
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotpresence
  */
  type EventType = typings.matrixJsSdk.mod._EventType | scala.Nothing
  type FilterComponent = js.Any
  type Group = js.Any
  type MatrixCallback = js.Function2[/* err */ scala.Null | js.Object, /* data */ js.Any, scala.Unit]
  type MatrixScheduler = js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Nothing
    - typings.matrixJsSdk.matrixJsSdkStrings.ban
    - typings.matrixJsSdk.matrixJsSdkStrings.invite
    - typings.matrixJsSdk.matrixJsSdkStrings.join
    - typings.matrixJsSdk.matrixJsSdkStrings.leave
  */
  type MembershipType = typings.matrixJsSdk.mod._MembershipType | scala.Nothing
  /* Rewritten from type alias, can be one of: 
    - scala.Nothing
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotaudio
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotbadDotencrypted
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotemote
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotfile
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotimage
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotnotice
    - typings.matrixJsSdk.matrixJsSdkStrings.mDottext
    - typings.matrixJsSdk.matrixJsSdkStrings.mDotvideo
  */
  type MsgType = typings.matrixJsSdk.mod._MsgType | scala.Nothing
  type PushAction = js.Any
  type RoomSummary = js.Any
}
