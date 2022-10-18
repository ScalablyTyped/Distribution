package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // State must come before Adapter or system.adapter.admin.0.foobar will resolve to AdapterObject
T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.State ? iobroker.iobroker/objects.<global>.ioBroker.StateObject : // Instance and Adapter must come before meta or `system.adapter.admin` will resolve to MetaObject
T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Instance ? iobroker.iobroker/objects.<global>.ioBroker.InstanceObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Adapter ? iobroker.iobroker/objects.<global>.ioBroker.AdapterObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Channel ? iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Meta ? iobroker.iobroker/objects.<global>.ioBroker.MetaObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Misc ? iobroker.iobroker/objects.<global>.ioBroker.AdapterScopedObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.ScriptOrChannel ? iobroker.iobroker/objects.<global>.ioBroker.ScriptObject | iobroker.iobroker/objects.<global>.ioBroker.ChannelObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Enum ? iobroker.iobroker/objects.<global>.ioBroker.EnumObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Group ? iobroker.iobroker/objects.<global>.ioBroker.GroupObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.User ? iobroker.iobroker/objects.<global>.ioBroker.UserObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Host ? iobroker.iobroker/objects.<global>.ioBroker.HostObject : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.Config ? / * Inlined iobroker.iobroker/objects.<global>.ioBroker.OtherObject & {  type :'config'} * /
{  type :'config' | 'chart',   common :iobroker.iobroker/objects.<global>.ioBroker.OtherCommon,   _id :string,   native :std.Record<string, any>,   enums :std.Record<string, string> | undefined,   acl :iobroker.iobroker/objects.<global>.ioBroker.ObjectACL | undefined,   from :string | undefined,   user :string | undefined,   ts :number | undefined,   type :'config'} : T extends iobroker.iobroker/objects.<global>.ioBroker.ObjectIDs.AdapterScoped ? iobroker.iobroker/objects.<global>.ioBroker.AdapterScopedObject : Read extends 'read' ? iobroker.iobroker/objects.<global>.ioBroker.Object : iobroker.iobroker/objects.<global>.ioBroker.AnyObject
  }}}
  */
@js.native
trait ObjectIdToObjectType[T /* <: String */, Read /* <: read | write */] extends StObject
