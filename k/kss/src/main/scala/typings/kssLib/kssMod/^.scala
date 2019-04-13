package typings
package kssLib.kssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[KssStyleguide] = js.native
  def apply(options: KssOptions): js.Promise[KssStyleguide] = js.native
  /** Parse a string of documented CSS, or an array of file anys with their content. */
  def parse(input: java.lang.String, options: Options): KssStyleguide = js.native
  def parse(input: js.Array[File], options: Options): KssStyleguide = js.native
  /** Traverse a directory, parse its contents, and create a `KssStyleGuide`. */
  def traverse(directory: java.lang.String, options: Options): js.Promise[KssStyleguide] = js.native
  def traverse(directory: js.Array[java.lang.String], options: Options): js.Promise[KssStyleguide] = js.native
}

