package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  K extends keyof T ? T[K] extends i18next.i18next.StringMap ? T[K] extends std.Array<any> ? i18next.i18next.KeysWithSeparator2<K, i18next.i18next.WithOrWithoutPlural<keyof T[K]>> | i18next.i18next.KeysWithSeparator2<K, i18next.i18next.Normalize2<T[K], keyof T[K]>> : i18next.i18next.KeysWithSeparator<K, i18next.i18next.WithOrWithoutPlural<keyof T[K]>, '.'> | i18next.i18next.KeysWithSeparator<K, i18next.i18next.Normalize2<T[K], keyof T[K]>, '.'> : never : never
  }}}
  */
@js.native
trait Normalize2[T, K] extends StObject
