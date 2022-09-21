package typings.matrixJsSdk.mod

import typings.matrixJsSdk.matrixJsSdkStrings.mDotdirect
import typings.matrixJsSdk.matrixJsSdkStrings.mDotpresence
import typings.matrixJsSdk.matrixJsSdkStrings.mDotreaction
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotcanonical_alias
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotencryption
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotguest_access
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDothistory_visibility
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotjoin_rules
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmember
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotmessage
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotname
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotpower_levels
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDotredaction
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDottombstone
import typings.matrixJsSdk.matrixJsSdkStrings.mDotroomDottopic
import typings.matrixJsSdk.matrixJsSdkStrings.mDotsticker
import typings.matrixJsSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(ops: String): MatrixClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(ops.asInstanceOf[js.Any]).asInstanceOf[MatrixClient]
inline def createClient(ops: CreateClientOption): MatrixClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(ops.asInstanceOf[js.Any]).asInstanceOf[MatrixClient]

inline def getRequest(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")().asInstanceOf[Any]

inline def request(r: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]

type CryptoModule = Any

type CryptoVerificationBase = Any

type EventContentType = EventContentTypeMessage

type EventTimelineDirection = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTimeline.BACKWARDS */ Any

type EventType = LiteralUnion[
mDotroomDotcanonical_alias | mDotroomDotencryption | mDotroomDotguest_access | mDotroomDothistory_visibility | mDotroomDotjoin_rules | mDotroomDotmember | mDotroomDotmessage | mDotroomDotname | mDotroomDotpower_levels | mDotroomDotredaction | mDotroomDottombstone | mDotroomDottopic | mDotsticker | mDotdirect | mDotreaction | mDotpresence, 
String]

type FilterComponent = Any

type LiteralUnion[T /* <: U */, U] = T | (U & js.Object)

type MatrixCallback = js.Function2[/* err */ Null | js.Object, /* data */ Any, Unit]

/* Rewritten from type alias, can be one of: 
  - scala.Nothing
  - typings.matrixJsSdk.matrixJsSdkStrings.ban
  - typings.matrixJsSdk.matrixJsSdkStrings.invite
  - typings.matrixJsSdk.matrixJsSdkStrings.join
  - typings.matrixJsSdk.matrixJsSdkStrings.leave
*/
type MembershipType = _MembershipType | scala.Nothing

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
type MsgType = _MsgType | scala.Nothing

type ProcessFn = js.Function1[/* event */ MatrixEvent[EventContentTypeMessage, EventType], js.Promise[Any]]

type QueueAlgorithm = js.Function1[/* event */ MatrixEvent[EventContentTypeMessage, EventType], String]

type RetryAlgorithm = js.Function3[
/* event */ MatrixEvent[EventContentTypeMessage, EventType], 
/* attempts */ Double, 
/* err */ MatrixError, 
Double]

type SyncCallback = js.Function3[/* state */ SyncState, /* prevState */ SyncState, /* data */ SyncData, Unit]
