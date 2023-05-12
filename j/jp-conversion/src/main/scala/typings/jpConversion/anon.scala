package typings.jpConversion

import typings.jpConversion.jpConversionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hiragana extends StObject {
    
    var hiragana: `false` | String
    
    var kanji: `false` | String
    
    var katakana: `false` | String
    
    var romaji: `false` | String
  }
  object Hiragana {
    
    inline def apply(
      hiragana: `false` | String,
      kanji: `false` | String,
      katakana: `false` | String,
      romaji: `false` | String
    ): Hiragana = {
      val __obj = js.Dynamic.literal(hiragana = hiragana.asInstanceOf[js.Any], kanji = kanji.asInstanceOf[js.Any], katakana = katakana.asInstanceOf[js.Any], romaji = romaji.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hiragana]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hiragana] (val x: Self) extends AnyVal {
      
      inline def setHiragana(value: `false` | String): Self = StObject.set(x, "hiragana", value.asInstanceOf[js.Any])
      
      inline def setKanji(value: `false` | String): Self = StObject.set(x, "kanji", value.asInstanceOf[js.Any])
      
      inline def setKatakana(value: `false` | String): Self = StObject.set(x, "katakana", value.asInstanceOf[js.Any])
      
      inline def setRomaji(value: `false` | String): Self = StObject.set(x, "romaji", value.asInstanceOf[js.Any])
    }
  }
}
