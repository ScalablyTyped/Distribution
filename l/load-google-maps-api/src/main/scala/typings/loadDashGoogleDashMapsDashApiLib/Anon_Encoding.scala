package typings
package loadDashGoogleDashMapsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: Anon_DecodePath
  var poly: Anon_ContainsLocation
  var spherical: Anon_ComputeArea
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: Anon_DecodePath, poly: Anon_ContainsLocation, spherical: Anon_ComputeArea): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("poly")(poly)
    __obj.updateDynamic("spherical")(spherical)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

