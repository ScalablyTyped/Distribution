package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  V extends keyof T ? i18next.i18next.NormalizeByTypeOptions<T[V], i18next.i18next.TypeOptions, i18next.i18next.TypeOptionsFallback<T[V], true, ''>> : S extends false ? V : V extends / * template literal string: ${inferK}${S}${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any extends keyof T ? i18next.i18next.NormalizeReturn<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, '.'> : never : i18next.i18next.StringIfPlural<keyof T>
  }}}
  */
@js.native
trait NormalizeReturn[T, V, S /* <: String | `false` */] extends StObject
