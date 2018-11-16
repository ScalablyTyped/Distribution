package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONEditorOptions extends js.Object {
  var ace: js.UndefOr[aceLib.AceAjaxNs.Ace] = js.undefined
  var ajv: js.UndefOr[js.Any] = js.undefined
  var escapeUnicode: js.UndefOr[scala.Boolean] = js.undefined
  var history: js.UndefOr[scala.Boolean] = js.undefined
  var indentation: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[JSONEditorMode] = js.undefined
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
   // Any for now, since ajv typings aren't A-Ok
  var onChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEditable: js.UndefOr[
    js.Function1[/* node */ JSONEditorNode, scala.Boolean | jsoneditorLib.Anon_Field]
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onModeChange: js.UndefOr[
    js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, scala.Unit]
  ] = js.undefined
  var schema: js.UndefOr[js.Object] = js.undefined
  var schemaRefs: js.UndefOr[js.Object] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var sortObjectKeys: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

