package typings.hyphen

import typings.hyphen.anon.ReadonlyFactoryOptions
import typings.hyphen.anon.ReadonlyPatternsDefinitio
import typings.hyphen.commonMod.HyphenationFunctionAsync
import typings.hyphen.commonMod.HyphenationFunctionSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyphen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Creates a hyphenation function that can be used to hyphenate text.
    * @param patternsDefinition The hyphenation patterns definition for a language.
    * @param options Settings for the hyphenation function.
    * @returns Depending on the options a synchronous or asynchronous hyphenation function.
    */
  def apply(patternsDefinition: ReadonlyPatternsDefinitio): HyphenationFunctionAsync | HyphenationFunctionSync = js.native
  def apply(patternsDefinition: ReadonlyPatternsDefinitio, options: ReadonlyFactoryOptions): HyphenationFunctionAsync | HyphenationFunctionSync = js.native
}

