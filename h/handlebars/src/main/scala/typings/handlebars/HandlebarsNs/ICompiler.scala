package typings.handlebars.HandlebarsNs

import typings.handlebars.hbsNs.ASTNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def BlockStatement(block: typings.handlebars.hbsNs.ASTNs.BlockStatement): Unit = js.native
  def BooleanLiteral(bool: typings.handlebars.hbsNs.ASTNs.BooleanLiteral): Unit = js.native
  def CommentStatement(): Unit = js.native
  def CommentStatement(comment: typings.handlebars.hbsNs.ASTNs.CommentStatement): Unit = js.native
  def ContentStatement(content: typings.handlebars.hbsNs.ASTNs.ContentStatement): Unit = js.native
  def Decorator(decorator: typings.handlebars.hbsNs.ASTNs.Decorator): Unit = js.native
  def DecoratorBlock(decorator: typings.handlebars.hbsNs.ASTNs.DecoratorBlock): Unit = js.native
  def Hash(hash: typings.handlebars.hbsNs.ASTNs.Hash): Unit = js.native
  def MustacheStatement(mustache: typings.handlebars.hbsNs.ASTNs.MustacheStatement): Unit = js.native
  def NullLiteral(): Unit = js.native
  def NumberLiteral(num: typings.handlebars.hbsNs.ASTNs.NumberLiteral): Unit = js.native
  def PartialBlockStatement(partial: typings.handlebars.hbsNs.ASTNs.PartialBlockStatement): Unit = js.native
  def PartialStatement(partial: typings.handlebars.hbsNs.ASTNs.PartialStatement): Unit = js.native
  def PathExpression(path: typings.handlebars.hbsNs.ASTNs.PathExpression): Unit = js.native
  def Program(program: typings.handlebars.hbsNs.ASTNs.Program): Unit = js.native
  def StringLiteral(str: typings.handlebars.hbsNs.ASTNs.StringLiteral): Unit = js.native
  def SubExpression(sexpr: typings.handlebars.hbsNs.ASTNs.SubExpression): Unit = js.native
  def UndefinedLiteral(): Unit = js.native
  def accept(node: Node): Unit = js.native
}

