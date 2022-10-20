package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  L extends U ? i18next.i18next.KeyWithNSSeparator<L, i18next.i18next.Normalize<T[L]>, ':'> | i18next.i18next.NormalizeMulti<T, std.Exclude<U, L>, i18next.i18next.LastOf<std.Exclude<U, L>>> : never
  }}}
  */
@js.native
trait NormalizeMulti[T, U /* <: /* keyof T */ String */, L] extends StObject
