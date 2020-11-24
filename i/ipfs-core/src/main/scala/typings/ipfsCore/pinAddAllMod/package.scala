package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pinAddAllMod {
  
  type AddOptions = typings.ipfsCore.pinAddAllMod.AddSettings with typings.ipfsCore.srcUtilsMod.AbortOptions
  
  type AwaitIterable[T] = typings.std.Iterable[T] | typings.std.AsyncIterable[T]
  
  type CID = typings.cids.mod.^
  
  type Source = java.lang.String | typings.cids.mod.^  | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.ToPinWithPath */ js.Any) | (typings.std.Iterable[
    java.lang.String | typings.cids.mod.^  | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.ToPinWithPath */ js.Any)
  ]) | (typings.std.AsyncIterable[
    java.lang.String | typings.cids.mod.^  | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.ToPinWithPath */ js.Any)
  ])
}
