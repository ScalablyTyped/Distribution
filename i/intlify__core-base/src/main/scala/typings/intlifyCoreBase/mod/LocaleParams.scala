package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends @intlify/core-base.@intlify/core-base.IsUnion<T, T> ? {  messages :T,   datetimeFormats :T,   numberFormats :T} : T extends {  messages :infer M | undefined,   datetimeFormats :infer D | undefined,   numberFormats :infer N | undefined} ? {  messages :@intlify/core-base.@intlify/core-base.LocaleParamsType<M, Default>,   datetimeFormats :@intlify/core-base.@intlify/core-base.LocaleParamsType<D, Default>,   numberFormats :@intlify/core-base.@intlify/core-base.LocaleParamsType<N, Default>} : T extends string ? {  messages :T,   datetimeFormats :T,   numberFormats :T} : {  messages :Default,   datetimeFormats :Default,   numberFormats :Default}
  }}}
  */
@js.native
trait LocaleParams[T, Default] extends StObject
