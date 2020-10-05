package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUnset extends LodashConvertible {
  def apply(path: PropertyPath): LodashUnset1x1 = js.native
  def apply[T](path: PropertyPath, `object`: T): T = js.native
  def apply[T](path: __, `object`: T): LodashUnset1x2[T] = js.native
}

