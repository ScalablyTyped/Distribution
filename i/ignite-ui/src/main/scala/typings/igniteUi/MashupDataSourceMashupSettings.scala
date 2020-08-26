package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MashupDataSourceMashupSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * An array of $.ig.DataSource instances holding the disperse data.
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /**
    * Indicates whether to ignore records that have no corresponding data in all of the provided data sources.
    */
  var ignorePartialRecords: js.UndefOr[Boolean] = js.native
}

object MashupDataSourceMashupSettings {
  @scala.inline
  def apply(): MashupDataSourceMashupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MashupDataSourceMashupSettings]
  }
  @scala.inline
  implicit class MashupDataSourceMashupSettingsOps[Self <: MashupDataSourceMashupSettings] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setIgnorePartialRecords(value: Boolean): Self = this.set("ignorePartialRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePartialRecords: Self = this.set("ignorePartialRecords", js.undefined)
  }
  
}

