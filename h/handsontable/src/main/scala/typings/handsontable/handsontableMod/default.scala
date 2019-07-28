package typings.handsontable.handsontableMod

import org.scalablytyped.runtime.Instantiable2
import typings.handsontable.handsontableMod.HandsontableNs.CellTypes
import typings.handsontable.handsontableMod.HandsontableNs.Dom
import typings.handsontable.handsontableMod.HandsontableNs.Editors
import typings.handsontable.handsontableMod.HandsontableNs.GridSettings
import typings.handsontable.handsontableMod.HandsontableNs.Helper
import typings.handsontable.handsontableMod.HandsontableNs.HooksNs.Methods
import typings.handsontable.handsontableMod.HandsontableNs.I18nNs.Internationalization
import typings.handsontable.handsontableMod.HandsontableNs.Plugins
import typings.handsontable.handsontableMod.HandsontableNs.Renderers
import typings.handsontable.handsontableMod.HandsontableNs.Validators
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", JSImport.Default)
@js.native
class default () extends Handsontable

/* static members */
@JSImport("handsontable", JSImport.Default)
@js.native
object default extends js.Object {
  var Core: Instantiable2[
    /* element */ Element, 
    /* options */ GridSettings, 
    typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
  ] = js.native
  var DefaultSettings: typings.handsontable.handsontableMod.HandsontableNs.DefaultSettings = js.native
  var EventManager: typings.handsontable.handsontableMod.HandsontableNs.EventManager = js.native
  var baseVersion: String = js.native
  var buildDate: String = js.native
  var cellTypes: CellTypes = js.native
  var dom: Dom = js.native
  var editors: Editors = js.native
  var helper: Helper = js.native
  var hooks: Methods = js.native
  var languages: Internationalization = js.native
  var packageName: typings.handsontable.handsontableStrings.handsontable = js.native
  var plugins: Plugins = js.native
  var renderers: Renderers = js.native
  var validators: Validators = js.native
  var version: String = js.native
}

