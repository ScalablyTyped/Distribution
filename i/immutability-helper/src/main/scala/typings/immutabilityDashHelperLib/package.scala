package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperLib {
  type ArraySpec[T, C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomCommands<object> */ js.Any */] = Anon_Push[T] | Anon_Unshift[T] | Anon_Splice[T] | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Spec<T, C> */ js.Any
  ])
  type MapSpec[K, V] = (Anon_Add[K, V]) | Anon_Remove[K]
  type ObjectSpec[T, C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomCommands<object> */ js.Any */] = Anon_Toggle[T] | Anon_Unset[T] | Anon_Merge[T] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with js.Any)
  type SetSpec[T] = Anon_AddArray[T] | Anon_RemoveArray[T]
}
