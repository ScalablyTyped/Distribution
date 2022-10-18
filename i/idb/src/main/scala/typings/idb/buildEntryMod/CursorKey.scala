package typings.idb.buildEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  IndexName extends idb.idb/build/entry.IndexNames<DBTypes, StoreName> ? idb.idb/build/entry.IndexKey<DBTypes, StoreName, IndexName> : idb.idb/build/entry.StoreKey<DBTypes, StoreName>
  }}}
  */
@js.native
trait CursorKey[DBTypes /* <: DBSchema | Any */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */] extends StObject
