package typings.libphonenumberJs

import typings.libphonenumberJs.libphonenumberJsStrings.Verticalline
import typings.libphonenumberJs.libphonenumberJsStrings.`[]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asYouTypeFormatterPatternParserMod {
  
  @JSImport("libphonenumber-js/source/AsYouTypeFormatter.PatternParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PatternParser {
    
    /* CompleteClass */
    override def parse(pattern: String): MatchTree = js.native
  }
  
  // Matches any character.
  //
  // Example:
  //
  // String pattern "123" compiles into 3 characters:
  //
  // ["1", "2", "3"]
  //
  type Character_ = character
  
  type MatchTree = Character_ | OneOfCharacters | js.Array[Any] | OrCondition[Any]
  
  // Matches one of characters.
  //
  // Example:
  //
  // String pattern "[5-9]" compiles into:
  //
  // { op: "[]", args: ["5", "6", "7", "8", "9"] }
  //
  trait OneOfCharacters extends StObject {
    
    var args: js.Array[character]
    
    var op: `[]`
  }
  object OneOfCharacters {
    
    inline def apply(args: js.Array[character]): OneOfCharacters = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], op = "[]")
      __obj.asInstanceOf[OneOfCharacters]
    }
    
    extension [Self <: OneOfCharacters](x: Self) {
      
      inline def setArgs(value: js.Array[character]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: character*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setOp(value: `[]`): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  // Matches any of the subtrees.
  //
  // Example:
  //
  // String pattern "123|[5-9]0" compiles into:
  //
  // {
  // 	op: "|",
  // 	args: [
  // 		// First subtree:
  // 		["1", "2", "3"],
  // 		// Second subtree:
  // 		[
  // 			{ op: "[]", args: ["5", "6", "7", "8", "9"] },
  // 			"0"
  // 		]
  // 	]
  // }
  //
  trait OrCondition[MatchTree] extends StObject {
    
    var args: js.Array[MatchTree]
    
    var op: Verticalline
  }
  object OrCondition {
    
    inline def apply[MatchTree](args: js.Array[MatchTree]): OrCondition[MatchTree] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], op = "|")
      __obj.asInstanceOf[OrCondition[MatchTree]]
    }
    
    extension [Self <: OrCondition[?], MatchTree](x: Self & OrCondition[MatchTree]) {
      
      inline def setArgs(value: js.Array[MatchTree]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: MatchTree*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setOp(value: Verticalline): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait PatternParser extends StObject {
    
    def parse(pattern: String): MatchTree
  }
  object PatternParser {
    
    inline def apply(parse: String => MatchTree): PatternParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[PatternParser]
    }
    
    extension [Self <: PatternParser](x: Self) {
      
      inline def setParse(value: String => MatchTree): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  type character = String
}
