package typings.graphqlToolsUtils.pruneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneSchemaOptions extends js.Object {
  var skipEmptyCompositeTypePruning: js.UndefOr[Boolean] = js.undefined
  var skipEmptyUnionPruning: js.UndefOr[Boolean] = js.undefined
  var skipUnimplementedInterfacesPruning: js.UndefOr[Boolean] = js.undefined
  var skipUnusedTypesPruning: js.UndefOr[Boolean] = js.undefined
}

object PruneSchemaOptions {
  @scala.inline
  def apply(
    skipEmptyCompositeTypePruning: js.UndefOr[Boolean] = js.undefined,
    skipEmptyUnionPruning: js.UndefOr[Boolean] = js.undefined,
    skipUnimplementedInterfacesPruning: js.UndefOr[Boolean] = js.undefined,
    skipUnusedTypesPruning: js.UndefOr[Boolean] = js.undefined
  ): PruneSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipEmptyCompositeTypePruning)) __obj.updateDynamic("skipEmptyCompositeTypePruning")(skipEmptyCompositeTypePruning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyUnionPruning)) __obj.updateDynamic("skipEmptyUnionPruning")(skipEmptyUnionPruning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnimplementedInterfacesPruning)) __obj.updateDynamic("skipUnimplementedInterfacesPruning")(skipUnimplementedInterfacesPruning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnusedTypesPruning)) __obj.updateDynamic("skipUnusedTypesPruning")(skipUnusedTypesPruning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneSchemaOptions]
  }
}

