package typings.mapnik

import org.scalablytyped.runtime.Instantiable2
import typings.mapnik.anon.Areathreshold
import typings.mapnik.anon.Callback
import typings.mapnik.anon.Compression
import typings.mapnik.anon.Filltype
import typings.mapnik.anon.Imageformat
import typings.mapnik.anon.Imagescaling
import typings.mapnik.anon.Upgrade
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mapnik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mapnik", "Datasource")
  @js.native
  open class Datasource protected () extends StObject {
    def this(options: DatasourceOptions) = this()
    
    def featureset(): Featureset = js.native
  }
  
  @JSImport("mapnik", "Feature")
  @js.native
  open class Feature () extends StObject {
    
    def attributes(): Any = js.native
    
    def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def fromJSON(geojson: String): Unit = js.native
    
    def geometry(): Any = js.native
    
    // TODO: Geometry class
    def id(): Double = js.native
    
    def toJSON(): String = js.native
  }
  
  @JSImport("mapnik", "Featureset")
  @js.native
  open class Featureset () extends StObject {
    
    def next(): FeaturesetNext = js.native
  }
  
  @JSImport("mapnik", "FeaturesetNext")
  @js.native
  open class FeaturesetNext () extends StObject {
    
    def toJSON(): String = js.native
  }
  
  @JSImport("mapnik", "Image")
  @js.native
  open class Image protected ()
    extends StObject
       with // constructor(x: number, y: number)
  Instantiable2[/* x */ Double, /* y */ Double, js.Function0[Unit]] {
    def this(x: Double, y: Double) = this()
    
    def encode(`type`: String): Unit = js.native
    def encode(`type`: String, callback: ImageEncodeCallback): Unit = js.native
    
    def getData(): Buffer = js.native
    
    def open(fp: String): js.Function0[Unit] = js.native
    
    def save(fp: String): js.Function0[Unit] = js.native
  }
  
  @JSImport("mapnik", "Layer")
  @js.native
  open class Layer protected () extends StObject {
    def this(name: String) = this()
    
    var datasource: Datasource = js.native
    
    var srs: String = js.native
    
    var styles: js.Array[String] = js.native
  }
  
  @JSImport("mapnik", "Map")
  @js.native
  open class Map protected () extends StObject {
    def this(x: Double, y: Double) = this()
    
    def add_layer(layer: Layer): Unit = js.native
    
    var extent: js.Array[Double] = js.native
    
    def fromString(styles: String, options: MapOptions, loadedCallback: MapLoadCallback): Unit = js.native
    
    def load(xml: String): Unit = js.native
    def load(xml: String, callback: MapLoadCallback): Unit = js.native
    
    def loadSync(stylesheet: String, options: MapOptions): Unit = js.native
    
    def render(images: Image): Unit = js.native
    def render(images: Image, callback: MapRenderCallback): Unit = js.native
    def render(images: VectorTile): Unit = js.native
    def render(images: VectorTile, callback: MapRenderCallback): Unit = js.native
    
    var srs: String = js.native
    
    def zoomAll(): Unit = js.native
    
    def zoomToBox(extent: js.Array[Double]): Unit = js.native
  }
  
  @JSImport("mapnik", "Projection")
  @js.native
  open class Projection protected () extends StObject {
    def this(epsg: String) = this()
    
    def forward(coordinate: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @JSImport("mapnik", "VectorTile")
  @js.native
  open class VectorTile protected () extends StObject {
    def this(z: Double, x: Double, y: Double) = this()
    
    def addData(buffer: Buffer): Unit = js.native
    def addData(buffer: Buffer, options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def addData(buffer: Buffer, options: Upgrade): Unit = js.native
    def addData(buffer: Buffer, options: Upgrade, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def addDataSync(buffer: Buffer): Unit = js.native
    def addDataSync(buffer: Buffer, options: Upgrade): Unit = js.native
    
    def addGeoJSON(geojson: String, name: String): Unit = js.native
    def addGeoJSON(geojson: String, name: String, options: Areathreshold): Unit = js.native
    
    def addImage(image: Image, name: String): Unit = js.native
    def addImage(image: Image, name: String, options: Imageformat): Unit = js.native
    
    def addImageBuffer(buffer: Buffer, name: String): Unit = js.native
    def addImageBuffer(buffer: Buffer, name: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def addImageBufferSync(buffer: Buffer, name: String): Unit = js.native
    
    def addImageSync(image: Image, name: String): Unit = js.native
    def addImageSync(image: Image, name: String, options: Imagescaling): Unit = js.native
    
    def bufferedExtent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def clear(): Unit = js.native
    def clear(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def clearSync(): Unit = js.native
    
    def composite(vectorTiles: js.Array[VectorTile]): Unit = js.native
    def composite(vectorTiles: js.Array[VectorTile], options: Callback): Unit = js.native
    
    def compositeSync(vectorTiles: js.Array[VectorTile]): Unit = js.native
    def compositeSync(vectorTiles: js.Array[VectorTile], options: Filltype): Unit = js.native
    
    def empty(): Boolean = js.native
    
    def emptyLayers(): js.Array[String] = js.native
    
    def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    def getData(): Unit = js.native
    def getData(options: Unit, callback: js.Function0[Unit]): Unit = js.native
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
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* features */ js.Array[Feature], Unit]
    ): Unit = js.native
    def query(longitude: Double, latitude: Double, options: typings.mapnik.anon.Layer): Unit = js.native
    def query(
      longitude: Double,
      latitude: Double,
      options: typings.mapnik.anon.Layer,
      callback: js.Function2[/* err */ js.Error, /* features */ js.Array[Feature], Unit]
    ): Unit = js.native
  }
  
  inline def registerDatasource(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register_datasource")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerDefaultFonts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register_default_fonts")().asInstanceOf[Unit]
  
  inline def registerDefaultInputPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register_default_input_plugins")().asInstanceOf[Unit]
  
  @JSImport("mapnik", "settings")
  @js.native
  val settings: Any = js.native
  
  trait DatasourceOptions extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object DatasourceOptions {
    
    inline def apply(`type`: String): DatasourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatasourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatasourceOptions] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageEncodeCallback = js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]
  
  type MapLoadCallback = js.Function2[/* err */ js.Error, /* map */ Map, Unit]
  
  trait MapOptions extends StObject {
    
    var strict: Boolean
  }
  object MapOptions {
    
    inline def apply(strict: Boolean): MapOptions = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  type MapRenderCallback = js.Function2[/* error */ js.Error, /* image */ Image, Unit]
}
