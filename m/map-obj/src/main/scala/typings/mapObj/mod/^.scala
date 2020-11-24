package typings.mapObj.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("map-obj", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^  with TopLevel[js.Any] = js.native
  def apply[SourceObjectType /* <: js.Object */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: DeepOptions
  ): StringDictionary[js.Any] = js.native
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: Options
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in MappedObjectKeyType ]: MappedObjectValueType}
    */ typings.mapObj.mapObjStrings.^  with TopLevel[js.Any] = js.native
  def apply[SourceObjectType /* <: StringDictionary[js.Any] */, TargetObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: TargetOptions[TargetObjectType]
  ): TargetObjectType with typings.mapObj.mapObjStrings.^  with TopLevel[js.Any] = js.native
}
