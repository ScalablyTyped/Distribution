package typings.graphqlToolsUtils.pruneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PruneSchemaOptions extends js.Object {
  /**
    * Set to `true` to skip pruning object types or interfaces with no no fields
    */
  var skipEmptyCompositeTypePruning: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to skip pruning empty unions
    */
  var skipEmptyUnionPruning: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to skip pruning interfaces that are not implemented by any
    * other types
    */
  var skipUnimplementedInterfacesPruning: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to skip pruning unused types
    */
  var skipUnusedTypesPruning: js.UndefOr[Boolean] = js.native
}

object PruneSchemaOptions {
  @scala.inline
  def apply(): PruneSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PruneSchemaOptions]
  }
  @scala.inline
  implicit class PruneSchemaOptionsOps[Self <: PruneSchemaOptions] (val x: Self) extends AnyVal {
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
    def setSkipEmptyCompositeTypePruning(value: Boolean): Self = this.set("skipEmptyCompositeTypePruning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipEmptyCompositeTypePruning: Self = this.set("skipEmptyCompositeTypePruning", js.undefined)
    @scala.inline
    def setSkipEmptyUnionPruning(value: Boolean): Self = this.set("skipEmptyUnionPruning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipEmptyUnionPruning: Self = this.set("skipEmptyUnionPruning", js.undefined)
    @scala.inline
    def setSkipUnimplementedInterfacesPruning(value: Boolean): Self = this.set("skipUnimplementedInterfacesPruning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUnimplementedInterfacesPruning: Self = this.set("skipUnimplementedInterfacesPruning", js.undefined)
    @scala.inline
    def setSkipUnusedTypesPruning(value: Boolean): Self = this.set("skipUnusedTypesPruning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUnusedTypesPruning: Self = this.set("skipUnusedTypesPruning", js.undefined)
  }
  
}

