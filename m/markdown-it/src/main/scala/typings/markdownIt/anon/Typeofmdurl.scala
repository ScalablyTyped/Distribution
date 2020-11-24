package typings.markdownIt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmdurl extends js.Object {
  
  val decode: Typeofdecode = js.native
  
  val encode: Typeofencode = js.native
  
  val format: Typeofformat = js.native
  
  val parse: Typeofparse = js.native
}
object Typeofmdurl {
  
  @scala.inline
  def apply(decode: Typeofdecode, encode: Typeofencode, format: Typeofformat, parse: Typeofparse): Typeofmdurl = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmdurl]
  }
  
  @scala.inline
  implicit class TypeofmdurlOps[Self <: Typeofmdurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecode(value: Typeofdecode): Self = this.set("decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncode(value: Typeofencode): Self = this.set("encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Typeofformat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: Typeofparse): Self = this.set("parse", value.asInstanceOf[js.Any])
  }
}
