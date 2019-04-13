package typings
package idyllDashDocumentLib.idyllDashDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdyllDocumentProps extends js.Object {
  /**
    * the AST to be rendered on the page
    * If provided, this will be used insteaed of
    * the markup
    */
  var ast: js.UndefOr[idyllDashCompilerLib.idyllDashCompilerMod.AST] = js.undefined
  /**
    * Compiler option for Idyll compiler when compiling markup
    */
  var compilerOptions: js.UndefOr[idyllDashCompilerLib.idyllDashCompilerMod.Options] = js.undefined
  /**
    * Components to be rendered with
    */
  var components: js.Any
  var context: js.UndefOr[js.Function1[/* context */ js.Any, scala.Unit]] = js.undefined
  /**
    * Initial data set
    */
  var datasets: js.UndefOr[js.Object] = js.undefined
  /**
    * The React component rendered when an error occurs
    */
  var errorComponent: js.UndefOr[reactLib.reactMod.ReactType[idyllDashDocumentLib.Anon_Children]] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  /**
    * The layout for idyll document
    * Will correspond to one one layout in idyll-layouts package
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Idyll markup to be compiled into AST
    */
  var markup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function if error happens during compilation
    */
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  /**
    * The theme for idyll document
    * Will correspond to one theme in idyll-theme package
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object IdyllDocumentProps {
  @scala.inline
  def apply(
    components: js.Any,
    ast: idyllDashCompilerLib.idyllDashCompilerMod.AST = null,
    compilerOptions: idyllDashCompilerLib.idyllDashCompilerMod.Options = null,
    context: /* context */ js.Any => scala.Unit = null,
    datasets: js.Object = null,
    errorComponent: reactLib.reactMod.ReactType[idyllDashDocumentLib.Anon_Children] = null,
    initialState: js.Any = null,
    layout: java.lang.String = null,
    markup: java.lang.String = null,
    onError: /* err */ stdLib.Error => scala.Unit = null,
    theme: java.lang.String = null
  ): IdyllDocumentProps = {
    val __obj = js.Dynamic.literal(components = components)
    if (ast != null) __obj.updateDynamic("ast")(ast)
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction1(context))
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (errorComponent != null) __obj.updateDynamic("errorComponent")(errorComponent.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (markup != null) __obj.updateDynamic("markup")(markup)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IdyllDocumentProps]
  }
}

