package typings.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsoneditorMod {
  import typings.jsoneditor.Anon_Options

  type AutoCompleteCompletion = Null | js.Array[String] | Anon_Options
  type AutoCompleteOptionsGetter = js.Function4[
    /* text */ String, 
    /* path */ JSONPath, 
    /* input */ String, 
    /* editor */ JSONEditor, 
    AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
  ]
  type JSONPath = js.Array[String | Double]
}
