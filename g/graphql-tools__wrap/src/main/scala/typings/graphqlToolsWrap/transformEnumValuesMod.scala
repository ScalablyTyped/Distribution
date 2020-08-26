package typings.graphqlToolsWrap

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.graphqlToolsWrap.mapLeafValuesMod.MapLeafValuesTransformationContext
import typings.graphqlToolsWrap.typesMod.EnumValueTransformer
import typings.graphqlToolsWrap.typesMod.LeafValueTransformer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/TransformEnumValues", JSImport.Namespace)
@js.native
object transformEnumValuesMod extends js.Object {
  @js.native
  trait TransformEnumValues extends Transform[MapLeafValuesTransformationContext] {
    val enumValueTransformer: js.Any = js.native
    var mapping: js.Any = js.native
    var reverseMapping: js.Any = js.native
    var transformEnumValue: js.Any = js.native
    var transformedSchema: js.Any = js.native
    val transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformEnumValues(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformEnumValues(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: MapLeafValuesTransformationContext
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformEnumValues(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformEnumValues(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: MapLeafValuesTransformationContext
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MTransformEnumValues(originalResult: ExecutionResult[StringDictionary[_], StringDictionary[_]]): js.Any = js.native
    @JSName("transformResult")
    def transformResult_MTransformEnumValues(
      originalResult: ExecutionResult[StringDictionary[_], StringDictionary[_]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: MapLeafValuesTransformationContext
    ): js.Any = js.native
    @JSName("transformResult")
    def transformResult_MTransformEnumValues(
      originalResult: ExecutionResult[StringDictionary[_], StringDictionary[_]],
      delegationContext: Record[String, _]
    ): js.Any = js.native
    @JSName("transformResult")
    def transformResult_MTransformEnumValues(
      originalResult: ExecutionResult[StringDictionary[_], StringDictionary[_]],
      delegationContext: Record[String, _],
      transformationContext: MapLeafValuesTransformationContext
    ): js.Any = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformEnumValues(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformEnumValues {
    def this(enumValueTransformer: EnumValueTransformer) = this()
    def this(enumValueTransformer: EnumValueTransformer, inputValueTransformer: LeafValueTransformer) = this()
    def this(
      enumValueTransformer: EnumValueTransformer,
      inputValueTransformer: js.UndefOr[scala.Nothing],
      outputValueTransformer: LeafValueTransformer
    ) = this()
    def this(
      enumValueTransformer: EnumValueTransformer,
      inputValueTransformer: LeafValueTransformer,
      outputValueTransformer: LeafValueTransformer
    ) = this()
  }
  
}

