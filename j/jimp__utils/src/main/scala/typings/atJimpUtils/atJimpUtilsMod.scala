package typings.atJimpUtils

import typings.atJimpUtils.atJimpUtilsBooleans.`false`
import typings.atJimpUtils.atJimpUtilsBooleans.`true`
import typings.std.Error
import typings.std.Image
import typings.std.Omit
import typings.typescript.typescriptMod.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/utils", JSImport.Namespace)
@js.native
object atJimpUtilsMod extends js.Object {
  def isNodePattern(cb: js.Function): `true` = js.native
  def isNodePattern(cb: Omit[_, js.Function]): `false` = js.native
  def scan(
    image: Image,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function4[/* image */ Image, /* _x */ Double, /* _y */ Double, /* idx */ Double, Unit]
  ): Image = js.native
  def throwError(error: String): ThrowStatement = js.native
  def throwError(error: String, cb: js.Function1[/* err */ Error, Unit]): ThrowStatement = js.native
  def throwError(error: Error): ThrowStatement = js.native
  def throwError(error: Error, cb: js.Function1[/* err */ Error, Unit]): ThrowStatement = js.native
}

