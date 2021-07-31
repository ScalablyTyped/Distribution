package typings.ini

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ini", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(str: String): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def encode(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(`object`: js.Any, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encode(`object`: js.Any, options: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parse(str: String): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def safe(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safe")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stringify(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Any, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Any, options: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def unsafe(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafe")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait EncodeOptions extends StObject {
    
    var section: String
    
    var whitespace: Boolean
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
