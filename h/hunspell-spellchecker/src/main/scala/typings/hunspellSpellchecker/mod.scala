package typings.hunspellSpellchecker

import typings.hunspellSpellchecker.anon.Aff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hunspell-spellchecker", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Spellchecker {
    def this(dictionary: Dictionary) = this()
  }
  
  trait Dictionary extends StObject {
    
    var compoundRuleCodes: js.Object
    
    var compoundRules: js.Array[Any]
    
    var dictionaryTable: js.Object
    
    var flags: js.Object
    
    var replacementTable: js.Array[Any]
    
    var rules: js.Object
  }
  object Dictionary {
    
    inline def apply(
      compoundRuleCodes: js.Object,
      compoundRules: js.Array[Any],
      dictionaryTable: js.Object,
      flags: js.Object,
      replacementTable: js.Array[Any],
      rules: js.Object
    ): Dictionary = {
      val __obj = js.Dynamic.literal(compoundRuleCodes = compoundRuleCodes.asInstanceOf[js.Any], compoundRules = compoundRules.asInstanceOf[js.Any], dictionaryTable = dictionaryTable.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], replacementTable = replacementTable.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictionary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictionary] (val x: Self) extends AnyVal {
      
      inline def setCompoundRuleCodes(value: js.Object): Self = StObject.set(x, "compoundRuleCodes", value.asInstanceOf[js.Any])
      
      inline def setCompoundRules(value: js.Array[Any]): Self = StObject.set(x, "compoundRules", value.asInstanceOf[js.Any])
      
      inline def setCompoundRulesVarargs(value: Any*): Self = StObject.set(x, "compoundRules", js.Array(value*))
      
      inline def setDictionaryTable(value: js.Object): Self = StObject.set(x, "dictionaryTable", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: js.Object): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setReplacementTable(value: js.Array[Any]): Self = StObject.set(x, "replacementTable", value.asInstanceOf[js.Any])
      
      inline def setReplacementTableVarargs(value: Any*): Self = StObject.set(x, "replacementTable", js.Array(value*))
      
      inline def setRules(value: js.Object): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Spellchecker extends StObject {
    
    /**
      * Checks whether a word or a capitalization variant exists in the current dictionary.
      * The word is trimmed and several variations of capitalizations are checked.
      * If you want to check a word without any changes made to it, call checkExact()
      */
    def check(word: String): Boolean = js.native
    
    /** Checks whether a word exists in the current dictionary. */
    def checkExact(word: String): Boolean = js.native
    
    /** Looks up whether a given word is flagged with a given flag. */
    def hasFlag(word: String, flag: String): Boolean = js.native
    
    /** Parse a dicitonary */
    def parse(files: Aff): Dictionary = js.native
    
    /**
      * Returns a list of suggestions for a misspelled word.
      *
      * @see http://www.norvig.com/spell-correct.html for the basis of this suggestor.
      * This suggestor is primitive, but it works.
      *
      * @param limit The maximum number of suggestions to return.
      */
    def suggest(word: String): js.Array[String] = js.native
    def suggest(word: String, limit: Double): js.Array[String] = js.native
    
    /** Use a parsed dictionary */
    def use(dictionary: Dictionary): Unit = js.native
  }
}
