package typings.iobroker.iobrokerMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioBroker {
  import org.scalablytyped.runtime.StringDictionary
  import typings.iobroker.Anon_Acl
  import typings.iobroker.Anon_Err
  import typings.iobroker.Anon_IdString
  import typings.iobroker.Anon_IdStringOptional
  import typings.iobroker.Anon_IdValue
  import typings.iobroker.Anon_Rows
  import typings.iobroker.Anon_RowsArray
  import typings.iobroker.iobrokerStrings._id
  import typings.iobroker.iobrokerStrings.acl
  import typings.node.Buffer
  import typings.std.Exclude
  import typings.std.Pick
  import typings.std.Record

  /** Infers the return type from a callback-style API and and leaves null and undefined in */
  type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = SecondParameterOf[T]
  type ChownFileCallback = js.Function3[
    /* err */ String | Null, 
    /* entries */ js.UndefOr[js.Array[ChownFileResult]], 
    /* id */ js.UndefOr[String], 
    Unit
  ]
  type ChownObjectCallback = js.Function2[/* err */ String | Null, /* list */ js.UndefOr[js.Array[Object]], Unit]
  type DeleteStateCallback = js.Function2[/* err */ String | Null, /* id */ js.UndefOr[String], Unit]
  type EmptyCallback = js.Function0[Unit]
  type Enum = js.Any
  type EnumList = String | js.Array[String]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[String], Unit]
  type ExtendObjectCallback = js.Function3[
    /* err */ String | Null, 
    /* result */ js.UndefOr[Anon_IdValue], 
    /* id */ js.UndefOr[String], 
    Unit
  ]
  type FindObjectCallback = js.Function3[
    /* err */ String | Null, 
    /* id */ js.UndefOr[String], 
    /* name */ js.UndefOr[String], 
    Unit
  ]
  // TODO: Redefine callbacks as subclass of GenericCallback
  type GenericCallback[T] = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[T], Unit]
  type GetBinaryStateCallback = js.Function2[/* err */ String | Null, /* state */ js.UndefOr[Buffer], Unit]
  type GetConfigKeysCallback = js.Function2[/* err */ String | Null, /* list */ js.UndefOr[js.Array[String]], Unit]
  type GetEnumCallback = js.Function3[
    /* err */ String | Null, 
    /* enums */ Record[String, Enum], 
    /* requestedEnum */ String, 
    Unit
  ]
  type GetEnumsCallback = js.Function2[/* err */ String | Null, /* result */ StringDictionary[Record[String, Enum]], Unit]
  type GetHistoryCallback = js.Function4[
    /* err */ String | Null, 
    /* result */ GetHistoryResult, 
    /* step */ Double, 
    /* sessionId */ js.UndefOr[String], 
    Unit
  ]
  type GetHistoryResult = js.Array[State with Anon_IdStringOptional]
  type GetObjectCallback = js.Function2[/* err */ String | Null, /* obj */ js.UndefOr[Object | Null], Unit]
  type GetObjectListCallback = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[Anon_RowsArray], Unit]
  type GetObjectViewCallback = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[Anon_Rows], Unit]
  type GetObjectsCallback = js.Function2[/* err */ String | Null, /* objects */ Record[String, Object], Unit]
  // this is a version of the callback used by Objects.getObjects
  type GetObjectsCallback2 = js.Function2[/* err */ String | Null, /* objects */ js.UndefOr[js.Array[Object | Anon_Err]], Unit]
  // This is a version used by GetDevices/GetChannelsOf/GetStatesOf
  type GetObjectsCallback3[T /* <: BaseObject */] = js.Function2[/* err */ String | Null, /* result */ js.UndefOr[js.Array[T]], Unit]
  type GetSessionCallback = js.Function1[/* session */ Session, Unit]
  type GetStateCallback = js.Function2[/* err */ String | Null, /* state */ js.UndefOr[State | Null], Unit]
  type GetStatesCallback = js.Function2[/* err */ String | Null, /* states */ Record[String, State], Unit]
  /** Version of the callback used by States.getStates */
  type GetStatesCallback2 = js.Function2[/* err */ String | Null, /* states */ js.Array[State], Unit]
  type GetUserGroupCallback = js.Function4[
    /* objectsInstance */ Objects, 
    /* user */ User, 
    /* groups */ js.Array[UserGroup], 
    /* acl */ ObjectPermissions, 
    Unit
  ]
  type Log = js.Any
  type MessageCallback = js.Function1[/* response */ js.UndefOr[Message], Unit]
  type MessageHandler = js.Function1[/* obj */ Message, Unit | js.Promise[Unit]]
  type MessagePayload = String | (Record[String, js.Any])
  /** Infers the return type from a callback-style API and strips out null and undefined */
  type NonNullCallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = Exclude[SecondParameterOf[T], js.UndefOr[Null]]
  type ObjectChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[Object | Null], Unit | js.Promise[Unit]]
  type ReadDirCallback = js.Function2[/* err */ String | Null, /* entries */ js.UndefOr[js.Array[ReadDirResult]], Unit]
  type ReadFileCallback = js.Function3[
    /* err */ String | Null, 
    /* file */ js.UndefOr[Buffer | String], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  // end interface Adapter
  type ReadyHandler = js.Function0[Unit | js.Promise[Unit]]
  type RmCallback = js.Function2[/* err */ String | Null, /* entries */ js.UndefOr[js.Array[RmResult]], Unit]
  type SecondParameterOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  // end interface States
  type Session = js.Any
  type SetObjectCallback = js.Function2[/* err */ String | Null, /* obj */ Anon_IdString, Unit]
  type SetStateCallback = js.Function2[/* err */ String | Null, /* id */ js.UndefOr[String], Unit]
  type SetStateChangedCallback = js.Function3[/* err */ String | Null, /* id */ String, /* notChanged */ Boolean, Unit]
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  type SettableObject = SettableObjectWorker[Object]
  type SettableObjectWorker[T /* <: Object */] = (Pick[T, Exclude[String, _id | acl]]) with Anon_Acl[T]
  type StateChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[State | Null], Unit | js.Promise[Unit]]
  type UnloadHandler = js.Function1[/* callback */ EmptyCallback, Unit | js.Promise[Unit]]
  type UserGroup = js.Any
}
