package typings.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorColours extends js.Object {
  var atom: String = js.native
  var attribute: String = js.native
  var builtin: String = js.native
  var comment: String = js.native
  var cursorColor: String = js.native
  var `def`: String = js.native
  var editorBackground: String = js.native
  var keyword: String = js.native
  var leftDrawerBackground: String = js.native
  var meta: String = js.native
  var number: String = js.native
  var property: String = js.native
  var punctuation: String = js.native
  var qualifier: String = js.native
  var resultBackground: String = js.native
  var rightDrawerBackground: String = js.native
  var selection: String = js.native
  var string: String = js.native
  var string2: String = js.native
  var variable: String = js.native
  var ws: String = js.native
}

object EditorColours {
  @scala.inline
  def apply(
    atom: String,
    attribute: String,
    builtin: String,
    comment: String,
    cursorColor: String,
    `def`: String,
    editorBackground: String,
    keyword: String,
    leftDrawerBackground: String,
    meta: String,
    number: String,
    property: String,
    punctuation: String,
    qualifier: String,
    resultBackground: String,
    rightDrawerBackground: String,
    selection: String,
    string: String,
    string2: String,
    variable: String,
    ws: String
  ): EditorColours = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], builtin = builtin.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], editorBackground = editorBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], leftDrawerBackground = leftDrawerBackground.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], punctuation = punctuation.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], resultBackground = resultBackground.asInstanceOf[js.Any], rightDrawerBackground = rightDrawerBackground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], string2 = string2.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], ws = ws.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorColours]
  }
  @scala.inline
  implicit class EditorColoursOps[Self <: EditorColours] (val x: Self) extends AnyVal {
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
    def setAtom(value: String): Self = this.set("atom", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuiltin(value: String): Self = this.set("builtin", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorColor(value: String): Self = this.set("cursorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDef(value: String): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorBackground(value: String): Self = this.set("editorBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftDrawerBackground(value: String): Self = this.set("leftDrawerBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setPunctuation(value: String): Self = this.set("punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultBackground(value: String): Self = this.set("resultBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightDrawerBackground(value: String): Self = this.set("rightDrawerBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setString2(value: String): Self = this.set("string2", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWs(value: String): Self = this.set("ws", value.asInstanceOf[js.Any])
  }
  
}

