package typings.iobroker.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioBroker {
  
  /** Infers the return type from a callback-style API and and leaves null and undefined in */
  type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typings.iobroker.mod.global.ioBroker.SecondParameterOf[T]
  
  type ChownFileCallback = js.Function3[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* entries */ js.UndefOr[js.Array[typings.iobroker.mod.global.ioBroker.ChownFileResult]], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type ChownObjectCallback = js.Function2[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* list */ js.UndefOr[js.Array[typings.iobroker.objectsMod.global.ioBroker.Object]], 
    scala.Unit
  ]
  
  type DeleteStateCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type EmptyCallback = js.Function0[scala.Unit]
  
  type Enum = js.Any
  
  // TODO: define this https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/states/statesInMemServer.js#L873
  type EnumList = java.lang.String | js.Array[java.lang.String]
  
  /** Special variant of ErrorCallback for methods where Node.js returns an ErrnoException */
  type ErrnoCallback = js.Function1[/* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], scala.Unit]
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
  
  type ErrorHandler = js.Function1[/* err */ typings.std.Error, scala.Boolean]
  
  type ExtendObjectCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[typings.iobroker.anon.Value], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type FindObjectCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* id */ js.UndefOr[java.lang.String], 
    /* name */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  // TODO: Redefine callbacks as subclass of GenericCallback
  type GenericCallback[T] = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type GetBinaryStateCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* state */ js.UndefOr[typings.node.Buffer], 
    scala.Unit
  ]
  
  type GetBinaryStatePromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.CallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetBinaryStateCallback]
  ]
  
  type GetConfigKeysCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* list */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  
  type GetEnumCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* enums */ js.UndefOr[typings.std.Record[java.lang.String, typings.iobroker.mod.global.ioBroker.Enum]], 
    /* requestedEnum */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GetEnumsCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[
      org.scalablytyped.runtime.StringDictionary[typings.std.Record[java.lang.String, typings.iobroker.mod.global.ioBroker.Enum]]
    ], 
    scala.Unit
  ]
  
  type GetEnumsPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetEnumsCallback]
  ]
  
  type GetHistoryCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.iobroker.mod.global.ioBroker.GetHistoryResult], 
    /* step */ js.UndefOr[scala.Double], 
    /* sessionId */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GetHistoryResult = js.Array[typings.iobroker.anon.Stateidstringundefined]
  
  type GetObjectCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* obj */ js.UndefOr[typings.iobroker.objectsMod.global.ioBroker.Object | scala.Null], 
    scala.Unit
  ]
  
  type GetObjectListCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[typings.iobroker.anon.RowsArray], 
    scala.Unit
  ]
  
  /** Parameters for adapter.getObjectList */
  type GetObjectListParams = typings.iobroker.mod.global.ioBroker.GetObjectViewParams
  
  type GetObjectListPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetObjectListCallback]
  ]
  
  type GetObjectPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.CallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetObjectCallback]
  ]
  
  type GetObjectViewCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[typings.iobroker.anon.Rows], 
    scala.Unit
  ]
  
  type GetObjectViewPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetObjectViewCallback]
  ]
  
  type GetObjectsCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* objects */ js.UndefOr[
      typings.std.Record[java.lang.String, typings.iobroker.objectsMod.global.ioBroker.Object]
    ], 
    scala.Unit
  ]
  
  // This is a version used by GetDevices/GetChannelsOf/GetStatesOf
  type GetObjectsCallback3[T /* <: typings.iobroker.objectsMod.global.ioBroker.BaseObject */] = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[js.Array[T]], 
    scala.Unit
  ]
  
  type GetObjectsPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetObjectsCallback]
  ]
  
  type GetSessionCallback = js.Function1[/* session */ typings.iobroker.mod.global.ioBroker.Session, scala.Unit]
  
  type GetStateCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* state */ js.UndefOr[typings.iobroker.mod.global.ioBroker.State | scala.Null], 
    scala.Unit
  ]
  
  type GetStatePromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.CallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetStateCallback]
  ]
  
  type GetStatesCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* states */ js.UndefOr[typings.std.Record[java.lang.String, typings.iobroker.mod.global.ioBroker.State]], 
    scala.Unit
  ]
  
  type GetStatesPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.CallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.GetStatesCallback]
  ]
  
  type Interval = scala.Double with typings.iobroker.anon.`0`
  
  type Log = js.Any
  
  type MessageCallback = js.Function1[
    /* response */ js.UndefOr[typings.iobroker.mod.global.ioBroker.Message], 
    scala.Unit
  ]
  
  type MessageHandler = js.Function1[
    /* obj */ typings.iobroker.mod.global.ioBroker.Message, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type MessagePayload = java.lang.String | (typings.std.Record[java.lang.String, js.Any])
  
  /** Infers the return type from a callback-style API and strips out null and undefined */
  type NonNullCallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typings.std.Exclude[typings.iobroker.mod.global.ioBroker.SecondParameterOf[T], js.UndefOr[scala.Null]]
  
  type ObjectChangeHandler = js.Function2[
    /* id */ java.lang.String, 
    /* obj */ js.UndefOr[typings.iobroker.objectsMod.global.ioBroker.Object | scala.Null], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  // TODO: implement this
  type Plugin = typings.std.Record[java.lang.String, js.Any]
  
  type ReadDirCallback = js.Function2[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* entries */ js.UndefOr[js.Array[typings.iobroker.mod.global.ioBroker.ReadDirResult]], 
    scala.Unit
  ]
  
  type ReadDirPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.ReadDirCallback]
  ]
  
  type ReadFileCallback = js.Function3[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* file */ js.UndefOr[typings.node.Buffer | java.lang.String], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type ReadFilePromise = js.Promise[typings.iobroker.anon.File]
  
  // end interface Adapter
  type ReadyHandler = js.Function0[scala.Unit | js.Promise[scala.Unit]]
  
  type RmCallback = js.Function2[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* entries */ js.UndefOr[js.Array[typings.iobroker.mod.global.ioBroker.RmResult]], 
    scala.Unit
  ]
  
  type SecondParameterOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  
  type Session = js.Any
  
  type SetObjectCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* obj */ js.UndefOr[typings.iobroker.anon.IdString], 
    scala.Unit
  ]
  
  type SetObjectPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.SetObjectCallback]
  ]
  
  type SetStateCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type SetStateChangedCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    /* notChanged */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type SetStateChangedPromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.SetStateChangedCallback]
  ]
  
  type SetStatePromise = js.Promise[
    typings.iobroker.mod.global.ioBroker.NonNullCallbackReturnTypeOf[typings.iobroker.mod.global.ioBroker.SetStateCallback]
  ]
  
  type StateChangeHandler = js.Function2[
    /* id */ java.lang.String, 
    /* obj */ js.UndefOr[typings.iobroker.mod.global.ioBroker.State | scala.Null], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type Timeout = scala.Double with typings.iobroker.anon.IoBrokerBrand
  
  type UnloadHandler = js.Function1[
    /* callback */ typings.iobroker.mod.global.ioBroker.EmptyCallback, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type UserGroup = js.Any
}
