package typings.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtendedKeyOptions[T] = typings.matchSorter.anon.Key[T] with (typings.matchSorter.anon.MinRanking | typings.matchSorter.anon.MaxRanking | typings.matchSorter.anon.Threshold)
  
  type KeyOptions[T] = java.lang.String | (js.Function1[/* item */ T, java.lang.String | js.Array[java.lang.String]])
}
