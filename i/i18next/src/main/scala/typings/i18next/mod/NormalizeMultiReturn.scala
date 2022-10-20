package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  V extends / * template literal string: ${inferN}:${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any extends keyof T ? i18next.i18next.NormalizeReturn<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, '.'> : never : never
  }}}
  */
@js.native
trait NormalizeMultiReturn[T, V] extends StObject
