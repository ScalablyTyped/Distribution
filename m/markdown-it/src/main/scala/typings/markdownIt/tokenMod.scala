package typings.markdownIt

import typings.markdownIt.markdownItNumbers.`-1`
import typings.markdownIt.markdownItNumbers.`0`
import typings.markdownIt.markdownItNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  /**
    * Create new token and fill passed properties.
    */
  @JSImport("markdown-it/lib/token", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Token {
    def this(`type`: String, tag: String, nesting: Nesting) = this()
    
    /**
      * Get the value of attribute `name`, or null if it does not exist.
      */
    /* CompleteClass */
    override def attrGet(name: String): String | Null = js.native
    
    /**
      * Search attribute index by name.
      */
    /* CompleteClass */
    override def attrIndex(name: String): Double = js.native
    
    /**
      *
      * Join value to existing attribute via space. Or create new attribute if not
      * exists. Useful to operate with token classes.
      */
    /* CompleteClass */
    override def attrJoin(name: String, value: String): Unit = js.native
    
    /**
      * Add `[name, value]` attribute to list. Init attrs if necessary
      */
    /* CompleteClass */
    override def attrPush(attrData: js.Tuple2[String, String]): Unit = js.native
    
    /**
      * Set `name` attribute to `value`. Override old value if exists.
      */
    /* CompleteClass */
    override def attrSet(name: String, value: String): Unit = js.native
    
    /**
      * HTML attributes. Format: `[[name1, value1], [name2, value2]]`
      */
    /* CompleteClass */
    var attrs: (js.Array[js.Tuple2[String, String]]) | Null = js.native
    
    /**
      * True for block-level tokens, false for inline tokens.
      * Used in renderer to calculate line breaks
      */
    /* CompleteClass */
    var block: Boolean = js.native
    
    /**
      * An array of child nodes (inline and img tokens)
      */
    /* CompleteClass */
    var children: js.Array[Token] | Null = js.native
    
    /**
      * In a case of self-closing tag (code, html, fence, etc.),
      * it has contents of this tag.
      */
    /* CompleteClass */
    var content: String = js.native
    
    /**
      * If it's true, ignore this element when rendering. Used for tight lists
      * to hide paragraphs.
      */
    /* CompleteClass */
    var hidden: Boolean = js.native
    
    /**
      * Fence info string
      */
    /* CompleteClass */
    var info: String = js.native
    
    /**
      * nesting level, the same as `state.level`
      */
    /* CompleteClass */
    var level: Double = js.native
    
    /**
      * Source map info. Format: `[line_begin, line_end]`
      */
    /* CompleteClass */
    var map: (js.Tuple2[Double, Double]) | Null = js.native
    
    /**
      * '*' or '_' for emphasis, fence string for fence, etc.
      */
    /* CompleteClass */
    var markup: String = js.native
    
    /**
      * A place for plugins to store an arbitrary data
      */
    /* CompleteClass */
    var meta: js.Any = js.native
    
    /**
      * Level change (number in {-1, 0, 1} set), where:
      *
      * - `1` means the tag is opening
      * - `0` means the tag is self-closing
      * - `-1` means the tag is closing
      */
    /* CompleteClass */
    var nesting: `1` | `0` | `-1` = js.native
    
    /**
      * HTML tag name, e.g. "p"
      */
    /* CompleteClass */
    var tag: String = js.native
    
    /**
      * Type of the token, e.g. "paragraph_open"
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.markdownIt.markdownItNumbers.`1`
    - typings.markdownIt.markdownItNumbers.`0`
    - typings.markdownIt.markdownItNumbers.`-1`
  */
  trait Nesting extends StObject
  object Nesting {
    
    inline def `-1`: typings.markdownIt.markdownItNumbers.`-1` = -1.asInstanceOf[typings.markdownIt.markdownItNumbers.`-1`]
    
    inline def `0`: typings.markdownIt.markdownItNumbers.`0` = 0.asInstanceOf[typings.markdownIt.markdownItNumbers.`0`]
    
    inline def `1`: typings.markdownIt.markdownItNumbers.`1` = 1.asInstanceOf[typings.markdownIt.markdownItNumbers.`1`]
  }
  
  /**
    * Create new token and fill passed properties.
    */
  trait Token extends StObject {
    
    /**
      * Get the value of attribute `name`, or null if it does not exist.
      */
    def attrGet(name: String): String | Null
    
    /**
      * Search attribute index by name.
      */
    def attrIndex(name: String): Double
    
    /**
      *
      * Join value to existing attribute via space. Or create new attribute if not
      * exists. Useful to operate with token classes.
      */
    def attrJoin(name: String, value: String): Unit
    
    /**
      * Add `[name, value]` attribute to list. Init attrs if necessary
      */
    def attrPush(attrData: js.Tuple2[String, String]): Unit
    
    /**
      * Set `name` attribute to `value`. Override old value if exists.
      */
    def attrSet(name: String, value: String): Unit
    
    /**
      * HTML attributes. Format: `[[name1, value1], [name2, value2]]`
      */
    var attrs: (js.Array[js.Tuple2[String, String]]) | Null
    
    /**
      * True for block-level tokens, false for inline tokens.
      * Used in renderer to calculate line breaks
      */
    var block: Boolean
    
    /**
      * An array of child nodes (inline and img tokens)
      */
    var children: js.Array[Token] | Null
    
    /**
      * In a case of self-closing tag (code, html, fence, etc.),
      * it has contents of this tag.
      */
    var content: String
    
    /**
      * If it's true, ignore this element when rendering. Used for tight lists
      * to hide paragraphs.
      */
    var hidden: Boolean
    
    /**
      * Fence info string
      */
    var info: String
    
    /**
      * nesting level, the same as `state.level`
      */
    var level: Double
    
    /**
      * Source map info. Format: `[line_begin, line_end]`
      */
    var map: (js.Tuple2[Double, Double]) | Null
    
    /**
      * '*' or '_' for emphasis, fence string for fence, etc.
      */
    var markup: String
    
    /**
      * A place for plugins to store an arbitrary data
      */
    var meta: js.Any
    
    /**
      * Level change (number in {-1, 0, 1} set), where:
      *
      * - `1` means the tag is opening
      * - `0` means the tag is self-closing
      * - `-1` means the tag is closing
      */
    var nesting: `1` | `0` | `-1`
    
    /**
      * HTML tag name, e.g. "p"
      */
    var tag: String
    
    /**
      * Type of the token, e.g. "paragraph_open"
      */
    var `type`: String
  }
  object Token {
    
    inline def apply(
      attrGet: String => String | Null,
      attrIndex: String => Double,
      attrJoin: (String, String) => Unit,
      attrPush: js.Tuple2[String, String] => Unit,
      attrSet: (String, String) => Unit,
      block: Boolean,
      content: String,
      hidden: Boolean,
      info: String,
      level: Double,
      markup: String,
      meta: js.Any,
      nesting: `1` | `0` | `-1`,
      tag: String,
      `type`: String
    ): Token = {
      val __obj = js.Dynamic.literal(attrGet = js.Any.fromFunction1(attrGet), attrIndex = js.Any.fromFunction1(attrIndex), attrJoin = js.Any.fromFunction2(attrJoin), attrPush = js.Any.fromFunction1(attrPush), attrSet = js.Any.fromFunction2(attrSet), block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], attrs = null, children = null, map = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setAttrGet(value: String => String | Null): Self = StObject.set(x, "attrGet", js.Any.fromFunction1(value))
      
      inline def setAttrIndex(value: String => Double): Self = StObject.set(x, "attrIndex", js.Any.fromFunction1(value))
      
      inline def setAttrJoin(value: (String, String) => Unit): Self = StObject.set(x, "attrJoin", js.Any.fromFunction2(value))
      
      inline def setAttrPush(value: js.Tuple2[String, String] => Unit): Self = StObject.set(x, "attrPush", js.Any.fromFunction1(value))
      
      inline def setAttrSet(value: (String, String) => Unit): Self = StObject.set(x, "attrSet", js.Any.fromFunction2(value))
      
      inline def setAttrs(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setAttrsVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Token]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: Token*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: `1` | `0` | `-1`): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
