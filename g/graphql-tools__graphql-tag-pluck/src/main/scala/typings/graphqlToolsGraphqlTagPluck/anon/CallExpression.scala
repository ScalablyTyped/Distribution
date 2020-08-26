package typings.graphqlToolsGraphqlTagPluck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallExpression extends js.Object {
  var CallExpression: Enter = js.native
  var ExpressionStatement: Exit = js.native
  var ImportDeclaration: Enter = js.native
  var TaggedTemplateExpression: Exit = js.native
  var TemplateLiteral: Exit = js.native
  def exit(): Unit = js.native
}

object CallExpression {
  @scala.inline
  def apply(
    CallExpression: Enter,
    ExpressionStatement: Exit,
    ImportDeclaration: Enter,
    TaggedTemplateExpression: Exit,
    TemplateLiteral: Exit,
    exit: () => Unit
  ): CallExpression = {
    val __obj = js.Dynamic.literal(CallExpression = CallExpression.asInstanceOf[js.Any], ExpressionStatement = ExpressionStatement.asInstanceOf[js.Any], ImportDeclaration = ImportDeclaration.asInstanceOf[js.Any], TaggedTemplateExpression = TaggedTemplateExpression.asInstanceOf[js.Any], TemplateLiteral = TemplateLiteral.asInstanceOf[js.Any], exit = js.Any.fromFunction0(exit))
    __obj.asInstanceOf[CallExpression]
  }
  @scala.inline
  implicit class CallExpressionOps[Self <: CallExpression] (val x: Self) extends AnyVal {
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
    def setCallExpression(value: Enter): Self = this.set("CallExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpressionStatement(value: Exit): Self = this.set("ExpressionStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportDeclaration(value: Enter): Self = this.set("ImportDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaggedTemplateExpression(value: Exit): Self = this.set("TaggedTemplateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateLiteral(value: Exit): Self = this.set("TemplateLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
  }
  
}

