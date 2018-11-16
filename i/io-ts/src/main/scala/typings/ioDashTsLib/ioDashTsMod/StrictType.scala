package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "StrictType")
@js.native
class StrictType[P, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], props: P) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.StrictType = js.native
  val props: P = js.native
}

