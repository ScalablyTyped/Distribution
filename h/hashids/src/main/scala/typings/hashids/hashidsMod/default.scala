package typings.hashids.hashidsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashids", JSImport.Default)
@js.native
class default protected () extends Hashids {
  def this(salt: String) = this()
  def this(salt: String, minHashLength: Double) = this()
  def this(salt: String, minHashLength: Double, alphabet: String) = this()
}

