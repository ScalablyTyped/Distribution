package typings.gradecamTsenum

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@gradecam/tsenum", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Use this along with TypeFromEnum to make a "fake" frozen enum which can be
    * used in place of an enum in ways that are mongoose-friendly and much more
    * flexible than a typescript enum. Example:
    *
    * const MyEnum = MakeEnum({
    *  key1: "value1",
    *  key2: "value2",
    *  key3: "value3",
    * });
    * type MyEnum = TypeFromEnum<typeof MyEnum>;
    *
    * // MyEnum will be type 'value1' | 'value2' | 'value3'
    * // MyEnum.key1, etc al work
    * // Object.values(MyEnum) will return ["value1", "value2", "value3"] e.g. for use in a mongoose enum
    * // assigning something of type MyEnum to the string value works
    *
    * You can also pass in multiple objects (or multiple enums created with this
    * helper) and the result will combine them with the actual value using Object.assign
    *
    * @param x Enum object to create a typed enum for
    */
  def MakeEnum[T1 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1): T1 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2): T1 with T2 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3): T1 with T2 with T3 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4): T1 with T2 with T3 with T4 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, T5 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4, x5: T5): T1 with T2 with T3 with T4 with T5 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, T5 /* <: StringDictionary[U] */, T6 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6): T1 with T2 with T3 with T4 with T5 with T6 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, T5 /* <: StringDictionary[U] */, T6 /* <: StringDictionary[U] */, T7 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7): T1 with T2 with T3 with T4 with T5 with T6 with T7 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, T5 /* <: StringDictionary[U] */, T6 /* <: StringDictionary[U] */, T7 /* <: StringDictionary[U] */, T8 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8): T1 with T2 with T3 with T4 with T5 with T6 with T7 with T8 = js.native
  def MakeEnum[T1 /* <: StringDictionary[U] */, T2 /* <: StringDictionary[U] */, T3 /* <: StringDictionary[U] */, T4 /* <: StringDictionary[U] */, T5 /* <: StringDictionary[U] */, T6 /* <: StringDictionary[U] */, T7 /* <: StringDictionary[U] */, T8 /* <: StringDictionary[U] */, T9 /* <: StringDictionary[U] */, U /* <: ValidEnumTypes */](x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8, x9: T9): T1 with T2 with T3 with T4 with T5 with T6 with T7 with T8 with T9 = js.native
  /**
    * Use this with MakeEnum. See docs for MakeEnum for example
    */
  type TypeFromEnum[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  type ValidEnumTypes = Double | String | Boolean
}

