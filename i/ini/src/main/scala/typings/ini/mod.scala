package typings.ini

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ini", "decode")
  @js.native
  def decode(str: String): StringDictionary[js.Any] = js.native
  
  @JSImport("ini", "encode")
  @js.native
  def encode(`object`: js.Any): String = js.native
  @JSImport("ini", "encode")
  @js.native
  def encode(`object`: js.Any, options: String): String = js.native
  @JSImport("ini", "encode")
  @js.native
  def encode(`object`: js.Any, options: EncodeOptions): String = js.native
  
  @JSImport("ini", "parse")
  @js.native
  def parse(str: String): StringDictionary[js.Any] = js.native
  
  @JSImport("ini", "safe")
  @js.native
  def safe(`val`: String): String = js.native
  
  @JSImport("ini", "stringify")
  @js.native
  def stringify(`object`: js.Any): String = js.native
  @JSImport("ini", "stringify")
  @js.native
  def stringify(`object`: js.Any, options: String): String = js.native
  @JSImport("ini", "stringify")
  @js.native
  def stringify(`object`: js.Any, options: EncodeOptions): String = js.native
  
  @JSImport("ini", "unsafe")
  @js.native
  def unsafe(`val`: String): String = js.native
  
  @js.native
  trait EncodeOptions extends StObject {
    
    var section: String = js.native
    
    var whitespace: Boolean = js.native
  }
  object EncodeOptions {
    
    @scala.inline
    def apply(section: String, whitespace: Boolean): EncodeOptions = {
      val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit class EncodeOptionsMutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    }
  }
}
