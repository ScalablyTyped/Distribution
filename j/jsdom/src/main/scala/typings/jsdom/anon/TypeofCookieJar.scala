package typings.jsdom.anon

import org.scalablytyped.runtime.Instantiable0
import typings.std.Error
import typings.toughCookie.mod.CookieJar
import typings.toughCookie.mod.CookieJar.Serialized
import typings.toughCookie.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCookieJar extends Instantiable0[CookieJar] {
  def deserialize(serialized: String): js.Promise[CookieJar] = js.native
  def deserialize(serialized: String, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(serialized: String, store: Store): js.Promise[CookieJar] = js.native
  def deserialize(
    serialized: String,
    store: Store,
    cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserialize(serialized: Serialized): js.Promise[CookieJar] = js.native
  def deserialize(serialized: Serialized, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(serialized: Serialized, store: Store): js.Promise[CookieJar] = js.native
  def deserialize(
    serialized: Serialized,
    store: Store,
    cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserializeSync(serialized: String): CookieJar = js.native
  def deserializeSync(serialized: String, store: Store): CookieJar = js.native
  def deserializeSync(serialized: Serialized): CookieJar = js.native
  def deserializeSync(serialized: Serialized, store: Store): CookieJar = js.native
  def fromJSON(string: String): CookieJar = js.native
}

