package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends string ? string : T extends (): std.Promise<infer P> ? @intlify/core-base.@intlify/core-base.LocaleMessageDictionary<P, Message> : T extends (args : infer Arguments): any ? (args : Arguments): std.ReturnType<T> : T extends std.Record<string, any> ? @intlify/core-base.@intlify/core-base.LocaleMessageDictionary<T, Message> : T extends std.Array<T> ? {[ K in keyof T ]: T[K]} : T
  }}}
  */
@js.native
trait LocaleMessageType[T, Message] extends StObject
