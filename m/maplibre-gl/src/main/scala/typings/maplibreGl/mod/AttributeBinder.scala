package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeBinder extends StObject {
  
  def destroy(): scala.Unit = js.native
  
  def populatePaintArray(length: Double, feature: Feature, imagePositions: StringDictionary[ImagePosition]): scala.Unit = js.native
  def populatePaintArray(
    length: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: scala.Unit,
    formattedSection: FormattedSection
  ): scala.Unit = js.native
  def populatePaintArray(
    length: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID
  ): scala.Unit = js.native
  def populatePaintArray(
    length: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID,
    formattedSection: FormattedSection
  ): scala.Unit = js.native
  
  def updatePaintArray(
    start: Double,
    length: Double,
    feature: Feature,
    featureState: FeatureState,
    imagePositions: StringDictionary[ImagePosition]
  ): scala.Unit = js.native
  
  def upload(a: Context): scala.Unit = js.native
}
