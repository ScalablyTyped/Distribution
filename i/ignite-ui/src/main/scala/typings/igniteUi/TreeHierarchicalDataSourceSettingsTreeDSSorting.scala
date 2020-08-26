package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDSSorting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies from which data bound level to be applied sorting - 0 is the first level
    */
  var fromLevel: js.UndefOr[Double] = js.native
  /**
    * Specifies to which data bound level to be applied sorting - if -1 sorting should be applied to the last data bound level
    */
  var toLevel: js.UndefOr[Double] = js.native
}

object TreeHierarchicalDataSourceSettingsTreeDSSorting {
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSSorting]
  }
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSSortingOps[Self <: TreeHierarchicalDataSourceSettingsTreeDSSorting] (val x: Self) extends AnyVal {
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
    def setFromLevel(value: Double): Self = this.set("fromLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromLevel: Self = this.set("fromLevel", js.undefined)
    @scala.inline
    def setToLevel(value: Double): Self = this.set("toLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLevel: Self = this.set("toLevel", js.undefined)
  }
  
}

