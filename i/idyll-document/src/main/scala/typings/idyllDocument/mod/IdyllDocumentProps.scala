package typings.idyllDocument.mod

import typings.idyllCompiler.mod.AST
import typings.idyllCompiler.mod.Node
import typings.idyllCompiler.mod.Options
import typings.idyllDocument.anon.Children
import typings.react.mod.ReactType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdyllDocumentProps extends js.Object {
  /**
    * the AST to be rendered on the page
    * If provided, this will be used insteaed of
    * the markup
    */
  var ast: js.UndefOr[AST] = js.native
  /**
    * Compiler option for Idyll compiler when compiling markup
    */
  var compilerOptions: js.UndefOr[Options] = js.native
  /**
    * Components to be rendered with
    */
  var components: js.Any = js.native
  var context: js.UndefOr[js.Function1[/* context */ js.Any, Unit]] = js.native
  /**
    * Initial data set
    */
  var datasets: js.UndefOr[js.Object] = js.native
  /**
    * The React component rendered when an error occurs
    */
  var errorComponent: js.UndefOr[ReactType[Children]] = js.native
  var initialState: js.UndefOr[js.Any] = js.native
  /**
    * The layout for idyll document
    * Will correspond to one one layout in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * The Idyll markup to be compiled into AST
    */
  var markup: js.UndefOr[String] = js.native
  /**
    * Callback function if error happens during compilation
    */
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  /**
    * The theme for idyll document
    * Will correspond to one theme in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.native
}

object IdyllDocumentProps {
  @scala.inline
  def apply(components: js.Any): IdyllDocumentProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdyllDocumentProps]
  }
  @scala.inline
  implicit class IdyllDocumentPropsOps[Self <: IdyllDocumentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponents(value: js.Any): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstVarargs(value: Node*): Self = this.set("ast", js.Array(value :_*))
    @scala.inline
    def setAst(value: AST): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setCompilerOptions(value: Options): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    @scala.inline
    def setContext(value: /* context */ js.Any => Unit): Self = this.set("context", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDatasets(value: js.Object): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    @scala.inline
    def setErrorComponent(value: ReactType[Children]): Self = this.set("errorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorComponent: Self = this.set("errorComponent", js.undefined)
    @scala.inline
    def setInitialState(value: js.Any): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMarkup(value: String): Self = this.set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

