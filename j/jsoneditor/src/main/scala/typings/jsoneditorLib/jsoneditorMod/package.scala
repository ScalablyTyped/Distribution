package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsoneditorMod {
  type AutoCompleteCompletion = scala.Null | js.Array[java.lang.String] | jsoneditorLib.Anon_Options
  type AutoCompleteOptionsGetter = js.Function4[
    /* text */ java.lang.String, 
    /* path */ JSONPath, 
    /* input */ java.lang.String, 
    /* editor */ JSONEditor, 
    AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
  ]
  type JSONEditorMode = jsoneditorLib.jsoneditorLibStrings.tree | jsoneditorLib.jsoneditorLibStrings.view | jsoneditorLib.jsoneditorLibStrings.form | jsoneditorLib.jsoneditorLibStrings.code | jsoneditorLib.jsoneditorLibStrings.text
  type JSONPath = js.Array[java.lang.String | scala.Double]
}
