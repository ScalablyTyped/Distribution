package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends / * template literal string: ${inferLeft}.${inferRight} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any extends keyof T ? lodash.lodash.FieldWithPossiblyUndefined<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any> : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any extends / * template literal string: ${inferFieldKey}[${inferIndexKey}] * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldKey * / any extends keyof T ? lodash.lodash.FieldWithPossiblyUndefined<lodash.lodash.IndexedFieldWithPossiblyUndefined<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldKey * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndexKey * / any>, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any> : undefined : undefined : P extends keyof T ? T[P] : P extends / * template literal string: ${inferFieldKey}[${inferIndexKey}] * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldKey * / any extends keyof T ? lodash.lodash.IndexedFieldWithPossiblyUndefined<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldKey * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndexKey * / any> : undefined : undefined
  }}}
  */
@js.native
trait GetFieldType[T, P] extends StObject
