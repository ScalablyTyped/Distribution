package typings.koaSessionMinimal.anon

import typings.cookies.mod.IOptions
import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /**
    * cookie options
    */
  var cookie: js.UndefOr[IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])] = js.undefined
  /**
    * session cookie name and store key prefix. Default is 'koa:sess'
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * session store
    */
  var store: js.UndefOr[js.Any] = js.undefined
}

object Cookie {
  @scala.inline
  def apply(
    cookie: IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions]) = null,
    key: String = null,
    store: js.Any = null
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

