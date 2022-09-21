package typings.jabber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jabber", JSImport.Namespace)
  @js.native
  /**
    *
    * @param themeWords Custom words that need to appear in some density
    * @param themeWordDensity appearance of themeword 1 per this number so 5 will make it approx 1 per 5 words
    * @param extraVowels additional vowel chars
    * @param extraConsonants additional consonants
    */
  open class ^ ()
    extends StObject
       with Jabber {
    def this(themeWords: js.Array[String]) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Double) = this()
    def this(themeWords: Unit, themeWordDensity: Double) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Double, extraVowels: String) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Unit, extraVowels: String) = this()
    def this(themeWords: Unit, themeWordDensity: Double, extraVowels: String) = this()
    def this(themeWords: Unit, themeWordDensity: Unit, extraVowels: String) = this()
    def this(
      themeWords: js.Array[String],
      themeWordDensity: Double,
      extraVowels: String,
      extraConsonants: String
    ) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Double, extraVowels: Unit, extraConsonants: String) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Unit, extraVowels: String, extraConsonants: String) = this()
    def this(themeWords: js.Array[String], themeWordDensity: Unit, extraVowels: Unit, extraConsonants: String) = this()
    def this(themeWords: Unit, themeWordDensity: Double, extraVowels: String, extraConsonants: String) = this()
    def this(themeWords: Unit, themeWordDensity: Double, extraVowels: Unit, extraConsonants: String) = this()
    def this(themeWords: Unit, themeWordDensity: Unit, extraVowels: String, extraConsonants: String) = this()
    def this(themeWords: Unit, themeWordDensity: Unit, extraVowels: Unit, extraConsonants: String) = this()
  }
  
  @js.native
  trait Jabber extends StObject {
    
    def createEmail(): String = js.native
    def createEmail(customDomain: String): String = js.native
    
    /**
      * Create fake full name
      */
    def createFullName(): String = js.native
    def createFullName(salutation: Boolean): String = js.native
    
    /**
      * Create paragraph of certain number of words
      */
    def createParagraph(length: Double): String = js.native
    
    /**
      * Create word of certain length
      */
    def createWord(length: Double): String = js.native
    def createWord(length: Double, capitalize: Boolean): String = js.native
    def createWord(length: Double, capitalize: Boolean, avoidThemeWords: Boolean): String = js.native
    def createWord(length: Double, capitalize: Unit, avoidThemeWords: Boolean): String = js.native
  }
}
