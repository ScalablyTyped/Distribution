package typings.jade.jadeMod

import typings.jade.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jade", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(template: String): JadeGenerationFunction = js.native
  def compile(template: String, options: JadeOptions): JadeGenerationFunction = js.native
  def compileClient(template: String): JadeGenerationFunction = js.native
  def compileClient(template: String, options: JadeOptions): JadeGenerationFunction = js.native
  def compileClientWithDependenciesTracked(template: String): Anon_Body = js.native
  def compileClientWithDependenciesTracked(template: String, options: JadeOptions): Anon_Body = js.native
  def compileFile(path: String): JadeGenerationFunction = js.native
  def compileFile(path: String, options: JadeOptions): JadeGenerationFunction = js.native
  def render(template: String): String = js.native
  def render(template: String, options: JadeOptions): String = js.native
  def renderFile(path: String): String = js.native
  def renderFile(path: String, options: JadeOptions): String = js.native
}

