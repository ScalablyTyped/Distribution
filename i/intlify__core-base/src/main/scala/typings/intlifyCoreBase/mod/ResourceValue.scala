package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends / * template literal string: ${inferKey}.${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any extends keyof T ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends @intlify/core-base.@intlify/core-base.ResourcePath<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any]> ? @intlify/core-base.@intlify/core-base.ResourceValue<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : never : never : P extends keyof T ? T[P] : never
  }}}
  */
@js.native
trait ResourceValue[T, P /* <: ResourcePath[T] */] extends StObject
