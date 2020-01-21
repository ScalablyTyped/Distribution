package typings.idyllDocument.mod

import typings.idyllCompiler.mod.AST
import typings.idyllCompiler.mod.Options
import typings.idyllDocument.AnonChildren
import typings.react.mod.ReactType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdyllDocumentProps extends js.Object {
  /**
    * the AST to be rendered on the page
    * If provided, this will be used insteaed of
    * the markup
    */
  var ast: js.UndefOr[AST] = js.undefined
  /**
    * Compiler option for Idyll compiler when compiling markup
    */
  var compilerOptions: js.UndefOr[Options] = js.undefined
  /**
    * Components to be rendered with
    */
  var components: js.Any
  var context: js.UndefOr[js.Function1[/* context */ js.Any, Unit]] = js.undefined
  /**
    * Initial data set
    */
  var datasets: js.UndefOr[js.Object] = js.undefined
  /**
    * The React component rendered when an error occurs
    */
  var errorComponent: js.UndefOr[ReactType[AnonChildren]] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  /**
    * The layout for idyll document
    * Will correspond to one one layout in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * The Idyll markup to be compiled into AST
    */
  var markup: js.UndefOr[String] = js.undefined
  /**
    * Callback function if error happens during compilation
    */
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  /**
    * The theme for idyll document
    * Will correspond to one theme in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.undefined
}

object IdyllDocumentProps {
  @scala.inline
  def apply(
    components: js.Any,
    ast: AST = null,
    compilerOptions: Options = null,
    context: /* context */ js.Any => Unit = null,
    datasets: js.Object = null,
    errorComponent: ReactType[AnonChildren] = null,
    initialState: js.Any = null,
    layout: String = null,
    markup: String = null,
    onError: /* err */ Error => Unit = null,
    theme: String = null
  ): IdyllDocumentProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction1(context))
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (errorComponent != null) __obj.updateDynamic("errorComponent")(errorComponent.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdyllDocumentProps]
  }
}

