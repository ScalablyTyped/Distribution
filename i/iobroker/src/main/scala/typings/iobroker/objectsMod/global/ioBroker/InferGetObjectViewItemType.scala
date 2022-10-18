package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Used to infer the return type of GetObjectView
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Design extends 'system' ? View extends 'host' ? iobroker.iobroker/objects.<global>.ioBroker.HostObject : View extends 'adapter' ? iobroker.iobroker/objects.<global>.ioBroker.AdapterObject : View extends 'instance' ? iobroker.iobroker/objects.<global>.ioBroker.InstanceObject : View extends 'meta' ? iobroker.iobroker/objects.<global>.ioBroker.MetaObject : View extends 'device' ? iobroker.iobroker/objects.<global>.ioBroker.DeviceObject : View extends 'channel' ? iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : View extends 'state' ? iobroker.iobroker/objects.<global>.ioBroker.StateObject : View extends 'folder' ? iobroker.iobroker/objects.<global>.ioBroker.FolderObject : View extends 'enum' ? iobroker.iobroker/objects.<global>.ioBroker.EnumObject : View extends 'script' ? iobroker.iobroker/objects.<global>.ioBroker.ScriptObject : View extends 'group' ? iobroker.iobroker/objects.<global>.ioBroker.GroupObject : View extends 'user' ? iobroker.iobroker/objects.<global>.ioBroker.UserObject : View extends 'config' ? / * Inlined iobroker.iobroker/objects.<global>.ioBroker.OtherObject & {  type :'config'} * /
{  type :'config' | 'chart',   common :iobroker.iobroker/objects.<global>.ioBroker.OtherCommon,   _id :string,   native :std.Record<string, any>,   enums :std.Record<string, string> | undefined,   acl :iobroker.iobroker/objects.<global>.ioBroker.ObjectACL | undefined,   from :string | undefined,   user :string | undefined,   ts :number | undefined,   type :'config'} : View extends 'custom' ? std.NonNullable<std.Record<string, any> | undefined> : iobroker.iobroker/objects.<global>.ioBroker.Object : any
  }}}
  */
@js.native
trait InferGetObjectViewItemType[Design /* <: String */, View /* <: String */] extends StObject
