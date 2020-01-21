package typings.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoCompleteCompletion = scala.Null | js.Array[java.lang.String] | typings.jsoneditor.AnonOptions
  type AutoCompleteOptionsGetter = js.Function4[
    /* text */ java.lang.String, 
    /* path */ typings.jsoneditor.mod.JSONPath, 
    /* input */ java.lang.String, 
    /* editor */ typings.jsoneditor.mod.JSONEditor, 
    typings.jsoneditor.mod.AutoCompleteCompletion | js.Promise[typings.jsoneditor.mod.AutoCompleteCompletion]
  ]
  type JSONPath = js.Array[java.lang.String | scala.Double]
}
