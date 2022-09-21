package typings.jspdf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jspdf.anon.Appearance
import typings.jspdf.anon.Events
import typings.jspdf.anon.Filename
import typings.jspdf.anon.GetContext
import typings.jspdf.anon.ReturnPromise
import typings.jspdf.anon.W
import typings.jspdf.jspdfBooleans.`false`
import typings.jspdf.jspdfBooleans.`true`
import typings.jspdf.jspdfStrings.FullScreen
import typings.jspdf.jspdfStrings.MacRomanEncoding
import typings.jspdf.jspdfStrings.StandardEncoding
import typings.jspdf.jspdfStrings.UseOutlines
import typings.jspdf.jspdfStrings.UseThumbs
import typings.jspdf.jspdfStrings.WinAnsiEncoding
import typings.jspdf.jspdfStrings.`Identity-H`
import typings.jspdf.jspdfStrings.arraybuffer
import typings.jspdf.jspdfStrings.blob
import typings.jspdf.jspdfStrings.bloburi
import typings.jspdf.jspdfStrings.bloburl
import typings.jspdf.jspdfStrings.cm
import typings.jspdf.jspdfStrings.continuous
import typings.jspdf.jspdfStrings.datauri
import typings.jspdf.jspdfStrings.datauristring
import typings.jspdf.jspdfStrings.dataurl
import typings.jspdf.jspdfStrings.dataurlnewwindow
import typings.jspdf.jspdfStrings.dataurlstring
import typings.jspdf.jspdfStrings.em
import typings.jspdf.jspdfStrings.evenodd
import typings.jspdf.jspdfStrings.ex
import typings.jspdf.jspdfStrings.fullheight
import typings.jspdf.jspdfStrings.fullpage
import typings.jspdf.jspdfStrings.fullwidth
import typings.jspdf.jspdfStrings.in
import typings.jspdf.jspdfStrings.l
import typings.jspdf.jspdfStrings.landscape
import typings.jspdf.jspdfStrings.mm
import typings.jspdf.jspdfStrings.original
import typings.jspdf.jspdfStrings.p
import typings.jspdf.jspdfStrings.pc
import typings.jspdf.jspdfStrings.pdfjsnewwindow
import typings.jspdf.jspdfStrings.pdfobjectnewwindow
import typings.jspdf.jspdfStrings.portrait
import typings.jspdf.jspdfStrings.pt
import typings.jspdf.jspdfStrings.px
import typings.jspdf.jspdfStrings.reset
import typings.jspdf.jspdfStrings.single
import typings.jspdf.jspdfStrings.two
import typings.jspdf.jspdfStrings.twoleft
import typings.jspdf.jspdfStrings.tworight
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.URL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jspdf", "jsPDF")
@js.native
open class jsPDF () extends StObject {
  def this(options: jsPDFOptions) = this()
  def this(orientation: p | portrait | l | landscape) = this()
  def this(orientation: p | portrait | l | landscape, unit: pt | px | in | mm | cm | ex | em | pc) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double]
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: String) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: js.Array[Double]) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: String) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: js.Array[Double]) = this()
  def this(orientation: Unit, unit: Unit, format: String) = this()
  def this(orientation: Unit, unit: Unit, format: js.Array[Double]) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String,
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: Unit,
    compressPdf: Boolean
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: String, compressPdf: Boolean) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: Unit,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: Unit, compressPdf: Boolean) = this()
  def this(
    orientation: Unit,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String,
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: Unit,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: Unit, compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: String, compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: js.Array[Double], compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: Unit, compressPdf: Boolean) = this()
  
  var AcroForm: Appearance = js.native
  
  var CapJoinStyles: Any = js.native
  
  def GState(parameters: typings.jspdf.mod.GState): typings.jspdf.mod.GState = js.native
  
  def Matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): typings.jspdf.mod.Matrix = js.native
  
  def ShadingPattern(`type`: ShadingPatternType, coords: js.Array[Double], colors: js.Array[ShadingPatterStop]): typings.jspdf.mod.ShadingPattern = js.native
  def ShadingPattern(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: Unit,
    matrix: Matrix
  ): typings.jspdf.mod.ShadingPattern = js.native
  def ShadingPattern(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: GState
  ): typings.jspdf.mod.ShadingPattern = js.native
  def ShadingPattern(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: GState,
    matrix: Matrix
  ): typings.jspdf.mod.ShadingPattern = js.native
  
  def TilingPattern(boundingBox: js.Array[Double], xStep: Double, yStep: Double): typings.jspdf.mod.TilingPattern = js.native
  def TilingPattern(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: Unit, matrix: Matrix): typings.jspdf.mod.TilingPattern = js.native
  def TilingPattern(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: GState): typings.jspdf.mod.TilingPattern = js.native
  def TilingPattern(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: GState, matrix: Matrix): typings.jspdf.mod.TilingPattern = js.native
  
  // jsPDF plugin: AcroForm
  def addField(field: AcroFormField): jsPDF = js.native
  
  def addFileToVFS(filename: String, filecontent: String): jsPDF = js.native
  
  def addFont(postScriptName: String, id: String, fontStyle: String): String = js.native
  def addFont(postScriptName: String, id: String, fontStyle: String, fontWeight: String): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: String,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: String,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: String,
    encoding: Unit,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(postScriptName: String, id: String, fontStyle: String, fontWeight: Double): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Double,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Double,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Double,
    encoding: Unit,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Unit,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Unit,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(
    postScriptName: String,
    id: String,
    fontStyle: String,
    fontWeight: Unit,
    encoding: Unit,
    isStandardFont: Boolean
  ): String = js.native
  def addFont(url: URL, id: String, fontStyle: String): String = js.native
  def addFont(url: URL, id: String, fontStyle: String, fontWeight: String): String = js.native
  def addFont(
    url: URL,
    id: String,
    fontStyle: String,
    fontWeight: String,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  def addFont(url: URL, id: String, fontStyle: String, fontWeight: Double): String = js.native
  def addFont(
    url: URL,
    id: String,
    fontStyle: String,
    fontWeight: Double,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  def addFont(
    url: URL,
    id: String,
    fontStyle: String,
    fontWeight: Unit,
    encoding: StandardEncoding | MacRomanEncoding | `Identity-H` | WinAnsiEncoding
  ): String = js.native
  
  def addGState(key: String, gState: GState): jsPDF = js.native
  
  /**
    * jsPDF plugins below:
    *
    *  - AcroForm
    *  - AddImage
    *  - Annotations
    *  - AutoPrint
    *  - Canvas
    *  - Cell
    *  - Context2D
    *  - fileloading
    *  - html
    *  - JavaScript
    *  - split_text_to_size
    *  - SVG
    *  - total_pages
    *  - utf8
    *  - vfs
    *  - xmp_metadata
    */
  // jsPDF plugin: addImage
  def addImage(imageData: String, format: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: String, format: String, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: String, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: js.typedarray.Uint8Array, format: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: js.typedarray.Uint8Array, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: js.typedarray.Uint8Array, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: js.typedarray.Uint8Array,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: RGBAData, format: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: RGBAData, format: String, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: RGBAData, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: RGBAData, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: RGBAData,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: HTMLCanvasElement, format: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: HTMLCanvasElement, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: HTMLCanvasElement, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLCanvasElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: HTMLImageElement, format: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    format: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(imageData: HTMLImageElement, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addImage(imageData: HTMLImageElement, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression
  ): jsPDF = js.native
  def addImage(
    imageData: HTMLImageElement,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: ImageCompression,
    rotation: Double
  ): jsPDF = js.native
  def addImage(options: ImageOptions): jsPDF = js.native
  
  // jsPDF plugin: JavaScript
  def addJS(javascript: String): jsPDF = js.native
  
  // jsPDF plugin: xmp_metadata
  def addMetadata(metadata: String): jsPDF = js.native
  def addMetadata(metadata: String, namespaceuri: String): jsPDF = js.native
  
  def addPage(): jsPDF = js.native
  def addPage(format: String): jsPDF = js.native
  def addPage(format: String, orientation: p | portrait | l | landscape): jsPDF = js.native
  def addPage(format: js.Array[Double]): jsPDF = js.native
  def addPage(format: js.Array[Double], orientation: p | portrait | l | landscape): jsPDF = js.native
  def addPage(format: Unit, orientation: p | portrait | l | landscape): jsPDF = js.native
  
  def addShadingPattern(key: String, pattern: ShadingPattern): jsPDF = js.native
  
  // jsPDF plugin: SVG
  def addSvgAsImage(svg: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def addSvgAsImage(svg: String, x: Double, y: Double, w: Double, h: Double, alias: String): jsPDF = js.native
  def addSvgAsImage(svg: String, x: Double, y: Double, w: Double, h: Double, alias: String, compression: Boolean): jsPDF = js.native
  def addSvgAsImage(
    svg: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Boolean,
    rotation: Double
  ): jsPDF = js.native
  def addSvgAsImage(
    svg: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: String,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  def addSvgAsImage(svg: String, x: Double, y: Double, w: Double, h: Double, alias: Unit, compression: Boolean): jsPDF = js.native
  def addSvgAsImage(
    svg: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Boolean,
    rotation: Double
  ): jsPDF = js.native
  def addSvgAsImage(
    svg: String,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    alias: Unit,
    compression: Unit,
    rotation: Double
  ): jsPDF = js.native
  
  def advancedAPI(): Unit = js.native
  def advancedAPI(body: js.Function1[/* pdf */ this.type, Unit]): Unit = js.native
  
  // jsPDF plugin: AutoPrint
  def autoPrint(): jsPDF = js.native
  def autoPrint(options: AutoPrintInput): jsPDF = js.native
  
  def beginFormObject(x: Double, y: Double, width: Double, height: Double, matrix: Any): jsPDF = js.native
  
  def beginTilingPattern(pattern: TilingPattern): Unit = js.native
  
  def calculateLineHeight(headerNames: js.Array[String], columnWidths: js.Array[Double], model: js.Array[Any]): Double = js.native
  
  // jsPDF plugin: Canvas
  var canvas: GetContext = js.native
  
  def cell(x: Double, y: Double, w: Double, h: Double, txt: String, ln: Double, align: String): jsPDF = js.native
  
  def cellAddPage(): jsPDF = js.native
  
  def circle(x: Double, y: Double, r: Double): jsPDF = js.native
  def circle(x: Double, y: Double, r: Double, style: String): jsPDF = js.native
  
  def clip(): jsPDF = js.native
  
  def clipEvenOdd(): jsPDF = js.native
  
  @JSName("clip")
  def clip_evenodd(rule: evenodd): jsPDF = js.native
  
  def close(): jsPDF = js.native
  
  def compatAPI(): Unit = js.native
  def compatAPI(body: js.Function1[/* pdf */ this.type, Unit]): Unit = js.native
  
  var context2d: Context2d = js.native
  
  // jsPDF plugin: Annotations
  def createAnnotation(options: Annotation): Unit = js.native
  
  def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): jsPDF = js.native
  
  def deletePage(targetPage: Double): jsPDF = js.native
  
  def discardPath(): jsPDF = js.native
  
  def doFormObject(key: Any, matrix: Any): jsPDF = js.native
  
  def ellipse(x: Double, y: Double, rx: Double, ry: Double): jsPDF = js.native
  def ellipse(x: Double, y: Double, rx: Double, ry: Double, style: String): jsPDF = js.native
  
  def endFormObject(key: Any): jsPDF = js.native
  
  def endTilingPattern(key: String, pattern: TilingPattern): Unit = js.native
  
  // jsPDF plugin: vfs
  def existsFileInVFS(filename: String): Boolean = js.native
  
  def f2(number: Double): String = js.native
  
  def f3(number: Double): String = js.native
  
  def fill(): jsPDF = js.native
  def fill(pattern: PatternData): jsPDF = js.native
  
  def fillEvenOdd(): jsPDF = js.native
  def fillEvenOdd(pattern: PatternData): jsPDF = js.native
  
  def fillStroke(): jsPDF = js.native
  def fillStroke(pattern: PatternData): jsPDF = js.native
  
  def fillStrokeEvenOdd(): jsPDF = js.native
  def fillStrokeEvenOdd(pattern: PatternData): jsPDF = js.native
  
  def getCharSpace(): Double = js.native
  
  // jsPDF plugin: split_text_to_size
  def getCharWidthsArray(text: String): js.Array[Any] = js.native
  def getCharWidthsArray(text: String, options: Any): js.Array[Any] = js.native
  
  def getCreationDate(`type`: String): js.Date = js.native
  
  def getCurrentPageInfo(): PageInfo = js.native
  
  def getDrawColor(): String = js.native
  
  def getFileFromVFS(filename: String): String = js.native
  
  def getFileId(): String = js.native
  
  def getFillColor(): String = js.native
  
  def getFont(): Font = js.native
  
  def getFontList(): StringDictionary[js.Array[String]] = js.native
  
  def getFontSize(): Double = js.native
  
  def getFormObject(key: Any): Any = js.native
  
  def getHorizontalCoordinateString(value: Double): Double = js.native
  
  def getImageProperties(imageData: String): ImageProperties = js.native
  def getImageProperties(imageData: js.typedarray.Uint8Array): ImageProperties = js.native
  def getImageProperties(imageData: HTMLCanvasElement): ImageProperties = js.native
  def getImageProperties(imageData: HTMLImageElement): ImageProperties = js.native
  
  def getLineHeight(): Double = js.native
  
  def getLineHeightFactor(): Double = js.native
  
  def getLineWidth(): Double = js.native
  
  def getNumberOfPages(): Double = js.native
  
  def getPageInfo(pageNumberOneBased: Double): PageInfo = js.native
  
  def getR2L(): Boolean = js.native
  
  def getStringUnitWidth(text: String): Double = js.native
  def getStringUnitWidth(text: String, options: Any): Double = js.native
  
  def getStyle(style: String): String = js.native
  
  def getTextColor(): String = js.native
  
  def getTextDimensions(text: String): W = js.native
  def getTextDimensions(text: String, options: typings.jspdf.anon.Font): W = js.native
  
  def getTextWidth(text: String): Double = js.native
  
  def getVerticalCoordinateString(value: Double): Double = js.native
  
  // jsPDF plugin: html
  def html(src: String): HTMLWorker = js.native
  def html(src: String, options: HTMLOptions): HTMLWorker = js.native
  def html(src: HTMLElement): HTMLWorker = js.native
  def html(src: HTMLElement, options: HTMLOptions): HTMLWorker = js.native
  
  def insertPage(beforePage: Double): jsPDF = js.native
  
  var internal: Events = js.native
  
  def isAdvancedAPI(): Boolean = js.native
  
  def line(x1: Double, y1: Double, x2: Double, y2: Double): jsPDF = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double, style: String): jsPDF = js.native
  
  def lineTo(x: Double, y: Double): jsPDF = js.native
  
  def lines(lines: js.Array[Any], x: Any, y: Any): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Any): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Any, style: String): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Any, style: String, closed: Boolean): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Any, style: Null, closed: Boolean): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Any, style: Unit, closed: Boolean): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Unit, style: String): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Unit, style: String, closed: Boolean): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Unit, style: Null, closed: Boolean): jsPDF = js.native
  def lines(lines: js.Array[Any], x: Any, y: Any, scale: Unit, style: Unit, closed: Boolean): jsPDF = js.native
  
  def link(x: Double, y: Double, w: Double, h: Double, options: Any): Unit = js.native
  
  // jsPDF plugin: fileloading
  def loadFile(url: String): String = js.native
  @JSName("loadFile")
  def loadFile_false(url: String, sync: `false`, callback: js.Function1[/* data */ String, String]): Unit = js.native
  @JSName("loadFile")
  def loadFile_true(url: String, sync: `true`): String = js.native
  
  def matrixMult(m1: Matrix, m2: Matrix): Matrix = js.native
  
  def movePage(targetPage: Double, beforePage: Double): jsPDF = js.native
  
  def moveTo(x: Double, y: Double): jsPDF = js.native
  
  //jsPDF plugin: Outline
  var outline: Outline = js.native
  
  def output(): String = js.native
  def output(`type`: datauristring | dataurlstring): String = js.native
  def output(`type`: datauristring | dataurlstring, options: Filename): String = js.native
  @JSName("output")
  def output_Boolean(`type`: dataurl | datauri): Boolean = js.native
  @JSName("output")
  def output_Boolean(`type`: dataurl | datauri, options: Filename): Boolean = js.native
  @JSName("output")
  def output_URL(`type`: bloburi | bloburl): URL = js.native
  @JSName("output")
  def output_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow): Window = js.native
  @JSName("output")
  def output_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow, options: Filename): Window = js.native
  @JSName("output")
  def output_arraybuffer(`type`: arraybuffer): js.typedarray.ArrayBuffer = js.native
  @JSName("output")
  def output_blob(`type`: blob): Blob = js.native
  
  def path(): jsPDF = js.native
  def path(lines: js.Array[Any]): jsPDF = js.native
  def path(lines: js.Array[Any], style: String): jsPDF = js.native
  def path(lines: Unit, style: String): jsPDF = js.native
  
  def pdfEscape(text: String, flags: Any): String = js.native
  
  def printHeaderRow(lineNumber: Double): Unit = js.native
  def printHeaderRow(lineNumber: Double, new_page: Boolean): Unit = js.native
  
  // jsPDF plugin: arabic
  def processArabic(text: String): String = js.native
  
  // jsPDF plugin: total_pages
  def putTotalPages(pageExpression: String): jsPDF = js.native
  
  def rect(x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
  def rect(x: Double, y: Double, w: Double, h: Double, style: String): jsPDF = js.native
  
  def restoreGraphicsState(): jsPDF = js.native
  
  def roundedRect(x: Double, y: Double, w: Double, h: Double, rx: Double, ry: Double): jsPDF = js.native
  def roundedRect(x: Double, y: Double, w: Double, h: Double, rx: Double, ry: Double, style: String): jsPDF = js.native
  
  def save(): jsPDF = js.native
  def save(filename: String): jsPDF = js.native
  def save(filename: String, options: ReturnPromise): js.Promise[Unit] = js.native
  
  def saveGraphicsState(): jsPDF = js.native
  
  def setCharSpace(charSpace: Double): jsPDF = js.native
  
  def setCreationDate(): jsPDF = js.native
  def setCreationDate(date: String): jsPDF = js.native
  def setCreationDate(date: js.Date): jsPDF = js.native
  
  def setCurrentTransformationMatrix(matrix: Matrix): jsPDF = js.native
  
  def setDisplayMode(): jsPDF = js.native
  def setDisplayMode(zoom: fullheight | fullwidth | fullpage | original): jsPDF = js.native
  def setDisplayMode(
    zoom: fullheight | fullwidth | fullpage | original,
    layout: continuous | single | twoleft | tworight | two
  ): jsPDF = js.native
  def setDisplayMode(
    zoom: fullheight | fullwidth | fullpage | original,
    layout: continuous | single | twoleft | tworight | two,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(
    zoom: fullheight | fullwidth | fullpage | original,
    layout: Null,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(
    zoom: fullheight | fullwidth | fullpage | original,
    layout: Unit,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(zoom: String): jsPDF = js.native
  def setDisplayMode(zoom: String, layout: continuous | single | twoleft | tworight | two): jsPDF = js.native
  def setDisplayMode(
    zoom: String,
    layout: continuous | single | twoleft | tworight | two,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(zoom: String, layout: Null, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: String, layout: Unit, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Double): jsPDF = js.native
  def setDisplayMode(zoom: Double, layout: continuous | single | twoleft | tworight | two): jsPDF = js.native
  def setDisplayMode(
    zoom: Double,
    layout: continuous | single | twoleft | tworight | two,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(zoom: Double, layout: Null, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Double, layout: Unit, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Null, layout: continuous | single | twoleft | tworight | two): jsPDF = js.native
  def setDisplayMode(
    zoom: Null,
    layout: continuous | single | twoleft | tworight | two,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(zoom: Null, layout: Null, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Null, layout: Unit, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Unit, layout: continuous | single | twoleft | tworight | two): jsPDF = js.native
  def setDisplayMode(
    zoom: Unit,
    layout: continuous | single | twoleft | tworight | two,
    pmode: UseOutlines | UseThumbs | FullScreen
  ): jsPDF = js.native
  def setDisplayMode(zoom: Unit, layout: Null, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  def setDisplayMode(zoom: Unit, layout: Unit, pmode: UseOutlines | UseThumbs | FullScreen): jsPDF = js.native
  
  def setDocumentProperties(properties: DocumentProperties): jsPDF = js.native
  
  def setDrawColor(ch1: String): jsPDF = js.native
  def setDrawColor(ch1: Double): jsPDF = js.native
  def setDrawColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
  def setDrawColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
  
  def setFileId(value: String): jsPDF = js.native
  
  def setFillColor(ch1: String): jsPDF = js.native
  def setFillColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
  def setFillColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
  
  def setFont(fontName: String): jsPDF = js.native
  def setFont(fontName: String, fontStyle: String): jsPDF = js.native
  def setFont(fontName: String, fontStyle: String, fontWeight: String): jsPDF = js.native
  def setFont(fontName: String, fontStyle: String, fontWeight: Double): jsPDF = js.native
  def setFont(fontName: String, fontStyle: Unit, fontWeight: String): jsPDF = js.native
  def setFont(fontName: String, fontStyle: Unit, fontWeight: Double): jsPDF = js.native
  
  def setFontSize(size: Double): jsPDF = js.native
  
  def setGState(gState: Any): jsPDF = js.native
  
  // jsPDF plugin: Cell
  def setHeaderFunction(func: js.Function2[/* jsPDFInstance */ this.type, /* pages */ Double, js.Array[Double]]): jsPDF = js.native
  
  // jsPDF plugin: setlanguage
  def setLanguage(langCode: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 196 */ Any): jsPDF = js.native
  
  def setLineCap(style: String): jsPDF = js.native
  def setLineCap(style: Double): jsPDF = js.native
  
  def setLineDashPattern(dashArray: js.Array[Double], dashPhase: Double): jsPDF = js.native
  
  def setLineHeightFactor(value: Double): jsPDF = js.native
  
  def setLineJoin(style: String): jsPDF = js.native
  def setLineJoin(style: Double): jsPDF = js.native
  
  def setLineMiterLimit(length: Double): jsPDF = js.native
  
  def setLineWidth(width: Double): jsPDF = js.native
  
  def setPage(pageNumber: Double): jsPDF = js.native
  
  def setProperties(properties: DocumentProperties): jsPDF = js.native
  
  def setR2L(value: Boolean): jsPDF = js.native
  
  def setTableHeaderRow(config: js.Array[CellConfig]): Unit = js.native
  
  def setTextColor(ch1: String): jsPDF = js.native
  def setTextColor(ch1: Double): jsPDF = js.native
  def setTextColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
  def setTextColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
  
  def splitTextToSize(text: String, maxlen: Double): Any = js.native
  def splitTextToSize(text: String, maxlen: Double, options: Any): Any = js.native
  
  def stroke(): jsPDF = js.native
  
  def table(
    x: Double,
    y: Double,
    data: js.Array[StringDictionary[String]],
    headers: js.Array[CellConfig | String],
    config: TableConfig
  ): jsPDF = js.native
  
  def text(text: String, x: Double, y: Double): jsPDF = js.native
  def text(text: String, x: Double, y: Double, options: Unit, transform: Any): jsPDF = js.native
  def text(text: String, x: Double, y: Double, options: Unit, transform: Double): jsPDF = js.native
  def text(text: String, x: Double, y: Double, options: TextOptionsLight): jsPDF = js.native
  def text(text: String, x: Double, y: Double, options: TextOptionsLight, transform: Any): jsPDF = js.native
  def text(text: String, x: Double, y: Double, options: TextOptionsLight, transform: Double): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double, options: Unit, transform: Any): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double, options: Unit, transform: Double): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double, options: TextOptionsLight): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double, options: TextOptionsLight, transform: Any): jsPDF = js.native
  def text(text: js.Array[String], x: Double, y: Double, options: TextOptionsLight, transform: Double): jsPDF = js.native
  
  def textWithLink(text: String, x: Double, y: Double, options: Any): Double = js.native
  
  def triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): jsPDF = js.native
  def triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, style: String): jsPDF = js.native
  
  var unitMatrix: Matrix = js.native
  
  var version: String = js.native
  
  // jsPDF plugin: viewerpreferences
  def viewerPreferences(options: ViewerPreferencesInput): jsPDF = js.native
  def viewerPreferences(options: ViewerPreferencesInput, doReset: Boolean): jsPDF = js.native
  @JSName("viewerPreferences")
  def viewerPreferences_reset(arg: reset): jsPDF = js.native
}
/* static members */
object jsPDF {
  
  @JSImport("jspdf", "jsPDF")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jspdf", "jsPDF.API")
  @js.native
  def API: jsPDFAPI = js.native
  inline def API_=(x: jsPDFAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
  
  @JSImport("jspdf", "jsPDF.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
