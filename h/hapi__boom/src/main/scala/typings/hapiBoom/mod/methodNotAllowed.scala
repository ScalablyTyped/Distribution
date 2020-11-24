package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/boom", "methodNotAllowed")
@js.native
object methodNotAllowed extends js.Object {
  
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: String): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: String, data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  def apply[Data](message: String, data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
}
