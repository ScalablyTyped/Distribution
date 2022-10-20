package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  N extends std.Array<keyof T> ? i18next.i18next.NormalizeMultiReturn<T, TKeys> : N extends keyof T ? TKPrefix extends undefined ? i18next.i18next.NormalizeReturn<T[N], TKeys, '.'> : i18next.i18next.NormalizeReturn<T[N], i18next.i18next.KeysWithSeparator<TKPrefix, TKeys, '.'>, '.'> : TDefaultResult
  }}}
  */
@js.native
trait TFuncReturn[N, TKeys, TDefaultResult, TKPrefix, T] extends StObject
