package typings
package jadeLib.jadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jade", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(template: java.lang.String): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def compile(template: java.lang.String, options: jadeLib.jadeMod.JadeOptions): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def compileClient(template: java.lang.String): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def compileClient(template: java.lang.String, options: jadeLib.jadeMod.JadeOptions): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def compileClientWithDependenciesTracked(template: java.lang.String): jadeLib.Anon_Body = js.native
  def compileClientWithDependenciesTracked(template: java.lang.String, options: jadeLib.jadeMod.JadeOptions): jadeLib.Anon_Body = js.native
  def compileFile(path: java.lang.String): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def compileFile(path: java.lang.String, options: jadeLib.jadeMod.JadeOptions): jadeLib.jadeMod.JadeGenerationFunction = js.native
  def render(template: java.lang.String): java.lang.String = js.native
  def render(template: java.lang.String, options: jadeLib.jadeMod.JadeOptions): java.lang.String = js.native
  def renderFile(path: java.lang.String): java.lang.String = js.native
  def renderFile(path: java.lang.String, options: jadeLib.jadeMod.JadeOptions): java.lang.String = js.native
}

