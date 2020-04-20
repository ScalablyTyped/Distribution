package typings.markdownIt.stateBlockMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/rules_block/state_block", JSImport.Namespace)
@js.native
class ^ protected () extends StateBlock {
  def this(src: String, md: MarkdownIt, env: js.Any, tokens: js.Array[typings.markdownIt.tokenMod.^]) = this()
  /* CompleteClass */
  override var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ] = js.native
  /**
    * line begin offsets for fast jumps
    */
  /* CompleteClass */
  override var bMarks: js.Array[Double] = js.native
  // block parser variables
  /**
    * required block content indent (for example, if we are
    * inside a list, it would be positioned after list marker)
    */
  /* CompleteClass */
  override var blkIndent: Double = js.native
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
  override var bsCount: js.Array[Double] = js.native
  /**
    * indent of the current dd block (-1 if there isn't any)
    */
  /* CompleteClass */
  override var ddIndent: Double = js.native
  /**
    * line end offsets for fast jumps
    */
  /* CompleteClass */
  override var eMarks: js.Array[Double] = js.native
  /* CompleteClass */
  override var env: js.Any = js.native
  /* CompleteClass */
  override var level: Double = js.native
  /**
    * line index in src
    */
  /* CompleteClass */
  override var line: Double = js.native
  /**
    * lines count
    */
  /* CompleteClass */
  override var lineMax: Double = js.native
  /**
    * indent of the current list block (-1 if there isn't any)
    */
  /* CompleteClass */
  override var listIndent: Double = js.native
  /**
    * link to parser instance
    */
  /* CompleteClass */
  override var md: MarkdownIt = js.native
  /**
    * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
    * used in lists to determine if they interrupt a paragraph
    */
  /* CompleteClass */
  override var parentType: ParentType = js.native
  /**
    * renderer
    */
  /* CompleteClass */
  override var result: String = js.native
  /**
    * indents for each line (tabs expanded)
    */
  /* CompleteClass */
  override var sCount: js.Array[Double] = js.native
  /* CompleteClass */
  override var src: String = js.native
  /**
    * offsets of the first non-space characters (tabs not expanded)
    */
  /* CompleteClass */
  override var tShift: js.Array[Double] = js.native
  /**
    * loose/tight mode for lists
    */
  /* CompleteClass */
  override var tight: Boolean = js.native
  //
  // Internal state vartiables
  //
  /* CompleteClass */
  override var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
  /**
    * cut lines range from source.
    */
  /* CompleteClass */
  override def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
  /* CompleteClass */
  override def isEmpty(line: Double): Boolean = js.native
  /**
    * Push new token to "stream".
    */
  /* CompleteClass */
  override def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^ = js.native
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
}

