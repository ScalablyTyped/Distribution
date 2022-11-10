package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Color
import typings.iobroker.anon.Common
import typings.iobroker.anon.langinLanguagesaslangexte
import typings.iobroker.iobrokerStrings._id
import typings.iobroker.iobrokerStrings.acl
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.write
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Used to infer the return type of GetObjectView
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Design extends 'system' ? View extends 'host' ? iobroker.iobroker/objects.<global>.ioBroker.HostObject : View extends 'adapter' ? iobroker.iobroker/objects.<global>.ioBroker.AdapterObject : View extends 'instance' ? iobroker.iobroker/objects.<global>.ioBroker.InstanceObject : View extends 'meta' ? iobroker.iobroker/objects.<global>.ioBroker.MetaObject : View extends 'device' ? iobroker.iobroker/objects.<global>.ioBroker.DeviceObject : View extends 'channel' ? iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : View extends 'state' ? iobroker.iobroker/objects.<global>.ioBroker.StateObject : View extends 'folder' ? iobroker.iobroker/objects.<global>.ioBroker.FolderObject : View extends 'enum' ? iobroker.iobroker/objects.<global>.ioBroker.EnumObject : View extends 'script' ? iobroker.iobroker/objects.<global>.ioBroker.ScriptObject : View extends 'group' ? iobroker.iobroker/objects.<global>.ioBroker.GroupObject : View extends 'user' ? iobroker.iobroker/objects.<global>.ioBroker.UserObject : View extends 'config' ? / * Inlined iobroker.iobroker/objects.<global>.ioBroker.OtherObject & {  type :'config'} * /
{  type :'config' | 'chart',   common :iobroker.iobroker/objects.<global>.ioBroker.OtherCommon,   _id :string,   native :std.Record<string, any>,   enums :std.Record<string, string> | undefined,   acl :iobroker.iobroker/objects.<global>.ioBroker.ObjectACL | undefined,   from :string | undefined,   user :string | undefined,   ts :number | undefined,   type :'config'} : View extends 'custom' ? std.NonNullable<std.Record<string, any> | undefined> : iobroker.iobroker/objects.<global>.ioBroker.Object : any
  }}}
  */
type InferGetObjectViewItemType[Design /* <: String */, View /* <: String */] = HostObject

// For all objects that are exposed to the user we need to tone the strictness down.
// Otherwise, every operation on objects becomes a pain to work with
type Object = AnyObject & Common

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // State must come before Adapter or system.adapter.admin.0.foobar will resolve to AdapterObject
T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.State ? iobroker.iobroker/objects.<global>.ioBroker.StateObject : // Instance and Adapter must come before meta or `system.adapter.admin` will resolve to MetaObject
T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Instance ? iobroker.iobroker/objects.<global>.ioBroker.InstanceObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Adapter ? iobroker.iobroker/objects.<global>.ioBroker.AdapterObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Channel ? iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Meta ? iobroker.iobroker/objects.<global>.ioBroker.MetaObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Misc ? iobroker.iobroker/objects.<global>.ioBroker.AdapterScopedObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.ScriptOrChannel ? iobroker.iobroker/objects.<global>.ioBroker.ScriptObject | iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Enum ? iobroker.iobroker/objects.<global>.ioBroker.EnumObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Group ? iobroker.iobroker/objects.<global>.ioBroker.GroupObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.User ? iobroker.iobroker/objects.<global>.ioBroker.UserObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Host ? iobroker.iobroker/objects.<global>.ioBroker.HostObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Config ? / * Inlined iobroker.iobroker/objects.<global>.ioBroker.OtherObject & {  type :'config'} * /
{  type :'config' | 'chart',   common :iobroker.iobroker/objects.<global>.ioBroker.OtherCommon,   _id :string,   native :std.Record<string, any>,   enums :std.Record<string, string> | undefined,   acl :iobroker.iobroker/objects.<global>.ioBroker.ObjectACL | undefined,   from :string | undefined,   user :string | undefined,   ts :number | undefined,   type :'config'} : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.AdapterScoped ? iobroker.iobroker/objects.<global>.ioBroker.AdapterScopedObject : Read extends 'read' ? iobroker.iobroker/objects.<global>.ioBroker.Object : iobroker.iobroker/objects.<global>.ioBroker.AnyObject
  }}}
  */
type ObjectIdToObjectType[T /* <: String */, Read /* <: read | write */] = StateObject

type PartialObject[T /* <: AnyObject */] = PartialObjectWorker[T]

// in extend[Foreign]Object, most properties are optional
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends iobroker.iobroker/objects.<global>.ioBroker.AnyObject ? iobroker.iobroker/objects.<global>.ioBroker.AnyPartialObject & {  type :T['type'] | undefined} : never
  }}}
  */
type PartialObjectWorker[T] = AnyPartialObject & (/* import warning: importer.ImportType#apply Failed type conversion: {  type :T['type'] | undefined} */ js.Any)

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
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends iobroker.iobroker/objects.<global>.ioBroker.AnyObject ? std.Omit<T, '_id' | 'acl'> & {  _id :T['_id'] | undefined,   acl :T['acl'] | undefined} : never
  }}}
  */
type SettableObjectWorker[T] = (Omit[T, _id | acl]) & (/* import warning: importer.ImportType#apply Failed type conversion: {  _id :T['_id'] | undefined,   acl :T['acl'] | undefined} */ js.Any)

type SettableOtherObject = SettableObject[OtherObject]

type SettableScriptObject = SettableObject[ScriptObject]

type SettableStateObject = SettableObject[StateObject]

type SettableUserObject = SettableObject[UserObject]

type StringOrTranslated = String | langinLanguagesaslangexte

type WelcomeScreenEntry = String | Color
