package typings.jscodeshift.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API extends js.Object {
  
  def j(source: ASTNode | ASTPath[ASTNode]): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def j(source: String): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def j(source: String, options: Options): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def j(source: js.Array[ASTNode | ASTPath[ASTNode]]): typings.jscodeshift.collectionMod.Collection[_] = js.native
  @JSName("j")
  var j_Original: JSCodeshift = js.native
  
  def jscodeshift(source: ASTNode | ASTPath[ASTNode]): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def jscodeshift(source: String): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def jscodeshift(source: String, options: Options): typings.jscodeshift.collectionMod.Collection[_] = js.native
  def jscodeshift(source: js.Array[ASTNode | ASTPath[ASTNode]]): typings.jscodeshift.collectionMod.Collection[_] = js.native
  @JSName("jscodeshift")
  var jscodeshift_Original: JSCodeshift = js.native
  
  def report(msg: String): Unit = js.native
  
  def stats(name: String): Unit = js.native
  def stats(name: String, quantity: Double): Unit = js.native
  @JSName("stats")
  var stats_Original: Stats = js.native
}
