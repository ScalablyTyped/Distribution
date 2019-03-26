package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperLib {
  /* Rewritten from type alias, can be one of: 
    - Anon_Push[T]
    - Anon_Unshift[T]
    - Anon_Splice[T]
    - org.scalablytyped.runtime.StringDictionary[
  / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Spec<T, C> * / js.Any]
  */
  type ArraySpec[T, C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomCommands<object> */ js.Any */] = (_ArraySpec[T, C]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Spec<T, C> */ js.Any
  ])
  /* Rewritten from type alias, can be one of: 
    - Anon_Toggle[T]
    - Anon_Unset[T]
    - Anon_Merge[T]
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    * / immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with js.Any
  */
  type ObjectSpec[T, C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomCommands<object> */ js.Any */] = (_ObjectSpec[T, C]) | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with js.Any)
}
