package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceOptions extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceAggregateItem]] = js.undefined
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  var batch: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DataSourceChangeEvent, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ DataSourceErrorEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[DataSourceGroupItem | js.Array[DataSourceGroupItem]] = js.undefined
  var inPlaceSort: js.UndefOr[scala.Boolean] = js.undefined
  var offlineStorage: js.UndefOr[js.Any] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var push: js.UndefOr[js.Function1[/* e */ DataSourcePushEvent, scala.Unit]] = js.undefined
  var requestEnd: js.UndefOr[js.Function1[/* e */ DataSourceRequestEndEvent, scala.Unit]] = js.undefined
  var requestStart: js.UndefOr[js.Function1[/* e */ DataSourceRequestStartEvent, scala.Unit]] = js.undefined
  var schema: js.UndefOr[DataSourceSchema] = js.undefined
  var serverAggregates: js.UndefOr[scala.Boolean] = js.undefined
  var serverFiltering: js.UndefOr[scala.Boolean] = js.undefined
  var serverGrouping: js.UndefOr[scala.Boolean] = js.undefined
  var serverPaging: js.UndefOr[scala.Boolean] = js.undefined
  var serverSorting: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var sync: js.UndefOr[js.Function1[/* e */ DataSourceEvent, scala.Unit]] = js.undefined
  var transport: js.UndefOr[DataSourceTransport] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

