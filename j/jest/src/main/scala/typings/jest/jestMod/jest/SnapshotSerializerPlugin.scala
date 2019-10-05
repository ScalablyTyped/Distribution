package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSerializerPlugin extends js.Object {
  def print(
    `val`: js.Any,
    serialize: js.Function1[/* val */ js.Any, String],
    indent: js.Function1[/* str */ String, String],
    opts: SnapshotSerializerOptions,
    colors: SnapshotSerializerColors
  ): String
  def test(`val`: js.Any): Boolean
}

object SnapshotSerializerPlugin {
  @scala.inline
  def apply(
    print: (js.Any, js.Function1[/* val */ js.Any, String], js.Function1[/* str */ String, String], SnapshotSerializerOptions, SnapshotSerializerColors) => String,
    test: js.Any => Boolean
  ): SnapshotSerializerPlugin = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[SnapshotSerializerPlugin]
  }
}

