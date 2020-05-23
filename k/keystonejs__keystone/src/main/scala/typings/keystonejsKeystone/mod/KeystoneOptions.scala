package typings.keystonejsKeystone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keystonejsKeystone.anon.Field
import typings.keystonejsKeystone.anon.MaxTotalResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystoneOptions extends js.Object {
  var adapter: BaseKeystoneAdapter
  var adapters: js.UndefOr[StringDictionary[BaseKeystoneAdapter]] = js.undefined
  var cookieMaxAge: js.UndefOr[Double] = js.undefined
  var cookieSecret: js.UndefOr[String] = js.undefined
  var defaultAcces: js.UndefOr[Field] = js.undefined
  var defaultAdapter: js.UndefOr[String] = js.undefined
  var name: String
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var queryLimits: js.UndefOr[MaxTotalResults] = js.undefined
   // TODO: bring in express session types
  var schemaNames: js.UndefOr[js.Array[String]] = js.undefined
  var secureCookies: js.UndefOr[Boolean] = js.undefined
  var sessionStore: js.UndefOr[js.Any] = js.undefined
}

object KeystoneOptions {
  @scala.inline
  def apply(
    adapter: BaseKeystoneAdapter,
    name: String,
    adapters: StringDictionary[BaseKeystoneAdapter] = null,
    cookieMaxAge: js.UndefOr[Double] = js.undefined,
    cookieSecret: String = null,
    defaultAcces: Field = null,
    defaultAdapter: String = null,
    onConnect: () => Unit = null,
    queryLimits: MaxTotalResults = null,
    schemaNames: js.Array[String] = null,
    secureCookies: js.UndefOr[Boolean] = js.undefined,
    sessionStore: js.Any = null
  ): KeystoneOptions = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (adapters != null) __obj.updateDynamic("adapters")(adapters.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieMaxAge)) __obj.updateDynamic("cookieMaxAge")(cookieMaxAge.get.asInstanceOf[js.Any])
    if (cookieSecret != null) __obj.updateDynamic("cookieSecret")(cookieSecret.asInstanceOf[js.Any])
    if (defaultAcces != null) __obj.updateDynamic("defaultAcces")(defaultAcces.asInstanceOf[js.Any])
    if (defaultAdapter != null) __obj.updateDynamic("defaultAdapter")(defaultAdapter.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction0(onConnect))
    if (queryLimits != null) __obj.updateDynamic("queryLimits")(queryLimits.asInstanceOf[js.Any])
    if (schemaNames != null) __obj.updateDynamic("schemaNames")(schemaNames.asInstanceOf[js.Any])
    if (!js.isUndefined(secureCookies)) __obj.updateDynamic("secureCookies")(secureCookies.get.asInstanceOf[js.Any])
    if (sessionStore != null) __obj.updateDynamic("sessionStore")(sessionStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneOptions]
  }
}

