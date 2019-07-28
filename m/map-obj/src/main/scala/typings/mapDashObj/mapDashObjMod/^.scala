package typings.mapDashObj.mapDashObjMod

import org.scalablytyped.runtime.StringDictionary
import typings.mapDashObj.mapDashObjStrings.`_backtick^_backtick`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("map-obj", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType]
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ `_backtick^_backtick` with js.Any = js.native
  def apply[SourceObjectType /* <: js.Object */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: DeepOptions
  ): StringDictionary[js.Any] = js.native
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: Options
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ `_backtick^_backtick` with js.Any = js.native
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, TargetObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: TargetOptions[TargetObjectType]
  ): TargetObjectType with `_backtick^_backtick` with js.Any = js.native
}

