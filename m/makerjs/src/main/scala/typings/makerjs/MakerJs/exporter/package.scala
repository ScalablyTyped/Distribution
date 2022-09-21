package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StringDictionary
import typings.makerjs.anon.Progress
import typings.makerjs.anon.ScaleConversion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Map of OpenJsCad export options.
  */
type IOpenJsCadOptionsMap = StringDictionary[IOpenJsCadOptions]

/**
  * Map of SVG Path Data by layer name.
  */
type IPathDataByLayerMap = StringDictionary[String]

type IStatusCallback = js.Function1[/* status */ Progress, Unit]

/**
  * Attributes for an XML tag.
  * @private
  */
type IXmlTagAttrs = StringDictionary[Any]

/**
  * Map of MakerJs unit system to SVG unit system
  */
type svgUnitConversion = StringDictionary[ScaleConversion]
