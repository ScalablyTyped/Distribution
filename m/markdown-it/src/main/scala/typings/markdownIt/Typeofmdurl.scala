package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmdurl extends js.Object {
  val decode: Typeofdecode
  val encode: Typeofencode
  val format: Typeofformat
  val parse: Typeofparse
}

object Typeofmdurl {
  @scala.inline
  def apply(decode: Typeofdecode, encode: Typeofencode, format: Typeofformat, parse: Typeofparse): Typeofmdurl = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmdurl]
  }
}

