package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SnapshotSerializerPlugin extends js.Object {
  def print(
    `val`: js.Any,
    serialize: js.Function1[/* val */ js.Any, java.lang.String],
    indent: js.Function1[/* str */ java.lang.String, java.lang.String],
    opts: SnapshotSerializerOptions,
    colors: SnapshotSerializerColors
  ): java.lang.String
  def test(`val`: js.Any): scala.Boolean
}

