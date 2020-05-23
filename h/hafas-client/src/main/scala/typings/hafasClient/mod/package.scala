package typings.hafasClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Each public transportation network exposes its products as boolean properties.
  // They are modelled as TypeScript boolean index types.
  // The products may be similar to Extended GTFS Route Types (https://developers.google.com/transit/gtfs/reference/extended-route-types)
  // and to Netex Vehicle types (https://www.vdv.de/vdv-462-netex-recommendation-v00-22-english.pdfx)
  type Products = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
