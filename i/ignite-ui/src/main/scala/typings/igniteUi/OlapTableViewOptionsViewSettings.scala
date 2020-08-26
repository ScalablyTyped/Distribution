package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapTableViewOptionsViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" value indicating wheter the column headers should be arranged for compact header layout - each hieararchy is in a single row.
    */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.native
  /**
    * Optional="false" value indicating wheter the row headers should be arranged for compact header layout - each hieararchy is in a single row.
    */
  var compactRowHeaders: js.UndefOr[Boolean] = js.native
  /**
    * Optional="false" a value indicating whether parent for columns is in front of its children.
    *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
    *                 Child members immediately follow their parent members.
    *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.native
  /**
    * Optional="false" a value indicating whether parent for rows is in front of its children.
    *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
    *                 Child members immediately follow their parent members.
    *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.native
}

object OlapTableViewOptionsViewSettings {
  @scala.inline
  def apply(): OlapTableViewOptionsViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptionsViewSettings]
  }
  @scala.inline
  implicit class OlapTableViewOptionsViewSettingsOps[Self <: OlapTableViewOptionsViewSettings] (val x: Self) extends AnyVal {
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
    def setCompactColumnHeaders(value: Boolean): Self = this.set("compactColumnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactColumnHeaders: Self = this.set("compactColumnHeaders", js.undefined)
    @scala.inline
    def setCompactRowHeaders(value: Boolean): Self = this.set("compactRowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactRowHeaders: Self = this.set("compactRowHeaders", js.undefined)
    @scala.inline
    def setIsParentInFrontForColumns(value: Boolean): Self = this.set("isParentInFrontForColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsParentInFrontForColumns: Self = this.set("isParentInFrontForColumns", js.undefined)
    @scala.inline
    def setIsParentInFrontForRows(value: Boolean): Self = this.set("isParentInFrontForRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsParentInFrontForRows: Self = this.set("isParentInFrontForRows", js.undefined)
  }
  
}

