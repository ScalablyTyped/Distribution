package typings.markdownIt.stateBlockMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ] = js.native
  /**
    * line begin offsets for fast jumps
    */
  var bMarks: js.Array[Double] = js.native
  // block parser variables
  /**
    * required block content indent (for example, if we are
    * inside a list, it would be positioned after list marker)
    */
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
  var bsCount: js.Array[Double] = js.native
  /**
    * indent of the current dd block (-1 if there isn't any)
    */
  var ddIndent: Double = js.native
  /**
    * line end offsets for fast jumps
    */
  var eMarks: js.Array[Double] = js.native
  var env: js.Any = js.native
  var level: Double = js.native
  /**
    * line index in src
    */
  var line: Double = js.native
  /**
    * lines count
    */
  var lineMax: Double = js.native
  /**
    * indent of the current list block (-1 if there isn't any)
    */
  var listIndent: Double = js.native
  /**
    * link to parser instance
    */
  var md: MarkdownIt = js.native
  /**
    * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
    * used in lists to determine if they interrupt a paragraph
    */
  var parentType: ParentType = js.native
  /**
    * renderer
    */
  var result: String = js.native
  /**
    * indents for each line (tabs expanded)
    */
  var sCount: js.Array[Double] = js.native
  var src: String = js.native
  /**
    * offsets of the first non-space characters (tabs not expanded)
    */
  var tShift: js.Array[Double] = js.native
  /**
    * loose/tight mode for lists
    */
  var tight: Boolean = js.native
  //
  // Internal state vartiables
  //
  var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
  /**
    * cut lines range from source.
    */
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
  def isEmpty(line: Double): Boolean = js.native
  /**
    * Push new token to "stream".
    */
  def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^ = js.native
  /**
    * Skip char codes from given position
    */
  def skipChars(pos: Double, code: Double): Double = js.native
  /**
    * Skip char codes reverse from given position - 1
    */
  def skipCharsBack(pos: Double, code: Double, min: Double): Double = js.native
  def skipEmptyLines(from: Double): Double = js.native
  /**
    * Skip spaces from given position.
    */
  def skipSpaces(pos: Double): Double = js.native
  /**
    * Skip spaces from given position in reverse.
    */
  def skipSpacesBack(pos: Double, min: Double): Double = js.native
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
  @scala.inline
  implicit class StateBlockOps[Self <: StateBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToken(
      value: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.tokenMod.^
        ]
    ): Self = this.set("Token", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMarksVarargs(value: Double*): Self = this.set("bMarks", js.Array(value :_*))
    @scala.inline
    def setBMarks(value: js.Array[Double]): Self = this.set("bMarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlkIndent(value: Double): Self = this.set("blkIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBsCountVarargs(value: Double*): Self = this.set("bsCount", js.Array(value :_*))
    @scala.inline
    def setBsCount(value: js.Array[Double]): Self = this.set("bsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDdIndent(value: Double): Self = this.set("ddIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setEMarksVarargs(value: Double*): Self = this.set("eMarks", js.Array(value :_*))
    @scala.inline
    def setEMarks(value: js.Array[Double]): Self = this.set("eMarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLines(value: (Double, Double, Double, Boolean) => String): Self = this.set("getLines", js.Any.fromFunction4(value))
    @scala.inline
    def setIsEmpty(value: Double => Boolean): Self = this.set("isEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineMax(value: Double): Self = this.set("lineMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setListIndent(value: Double): Self = this.set("listIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd(value: MarkdownIt): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentType(value: ParentType): Self = this.set("parentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: (String, String, Nesting) => typings.markdownIt.tokenMod.^): Self = this.set("push", js.Any.fromFunction3(value))
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSCountVarargs(value: Double*): Self = this.set("sCount", js.Array(value :_*))
    @scala.inline
    def setSCount(value: js.Array[Double]): Self = this.set("sCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipChars(value: (Double, Double) => Double): Self = this.set("skipChars", js.Any.fromFunction2(value))
    @scala.inline
    def setSkipCharsBack(value: (Double, Double, Double) => Double): Self = this.set("skipCharsBack", js.Any.fromFunction3(value))
    @scala.inline
    def setSkipEmptyLines(value: Double => Double): Self = this.set("skipEmptyLines", js.Any.fromFunction1(value))
    @scala.inline
    def setSkipSpaces(value: Double => Double): Self = this.set("skipSpaces", js.Any.fromFunction1(value))
    @scala.inline
    def setSkipSpacesBack(value: (Double, Double) => Double): Self = this.set("skipSpacesBack", js.Any.fromFunction2(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTShiftVarargs(value: Double*): Self = this.set("tShift", js.Array(value :_*))
    @scala.inline
    def setTShift(value: js.Array[Double]): Self = this.set("tShift", value.asInstanceOf[js.Any])
    @scala.inline
    def setTight(value: Boolean): Self = this.set("tight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: typings.markdownIt.tokenMod.^ *): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[typings.markdownIt.tokenMod.^]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

