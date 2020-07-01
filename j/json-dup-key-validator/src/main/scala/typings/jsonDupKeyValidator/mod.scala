package typings.jsonDupKeyValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-dup-key-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(jsonString: String): js.Object = js.native
  def parse(jsonString: String, allowDuplicatedKeys: Boolean): js.Object = js.native
  def validate(jsonString: String): js.UndefOr[String] = js.native
  def validate(jsonString: String, allowDuplicatedKeys: Boolean): js.UndefOr[String] = js.native
}

