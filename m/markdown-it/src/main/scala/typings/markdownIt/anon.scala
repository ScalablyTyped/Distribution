package typings.markdownIt

import typings.mdurl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mdurl extends StObject {
    
    var mdurl: Typeofmdurl
  }
  object Mdurl {
    
    @scala.inline
    def apply(mdurl: Typeofmdurl): Mdurl = {
      val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mdurl]
    }
    
    @scala.inline
    implicit class MdurlMutableBuilder[Self <: Mdurl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMdurl(value: Typeofmdurl): Self = StObject.set(x, "mdurl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofdecode extends StObject {
    
    def apply(input: String): String = js.native
    def apply(input: String, exclude: String): String = js.native
    
    val componentChars: String = js.native
    
    val defaultChars: String = js.native
  }
  
  @js.native
  trait Typeofencode extends StObject {
    
    def apply(str: String): String = js.native
    def apply(str: String, exclude: String): String = js.native
    def apply(str: String, exclude: String, keepEscaped: Boolean): String = js.native
    def apply(str: String, exclude: Unit, keepEscaped: Boolean): String = js.native
    
    val componentChars: String = js.native
    
    val defaultChars: String = js.native
  }
  
  @js.native
  trait Typeofformat extends StObject {
    
    def apply(url: Url): String = js.native
  }
  
  trait Typeofmdurl extends StObject {
    
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
    
    @scala.inline
    implicit class TypeofmdurlMutableBuilder[Self <: Typeofmdurl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: Typeofdecode): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncode(value: Typeofencode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Typeofformat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: Typeofparse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofparse extends StObject {
    
    def apply(input: String): Url = js.native
    def apply(input: String, slashesDenoteHost: Boolean): Url = js.native
  }
}
