package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Markdown-It token.
  */
@js.native
trait MarkdownItToken extends js.Object {
  
  /**
    * HTML attributes.
    */
  var attrs: js.Array[js.Array[String]] = js.native
  
  /**
    * Block-level token.
    */
  var block: Boolean = js.native
  
  /**
    * Child nodes.
    */
  var children: js.Array[MarkdownItToken] = js.native
  
  /**
    * Tag contents.
    */
  var content: String = js.native
  
  /**
    * Ignore element.
    */
  var hidden: Boolean = js.native
  
  /**
    * Fence info.
    */
  var info: String = js.native
  
  /**
    * Nesting level.
    */
  var level: Double = js.native
  
  /**
    * Line content.
    */
  var line: String = js.native
  
  /**
    * Line number (1-based).
    */
  var lineNumber: Double = js.native
  
  /**
    * Beginning/ending line numbers.
    */
  var map: js.Array[Double] = js.native
  
  /**
    * Markup text.
    */
  var markup: String = js.native
  
  /**
    * Arbitrary data.
    */
  var meta: js.Any = js.native
  
  /**
    * Level change.
    */
  var nesting: Double = js.native
  
  /**
    * HTML tag name.
    */
  var tag: String = js.native
  
  /**
    * Token type.
    */
  var `type`: String = js.native
}
object MarkdownItToken {
  
  @scala.inline
  def apply(
    attrs: js.Array[js.Array[String]],
    block: Boolean,
    children: js.Array[MarkdownItToken],
    content: String,
    hidden: Boolean,
    info: String,
    level: Double,
    line: String,
    lineNumber: Double,
    map: js.Array[Double],
    markup: String,
    meta: js.Any,
    nesting: Double,
    tag: String,
    `type`: String
  ): MarkdownItToken = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownItToken]
  }
  
  @scala.inline
  implicit class MarkdownItTokenOps[Self <: MarkdownItToken] (val x: Self) extends AnyVal {
    
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
    def setAttrsVarargs(value: js.Array[String]*): Self = this.set("attrs", js.Array(value :_*))
    
    @scala.inline
    def setAttrs(value: js.Array[js.Array[String]]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: MarkdownItToken*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[MarkdownItToken]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: Double*): Self = this.set("map", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: js.Array[Double]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkup(value: String): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNesting(value: Double): Self = this.set("nesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
