package typings.jconv

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buf: Buffer, from: String, to: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("jconv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /*
    * Converts a Buffer from one encoding straight to another, and returns a new Buffer.
    */
  inline def convert(buf: Buffer, from: String, to: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(buf.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /*
    * Decodes a Buffer with the given encoding to a string.
    */
  inline def decode(buf: Buffer, from: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /*
    * Adds a new encoding. Already used internally with SJIS, JIS and EUCJP.
    */
  inline def defineEncoding(obj: Encoding): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineEncoding")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /*
    * Encodes a string to a Buffer with a given encoding.
    */
  inline def encode(str: String, to: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /*
    * Checks whether an encoding exists.
    */
  inline def encodingExists(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingExists")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Encoding extends StObject {
    
    def convert(buf: Buffer): Buffer
    
    var name: String
  }
  object Encoding {
    
    inline def apply(convert: Buffer => Buffer, name: String): Encoding = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setConvert(value: Buffer => Buffer): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
