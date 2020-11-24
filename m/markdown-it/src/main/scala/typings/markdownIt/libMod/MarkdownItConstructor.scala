package typings.markdownIt.libMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkdownItConstructor
  extends Instantiable0[MarkdownIt]
     with Instantiable1[(/* options */ Options) | (/* presetName */ PresetName), MarkdownIt]
     with Instantiable2[/* presetName */ PresetName, /* options */ Options, MarkdownIt] {
  
  def apply(): MarkdownIt = js.native
  def apply(options: Options): MarkdownIt = js.native
  def apply(presetName: PresetName): MarkdownIt = js.native
  def apply(presetName: PresetName, options: Options): MarkdownIt = js.native
}
