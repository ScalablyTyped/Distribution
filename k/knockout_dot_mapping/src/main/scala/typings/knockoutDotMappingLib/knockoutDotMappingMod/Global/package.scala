package typings
package knockoutDotMappingLib.knockoutDotMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type KnockoutObservableType[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: knockout.KnockoutObservable<object> | T[P]}
    */ knockoutDotMappingLib.knockoutDotMappingLibStrings.KnockoutObservableType with T
}
