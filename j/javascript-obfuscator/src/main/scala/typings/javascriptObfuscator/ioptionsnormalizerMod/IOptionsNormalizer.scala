package typings.javascriptObfuscator.ioptionsnormalizerMod

import typings.javascriptObfuscator.ioptionsMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsNormalizer extends js.Object {
  /**
    * @param {IOptions} options
    * @returns {IOptions}
    */
  def normalize(options: IOptions): IOptions
}

object IOptionsNormalizer {
  @scala.inline
  def apply(normalize: IOptions => IOptions): IOptionsNormalizer = {
    val __obj = js.Dynamic.literal(normalize = js.Any.fromFunction1(normalize))
  
    __obj.asInstanceOf[IOptionsNormalizer]
  }
}

