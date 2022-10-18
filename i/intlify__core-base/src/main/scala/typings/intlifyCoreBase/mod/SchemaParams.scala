package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Array<any> ? {  message :@intlify/core-base.@intlify/core-base.First<T>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} : T extends {  message :infer M | undefined,   datetime :infer D | undefined,   number :infer N | undefined} ? {  message :M extends @intlify/core-base.@intlify/core-base.LocaleMessage<Message> ? M : @intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :D extends @intlify/core-base.@intlify/core-base.DateTimeFormat ? D : @intlify/core-base.@intlify/core-base.DateTimeFormat,   number :N extends @intlify/core-base.@intlify/core-base.NumberFormat ? N : @intlify/core-base.@intlify/core-base.NumberFormat} : {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat}
  }}}
  */
@js.native
trait SchemaParams[T, Message] extends StObject
