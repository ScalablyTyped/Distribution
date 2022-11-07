package typings.mapboxMapboxGlDraw.mod

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiLineString
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPoint
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def modes: Modes_ = ^.asInstanceOf[js.Dynamic].selectDynamic("modes").asInstanceOf[Modes_]
inline def modes_=(x: Modes_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxGlDraw.mod.DrawPoint
  - typings.mapboxMapboxGlDraw.mod.DrawLineString
  - typings.mapboxMapboxGlDraw.mod.DrawPolygon
  - typings.mapboxMapboxGlDraw.mod.DrawMultiFeature[
typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPoint | typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiLineString | typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPolygon]
*/
type DrawFeature = _DrawFeature | (DrawMultiFeature[MultiPoint | MultiLineString | MultiPolygon])
