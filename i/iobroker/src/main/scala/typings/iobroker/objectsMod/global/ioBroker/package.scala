package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Color
import typings.iobroker.anon.Common
import typings.iobroker.anon.langinLanguagesaslangexte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// For all objects that are exposed to the user we need to tone the strictness down.
// Otherwise, every operation on objects becomes a pain to work with
type Object = AnyObject & Common

type PartialObject[T /* <: AnyObject */] = PartialObjectWorker[T]

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

type SettableOtherObject = SettableObject[OtherObject]

type SettableScriptObject = SettableObject[ScriptObject]

type SettableStateObject = SettableObject[StateObject]

type SettableUserObject = SettableObject[UserObject]

type StringOrTranslated = String | langinLanguagesaslangexte

type WelcomeScreenEntry = String | Color
