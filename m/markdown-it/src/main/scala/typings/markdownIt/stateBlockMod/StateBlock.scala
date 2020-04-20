package typings.markdownIt.stateBlockMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateBlock extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
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
  var env: js.Any
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
    * renderer
    */
  var result: String
  /**
    * indents for each line (tabs expanded)
    */
  var sCount: js.Array[Double]
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
  var tokens: js.Array[typings.markdownIt.tokenMod.^]
  /**
    * cut lines range from source.
    */
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String
  def isEmpty(line: Double): Boolean
  /**
    * Push new token to "stream".
    */
  def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^
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
}

object StateBlock {
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typings.markdownIt.tokenMod.^
    ],
    bMarks: js.Array[Double],
    blkIndent: Double,
    bsCount: js.Array[Double],
    ddIndent: Double,
    eMarks: js.Array[Double],
    env: js.Any,
    getLines: (Double, Double, Double, Boolean) => String,
    isEmpty: Double => Boolean,
    level: Double,
    line: Double,
    lineMax: Double,
    listIndent: Double,
    md: MarkdownIt,
    parentType: ParentType,
    push: (String, String, Nesting) => typings.markdownIt.tokenMod.^,
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
    tokens: js.Array[typings.markdownIt.tokenMod.^]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], bsCount = bsCount.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], listIndent = listIndent.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), result = result.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipCharsBack = js.Any.fromFunction3(skipCharsBack), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), skipSpacesBack = js.Any.fromFunction2(skipSpacesBack), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBlock]
  }
}

