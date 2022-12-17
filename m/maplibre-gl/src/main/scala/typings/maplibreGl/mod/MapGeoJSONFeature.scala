package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.maplibreGlStrings.source_
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapGeoJSONFeature extends GeoJSONFeature {
  
  var layer: (Omit[LayerSpecification, source_]) & typings.maplibreGl.anon.Source = js.native
  
  var source: String = js.native
  
  var sourceLayer: js.UndefOr[String] = js.native
  
  var state: StringDictionary[Any] = js.native
}
