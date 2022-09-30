package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Define the naming schemes for objects so we can provide more specific types for get/setObject
object ObjectIDs {
  
  // Guaranteed adapter objects
  type Adapter = /* template literal string: system.adapter.${string} */ String
  
  // Unsure, can be folder, device, channel or state (or whatever an adapter does)
  type AdapterScoped = /* template literal string: ${string}.${number}.${string} */ String
  
  /** All possible typed object IDs */
  type Any = Meta | Misc | Channel | ScriptOrChannel | State | Enum | Instance | Adapter | Group | User | Host | Config | AdapterScoped
  
  // Guaranteed channel objects
  type Channel = /* template literal string: script.js.${common|global} */ String
  
  // Guaranteed config objects
  type Config = /* template literal string: system.${certificates|config|repositories} */ String
  
  // Guaranteed enum objects
  type Enum = /* template literal string: enum.${string} */ String
  
  // Guaranteed group objects
  type Group = /* template literal string: system.group.${string} */ String
  
  // Guaranteed host objects
  type Host = /* template literal string: system.host.${string} */ String
  
  // Guaranteed instance objects
  type Instance = /* template literal string: system.adapter.${string}.${number} */ String
  
  // Guaranteed meta objects
  type Meta = /* template literal string: ${string}.${number} */ String
  
  // Unsure, can be folder, device, channel or state
  // --> We need this match to avoid matching the more specific types below
  type Misc = /* template literal string: system.host.${string}.${string} */ String
  
  // Either script or channel object
  type ScriptOrChannel = /* template literal string: script.js.${string} */ String
  
  // Guaranteed state objects
  type State = /* template literal string: system.adapter.${string}.${number}.${string} */ String
  
  // Guaranteed user objects
  type User = /* template literal string: system.user.${string} */ String
}
