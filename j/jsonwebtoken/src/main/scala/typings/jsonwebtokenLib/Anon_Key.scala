package typings
package jsonwebtokenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var passphrase: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, passphrase: java.lang.String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, passphrase = passphrase)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

