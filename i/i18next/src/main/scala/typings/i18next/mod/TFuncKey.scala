package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  N extends std.Array<keyof T> | std.Readonly<std.Array<keyof T>> ? i18next.i18next.NormalizeMulti<T, N[number], i18next.i18next.LastOf<N[number]>> : N extends keyof T ? TKPrefix extends undefined ? i18next.i18next.Normalize<T[N]> : i18next.i18next.NormalizeWithKeyPrefix<T[N], TKPrefix, '.'> : string
  }}}
  */
@js.native
trait TFuncKey[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix, T] extends StObject
