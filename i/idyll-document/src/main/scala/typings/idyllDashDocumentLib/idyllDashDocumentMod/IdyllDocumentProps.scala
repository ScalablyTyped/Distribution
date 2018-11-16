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
  var errorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[idyllDashDocumentLib.Anon_ClassName]] = js.undefined
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

