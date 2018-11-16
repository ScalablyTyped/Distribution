package typings
package handlebarsLib.HandlebarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def BlockStatement(block: handlebarsLib.hbsNs.ASTNs.BlockStatement): scala.Unit = js.native
  def BooleanLiteral(bool: handlebarsLib.hbsNs.ASTNs.BooleanLiteral): scala.Unit = js.native
  def CommentStatement(): scala.Unit = js.native
  def CommentStatement(comment: handlebarsLib.hbsNs.ASTNs.CommentStatement): scala.Unit = js.native
  def ContentStatement(content: handlebarsLib.hbsNs.ASTNs.ContentStatement): scala.Unit = js.native
  def Decorator(decorator: handlebarsLib.hbsNs.ASTNs.Decorator): scala.Unit = js.native
  def DecoratorBlock(decorator: handlebarsLib.hbsNs.ASTNs.DecoratorBlock): scala.Unit = js.native
  def Hash(hash: handlebarsLib.hbsNs.ASTNs.Hash): scala.Unit = js.native
  def MustacheStatement(mustache: handlebarsLib.hbsNs.ASTNs.MustacheStatement): scala.Unit = js.native
  def NullLiteral(): scala.Unit = js.native
  def NumberLiteral(num: handlebarsLib.hbsNs.ASTNs.NumberLiteral): scala.Unit = js.native
  def PartialBlockStatement(partial: handlebarsLib.hbsNs.ASTNs.PartialBlockStatement): scala.Unit = js.native
  def PartialStatement(partial: handlebarsLib.hbsNs.ASTNs.PartialStatement): scala.Unit = js.native
  def PathExpression(path: handlebarsLib.hbsNs.ASTNs.PathExpression): scala.Unit = js.native
  def Program(program: handlebarsLib.hbsNs.ASTNs.Program): scala.Unit = js.native
  def StringLiteral(str: handlebarsLib.hbsNs.ASTNs.StringLiteral): scala.Unit = js.native
  def SubExpression(sexpr: handlebarsLib.hbsNs.ASTNs.SubExpression): scala.Unit = js.native
  def UndefinedLiteral(): scala.Unit = js.native
  def accept(node: handlebarsLib.hbsNs.ASTNs.Node): scala.Unit = js.native
}

