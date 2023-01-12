package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * Look up the charset of a mime type
    */
  def charsetLookup(mime: String): String
  
  /**
    * Converts a string to a base 64 string
    */
  def encodeBase64(str: String): String
  
  /**
    * Gets a source map generator
    */
  def getSourceMapGenerator(): Any
  
  /**
    * Lookup the mime-type of a filename
    */
  def mimeLookup(filename: String): String
}
object Environment {
  
  inline def apply(
    charsetLookup: String => String,
    encodeBase64: String => String,
    getSourceMapGenerator: () => Any,
    mimeLookup: String => String
  ): Environment = {
    val __obj = js.Dynamic.literal(charsetLookup = js.Any.fromFunction1(charsetLookup), encodeBase64 = js.Any.fromFunction1(encodeBase64), getSourceMapGenerator = js.Any.fromFunction0(getSourceMapGenerator), mimeLookup = js.Any.fromFunction1(mimeLookup))
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setCharsetLookup(value: String => String): Self = StObject.set(x, "charsetLookup", js.Any.fromFunction1(value))
    
    inline def setEncodeBase64(value: String => String): Self = StObject.set(x, "encodeBase64", js.Any.fromFunction1(value))
    
    inline def setGetSourceMapGenerator(value: () => Any): Self = StObject.set(x, "getSourceMapGenerator", js.Any.fromFunction0(value))
    
    inline def setMimeLookup(value: String => String): Self = StObject.set(x, "mimeLookup", js.Any.fromFunction1(value))
  }
}
