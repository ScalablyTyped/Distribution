package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exporter {
  import org.scalablytyped.runtime.StringDictionary
  import typings.makerDotJs.Anon_ScaleConversion

  /**
    * DXF rendering options.
    */
  type IDXFRenderOptions = IExportOptions
  type IOpenJsCadOptionsMap = StringDictionary[IOpenJsCadOptions]
  /**
    * Map of SVG Path Data by layer name.
    */
  type IPathDataByLayerMap = StringDictionary[String]
  /**
    * Attributes for an XML tag.
    * @private
    */
  type IXmlTagAttrs = StringDictionary[js.Any]
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  type svgUnitConversion = StringDictionary[Anon_ScaleConversion]
}
