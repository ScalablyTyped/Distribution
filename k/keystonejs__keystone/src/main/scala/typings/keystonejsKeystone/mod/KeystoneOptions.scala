package typings.keystonejsKeystone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keystonejsKeystone.anon.Field
import typings.keystonejsKeystone.anon.MaxTotalResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeystoneOptions extends js.Object {
  var adapter: BaseKeystoneAdapter = js.native
  var adapters: js.UndefOr[StringDictionary[BaseKeystoneAdapter]] = js.native
  var cookieMaxAge: js.UndefOr[Double] = js.native
  var cookieSecret: js.UndefOr[String] = js.native
  var defaultAcces: js.UndefOr[Field] = js.native
  var defaultAdapter: js.UndefOr[String] = js.native
  var name: String = js.native
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.native
  var queryLimits: js.UndefOr[MaxTotalResults] = js.native
   // TODO: bring in express session types
  var schemaNames: js.UndefOr[js.Array[String]] = js.native
  var secureCookies: js.UndefOr[Boolean] = js.native
  var sessionStore: js.UndefOr[js.Any] = js.native
}

object KeystoneOptions {
  @scala.inline
  def apply(adapter: BaseKeystoneAdapter, name: String): KeystoneOptions = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneOptions]
  }
  @scala.inline
  implicit class KeystoneOptionsOps[Self <: KeystoneOptions] (val x: Self) extends AnyVal {
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
    def setAdapter(value: BaseKeystoneAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdapters(value: StringDictionary[BaseKeystoneAdapter]): Self = this.set("adapters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdapters: Self = this.set("adapters", js.undefined)
    @scala.inline
    def setCookieMaxAge(value: Double): Self = this.set("cookieMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieMaxAge: Self = this.set("cookieMaxAge", js.undefined)
    @scala.inline
    def setCookieSecret(value: String): Self = this.set("cookieSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieSecret: Self = this.set("cookieSecret", js.undefined)
    @scala.inline
    def setDefaultAcces(value: Field): Self = this.set("defaultAcces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAcces: Self = this.set("defaultAcces", js.undefined)
    @scala.inline
    def setDefaultAdapter(value: String): Self = this.set("defaultAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAdapter: Self = this.set("defaultAdapter", js.undefined)
    @scala.inline
    def setOnConnect(value: () => Unit): Self = this.set("onConnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setQueryLimits(value: MaxTotalResults): Self = this.set("queryLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryLimits: Self = this.set("queryLimits", js.undefined)
    @scala.inline
    def setSchemaNamesVarargs(value: String*): Self = this.set("schemaNames", js.Array(value :_*))
    @scala.inline
    def setSchemaNames(value: js.Array[String]): Self = this.set("schemaNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaNames: Self = this.set("schemaNames", js.undefined)
    @scala.inline
    def setSecureCookies(value: Boolean): Self = this.set("secureCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureCookies: Self = this.set("secureCookies", js.undefined)
    @scala.inline
    def setSessionStore(value: js.Any): Self = this.set("sessionStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionStore: Self = this.set("sessionStore", js.undefined)
  }
  
}

