package typings.helmet.helmetMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFeaturePolicyOptions extends js.Object {
  var features: StringDictionary[js.Array[String]]
}

object IFeaturePolicyOptions {
  @scala.inline
  def apply(features: StringDictionary[js.Array[String]]): IFeaturePolicyOptions = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFeaturePolicyOptions]
  }
}

