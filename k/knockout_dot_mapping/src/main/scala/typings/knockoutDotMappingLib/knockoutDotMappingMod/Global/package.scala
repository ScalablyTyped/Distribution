package typings
package knockoutDotMappingLib.knockoutDotMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type KnockoutMappingOptions[T] = KnockoutMappingSpecificOptions[T] | KnockoutMappingStandardOptions
  type KnockoutMappingSpecificOptions[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? knockout.mapping.knockout.mapping.Global.KnockoutPropertyMappingCallBack}
    */ knockoutDotMappingLib.knockoutDotMappingLibStrings.KnockoutMappingSpecificOptions with js.Any
  // the idea behind this is good, but doesn't work as intended. This will make object properties T | Observable<T>, 
  //and you will have to put the correct Type in each property to use them, what defeats the purpose. Besides, this gives  
  //RangeError: Maximum call stack size exceeded in TSC when used in all the mapping signatures. Maybe this can be used with TS 2.8 and conditional typing
  type KnockoutObservableType[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: knockout.KnockoutObservable<object> | T[P]}
    */ knockoutDotMappingLib.knockoutDotMappingLibStrings.KnockoutObservableType with T
}
