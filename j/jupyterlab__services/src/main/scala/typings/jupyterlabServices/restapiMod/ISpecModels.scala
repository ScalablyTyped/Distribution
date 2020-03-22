package typings.jupyterlabServices.restapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpecModels extends PartialJSONObject {
  /**
    * The name of the default kernel spec.
    */
  var default: String
  /**
    * A mapping of kernel spec name to spec.
    */
  val kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]
}

object ISpecModels {
  @scala.inline
  def apply(default: String, kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]): ISpecModels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpecModels]
  }
}

