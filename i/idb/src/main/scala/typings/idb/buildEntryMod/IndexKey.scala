package typings.idb.buildEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  DBTypes extends idb.idb/build/entry.DBSchema ? IndexName extends keyof DBTypes[StoreName]['indexes'] ? DBTypes[StoreName]['indexes'][IndexName] : std.IDBValidKey : std.IDBValidKey
  }}}
  */
@js.native
trait IndexKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: IndexNames[DBTypes, StoreName] */] extends StObject
