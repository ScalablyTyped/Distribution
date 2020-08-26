package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphqlToolsUtils.interfacesMod.TypeMap
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedTypeInfo extends js.Object {
  var containsSelectionSet: Map[SubschemaConfig, Map[SelectionSetNode, Boolean]] = js.native
  var nonUniqueFields: Record[String, js.Array[SubschemaConfig]] = js.native
  var selectionSet: js.UndefOr[SelectionSetNode] = js.native
  var selectionSets: Map[SubschemaConfig, SelectionSetNode] = js.native
  var targetSubschemas: Map[SubschemaConfig, js.Array[SubschemaConfig]] = js.native
  var typeMaps: Map[SubschemaConfig, TypeMap] = js.native
  var uniqueFields: Record[String, SubschemaConfig] = js.native
}

object MergedTypeInfo {
  @scala.inline
  def apply(
    containsSelectionSet: Map[SubschemaConfig, Map[SelectionSetNode, Boolean]],
    nonUniqueFields: Record[String, js.Array[SubschemaConfig]],
    selectionSets: Map[SubschemaConfig, SelectionSetNode],
    targetSubschemas: Map[SubschemaConfig, js.Array[SubschemaConfig]],
    typeMaps: Map[SubschemaConfig, TypeMap],
    uniqueFields: Record[String, SubschemaConfig]
  ): MergedTypeInfo = {
    val __obj = js.Dynamic.literal(containsSelectionSet = containsSelectionSet.asInstanceOf[js.Any], nonUniqueFields = nonUniqueFields.asInstanceOf[js.Any], selectionSets = selectionSets.asInstanceOf[js.Any], targetSubschemas = targetSubschemas.asInstanceOf[js.Any], typeMaps = typeMaps.asInstanceOf[js.Any], uniqueFields = uniqueFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedTypeInfo]
  }
  @scala.inline
  implicit class MergedTypeInfoOps[Self <: MergedTypeInfo] (val x: Self) extends AnyVal {
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
    def setContainsSelectionSet(value: Map[SubschemaConfig, Map[SelectionSetNode, Boolean]]): Self = this.set("containsSelectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonUniqueFields(value: Record[String, js.Array[SubschemaConfig]]): Self = this.set("nonUniqueFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSets(value: Map[SubschemaConfig, SelectionSetNode]): Self = this.set("selectionSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetSubschemas(value: Map[SubschemaConfig, js.Array[SubschemaConfig]]): Self = this.set("targetSubschemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeMaps(value: Map[SubschemaConfig, TypeMap]): Self = this.set("typeMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueFields(value: Record[String, SubschemaConfig]): Self = this.set("uniqueFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
  }
  
}

