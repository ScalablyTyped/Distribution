package typings.luminoDatagrid.jsonmodelMod

import typings.luminoDatagrid.datamodelMod.DataModel
import typings.luminoDatagrid.jsonmodelMod.JSONModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/jsonmodel", "JSONModel")
@js.native
class JSONModel_ protected () extends DataModel {
  /**
    * Create a data model with static JSON data.
    *
    * @param options - The options for initializing the data model.
    */
  def this(options: IOptions) = this()
  var _bodyFields: js.Any = js.native
  var _data: js.Any = js.native
  var _headerFields: js.Any = js.native
  var _missingValues: js.Any = js.native
}

