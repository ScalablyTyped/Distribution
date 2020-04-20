package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var down: js.UndefOr[js.Function1[/* kenx */ Knex[_, js.Array[_]], js.Thenable[_]]] = js.undefined
  def up(knex: Knex[_, js.Array[_]]): js.Thenable[_]
}

object Migration {
  @scala.inline
  def apply(
    up: Knex[_, js.Array[_]] => js.Thenable[_],
    down: /* kenx */ Knex[_, js.Array[_]] => js.Thenable[_] = null
  ): Migration = {
    val __obj = js.Dynamic.literal(up = js.Any.fromFunction1(up))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    __obj.asInstanceOf[Migration]
  }
}

