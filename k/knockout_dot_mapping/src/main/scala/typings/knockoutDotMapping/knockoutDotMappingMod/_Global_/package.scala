package typings.knockoutDotMapping.knockoutDotMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  import typings.knockout.KnockoutObservable
  import typings.knockout.KnockoutObservableArray
  import typings.knockout.KnockoutReadonlyObservableArray

  type KnockoutMappingOptions[T] = KnockoutMappingSpecificOptions[T] | KnockoutMappingStandardOptions
  type KnockoutMappingSpecificOptions[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? knockout.mapping.knockout.mapping._Global_.KnockoutPropertyMappingCallBack}
    */ typings.knockoutDotMapping.knockoutDotMappingStrings.KnockoutMappingSpecificOptions with js.Any
  // Could not get this to return any when T is any. It returns a Union type of the possible values.
  type KnockoutObservableArrayType[T] = KnockoutObservableArray[KnockoutObservableType[T] | T]
  type KnockoutObservableType[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends knockout.mapping.knockout.mapping.Primitives? knockout.KnockoutObservable<T[P]> : T[P] extends std.Array<any>? knockout.mapping.knockout.mapping._Global_.KnockoutObservableArrayType<T[P][number]> : T[P] extends std.ReadonlyArray<any>? knockout.mapping.knockout.mapping._Global_.KnockoutReadonlyObservableArrayType<T[P][number]> : knockout.mapping.knockout.mapping._Global_.MappedType<T[P]>}
    */ typings.knockoutDotMapping.knockoutDotMappingStrings.KnockoutObservableType with js.Any
  type KnockoutReadonlyObservableArrayType[T] = KnockoutReadonlyObservableArray[KnockoutObservableType[T] | T]
  type MappedType[T] = KnockoutObservableType[T] | KnockoutObservable[T]
}
