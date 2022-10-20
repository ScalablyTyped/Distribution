package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Normalize single namespace with key prefix
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  K extends / * template literal string: ${inferK1}${S}${inferK2} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any extends keyof T ? i18next.i18next.NormalizeWithKeyPrefix<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K2 * / any, '.'> : never : K extends keyof T ? T[K] extends string ? never : i18next.i18next.Normalize<T[K]> : never
  }}}
  */
@js.native
trait NormalizeWithKeyPrefix[T, K, S /* <: String */] extends StObject
