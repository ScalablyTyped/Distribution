package typings.locale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * This module exports a function that can be used as Express/Connect
    * middleware. It takes one argument, a list of supported locales, and adds a
    * `locale` property to incoming HTTP requests, reflecting the most appropriate
    * locale determined using the `best` method described below.
    */
  def apply(): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: js.UndefOr[scala.Nothing], `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: String, `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: js.Array[String | Locale]): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: js.Array[String | Locale], `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: Locales): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  def apply(supported: Locales, `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
}

