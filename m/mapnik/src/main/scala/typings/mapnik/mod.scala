package typings.mapnik

import org.scalablytyped.runtime.Instantiable2
import typings.mapnik.anon.Areathreshold
import typings.mapnik.anon.Callback
import typings.mapnik.anon.Compression
import typings.mapnik.anon.Filltype
import typings.mapnik.anon.Imageformat
import typings.mapnik.anon.Imagescaling
import typings.mapnik.anon.Layer
import typings.mapnik.anon.Upgrade
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mapnik", "Datasource")
  @js.native
  class Datasource protected () extends StObject {
    def this(datasource: js.Any) = this()
    
    def featureset(): Featureset = js.native
  }
  
  @JSImport("mapnik", "Feature")
  @js.native
  class Feature () extends StObject {
    
    def attributes(): js.Any = js.native
    
    def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def fromJSON(geojson: String): Unit = js.native
    
    def geometry(): js.Any = js.native
    
    // TODO: Geometry class
    def id(): Double = js.native
    
    def toJSON(): String = js.native
  }
  
  @JSImport("mapnik", "Featureset")
  @js.native
  class Featureset () extends StObject {
    
    def next(): FeaturesetNext = js.native
  }
  
  @JSImport("mapnik", "FeaturesetNext")
  @js.native
  class FeaturesetNext () extends StObject {
    
    def toJSON(): String = js.native
  }
  
  @JSImport("mapnik", "Image")
  @js.native
  class Image protected ()
    extends // constructor(x: number, y: number)
  Instantiable2[/* x */ Double, /* y */ Double, js.Function0[Unit]] {
    def this(x: Double, y: Double) = this()
    
    def encode(`type`: String): Unit = js.native
    def encode(`type`: String, callback: js.Function2[/* err */ Error, /* buffer */ Buffer, Unit]): Unit = js.native
    
    def getData(): Buffer = js.native
    
    def open(fp: String): js.Function0[Unit] = js.native
    
    def save(fp: String): js.Function0[Unit] = js.native
  }
  
  @JSImport("mapnik", "Map")
  @js.native
  class Map protected () extends StObject {
    def this(x: Double, y: Double) = this()
    
    def load(xml: String): Unit = js.native
    def load(xml: String, callback: js.Function2[/* err */ Error, /* map */ this.type, Unit]): Unit = js.native
    
    def render(images: Image): Unit = js.native
    def render(images: Image, callback: js.Function2[/* err */ Error, /* map */ Image, Unit]): Unit = js.native
    def render(images: VectorTile): Unit = js.native
    def render(images: VectorTile, callback: js.Function2[/* err */ Error, /* map */ Image, Unit]): Unit = js.native
    
    def zoomAll(): Unit = js.native
  }
  
  @JSImport("mapnik", "VectorTile")
  @js.native
  class VectorTile protected () extends StObject {
    def this(z: Double, x: Double, y: Double) = this()
    
    def addData(buffer: Buffer): Unit = js.native
    def addData(
      buffer: Buffer,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def addData(buffer: Buffer, options: Upgrade): Unit = js.native
    def addData(buffer: Buffer, options: Upgrade, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def addDataSync(buffer: Buffer): Unit = js.native
    def addDataSync(buffer: Buffer, options: Upgrade): Unit = js.native
    
    def addGeoJSON(geojson: String, name: String): Unit = js.native
    def addGeoJSON(geojson: String, name: String, options: Areathreshold): Unit = js.native
    
    def addImage(image: Image, name: String): Unit = js.native
    def addImage(image: Image, name: String, options: Imageformat): Unit = js.native
    
    def addImageBuffer(buffer: Buffer, name: String): Unit = js.native
    def addImageBuffer(buffer: Buffer, name: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def addImageBufferSync(buffer: Buffer, name: String): Unit = js.native
    
    def addImageSync(image: Image, name: String): Unit = js.native
    def addImageSync(image: Image, name: String, options: Imagescaling): Unit = js.native
    
    def bufferedExtent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def clear(): Unit = js.native
    def clear(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def clearSync(): Unit = js.native
    
    def composite(vectorTiles: js.Array[VectorTile]): Unit = js.native
    def composite(vectorTiles: js.Array[VectorTile], options: Callback): Unit = js.native
    
    def compositeSync(vectorTiles: js.Array[VectorTile]): Unit = js.native
    def compositeSync(vectorTiles: js.Array[VectorTile], options: Filltype): Unit = js.native
    
    def empty(): Boolean = js.native
    
    def emptyLayers(): js.Array[String] = js.native
    
    def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def getData(): Unit = js.native
    def getData(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def getData(options: Compression): Unit = js.native
    def getData(options: Compression, callback: js.Function0[Unit]): Unit = js.native
    
    def getDataSync(): Unit = js.native
    def getDataSync(options: Compression): Unit = js.native
    
    def info(buffer: Buffer): Unit = js.native
    
    def layer(layer_name: String): VectorTile = js.native
    
    def names(): js.Array[String] = js.native
    
    def painted(): Boolean = js.native
    
    def paintedLayers(): js.Array[String] = js.native
    
    def query(longitude: Double, latitude: Double): Unit = js.native
    def query(
      longitude: Double,
      latitude: Double,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ Error, /* features */ js.Array[Feature], Unit]
    ): Unit = js.native
    def query(longitude: Double, latitude: Double, options: Layer): Unit = js.native
    def query(
      longitude: Double,
      latitude: Double,
      options: Layer,
      callback: js.Function2[/* err */ Error, /* features */ js.Array[Feature], Unit]
    ): Unit = js.native
  }
  
  @JSImport("mapnik", "register_datasource")
  @js.native
  def registerDatasource(path: String): Unit = js.native
  
  @JSImport("mapnik", "register_default_fonts")
  @js.native
  def registerDefaultFonts(): Unit = js.native
  
  @JSImport("mapnik", "register_default_input_plugins")
  @js.native
  def registerDefaultInputPlugins(): Unit = js.native
  
  @JSImport("mapnik", "settings")
  @js.native
  val settings: js.Any = js.native
}
