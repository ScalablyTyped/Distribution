package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StitchingInfo extends js.Object {
  var dynamicSelectionSetsByField: Record[
    String, 
    Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
  ] = js.native
  var fragmentsByField: Record[String, Record[String, InlineFragmentNode]] = js.native
  var mergedTypes: Record[String, MergedTypeInfo] = js.native
  var selectionSetsByField: Record[String, Record[String, SelectionSetNode]] = js.native
  var selectionSetsByType: Record[String, SelectionSetNode] = js.native
  var transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema] = js.native
}

object StitchingInfo {
  @scala.inline
  def apply(
    dynamicSelectionSetsByField: Record[
      String, 
      Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
    ],
    fragmentsByField: Record[String, Record[String, InlineFragmentNode]],
    mergedTypes: Record[String, MergedTypeInfo],
    selectionSetsByField: Record[String, Record[String, SelectionSetNode]],
    selectionSetsByType: Record[String, SelectionSetNode],
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema]
  ): StitchingInfo = {
    val __obj = js.Dynamic.literal(dynamicSelectionSetsByField = dynamicSelectionSetsByField.asInstanceOf[js.Any], fragmentsByField = fragmentsByField.asInstanceOf[js.Any], mergedTypes = mergedTypes.asInstanceOf[js.Any], selectionSetsByField = selectionSetsByField.asInstanceOf[js.Any], selectionSetsByType = selectionSetsByType.asInstanceOf[js.Any], transformedSchemas = transformedSchemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StitchingInfo]
  }
  @scala.inline
  implicit class StitchingInfoOps[Self <: StitchingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamicSelectionSetsByField(
      value: Record[
          String, 
          Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
        ]
    ): Self = this.set("dynamicSelectionSetsByField", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentsByField(value: Record[String, Record[String, InlineFragmentNode]]): Self = this.set("fragmentsByField", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergedTypes(value: Record[String, MergedTypeInfo]): Self = this.set("mergedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSetsByField(value: Record[String, Record[String, SelectionSetNode]]): Self = this.set("selectionSetsByField", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSetsByType(value: Record[String, SelectionSetNode]): Self = this.set("selectionSetsByType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformedSchemas(value: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema]): Self = this.set("transformedSchemas", value.asInstanceOf[js.Any])
  }
  
}

