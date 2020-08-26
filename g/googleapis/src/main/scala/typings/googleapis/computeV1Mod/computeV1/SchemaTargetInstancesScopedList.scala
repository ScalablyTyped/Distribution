package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetInstancesScopedList extends js.Object {
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[SchemaTargetInstance]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaTargetInstancesScopedList {
  @scala.inline
  def apply(): SchemaTargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetInstancesScopedList]
  }
  @scala.inline
  implicit class SchemaTargetInstancesScopedListOps[Self <: SchemaTargetInstancesScopedList] (val x: Self) extends AnyVal {
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
    def setTargetInstancesVarargs(value: SchemaTargetInstance*): Self = this.set("targetInstances", js.Array(value :_*))
    @scala.inline
    def setTargetInstances(value: js.Array[SchemaTargetInstance]): Self = this.set("targetInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInstances: Self = this.set("targetInstances", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

