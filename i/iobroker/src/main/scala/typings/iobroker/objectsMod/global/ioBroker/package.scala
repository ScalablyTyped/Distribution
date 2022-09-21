package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Acl
import typings.iobroker.anon.Color
import typings.iobroker.anon.Common
import typings.iobroker.anon.`0`
import typings.iobroker.anon.langinLanguagesaslangexte
import typings.iobroker.iobrokerStrings._id
import typings.iobroker.iobrokerStrings.acl
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.write
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Used to infer the return type of GetObjectView
/* Rewritten from type alias, can be one of: 
  - typings.iobroker.objectsMod.global.ioBroker.Object
  - typings.std.NonNullable[js.UndefOr[typings.std.Record[java.lang.String, scala.Any]]]
  - typings.iobroker.anon.OtherObjecttypeconfig
  - typings.iobroker.objectsMod.global.ioBroker.UserObject
  - typings.iobroker.objectsMod.global.ioBroker.GroupObject
  - typings.iobroker.objectsMod.global.ioBroker.ScriptObject
  - typings.iobroker.objectsMod.global.ioBroker.EnumObject
  - typings.iobroker.objectsMod.global.ioBroker.FolderObject
  - typings.iobroker.objectsMod.global.ioBroker.StateObject
  - typings.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typings.iobroker.objectsMod.global.ioBroker.DeviceObject
  - typings.iobroker.objectsMod.global.ioBroker.MetaObject
  - typings.iobroker.objectsMod.global.ioBroker.InstanceObject
  - typings.iobroker.objectsMod.global.ioBroker.AdapterObject
  - typings.iobroker.objectsMod.global.ioBroker.HostObject
*/
type InferGetObjectViewItemType[Design /* <: String */, View /* <: String */] = (_InferGetObjectViewItemType[Design, View]) | (NonNullable[js.UndefOr[Record[String, Any]]]) | Object

// For all objects that are exposed to the user we need to tone the strictness down.
// Otherwise, every operation on objects becomes a pain to work with
type Object = AnyObject & Common

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.objectsMod.global.ioBroker.AnyObject
  - typings.iobroker.objectsMod.global.ioBroker.Object
  - typings.iobroker.objectsMod.global.ioBroker.AdapterScopedObject
  - typings.iobroker.anon.OtherObjecttypeconfig
  - typings.iobroker.objectsMod.global.ioBroker.HostObject
  - typings.iobroker.objectsMod.global.ioBroker.UserObject
  - typings.iobroker.objectsMod.global.ioBroker.GroupObject
  - typings.iobroker.objectsMod.global.ioBroker.EnumObject
  - typings.iobroker.objectsMod.global.ioBroker.ScriptObject
  - typings.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typings.iobroker.objectsMod.global.ioBroker.MetaObject
  - typings.iobroker.objectsMod.global.ioBroker.AdapterObject
  - typings.iobroker.objectsMod.global.ioBroker.InstanceObject
  - typings.iobroker.objectsMod.global.ioBroker.StateObject
*/
type ObjectIdToObjectType[T /* <: String */, Read /* <: read | write */] = (_ObjectIdToObjectType[T, Read]) | Object

type PartialObject[T /* <: AnyObject */] = PartialObjectWorker[T]

// in extend[Foreign]Object, most properties are optional
type PartialObjectWorker[T] = AnyPartialObject & `0`[T]

type SettableAdapterObject = SettableObject[AdapterObject]

type SettableChannelObject = SettableObject[ChannelObject]

type SettableDeviceObject = SettableObject[DeviceObject]

type SettableEnumObject = SettableObject[EnumObject]

type SettableFolderObject = SettableObject[FolderObject]

type SettableGroupObject = SettableObject[GroupObject]

type SettableHostObject = SettableObject[HostObject]

type SettableInstanceObject = SettableObject[InstanceObject]

type SettableMetaObject = SettableObject[MetaObject]

// Convenient definitions for manually specifying settable object types
type SettableObject[T /* <: AnyObject */] = SettableObjectWorker[T]

// In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
type SettableObjectWorker[T] = (Omit[T, _id | acl]) & Acl[T]

type SettableOtherObject = SettableObject[OtherObject]

type SettableScriptObject = SettableObject[ScriptObject]

type SettableStateObject = SettableObject[StateObject]

type SettableUserObject = SettableObject[UserObject]

type StringOrTranslated = String | langinLanguagesaslangexte

type WelcomeScreenEntry = String | Color
