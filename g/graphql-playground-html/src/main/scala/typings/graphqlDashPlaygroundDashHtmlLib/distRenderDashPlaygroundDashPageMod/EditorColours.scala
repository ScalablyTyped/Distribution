package typings
package graphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorColours extends js.Object {
  var atom: java.lang.String
  var attribute: java.lang.String
  var builtin: java.lang.String
  var comment: java.lang.String
  var cursorColor: java.lang.String
  var `def`: java.lang.String
  var editorBackground: java.lang.String
  var keyword: java.lang.String
  var leftDrawerBackground: java.lang.String
  var meta: java.lang.String
  var number: java.lang.String
  var property: java.lang.String
  var punctuation: java.lang.String
  var qualifier: java.lang.String
  var resultBackground: java.lang.String
  var rightDrawerBackground: java.lang.String
  var selection: java.lang.String
  var string: java.lang.String
  var string2: java.lang.String
  var variable: java.lang.String
  var ws: java.lang.String
}

object EditorColours {
  @scala.inline
  def apply(
    atom: java.lang.String,
    attribute: java.lang.String,
    builtin: java.lang.String,
    comment: java.lang.String,
    cursorColor: java.lang.String,
    `def`: java.lang.String,
    editorBackground: java.lang.String,
    keyword: java.lang.String,
    leftDrawerBackground: java.lang.String,
    meta: java.lang.String,
    number: java.lang.String,
    property: java.lang.String,
    punctuation: java.lang.String,
    qualifier: java.lang.String,
    resultBackground: java.lang.String,
    rightDrawerBackground: java.lang.String,
    selection: java.lang.String,
    string: java.lang.String,
    string2: java.lang.String,
    variable: java.lang.String,
    ws: java.lang.String
  ): EditorColours = {
    val __obj = js.Dynamic.literal(atom = atom, attribute = attribute, builtin = builtin, comment = comment, cursorColor = cursorColor, editorBackground = editorBackground, keyword = keyword, leftDrawerBackground = leftDrawerBackground, meta = meta, number = number, property = property, punctuation = punctuation, qualifier = qualifier, resultBackground = resultBackground, rightDrawerBackground = rightDrawerBackground, selection = selection, string = string, string2 = string2, variable = variable, ws = ws)
    __obj.updateDynamic("def")(`def`)
    __obj.asInstanceOf[EditorColours]
  }
}

