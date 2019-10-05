package typings.handlebars.Handlebars

import typings.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def BlockStatement(block: typings.handlebars.hbs.AST.BlockStatement): Unit = js.native
  def BooleanLiteral(bool: typings.handlebars.hbs.AST.BooleanLiteral): Unit = js.native
  def CommentStatement(): Unit = js.native
  def CommentStatement(comment: typings.handlebars.hbs.AST.CommentStatement): Unit = js.native
  def ContentStatement(content: typings.handlebars.hbs.AST.ContentStatement): Unit = js.native
  def Decorator(decorator: typings.handlebars.hbs.AST.Decorator): Unit = js.native
  def DecoratorBlock(decorator: typings.handlebars.hbs.AST.DecoratorBlock): Unit = js.native
  def Hash(hash: typings.handlebars.hbs.AST.Hash): Unit = js.native
  def MustacheStatement(mustache: typings.handlebars.hbs.AST.MustacheStatement): Unit = js.native
  def NullLiteral(): Unit = js.native
  def NumberLiteral(num: typings.handlebars.hbs.AST.NumberLiteral): Unit = js.native
  def PartialBlockStatement(partial: typings.handlebars.hbs.AST.PartialBlockStatement): Unit = js.native
  def PartialStatement(partial: typings.handlebars.hbs.AST.PartialStatement): Unit = js.native
  def PathExpression(path: typings.handlebars.hbs.AST.PathExpression): Unit = js.native
  def Program(program: typings.handlebars.hbs.AST.Program): Unit = js.native
  def StringLiteral(str: typings.handlebars.hbs.AST.StringLiteral): Unit = js.native
  def SubExpression(sexpr: typings.handlebars.hbs.AST.SubExpression): Unit = js.native
  def UndefinedLiteral(): Unit = js.native
  def accept(node: Node): Unit = js.native
}

