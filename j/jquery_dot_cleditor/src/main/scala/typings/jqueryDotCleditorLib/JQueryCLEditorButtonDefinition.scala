package typings
package jqueryDotCleditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinition extends js.Object {
  var buttonClick: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ]
  ] = js.undefined
  var command: js.UndefOr[java.lang.String] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean]] = js.undefined
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean]] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var popupClick: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ]
  ] = js.undefined
  var popupContent: js.UndefOr[java.lang.String] = js.undefined
  var popupName: js.UndefOr[java.lang.String] = js.undefined
  var stripIndex: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
}

