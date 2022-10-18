package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libTokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesBlockStateBlockMod {
  
  @JSImport("markdown-it/lib/rules_block/state_block", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StateBlock {
    def this(src: String, md: MarkdownIt, env: Any, tokens: js.Array[typings.markdownIt.libTokenMod.^]) = this()
    
    /* CompleteClass */
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.libTokenMod.^
      ] = js.native
    
    /**
      * line begin offsets for fast jumps
      */
    /* CompleteClass */
    var bMarks: js.Array[Double] = js.native
    
    // block parser variables
    /**
      * required block content indent (for example, if we are
      * inside a list, it would be positioned after list marker)
      */
    /* CompleteClass */
    var blkIndent: Double = js.native
    
    /**
      * An amount of virtual spaces (tabs expanded) between beginning
      * of each line (bMarks) and real beginning of that line.
      *
      * It exists only as a hack because blockquotes override bMarks
      * losing information in the process.
      *
      * It's used only when expanding tabs, you can think about it as
      * an initial tab length, e.g. bsCount=21 applied to string `\t123`
      * means first tab should be expanded to 4-21%4 === 3 spaces.
      */
    /* CompleteClass */
    var bsCount: js.Array[Double] = js.native
    
    /**
      * indent of the current dd block (-1 if there isn't any)
      */
    /* CompleteClass */
    var ddIndent: Double = js.native
    
    /**
      * line end offsets for fast jumps
      */
    /* CompleteClass */
    var eMarks: js.Array[Double] = js.native
    
    /* CompleteClass */
    var env: Any = js.native
    
    /**
      * cut lines range from source.
      */
    /* CompleteClass */
    override def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
    
    /* CompleteClass */
    override def isEmpty(line: Double): Boolean = js.native
    
    /* CompleteClass */
    var level: Double = js.native
    
    /**
      * line index in src
      */
    /* CompleteClass */
    var line: Double = js.native
    
    /**
      * lines count
      */
    /* CompleteClass */
    var lineMax: Double = js.native
    
    /**
      * indent of the current list block (-1 if there isn't any)
      */
    /* CompleteClass */
    var listIndent: Double = js.native
    
    /**
      * link to parser instance
      */
    /* CompleteClass */
    var md: MarkdownIt = js.native
    
    /**
      * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
      * used in lists to determine if they interrupt a paragraph
      */
    /* CompleteClass */
    var parentType: ParentType = js.native
    
    /**
      * Push new token to "stream".
      */
    /* CompleteClass */
    override def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.libTokenMod.^ = js.native
    
    /**
      * renderer
      */
    /* CompleteClass */
    var result: String = js.native
    
    /**
      * indents for each line (tabs expanded)
      */
    /* CompleteClass */
    var sCount: js.Array[Double] = js.native
    
    /**
      * Skip char codes from given position
      */
    /* CompleteClass */
    override def skipChars(pos: Double, code: Double): Double = js.native
    
    /**
      * Skip char codes reverse from given position - 1
      */
    /* CompleteClass */
    override def skipCharsBack(pos: Double, code: Double, min: Double): Double = js.native
    
    /* CompleteClass */
    override def skipEmptyLines(from: Double): Double = js.native
    
    /**
      * Skip spaces from given position.
      */
    /* CompleteClass */
    override def skipSpaces(pos: Double): Double = js.native
    
    /**
      * Skip spaces from given position in reverse.
      */
    /* CompleteClass */
    override def skipSpacesBack(pos: Double, min: Double): Double = js.native
    
    /* CompleteClass */
    var src: String = js.native
    
    /**
      * offsets of the first non-space characters (tabs not expanded)
      */
    /* CompleteClass */
    var tShift: js.Array[Double] = js.native
    
    /**
      * loose/tight mode for lists
      */
    /* CompleteClass */
    var tight: Boolean = js.native
    
    //
    // Internal state vartiables
    //
    /* CompleteClass */
    var tokens: js.Array[typings.markdownIt.libTokenMod.^] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.markdownIt.markdownItStrings.blockquote
    - typings.markdownIt.markdownItStrings.list
    - typings.markdownIt.markdownItStrings.root
    - typings.markdownIt.markdownItStrings.paragraph
    - typings.markdownIt.markdownItStrings.reference
  */
  trait ParentType extends StObject
  object ParentType {
    
    inline def blockquote: typings.markdownIt.markdownItStrings.blockquote = "blockquote".asInstanceOf[typings.markdownIt.markdownItStrings.blockquote]
    
    inline def list: typings.markdownIt.markdownItStrings.list = "list".asInstanceOf[typings.markdownIt.markdownItStrings.list]
    
    inline def paragraph: typings.markdownIt.markdownItStrings.paragraph = "paragraph".asInstanceOf[typings.markdownIt.markdownItStrings.paragraph]
    
    inline def reference: typings.markdownIt.markdownItStrings.reference = "reference".asInstanceOf[typings.markdownIt.markdownItStrings.reference]
    
    inline def root: typings.markdownIt.markdownItStrings.root = "root".asInstanceOf[typings.markdownIt.markdownItStrings.root]
  }
  
  trait StateBlock extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.libTokenMod.^
      ]
    
    /**
      * line begin offsets for fast jumps
      */
    var bMarks: js.Array[Double]
    
    // block parser variables
    /**
      * required block content indent (for example, if we are
      * inside a list, it would be positioned after list marker)
      */
    var blkIndent: Double
    
    /**
      * An amount of virtual spaces (tabs expanded) between beginning
      * of each line (bMarks) and real beginning of that line.
      *
      * It exists only as a hack because blockquotes override bMarks
      * losing information in the process.
      *
      * It's used only when expanding tabs, you can think about it as
      * an initial tab length, e.g. bsCount=21 applied to string `\t123`
      * means first tab should be expanded to 4-21%4 === 3 spaces.
      */
    var bsCount: js.Array[Double]
    
    /**
      * indent of the current dd block (-1 if there isn't any)
      */
    var ddIndent: Double
    
    /**
      * line end offsets for fast jumps
      */
    var eMarks: js.Array[Double]
    
    var env: Any
    
    /**
      * cut lines range from source.
      */
    def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String
    
    def isEmpty(line: Double): Boolean
    
    var level: Double
    
    /**
      * line index in src
      */
    var line: Double
    
    /**
      * lines count
      */
    var lineMax: Double
    
    /**
      * indent of the current list block (-1 if there isn't any)
      */
    var listIndent: Double
    
    /**
      * link to parser instance
      */
    var md: MarkdownIt
    
    /**
      * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
      * used in lists to determine if they interrupt a paragraph
      */
    var parentType: ParentType
    
    /**
      * Push new token to "stream".
      */
    def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.libTokenMod.^
    
    /**
      * renderer
      */
    var result: String
    
    /**
      * indents for each line (tabs expanded)
      */
    var sCount: js.Array[Double]
    
    /**
      * Skip char codes from given position
      */
    def skipChars(pos: Double, code: Double): Double
    
    /**
      * Skip char codes reverse from given position - 1
      */
    def skipCharsBack(pos: Double, code: Double, min: Double): Double
    
    def skipEmptyLines(from: Double): Double
    
    /**
      * Skip spaces from given position.
      */
    def skipSpaces(pos: Double): Double
    
    /**
      * Skip spaces from given position in reverse.
      */
    def skipSpacesBack(pos: Double, min: Double): Double
    
    var src: String
    
    /**
      * offsets of the first non-space characters (tabs not expanded)
      */
    var tShift: js.Array[Double]
    
    /**
      * loose/tight mode for lists
      */
    var tight: Boolean
    
    //
    // Internal state vartiables
    //
    var tokens: js.Array[typings.markdownIt.libTokenMod.^]
  }
  object StateBlock {
    
    inline def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.libTokenMod.^
        ],
      bMarks: js.Array[Double],
      blkIndent: Double,
      bsCount: js.Array[Double],
      ddIndent: Double,
      eMarks: js.Array[Double],
      env: Any,
      getLines: (Double, Double, Double, Boolean) => String,
      isEmpty: Double => Boolean,
      level: Double,
      line: Double,
      lineMax: Double,
      listIndent: Double,
      md: MarkdownIt,
      parentType: ParentType,
      push: (String, String, Nesting) => typings.markdownIt.libTokenMod.^,
      result: String,
      sCount: js.Array[Double],
      skipChars: (Double, Double) => Double,
      skipCharsBack: (Double, Double, Double) => Double,
      skipEmptyLines: Double => Double,
      skipSpaces: Double => Double,
      skipSpacesBack: (Double, Double) => Double,
      src: String,
      tShift: js.Array[Double],
      tight: Boolean,
      tokens: js.Array[typings.markdownIt.libTokenMod.^]
    ): StateBlock = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], bsCount = bsCount.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], listIndent = listIndent.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), result = result.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipCharsBack = js.Any.fromFunction3(skipCharsBack), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), skipSpacesBack = js.Any.fromFunction2(skipSpacesBack), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateBlock]
    }
    
    extension [Self <: StateBlock](x: Self) {
      
      inline def setBMarks(value: js.Array[Double]): Self = StObject.set(x, "bMarks", value.asInstanceOf[js.Any])
      
      inline def setBMarksVarargs(value: Double*): Self = StObject.set(x, "bMarks", js.Array(value*))
      
      inline def setBlkIndent(value: Double): Self = StObject.set(x, "blkIndent", value.asInstanceOf[js.Any])
      
      inline def setBsCount(value: js.Array[Double]): Self = StObject.set(x, "bsCount", value.asInstanceOf[js.Any])
      
      inline def setBsCountVarargs(value: Double*): Self = StObject.set(x, "bsCount", js.Array(value*))
      
      inline def setDdIndent(value: Double): Self = StObject.set(x, "ddIndent", value.asInstanceOf[js.Any])
      
      inline def setEMarks(value: js.Array[Double]): Self = StObject.set(x, "eMarks", value.asInstanceOf[js.Any])
      
      inline def setEMarksVarargs(value: Double*): Self = StObject.set(x, "eMarks", js.Array(value*))
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setGetLines(value: (Double, Double, Double, Boolean) => String): Self = StObject.set(x, "getLines", js.Any.fromFunction4(value))
      
      inline def setIsEmpty(value: Double => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineMax(value: Double): Self = StObject.set(x, "lineMax", value.asInstanceOf[js.Any])
      
      inline def setListIndent(value: Double): Self = StObject.set(x, "listIndent", value.asInstanceOf[js.Any])
      
      inline def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setParentType(value: ParentType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (String, String, Nesting) => typings.markdownIt.libTokenMod.^): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSCount(value: js.Array[Double]): Self = StObject.set(x, "sCount", value.asInstanceOf[js.Any])
      
      inline def setSCountVarargs(value: Double*): Self = StObject.set(x, "sCount", js.Array(value*))
      
      inline def setSkipChars(value: (Double, Double) => Double): Self = StObject.set(x, "skipChars", js.Any.fromFunction2(value))
      
      inline def setSkipCharsBack(value: (Double, Double, Double) => Double): Self = StObject.set(x, "skipCharsBack", js.Any.fromFunction3(value))
      
      inline def setSkipEmptyLines(value: Double => Double): Self = StObject.set(x, "skipEmptyLines", js.Any.fromFunction1(value))
      
      inline def setSkipSpaces(value: Double => Double): Self = StObject.set(x, "skipSpaces", js.Any.fromFunction1(value))
      
      inline def setSkipSpacesBack(value: (Double, Double) => Double): Self = StObject.set(x, "skipSpacesBack", js.Any.fromFunction2(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTShift(value: js.Array[Double]): Self = StObject.set(x, "tShift", value.asInstanceOf[js.Any])
      
      inline def setTShiftVarargs(value: Double*): Self = StObject.set(x, "tShift", js.Array(value*))
      
      inline def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
      
      inline def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typings.markdownIt.libTokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[typings.markdownIt.libTokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: typings.markdownIt.libTokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
