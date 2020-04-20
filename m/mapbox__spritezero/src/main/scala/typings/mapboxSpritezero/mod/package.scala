package typings.mapboxSpritezero

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataLayout = org.scalablytyped.runtime.StringDictionary[typings.mapboxSpritezero.mod.StructuredData]
  type ExtractCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* metadata */ typings.mapboxSpritezero.mod.Metadata, 
    scala.Unit
  ]
  type GenerateImageCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* img */ typings.node.Buffer, scala.Unit]
  type GenerateLayoutCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* layout */ typings.mapboxSpritezero.mod.DataLayout | typings.mapboxSpritezero.mod.ImgLayout, 
    scala.Unit
  ]
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double | js.Array[scala.Double]]]
}
