package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends iobroker.iobroker/objects.<global>.ioBroker.AnyObject ? std.Omit<T, '_id' | 'acl'> & {  _id :T['_id'] | undefined,   acl :T['acl'] | undefined} : never
  }}}
  */
@js.native
trait SettableObjectWorker[T] extends StObject
